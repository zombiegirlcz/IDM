package dce;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.giro.api.navigation.GiroFormDestination$Edit;
import com.revolut.feature.masav.api.navigation.MasavDirectDebitsEditDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c f112892w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ qua.p f112893x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar, qua.p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112892w = cVar;
        this.f112893x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r0(this.f112892w, this.f112893x, continuation, 0);
            case 1:
                return new r0(this.f112892w, this.f112893x, continuation, 1);
            case 2:
                return new r0(this.f112892w, this.f112893x, continuation, 2);
            case 3:
                return new r0(this.f112892w, this.f112893x, continuation, 3);
            case 4:
                return new r0(this.f112892w, this.f112893x, continuation, 4);
            case 5:
                return new r0(this.f112892w, this.f112893x, continuation, 5);
            case 6:
                return new r0(this.f112892w, this.f112893x, continuation, 6);
            case 7:
                return new r0(this.f112892w, this.f112893x, continuation, 7);
            case 8:
                return new r0(this.f112892w, this.f112893x, continuation, 8);
            case 9:
                return new r0(this.f112892w, this.f112893x, continuation, 9);
            default:
                return new r0(this.f112892w, this.f112893x, continuation, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar = this.f112892w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG = mo3.a.g(cVar.K.b(this.f112893x.f249314a.f160150a), null, null, 3);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarG, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return cVar.C1(new GiroFormDestination$Edit((ApmPaymentAuthorisationSummary) obj2));
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar2 = this.f112892w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG2 = mo3.a.g(cVar2.K.b(this.f112893x.f249314a.f160150a), null, null, 3);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarG2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return cVar2.C1(new MasavDirectDebitsEditDestination((ApmPaymentAuthorisationSummary) obj2));
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c.I2(this.f112892w, this.f112893x, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar3 = this.f112892w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    twg.c cVar4 = cVar3.f89266r;
                    this.v = 1;
                    if (cVar4.j(this.f112893x, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                cVar3.B2();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar5 = this.f112892w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    twg.c cVar6 = cVar5.f89266r;
                    this.v = 1;
                    if (cVar6.e(this.f112893x, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                cVar5.B2();
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c.I2(this.f112892w, this.f112893x, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar7 = this.f112892w;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    twg.c cVar8 = cVar7.f89266r;
                    this.v = 1;
                    if (cVar8.r(this.f112893x, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                cVar7.B2();
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    twg.c cVar9 = this.f112892w.f89266r;
                    this.v = 1;
                    if (cVar9.e(this.f112893x, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    twg.c cVar10 = this.f112892w.f89266r;
                    this.v = 1;
                    if (cVar10.e(this.f112893x, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    twg.c cVar11 = this.f112892w.f89266r;
                    this.v = 1;
                    if (cVar11.j(this.f112893x, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    twg.c cVar12 = this.f112892w.f89266r;
                    this.v = 1;
                    if (cVar12.e(this.f112893x, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
