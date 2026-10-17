package ls1;

import com.revolut.feature.apm.bizum.api.navigation.BizumFlowDestination;
import com.revolut.feature.apm.bizum.api.navigation.BizumFlowInputData;
import com.revolut.feature.apm.bizum.api.navigation.BizumTransferBridgeFeatureConfig$BridgeDestination;
import com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements fs1.a {
    @Override // ny1.b
    public final KompotDestination a(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new BizumFlowDestination(BizumFlowInputData.StartType.Area.f61557a);
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof BizumContact;
    }

    @Override // ly1.a
    public final boolean d(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return product instanceof ApmBizum;
    }

    @Override // ny1.b
    public final KompotDestination f(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new BizumFlowDestination(BizumFlowInputData.StartType.NewContact.f61558a);
    }

    @Override // ny1.b
    public final KompotDestination l(dx1.a aVar) {
        return new BizumFlowDestination(BizumFlowInputData.StartType.Area.f61557a);
    }

    @Override // ny1.b
    public final KompotDestination m(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        BizumContact recipient = (BizumContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return new BizumTransferBridgeFeatureConfig$BridgeDestination(new BizumTransferInputData(recipient, direction, funding));
    }

    @Override // ny1.b
    public final KompotDestination n(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new BizumFlowDestination(BizumFlowInputData.StartType.RecipientList.f61559a);
    }
}
