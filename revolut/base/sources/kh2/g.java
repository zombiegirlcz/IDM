package kh2;

import c12.p0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.wero.api.R$string;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$Destination;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType;
import com.revolut.feature.apm.wero.impl.common.ApmTransferDestinationWero;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements fh2.a {
    public static ApmTransferContract$InputData o(WeroContact weroContact, hrf.f fVar, TransferMoneyPocket transferMoneyPocket) {
        return new ApmTransferContract$InputData(weroContact, fVar, new TextLocalisedClause(R$string.apm_descriptor_transfer_wero_amount_title, null, null, 14), new TextLocalisedClause(R$string.apm_descriptor_transfer_wero_review_title, null, null, 14), new ApmTransferDestinationWero(weroContact), transferMoneyPocket, null, null, null, 16320);
    }

    @Override // ny1.b
    public final KompotDestination a(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new WeroNavigation$Destination(WeroNavigation$StartType.Area.f63019a);
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof WeroContact;
    }

    @Override // ly1.a
    public final boolean d(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return product instanceof ApmWero;
    }

    @Override // ny1.b
    public final KompotDestination f(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new WeroNavigation$Destination(WeroNavigation$StartType.NewContact.f63020a);
    }

    @Override // ny1.c
    public final aii.e g(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        WeroContact recipient = (WeroContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new p0(o(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination l(dx1.a aVar) {
        return new WeroNavigation$Destination(WeroNavigation$StartType.Area.f63019a);
    }

    @Override // ny1.b
    public final KompotDestination m(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        WeroContact recipient = (WeroContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new ApmTransferContract$Destination(o(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination n(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new WeroNavigation$Destination(WeroNavigation$StartType.PaymentArea.f63028a);
    }
}
