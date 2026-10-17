package sca;

import com.revolut.feature.apm.core.api.product.ApmPix;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.pix.api.navigation.PixAreaNavigation$Destination;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$Destination;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements h8a.a {
    @Override // ny1.b
    public final KompotDestination a(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new PixAreaNavigation$Destination(0);
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof PixContact;
    }

    @Override // ly1.a
    public final boolean d(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return product instanceof ApmPix;
    }

    @Override // ny1.b
    public final KompotDestination f(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new PixTransferNavigation$Destination(new PixTransferNavigation$InputData.NewContact(0));
    }

    @Override // ny1.c
    public final aii.e g(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        PixContact recipient = (PixContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new com.revolut.feature.pix.api.navigation.a(new PixTransferNavigation$InputData.ApmTransfer(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination l(dx1.a aVar) {
        return new PixAreaNavigation$Destination(0);
    }

    @Override // ny1.b
    public final KompotDestination m(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        PixContact recipient = (PixContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new PixTransferNavigation$Destination(new PixTransferNavigation$InputData.ApmTransfer(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination n(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new PixTransferNavigation$Destination(new PixTransferNavigation$InputData.NewContact(0));
    }
}
