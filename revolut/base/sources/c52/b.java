package c52;

import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final ApmQuoteDirection a(ApmTransferContract$InputData apmTransferContract$InputData) {
        Intrinsics.checkNotNullParameter(apmTransferContract$InputData, "<this>");
        ApmTransferDirection apmTransferDirection = apmTransferContract$InputData.f62280a;
        ApmTransferDestination apmTransferDestination = apmTransferContract$InputData.d;
        if (apmTransferDirection instanceof ApmTransferDirection.Outgoing) {
            return new ApmQuoteDirection.Outgoing(apmTransferDestination.getF62480a());
        }
        if (!(apmTransferDirection instanceof ApmTransferDirection.Incoming)) {
            if (!(apmTransferDirection instanceof ApmTransferDirection.AcceptMoneyRequest) && !(apmTransferDirection instanceof ApmTransferDirection.Draft)) {
                throw new NoWhenBranchMatchedException();
            }
            return new ApmQuoteDirection.Outgoing(apmTransferDestination.getF62480a());
        }
        ApmTransferRecipient.Contact contact = ((ApmTransferDirection.Incoming) apmTransferDirection).f62297c;
        Intrinsics.checkNotNullParameter(contact, "<this>");
        if (contact != null) {
            return new ApmQuoteDirection.Incoming(d52.a.a(contact.f62299a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
