package mi4;

import c84.t;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p24.p;
import pfm.r;
import te0.w;
import ufm.n;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b f205614w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f205614w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f205614w, continuation, 0);
            case 1:
                return new d(this.f205614w, continuation, 1);
            case 2:
                return new d(this.f205614w, continuation, 2);
            default:
                return new d(this.f205614w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar = this.f205614w;
                if (i == 0) {
                    o.b(obj2);
                    n nVarD = bVar.f68441p.d(bVar.f68442q.f68430a.f66892b);
                    this.v = 1;
                    obj2 = nim.a.b(nVarD, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(bVar, (it3.d) obj2, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar2 = this.f205614w;
                    d dVar = new d(bVar2, null, 0);
                    this.v = 1;
                    if (bVar2.p2(this, dVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar3 = this.f205614w;
                if (i3 == 0) {
                    o.b(obj2);
                    hw3.c cVar = bVar3.f68441p;
                    String applicationId = bVar3.f68442q.f68430a.f66892b;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                    p pVar = cVar.f156055a;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                    r rVarG0 = w.g0(pVar.f232057c.failSpousalConsentApplication(applicationId));
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar3.K2(null);
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar4 = this.f205614w;
                    d dVar2 = new d(bVar4, null, 2);
                    this.v = 1;
                    if (bVar4.p2(this, dVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
