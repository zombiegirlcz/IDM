package gd2;

import aw0.n6;
import com.revolut.feature.apm.services.ideal.impl.ui.accounts.IDealAccountsListController;
import com.revolut.feature.apm.services.ideal.impl.ui.accounts.IDealAccountsListControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ IDealAccountsListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(IDealAccountsListController iDealAccountsListController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = iDealAccountsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        IDealAccountsListController iDealAccountsListController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = iDealAccountsListController.e3();
                IDealAccountsListControllerContract$InputData iDealAccountsListControllerContract$InputData = jVarE3.o;
                int i2 = g.f143041a[iDealAccountsListControllerContract$InputData.f62839b.ordinal()];
                if (i2 == 1) {
                    jVarE3.B2();
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVarE3.C2(new jd2.e(iDealAccountsListControllerContract$InputData.f62838a));
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE32 = iDealAccountsListController.e3();
                jVarE32.getClass();
                jVarE32.l2(new i(jVarE32, null, 0), new yi5.b(26));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE33 = iDealAccountsListController.e3();
                jVarE33.C2(new jd2.e(jVarE33.o.f62838a));
                return Unit.f186387a;
        }
    }
}
