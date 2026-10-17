package okl;

import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.api.models.RcsEvidence;
import com.revolut.sso.api.models.SmsEvidence;
import com.revolut.sso.api.models.TelephoneEvidence;
import com.revolut.sso.api.models.WhatsAppEvidence;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226162w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ lni.i f226163x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(com.revolut.sso.impl.ui.auth.n nVar, lni.i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226162w = nVar;
        this.f226163x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0(this.f226162w, this.f226163x, continuation, 0);
            case 1:
                return new d0(this.f226162w, this.f226163x, continuation, 1);
            default:
                return new d0(this.f226162w, this.f226163x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Evidence smsEvidence;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.sso.impl.ui.auth.n nVar = this.f226162w;
                    Challenge f106299h = ((AuthenticationFlowContract$State) ((j2) nVar.m0.f22677a).getValue()).getF106299h();
                    jkl.i iVar = f106299h != null ? f106299h.f106098a : null;
                    int i2 = iVar == null ? -1 : c0.f226157a[iVar.ordinal()];
                    lni.i iVar2 = this.f226163x;
                    if (i2 == 1) {
                        lni.f fVar = (lni.f) iVar2;
                        smsEvidence = new RcsEvidence(fVar.f197261a, fVar.f197262b);
                    } else {
                        lni.f fVar2 = (lni.f) iVar2;
                        smsEvidence = new SmsEvidence(fVar2.f197261a, fVar2.f197262b);
                    }
                    Evidence evidence = smsEvidence;
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(nVar, null, evidence, null, this, 5) == aVar) {
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
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    WhatsAppEvidence whatsAppEvidence = new WhatsAppEvidence(((lni.h) this.f226163x).f197264a, false);
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(this.f226162w, null, whatsAppEvidence, null, this, 5) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    String secret = ((lni.g) this.f226163x).f197263a;
                    Intrinsics.checkNotNullParameter(secret, "secret");
                    TelephoneEvidence telephoneEvidence = new TelephoneEvidence(secret);
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(this.f226162w, null, telephoneEvidence, null, this, 5) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
