package j6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import ip0.v7;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f171800b;

    public /* synthetic */ d(o oVar, int i) {
        this.f171799a = i;
        this.f171800b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f171799a) {
            case 0:
                MoneyRequest moneyRequest = (MoneyRequest) obj2;
                Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
                return this.f171800b.e.c(moneyRequest);
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return this.f171800b.f171821h.g(new j((String) ((od0.i) pair.f186386b).g(), (Set) pair.f186385a), false);
            case 2:
                List moneyRequests = (List) obj2;
                Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
                return this.f171800b.e.d(moneyRequests);
            case 3:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                z8l.i iVar = (z8l.i) hVar.f288433a;
                List list = (List) hVar.f288434b;
                Set set = (Set) hVar.f288435c;
                String str = (String) ((od0.i) hVar.d).g();
                String id10 = iVar.getCreator().getId();
                z8l.g requester = iVar.getRequester();
                String id11 = requester != null ? requester.getId() : null;
                o oVar = this.f171800b;
                oVar.getClass();
                MoneyRequest moneyRequestA = m6k.a.a(iVar, null, o.b(id10, id11, set, str));
                return new ufm.i(oVar.e.c(moneyRequestA), new j4e.c(27, new dqd.a(list, moneyRequestA, set, str, 29)), 1);
            case 4:
                i iVar2 = (i) obj2;
                this.f171800b.f171821h.j(new j(iVar2.d, iVar2.f171810c), iVar2.f171809b);
                return Unit.f186387a;
            case 5:
                j it8 = (j) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) this.f171800b.f.get("money_requests");
            case 6:
                j params = (j) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                o oVar2 = this.f171800b;
                ufm.i iVar3 = new ufm.i(new ufm.i(new ufm.c(new fag.g(oVar2, params, 14), 2), new j4e.c(29, new d(oVar2, 8)), 0), new a31.o(23, m.f171816a), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return iVar3;
            case 7:
                k params2 = (k) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                o oVar3 = this.f171800b;
                List list2 = (List) oVar3.f.get("money_requests");
                if (list2 != null) {
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((MoneyRequest) next).getF60314a(), params2.a())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    MoneyRequest moneyRequest2 = (MoneyRequest) next;
                    if (moneyRequest2 != null) {
                        return moneyRequest2;
                    }
                }
                return (MoneyRequest) v7.r("money_request_", params2.a(), oVar3.f);
            default:
                List moneyRequests2 = (List) obj2;
                Intrinsics.checkNotNullParameter(moneyRequests2, "moneyRequests");
                return this.f171800b.e.d(moneyRequests2);
        }
    }
}
