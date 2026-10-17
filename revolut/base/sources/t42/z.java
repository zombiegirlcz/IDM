package t42;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c f267872w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f267872w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f267872w, continuation, 0);
            case 1:
                return new z(this.f267872w, continuation, 1);
            default:
                return new z(this.f267872w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TransferData transferData;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar = this.f267872w;
                    TransferData transferDataN2 = cVar.N2();
                    this.v = 1;
                    if (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c.K2(cVar, transferDataN2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar2 = this.f267872w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c.I2(cVar2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return (TransferReviewInfo) obj2;
                    }
                    yhm.o.b(obj2);
                }
                if (!((Boolean) obj2).booleanValue()) {
                    return null;
                }
                TransferAmountContract$InputData transferAmountContract$InputData = cVar2.E;
                TransferAmountContract$InputData.WithTransferData withTransferData = transferAmountContract$InputData instanceof TransferAmountContract$InputData.WithTransferData ? (TransferAmountContract$InputData.WithTransferData) transferAmountContract$InputData : null;
                if (withTransferData != null && (transferData = withTransferData.f62432g) != null && !transferData.equals(cVar2.N2())) {
                    cVar2.f62449x.a("payments_apm_transfer");
                }
                c52.c cVar3 = cVar2.f62445r;
                TransferData transferDataN22 = cVar2.N2();
                this.v = 2;
                obj2 = ((c52.r) cVar3).l3(transferDataN22, this);
                if (obj2 == aVar2) {
                    return aVar2;
                }
                return (TransferReviewInfo) obj2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                String strA = a.SUBMIT.a();
                com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar4 = this.f267872w;
                z zVar = new z(cVar4, null, 1);
                this.v = 1;
                Object objB0 = u0.b0(cVar4.X(), strA, zVar, this);
                return objB0 == aVar3 ? aVar3 : objB0;
        }
    }
}
