package ab4;

import com.revolut.data.model.Data;
import dx4.t0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f2883b;

    public /* synthetic */ p(t0 t0Var, int i) {
        this.f2882a = i;
        this.f2883b = t0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ?? arrayList;
        wu3.h hVar;
        List list;
        Map mapQ;
        switch (this.f2882a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                t0 item = this.f2883b;
                Intrinsics.checkNotNullParameter(item, "item");
                Data data = update.f2873a;
                wu3.h hVar2 = (wu3.h) data.getContent();
                if (hVar2 == null || (list = hVar2.e) == null) {
                    arrayList = 0;
                } else {
                    List<t0> list2 = list;
                    arrayList = new ArrayList(w.t(list2, 10));
                    for (t0 t0VarB : list2) {
                        if (Intrinsics.f(item.f120770a, t0VarB.f120770a)) {
                            t0VarB = t0.b(t0VarB, !t0VarB.d);
                        }
                        arrayList.add(t0VarB);
                    }
                }
                if (arrayList == 0) {
                    arrayList = f0.f322471a;
                }
                ?? checkboxes = arrayList;
                wu3.h hVar3 = (wu3.h) data.getContent();
                if (hVar3 != null) {
                    String title = hVar3.f300060a;
                    String subtitle = hVar3.f300061b;
                    List terms = hVar3.f300062c;
                    List list3 = hVar3.d;
                    String str = hVar3.f;
                    wu3.c button = hVar3.f300063g;
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    Intrinsics.checkNotNullParameter(terms, "terms");
                    Intrinsics.checkNotNullParameter(checkboxes, "checkboxes");
                    Intrinsics.checkNotNullParameter(button, "button");
                    hVar = new wu3.h(title, subtitle, terms, list3, checkboxes, str, button);
                } else {
                    hVar = null;
                }
                Data data2 = Data.copy$default(data, hVar, null, false, 6, null);
                Intrinsics.checkNotNullParameter(data2, "data");
                return new h(data2);
            default:
                ax4.b updateState = (ax4.b) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                updateState.getClass();
                t0 item2 = this.f2883b;
                Intrinsics.checkNotNullParameter(item2, "item");
                Map map = updateState.f10858c;
                String str2 = item2.f120770a;
                if (map.containsKey(str2)) {
                    mapQ = new LinkedHashMap(q0.b(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        String str3 = (String) entry.getKey();
                        ax4.a aVar = (ax4.a) entry.getValue();
                        if (Intrinsics.f(str3, str2)) {
                            aVar = new ax4.a(!aVar.f10854a, aVar.f10855b);
                        }
                        mapQ.put(key, aVar);
                    }
                } else {
                    mapQ = r0.q(map, new Pair(str2, new ax4.a(!item2.d, item2.f120772c)));
                }
                return ax4.b.a(updateState, null, null, mapQ, null, null, null, null, null, null, null, null, null, null, 8187);
        }
    }
}
