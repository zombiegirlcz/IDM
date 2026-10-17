package is2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b f168094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ qua.p f168095x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar, qua.p pVar, Continuation continuation) {
        super(1, continuation);
        this.f168094w = bVar;
        this.f168095x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f168095x, this.f168094w, continuation);
            default:
                return new o(this.f168094w, this.f168095x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.b bVarU;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    qua.p subscription = this.f168095x;
                    int i2 = n.f168093a[subscription.f249314a.f160152c.ordinal()];
                    com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar = this.f168094w;
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        yua.q qVar = (yua.q) bVar.f64269r;
                        qVar.getClass();
                        Intrinsics.checkNotNullParameter(subscription, "subscription");
                        bVarU = qVar.u(subscription, true);
                    } else if (i2 != 4) {
                        bVarU = efm.b.n(new IllegalStateException("Recurring payment of type " + subscription.f249314a.f160152c + " can not be blocked"));
                    } else {
                        yua.q qVar2 = (yua.q) bVar.f64269r;
                        qVar2.getClass();
                        Intrinsics.checkNotNullParameter(subscription, "subscription");
                        bVarU = qVar2.v(subscription, true);
                    }
                    pfm.t tVarM = bVarU.m(new ir9.a(new k(bVar, 2), 13));
                    Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
                    this.v = 1;
                    if (nim.a.a(tVarM, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar2 = this.f168094w;
                    j60.a.v(bVar2.f64271t, false, null, 3);
                    o oVar = new o(this.f168095x, bVar2, (Continuation) null);
                    this.v = 1;
                    if (do3.q.t(bVar2, oVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(qua.p pVar, com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f168095x = pVar;
        this.f168094w = bVar;
    }
}
