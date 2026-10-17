package mj6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.BrazilInboundConsentDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.BrazilInboundConsentDetailsScreenContract$OutputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ BrazilInboundConsentDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BrazilInboundConsentDetailsScreen brazilInboundConsentDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = brazilInboundConsentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.a) this.u.R2();
        so6.a aVar3 = (so6.a) ((g) ((j2) aVar2.f72569q.f22677a).getValue()).f205929a.getContent();
        if (aVar3 == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Consent details content was null when Brazil inbound consent revoke was clicked");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            aVar2.C2(new BrazilInboundConsentDetailsScreenContract$OutputData.Revoke(aVar3.f264787a, aVar3.d.f73116b));
        }
        return Unit.f186387a;
    }
}
