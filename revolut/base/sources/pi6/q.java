package pi6;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d f236453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ej6.u f236454x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d dVar, ej6.u uVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f236453w = dVar;
        this.f236454x = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f236453w, this.f236454x, continuation, 0);
            default:
                return new q(this.f236453w, this.f236454x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d dVar = this.f236453w;
                oe6.m mVar = dVar.f72518p;
                x61.h model = com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d.I2(dVar, ((ej6.p) this.f236454x).f126750a);
                mg6.c cVar = (mg6.c) mVar;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                pfm.a aVarR = cVar.f205161b.r(new wj0.b("OPEN_BANKING_OUTBOUND_IDEMPOTENCY_KEY"));
                hf6.i iVar = (hf6.i) cVar.f205160a;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                d0<if6.j> d0VarAuthorizePayment = iVar.f151760a.authorizePayment(uj3.b.B(model), new wj0.b("OPEN_BANKING_OUTBOUND_IDEMPOTENCY_KEY"));
                hae.k kVar = new hae.k(new he4.r(17), 20);
                d0VarAuthorizePayment.getClass();
                ufm.i iVar2 = new ufm.i(d0VarAuthorizePayment, kVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                f0 f0VarF = aVarR.f(w.i0(iVar2));
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                this.v = 1;
                Object objB = nim.a.b(f0VarF, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d dVar2 = this.f236453w;
                q qVar = new q(dVar2, this.f236454x, null, 0);
                this.v = 1;
                Object objA = ((g) dVar2.f72521s).a(qVar, this);
                return objA == aVar2 ? aVar2 : objA;
        }
    }
}
