package mj6;

import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.BrazilInboundConsentDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.BrazilInboundConsentDetailsScreenContract$OutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BrazilInboundConsentDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(BrazilInboundConsentDetailsScreen brazilInboundConsentDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = brazilInboundConsentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BrazilInboundConsentDetailsScreen brazilInboundConsentDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.a) brazilInboundConsentDetailsScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.a aVar3 = (com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.a) brazilInboundConsentDetailsScreen.e3();
                so6.a aVar4 = (so6.a) ((g) ((j2) aVar3.f72569q.f22677a).getValue()).f205929a.getContent();
                if (aVar4 != null) {
                    aVar3.C2(new BrazilInboundConsentDetailsScreenContract$OutputData.EditAlias(aVar4.f264787a, aVar4.f264788b));
                }
                break;
        }
        return Unit.f186387a;
    }
}
