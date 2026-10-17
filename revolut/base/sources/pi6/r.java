package pi6;

import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d f236455w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f236455w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f236455w, continuation, 0);
            case 1:
                return new r(this.f236455w, continuation, 1);
            case 2:
                return new r(this.f236455w, continuation, 2);
            case 3:
                return new r(this.f236455w, continuation, 3);
            default:
                return new r(this.f236455w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d dVar = this.f236455w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                oe6.m mVar = dVar.f72518p;
                x61.h model = com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d.I2(dVar, null);
                mg6.c cVar = (mg6.c) mVar;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                hf6.i iVar = (hf6.i) cVar.f205160a;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                d0<if6.j> d0VarRejectPayment = iVar.f151760a.rejectPayment(uj3.b.B(model));
                hf6.h hVar = hf6.h.f;
                h35.c cVar2 = new h35.c(2);
                d0VarRejectPayment.getClass();
                ufm.i iVar2 = new ufm.i(d0VarRejectPayment, cVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                ufm.n nVarI0 = w.i0(iVar2);
                this.v = 1;
                Object objB = nim.a.b(nVarI0, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r rVar = new r(dVar, continuation, 0);
                this.v = 1;
                Object objA = ((g) dVar.f72521s).a(rVar, this);
                return objA == aVar2 ? aVar2 : objA;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    r rVar2 = new r(dVar, continuation, i2);
                    this.v = 1;
                    obj2 = do3.q.t(dVar, rVar2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                c cVar3 = (c) obj2;
                if (cVar3 instanceof a) {
                    com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d.K2(dVar, ((a) cVar3).f236435a);
                } else {
                    if (!(cVar3 instanceof b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj3 = ((b) cVar3).f236436a;
                    Intrinsics.checkNotNullExpressionValue(obj3, "<get-result>(...)");
                    dVar.C2(new m((String) obj3));
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                oe6.m mVar2 = dVar.f72518p;
                k kVar = dVar.o;
                String clientId = kVar.d;
                String request = kVar.f236446c;
                String redirectUri = kVar.e;
                mg6.c cVar4 = (mg6.c) mVar2;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                hf6.i iVar3 = (hf6.i) cVar4.f205160a;
                iVar3.getClass();
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                d0<if6.m> payment = iVar3.f151760a.getPayment(clientId, request, redirectUri);
                hae.k kVar2 = new hae.k(new he4.r(16), 19);
                payment.getClass();
                ufm.i iVar4 = new ufm.i(payment, kVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                ufm.n nVarI02 = w.i0(iVar4);
                this.v = 1;
                Object objB2 = nim.a.b(nVarI02, this);
                return objB2 == aVar4 ? aVar4 : objB2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    r rVar3 = new r(dVar, continuation, 3);
                    this.v = 1;
                    obj2 = ((g) dVar.f72521s).a(rVar3, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return (c) obj2;
        }
    }
}
