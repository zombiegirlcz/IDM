package pqg;

import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pcd.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddMoneyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AddMoneyScreen addMoneyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addMoneyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddMoneyScreen addMoneyScreen = this.v;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0Var = (i0) addMoneyScreen.T2();
                i0Var.L.onNext(Boolean.FALSE);
                ppg.b bVar = i0Var.f238741w;
                pcd.s vault = i0Var.u.f94775a;
                long jA = ((o) i0Var.t2()).a(i0Var.z);
                String str = ((o) i0Var.t2()).e;
                ypg.p pVar = (ypg.p) bVar;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(vault, "vault");
                eed.n nVar = (eed.n) pVar.f;
                Intrinsics.checkNotNullParameter(vault, "vault");
                qdd.a aVar2 = nVar.f125201a;
                String vaultId = vault.f234881a;
                aed.o oVar = (aed.o) aVar2;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                pfm.a aVarE = ue0.e.A(te0.w.g0(oVar.f3546a.contributeToSharedVault(vaultId, new zdd.f(jA, str))), new aed.b(oVar, 5)).e(nVar.f125205h.a(vault, nVar));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                efm.b bVarH = aVarE.h(sjg.a.b(i0Var.A));
                Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
                i0Var.y0(ue0.e.A(bVarH, new pnh.a0(i0Var, 29)), true, new pgk.f(i0Var, 17), new u(i0Var, i2));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0Var2 = (i0) addMoneyScreen.T2();
                if (i0Var2.u.f94775a.e == l0.SAVINGS) {
                    i0Var2.l2(new z(i0Var2, null, i2), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
