package oy1;

import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.core.api.product.ApmProductIncomplete;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.core.gateway.impl.common.UnsupportedApmContact;
import com.revolut.feature.apm.core.gateway.impl.common.UnsupportedApmProduct;
import com.revolut.feature.apm.core.models.recipients.ApmBeneficiary;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.payid.api.navigation.PayIdCreateContactDestination;
import com.revolut.feature.apm.payid.api.navigation.PayIdDestination;
import com.revolut.feature.apm.upi.api.UpiFeatureConfig;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dx1.h;
import hrf.f;
import java.util.Iterator;
import java.util.Set;
import jli.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kq2.g;
import org.jetbrains.annotations.NotNull;
import qua.p;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements ny1.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f230872a;

    public b(Set set) {
        Intrinsics.checkNotNullParameter(set, "set");
        this.f230872a = set;
    }

    public final ParcelableDestination b(h product) {
        Intrinsics.checkNotNullParameter(product, "product");
        if (product instanceof dx1.a) {
            dx1.a aVar = (dx1.a) product;
            return f(aVar).l(aVar);
        }
        if (!(product instanceof ApmProductIncomplete)) {
            throw new NoWhenBranchMatchedException();
        }
        ApmProductIncomplete apmProductIncomplete = (ApmProductIncomplete) product;
        if (apmProductIncomplete.equals(ApmPayId.f61819c)) {
            return PayIdDestination.f62693a;
        }
        if (apmProductIncomplete.equals(ApmUpi.f61828c)) {
            return UpiFeatureConfig.Area.f62932g.f98274b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ParcelableDestination c(h product) {
        Intrinsics.checkNotNullParameter(product, "product");
        if (product instanceof dx1.a) {
            dx1.a aVar = (dx1.a) product;
            return f(aVar).f(aVar);
        }
        if (!(product instanceof ApmProductIncomplete)) {
            throw new NoWhenBranchMatchedException();
        }
        ApmProductIncomplete apmProductIncomplete = (ApmProductIncomplete) product;
        if (apmProductIncomplete.equals(ApmPayId.f61819c)) {
            return PayIdCreateContactDestination.f62692a;
        }
        if (apmProductIncomplete.equals(ApmUpi.f61828c)) {
            return UpiFeatureConfig.TransferInputIdOrMobile.f62954g.f98274b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ParcelableDestination d(h product) {
        Intrinsics.checkNotNullParameter(product, "product");
        if (product instanceof dx1.a) {
            dx1.a aVar = (dx1.a) product;
            return f(aVar).n(aVar);
        }
        if (!(product instanceof ApmProductIncomplete)) {
            throw new NoWhenBranchMatchedException();
        }
        ApmProductIncomplete apmProductIncomplete = (ApmProductIncomplete) product;
        if (apmProductIncomplete.equals(ApmPayId.f61819c)) {
            return PayIdDestination.f62693a;
        }
        if (apmProductIncomplete.equals(ApmUpi.f61828c)) {
            return UpiFeatureConfig.TransferInputIdOrMobile.f62954g.f98274b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ny1.b e(ApmContact apmContact) {
        Object next;
        Iterator it8 = this.f230872a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ny1.b) next).b(apmContact)) {
                break;
            }
        }
        ny1.b bVar = (ny1.b) next;
        if (bVar != null) {
            return bVar;
        }
        throw new UnsupportedApmContact("ApmNavigationProvider", apmContact);
    }

    public final ny1.b f(dx1.a aVar) {
        Object next;
        Iterator it8 = this.f230872a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ny1.b) next).d(aVar)) {
                break;
            }
        }
        ny1.b bVar = (ny1.b) next;
        if (bVar != null) {
            return bVar;
        }
        throw new UnsupportedApmProduct("ApmNavigationProvider", aVar);
    }

    public final KompotDestination g(ApmRecipient recipient, f direction, TransferMoneyPocket funding) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        if (!(recipient instanceof ApmContact)) {
            if (recipient instanceof ApmBeneficiary) {
                return new BankTransferBridgeFeatureConfig.BridgeDestination(new BankTransferInputData(((ApmBeneficiary) recipient).s(), (TransferFlowType) TransferFlowType.Default.f92257b, (BankTransferInputReference) null, funding, m1l.a.SCHEDULE_ENABLED, new TransferScheduleData(0L, (c) null, 7), (p) null, new FlowExtras(new FinishCommand(null, null, null, 7)), r0.g(), (UltimateDebtor) null, (g) null, (Set) null, false, (ScannedBillDetails) null, (TransferAppSource.AIR_WIDGET) null, 65024));
            }
            throw new NoWhenBranchMatchedException();
        }
        ApmContact contact = (ApmContact) recipient;
        ny1.b bVarE = e(contact);
        Intrinsics.checkNotNullParameter(bVarE, "<this>");
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(funding, "funding");
        return bVarE.m(contact, direction, funding);
    }
}
