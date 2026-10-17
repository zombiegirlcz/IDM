package bu1;

import c12.p0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.blik.api.navigation.BlikFlowDestination;
import com.revolut.feature.apm.blik.impl.common.ApmTransferDestinationBlik;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements wt1.a {
    public static ApmTransferContract$InputData o(BlikContact contact, hrf.f fVar, TransferMoneyPocket transferMoneyPocket) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_product_blik_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.apm_product_blik_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transfer_amount_note_phone_transfer, null, null, 14);
        Intrinsics.checkNotNullParameter(contact, "contact");
        return new ApmTransferContract$InputData(contact, fVar, textLocalisedClause, textLocalisedClause2, new ApmTransferDestinationBlik("BLIK_P2P", new ApmTransferDestinationBlik.Body(t02.e.a(contact), t02.e.b(contact))), transferMoneyPocket, textLocalisedClause3, null, null, 16064);
    }

    @Override // ny1.b
    public final KompotDestination a(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        xi0.b.Companion.getClass();
        return new BlikFlowDestination(new BlikFlowDestination.StartType.OpenBlikCode(xi0.b.k));
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof BlikContact;
    }

    @Override // ly1.a
    public final boolean d(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return product instanceof ApmBlik;
    }

    @Override // ny1.b
    public final KompotDestination f(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new BlikFlowDestination(BlikFlowDestination.StartType.NewContact.f61649a);
    }

    @Override // ny1.c
    public final aii.e g(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        BlikContact recipient = (BlikContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new p0(o(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination l(dx1.a aVar) {
        xi0.b.Companion.getClass();
        return new BlikFlowDestination(new BlikFlowDestination.StartType.OpenBlikCode(xi0.b.k));
    }

    @Override // ny1.b
    public final KompotDestination m(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        BlikContact recipient = (BlikContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new ApmTransferContract$Destination(o(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination n(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new BlikFlowDestination(BlikFlowDestination.StartType.RecipientList.f61652a);
    }
}
