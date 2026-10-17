package k3k;

import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f180780w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(t0 t0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180780w = t0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l0(this.f180780w, continuation, 0);
            case 1:
                return new l0(this.f180780w, continuation, 1);
            case 2:
                return new l0(this.f180780w, continuation, 2);
            default:
                return new l0(this.f180780w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        t0 t0Var = this.f180780w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    o3k.g gVar = t0Var.f180793q;
                    this.v = 1;
                    RemittanceAmountScreenContract$InputData remittanceAmountScreenContract$InputData = gVar.f221843a;
                    if (remittanceAmountScreenContract$InputData instanceof RemittanceAmountScreenContract$InputData.NewTransfer) {
                        obj2 = gVar.c((RemittanceAmountScreenContract$InputData.NewTransfer) remittanceAmountScreenContract$InputData, this);
                    } else {
                        if (!(remittanceAmountScreenContract$InputData instanceof RemittanceAmountScreenContract$InputData.WithTransferData)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((RemittanceAmountScreenContract$InputData.WithTransferData) remittanceAmountScreenContract$InputData).f102030c;
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                t0Var.x2(new k0d.c((RemittanceTransferData) obj2, 13));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    o0 o0Var = new o0(t0Var, null);
                    this.v = 1;
                    if (t0Var.p2(this, o0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = vkm.q.x(t0Var.z.Z2(t0Var.A2(), t0Var.z2().f180807b, t0Var.z2().f180806a), this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                hrf.h hVar = (hrf.h) obj2;
                if (hVar.f154817a.isEmpty()) {
                    t0Var.l2(new q0(t0Var, new p0(t0Var, continuation, 0), (Continuation) null), new yi5.b(26));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Unhandled errors when trying to schedule Remittance Transfer: transferErrors=" + hVar.f154817a + ", balanceErrors=" + hVar.f154818b + ", userError=" + hVar.f154819c);
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    jld.h hVar2 = new jld.h(i2, continuation, t0Var);
                    this.v = 1;
                    if (t0Var.p2(this, hVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
