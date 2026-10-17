package hqe;

import com.revolut.feature.teen_profile.api.models.TeenProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.r;
import zh9.u0;
import zhm.a0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f154686b;

    public /* synthetic */ k(o oVar, int i) {
        this.f154685a = i;
        this.f154686b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f154685a) {
            case 0:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                Map map = (Map) rVar.f314202b;
                xi0.b bVar = (xi0.b) rVar.f314203c;
                o oVar = this.f154686b;
                return u0.m(oVar.e.w(list, map, bVar), new ahe.l(oVar.f.k(), 6));
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                Set hiddenAccountsIds = (Set) pair.f186386b;
                List<fqe.c> listP0 = d0.P0(list2, new n());
                ArrayList arrayList = new ArrayList();
                for (fqe.c cVar : listP0) {
                    fo3.c wallet = cVar.f137252a;
                    List pockets = cVar.f137253b;
                    TeenProfile teenProfile = cVar.f137254c;
                    dj0.d dVar = cVar.d;
                    o oVar2 = this.f154686b;
                    gqe.c teenHomeUiConfig = oVar2.a(teenProfile);
                    iqe.f fVar = oVar2.f154691c;
                    Intrinsics.checkNotNullParameter(wallet, "wallet");
                    Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
                    Intrinsics.checkNotNullParameter(pockets, "pockets");
                    Intrinsics.checkNotNullParameter(teenHomeUiConfig, "teenHomeUiConfig");
                    Intrinsics.checkNotNullParameter(hiddenAccountsIds, "hiddenAccountsIds");
                    List<io3.d> list3 = pockets;
                    ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                    for (io3.d dVar2 : list3) {
                        iqe.f fVar2 = fVar;
                        arrayList2.add(fVar2.a(wallet, dVar2, teenHomeUiConfig, teenProfile, hiddenAccountsIds.contains(dVar2.f163145a)));
                        fVar = fVar2;
                    }
                    iqe.f fVar3 = fVar;
                    if (arrayList2.size() > 1) {
                        arrayList2 = d0.F0(fVar3.b(wallet, dVar, teenProfile, teenHomeUiConfig), arrayList2);
                    }
                    a0.x(arrayList2, arrayList);
                }
                return arrayList;
            default:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                fo3.c cVar2 = (fo3.c) pair2.f186385a;
                return nim.a.v(rd0.e.b(this.f154686b.d.d((List) pair2.f186386b)), new atg.c(cVar2, 4));
        }
    }
}
