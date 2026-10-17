package w52;

import c12.p0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.iris.api.R$string;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$Destination;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$StartType;
import com.revolut.feature.apm.iris.impl.common.ApmTransferDestinationIris;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements r52.a {
    public static ApmTransferContract$InputData p(IrisContact irisContact, hrf.f fVar, TransferMoneyPocket transferMoneyPocket, ApmPaymentProfile apmPaymentProfile) {
        return new ApmTransferContract$InputData(irisContact, fVar, new TextLocalisedClause(R$string.apm_descriptor_transfer_iris_amount_title, null, null, 14), new TextLocalisedClause(R$string.apm_descriptor_transfer_iris_review_title, null, null, 14), new ApmTransferDestinationIris(irisContact), transferMoneyPocket, null, apmPaymentProfile, null, 12224);
    }

    @Override // ny1.b
    public final KompotDestination a(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new IrisNavigation$Destination(IrisNavigation$StartType.Settings.f62492a, product instanceof ApmIris.b ? ApmPaymentProfile.PRO : ApmPaymentProfile.PERSONAL);
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof IrisContact;
    }

    @Override // ly1.a
    public final boolean d(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return (product instanceof ApmIris) || (product instanceof ApmIris.b);
    }

    @Override // ny1.b
    public final KompotDestination f(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new IrisNavigation$Destination(IrisNavigation$StartType.NewContact.f62486a, product instanceof ApmIris.b ? ApmPaymentProfile.PRO : ApmPaymentProfile.PERSONAL);
    }

    @Override // ny1.c
    public final aii.e g(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        IrisContact recipient = (IrisContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new p0(p(recipient, direction, funding, ApmPaymentProfile.PERSONAL));
    }

    @Override // ny1.b
    public final KompotDestination l(dx1.a aVar) {
        return new IrisNavigation$Destination(IrisNavigation$StartType.Area.f62485a, aVar instanceof ApmIris.b ? ApmPaymentProfile.PRO : ApmPaymentProfile.PERSONAL);
    }

    @Override // ny1.b
    public final KompotDestination m(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        IrisContact recipient = (IrisContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new ApmTransferContract$Destination(p(recipient, direction, funding, ApmPaymentProfile.PERSONAL));
    }

    @Override // ny1.b
    public final KompotDestination n(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new IrisNavigation$Destination(IrisNavigation$StartType.RecipientList.f62491a, product instanceof ApmIris.b ? ApmPaymentProfile.PRO : ApmPaymentProfile.PERSONAL);
    }

    public final p0 o(IrisContact recipient, hrf.f direction, TransferMoneyPocket funding, ApmPaymentProfile paymentProfile) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        Intrinsics.checkNotNullParameter(paymentProfile, "paymentProfile");
        return new p0(p(recipient, direction, funding, paymentProfile));
    }
}
