package ij6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.BrazilConsentDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.BrazilConsentDetailsScreenContract$OutputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ BrazilConsentDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BrazilConsentDetailsScreen brazilConsentDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = brazilConsentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.a) ((g) this.u.O.getValue());
        com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c cVar = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) ((f) ((j2) aVar2.f72551q.f22677a).getValue()).f161713a.getContent();
        if (cVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Consent details content was null when Brazil consent revoke was clicked");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            aVar2.C2(new BrazilConsentDetailsScreenContract$OutputData.Revoke(cVar.f72413a, cVar.f.f73116b));
        }
        return Unit.f186387a;
    }
}
