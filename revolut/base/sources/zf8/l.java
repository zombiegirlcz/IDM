package zf8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f321904b;

    public /* synthetic */ l(n nVar, int i) {
        this.f321903a = i;
        this.f321904b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        switch (this.f321903a) {
            case 0:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return this.f321904b.a((JuniorBankingProfile) pair.f186385a, (mf8.e) pair.f186386b);
            default:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Map map = (Map) pair.f186385a;
                Map map2 = (Map) pair.f186386b;
                Set setH0 = d0.h0(map.keySet(), map2.keySet());
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : setH0) {
                    String str = (String) obj3;
                    if (map2.containsKey(str) && map.containsKey(str)) {
                        arrayList.add(obj3);
                    }
                }
                int iB = q0.b(w.t(arrayList, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : arrayList) {
                    String str2 = (String) obj4;
                    linkedHashMap.put(obj4, this.f321904b.a((JuniorBankingProfile) r0.h(str2, map), (mf8.e) r0.h(str2, map2)));
                }
                return linkedHashMap;
        }
    }
}
