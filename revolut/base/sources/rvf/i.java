package rvf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.ui.activation.flow.TransitTicketActivationFlow;
import com.revolut.feature.transport.impl.ui.activation.flow.TransitTicketActivationFlowContract$InputData;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.feature.transport.models.transit.PurchasedTransportTicketActivationProviderParams;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.d0;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends n implements d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ouf.a f257776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sf0.h f257777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v60.e f257778n;
    public final j60.a o;

    public i(ouf.a interactor, sf0.h serverErrorParser, v60.e serverErrorsProvider, j60.a expandableDialogExtension) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(expandableDialogExtension, "expandableDialogExtension");
        this.f257776l = interactor;
        this.f257777m = serverErrorParser;
        this.f257778n = serverErrorsProvider;
        this.o = expandableDialogExtension;
    }

    public final void Z2(PurchasedTransitTicket.ToBeActivated ticket) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        PurchasedTransportTicketActivationProviderParams purchasedTransportTicketActivationProviderParams = ticket.f92695t;
        if (purchasedTransportTicketActivationProviderParams == null) {
            A2(new com.revolut.kompot.common.b(new TransitTicketActivationFlow(new TransitTicketActivationFlowContract$InputData(ticket, null)), (ModalDestination.Style) null, 6));
        } else {
            this.o.x(d0.a(new TextLocalisedClause(R$string.transport_ticket_activate_qr_disclaimer_title, u.c(jvf.a.a(purchasedTransportTicketActivationProviderParams.f92704b)), null, 12), new TextLocalisedClause(R$string.transport_ticket_activate_qr_disclaimer_description, u.c(jvf.a.a(purchasedTransportTicketActivationProviderParams.f92705c)), null, 12), new TextLocalisedClause(R$string.transport_ticket_activate_qr_disclaimer_action, null, null, 14), "DIALOG_BUTTON_ID", ticket, 736));
        }
    }
}
