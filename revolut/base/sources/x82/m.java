package x82;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoCodeDetailsInputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tb4.t;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a f303270w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f303270w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(0, this.f303270w, continuation);
            default:
                return new m(1, this.f303270w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        String str;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar2 = this.f303270w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    t tVar = aVar2.f62636p;
                    MultibancoCodeDetailsInputData multibancoCodeDetailsInputData = aVar2.o;
                    if (multibancoCodeDetailsInputData instanceof MultibancoCodeDetailsInputData.ByCode) {
                        str = ((MultibancoCodeDetailsInputData.ByCode) multibancoCodeDetailsInputData).f62539a.f61951a;
                    } else {
                        if (!(multibancoCodeDetailsInputData instanceof MultibancoCodeDetailsInputData.ById)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((MultibancoCodeDetailsInputData.ById) multibancoCodeDetailsInputData).f62540a;
                    }
                    this.v = 1;
                    obj2 = ((l72.i) tVar.f269456b).c(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar2.H2(aVar2.u, new x0b.c((MultibancoWithdrawalCode) obj2, 25));
                return yji.l.a1(aVar2, aVar2.X1(new mii.f("CANCEL_DIALOG_ID_SUCCESS", new TextLocalisedClause(R$string.multibanco_withdrawal_cancellation_success, null, null, 14), null, null, null, null, 124)), null, null, null, 7);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar4 = this.f303270w;
                m mVar = new m(0, aVar4, null);
                this.v = 1;
                Object objB = pu7.a.B(aVar4.k, "handleActionCancelConfirmation", mVar, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
