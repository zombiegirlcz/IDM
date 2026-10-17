package w38;

import com.revolut.core.model.account.AccountId;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f294238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n38.a f294239c;

    public /* synthetic */ x(q0 q0Var, n38.a aVar, int i) {
        this.f294237a = i;
        this.f294238b = q0Var;
        this.f294239c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.r rVarJust;
        switch (this.f294237a) {
            case 0:
                vf0.y yVar = (vf0.y) obj2;
                Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                io3.d dVar = (io3.d) yVar.f288491a;
                xi0.b bVar = (xi0.b) yVar.f288492b;
                List list = (List) yVar.f288493c;
                do3.n nVar = (do3.n) yVar.d;
                Set set = (Set) yVar.e;
                g48.a aVar = (g48.a) yVar.f;
                q0 q0Var = this.f294238b;
                return rd0.e.c(new d0(q0Var.i.c(dVar, bVar), q0Var, dVar, bVar, this.f294239c, list, nVar, set, aVar), kotlin.coroutines.g.f186406a);
            default:
                od0.i baseCurrencyPocket = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(baseCurrencyPocket, "baseCurrencyPocket");
                q0 q0Var2 = this.f294238b;
                r38.b bVar2 = q0Var2.e;
                n38.a aVar2 = this.f294239c;
                AccountId.Joint accountId = l38.a.c(aVar2);
                r38.l lVar = (r38.l) bVar2;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                efm.r rVarA = lVar.f251222m.a(new r38.e(accountId, loadingStrategy));
                cxe.u uVarE = ((d89.g) q0Var2.f).e(z79.b.JOINT);
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
                efm.r rVarC = rd0.e.c(uVarE, gVar);
                efm.r rVarK = q0Var2.f294205b.k(false);
                io3.d dVar2 = (io3.d) baseCurrencyPocket.g();
                od0.i iVar = od0.i.f224256b;
                if (dVar2 != null) {
                    wda.r rVar = q0Var2.i;
                    xi0.a aVar3 = xi0.b.Companion;
                    String str = dVar2.f163147c;
                    aVar3.getClass();
                    efm.r rVarC2 = rd0.e.c(new vy5.d0(rVar.c(dVar2, xi0.a.a(str)), 1), gVar);
                    od0.i.Companion.getClass();
                    rVarJust = ue0.e.E(rVarC2, iVar);
                } else {
                    od0.i.Companion.getClass();
                    rVarJust = efm.r.just(iVar);
                }
                efm.r map = rVarJust.map(new mic.a0(29, g0.f294177a));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return nim.a.w(mif.a.f(rVarA, rVarC, rVarK, map), new vx9.v(q0Var2, 4, aVar2, baseCurrencyPocket));
        }
    }
}
