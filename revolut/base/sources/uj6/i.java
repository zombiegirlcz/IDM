package uj6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.BrazilInboundMandatePreviewScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ BrazilInboundMandatePreviewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(BrazilInboundMandatePreviewScreen brazilInboundMandatePreviewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = brazilInboundMandatePreviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b) this.u.R2()).C2(a.b.f72608a);
        return Unit.f186387a;
    }
}
