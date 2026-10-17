package ep7;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.a1;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128099a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f128100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f128101c;

    public /* synthetic */ j(Object obj2, Object obj3) {
        this.f128100b = obj2;
        this.f128101c = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f128099a) {
            case 0:
                e updateState = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Map answers = r0.q(updateState.d, new Pair(this.f128100b, this.f128101c));
                boolean z = updateState.f128093a;
                boolean z3 = updateState.f128094b;
                List questions = updateState.f128095c;
                Intrinsics.checkNotNullParameter(questions, "questions");
                Intrinsics.checkNotNullParameter(answers, "answers");
                return new e(z, z3, questions, answers);
            default:
                zxi.e update = (zxi.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Map map = update.f326341b;
                String str = (String) this.f128100b;
                String str2 = (String) this.f128101c;
                Set set = (Set) map.get(str);
                if (set == null) {
                    set = h0.f322473a;
                }
                LinkedHashSet linkedHashSetJ = set.contains(str2) ? a1.j(set, str2) : a1.m(set, str2);
                LinkedHashMap linkedHashMapZ = r0.z(map);
                if (linkedHashSetJ.isEmpty()) {
                    linkedHashMapZ.remove(str);
                } else {
                    linkedHashMapZ.put(str, linkedHashSetJ);
                }
                Map selectedFilters = r0.u(linkedHashMapZ);
                List filters = update.f326340a;
                Intrinsics.checkNotNullParameter(filters, "filters");
                Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
                return new zxi.e(filters, selectedFilters);
        }
    }

    public /* synthetic */ j(zxi.i iVar, Object obj2, Object obj3) {
        this.f128100b = obj2;
        this.f128101c = obj3;
    }
}
