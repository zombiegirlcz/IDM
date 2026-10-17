package pd2;

import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.SpinContact;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$Destination;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$StartType;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$TransferDestination;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kq2.g;
import qua.p;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements od2.a {
    @Override // ny1.b
    public final KompotDestination a(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new SpinNavigation$Destination(SpinNavigation$StartType.RecipientList.f62864a);
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof SpinContact;
    }

    @Override // ly1.a
    public final boolean d(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return product instanceof ApmSpin;
    }

    @Override // ny1.b
    public final KompotDestination f(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new SpinNavigation$Destination(SpinNavigation$StartType.NewContact.f62863a);
    }

    @Override // ny1.b
    public final KompotDestination l(dx1.a aVar) {
        return new SpinNavigation$Destination(SpinNavigation$StartType.RecipientList.f62864a);
    }

    @Override // ny1.b
    public final KompotDestination m(ApmContact apmContact, hrf.f direction, TransferMoneyPocket funding) {
        SpinContact recipient = (SpinContact) apmContact;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        f5j.a aVar = recipient.f62156g;
        return aVar != null ? new BankTransferBridgeFeatureConfig.BridgeDestination(new BankTransferInputData(aVar, (TransferFlowType) TransferFlowType.Default.f92257b, (BankTransferInputReference) null, funding, m1l.a.SCHEDULE_ENABLED, new TransferScheduleData(0L, (jli.c) null, 7), (p) null, new FlowExtras(new FinishCommand(null, null, null, 7)), r0.g(), (UltimateDebtor) null, (g) null, (Set) null, false, (ScannedBillDetails) null, (TransferAppSource.AIR_WIDGET) null, 65024)) : new SpinNavigation$TransferDestination(recipient);
    }

    @Override // ny1.b
    public final KompotDestination n(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new SpinNavigation$Destination(SpinNavigation$StartType.RecipientList.f62864a);
    }
}
