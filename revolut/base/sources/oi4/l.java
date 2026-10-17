package oi4;

import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentConfiguration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        p pVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.i iVar = new ufm.i(pVar.f225445p.b(ju3.a.SPOUSAL_CONSENT_INITIATOR_REQUEST_CONSENT, pVar.f225447r.f68457a.d), new oc8.e(22, new oh3.a(5)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            this.u = 1;
            obj2 = nim.a.b(iVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        pVar.x2(new o9h.b((RequestConsentConfiguration) obj2, 25));
        return Unit.f186387a;
    }
}
