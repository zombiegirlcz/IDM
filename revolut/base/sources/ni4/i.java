package ni4;

import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.popup.SpousalConsentInitiatorPopupScreenContract$InputData;
import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import mri.w;
import p24.p;
import pfm.r;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f215643w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f215643w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f215643w, continuation, 0);
            case 1:
                return new i(this.f215643w, continuation, 1);
            case 2:
                return new i(this.f215643w, continuation, 2);
            case 3:
                return new i(this.f215643w, continuation, 3);
            case 4:
                return new i(this.f215643w, continuation, 4);
            default:
                return new i(this.f215643w, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                n nVar = this.f215643w;
                w wVar = nVar.f215651t;
                SpousalConsentInitiatorPopupScreenContract$InputData spousalConsentInitiatorPopupScreenContract$InputData = nVar.f215648q;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ow3.e eVar = nVar.f215650s;
                    h1 h1VarF = w0.F(spousalConsentInitiatorPopupScreenContract$InputData.f68447c);
                    this.v = 1;
                    if (eVar.a(h1VarF, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                w.r0(wVar, spousalConsentInitiatorPopupScreenContract$InputData.f68447c.f66892b);
                pw5.a.x(wVar);
                nVar.v2(b.f215637a);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    n nVar2 = this.f215643w;
                    i iVar = new i(nVar2, null, 0);
                    this.v = 1;
                    if (nVar2.p2(this, iVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                n nVar3 = this.f215643w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ufm.n nVarD = nVar3.f215647p.d(nVar3.f215648q.f68447c.f66892b);
                    this.v = 1;
                    obj2 = nim.a.b(nVarD, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                it3.d dVar = (it3.d) obj2;
                Intrinsics.h(dVar);
                nVar3.v2(new c(dVar));
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    n nVar4 = this.f215643w;
                    i iVar2 = new i(nVar4, null, 2);
                    this.v = 1;
                    if (nVar4.p2(this, iVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                n nVar5 = this.f215643w;
                w wVar2 = nVar5.f215651t;
                SpousalConsentInitiatorPopupScreenContract$InputData spousalConsentInitiatorPopupScreenContract$InputData2 = nVar5.f215648q;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    hw3.c cVar = nVar5.f215647p;
                    String applicationId = spousalConsentInitiatorPopupScreenContract$InputData2.f68447c.f66892b;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                    p pVar = cVar.f156055a;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                    r rVarG0 = te0.w.g0(pVar.f232057c.failSpousalConsentApplication(applicationId));
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                w.r0(wVar2, spousalConsentInitiatorPopupScreenContract$InputData2.f68447c.f66892b);
                pw5.a.x(wVar2);
                nVar5.v2(b.f215637a);
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    n nVar6 = this.f215643w;
                    i iVar3 = new i(nVar6, null, 4);
                    this.v = 1;
                    if (nVar6.p2(this, iVar3) == aVar6) {
                        return aVar6;
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
