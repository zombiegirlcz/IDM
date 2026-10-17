package g72;

import c12.p0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowDestination;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowInputData;
import com.revolut.feature.apm.multibanco.impl.common.ApmTransferDestinationMbWay;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements v62.a {
    public static MultibancoFlowDestination o(dx1.a aVar, MultibancoFlowInputData.StartType startType) {
        return aVar instanceof ApmMultibanco.b ? new MultibancoFlowDestination(MultibancoFlowInputData.StartType.ViaVerde.f62552a) : new MultibancoFlowDestination(startType);
    }

    public static ApmTransferContract$InputData p(MultibancoContact contact, hrf.f fVar, TransferMoneyPocket transferMoneyPocket) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_descriptor_transfer_multibanco_amount_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.apm_descriptor_transfer_multibanco_review_title, null, null, 14);
        Intrinsics.checkNotNullParameter(contact, "contact");
        return new ApmTransferContract$InputData(contact, fVar, textLocalisedClause, textLocalisedClause2, new ApmTransferDestinationMbWay("MBWAY", new ApmTransferDestinationMbWay.Body(t02.e.a(contact), t02.e.b(contact), contact.f62132b.f62110b)), transferMoneyPocket, null, null, null, 16320);
    }

    @Override // ny1.b
    public final KompotDestination a(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return o(product, MultibancoFlowInputData.StartType.Area.f62547a);
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof MultibancoContact;
    }

    @Override // ly1.a
    public final boolean d(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return (product instanceof ApmMultibanco) || (product instanceof ApmMultibanco.b);
    }

    @Override // ny1.b
    public final KompotDestination f(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return o(product, MultibancoFlowInputData.StartType.NewContact.f62549a);
    }

    @Override // ny1.c
    public final aii.e g(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        MultibancoContact recipient = (MultibancoContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new p0(p(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination l(dx1.a aVar) {
        return o(aVar, MultibancoFlowInputData.StartType.Area.f62547a);
    }

    @Override // ny1.b
    public final KompotDestination m(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        MultibancoContact recipient = (MultibancoContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new ApmTransferContract$Destination(p(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination n(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return o(product, MultibancoFlowInputData.StartType.RecipientList.f62551a);
    }
}
