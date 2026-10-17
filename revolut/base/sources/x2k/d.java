package x2k;

import aii.g;
import aii.p;
import aii.u;
import com.revolut.retail.feature.payments.bank_transfer.api.PaymentsBankTransferApi$FeatureToggles;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferReviewDescriptor;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferWithdrawalBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BeneficiaryDetailsDescriptor;
import com.revolut.retail.feature.payments.bank_transfer.impl.comparison.navigation.PriceComparisonDestination;
import com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.PriceComparisonScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui.PriceComparisonScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.country_chooser.PaymentsCountryChooserScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.BankTransferEntryFlow;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.BankTransferNavigatingEntryFlow;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.beneficiary_details.BeneficiaryDetailsController;
import d2k.j;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import od0.h;
import od0.i;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements ohi.a, nte.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue2.a f302599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f302600b;

    public d(ue2.a paymentsUpiFeatureHandlerDelegate) {
        Intrinsics.checkNotNullParameter(paymentsUpiFeatureHandlerDelegate, "paymentsUpiFeatureHandlerDelegate");
        this.f302599a = paymentsUpiFeatureHandlerDelegate;
        this.f302600b = y0.b(new c());
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        af2.b bVar = (af2.b) this.f302599a;
        if (bVar.c()) {
            return bVar.b(descriptor);
        }
        if (descriptor instanceof BankTransferReviewDescriptor) {
            BankTransferReviewDescriptor bankTransferReviewDescriptor = (BankTransferReviewDescriptor) descriptor;
            return bankTransferReviewDescriptor.a(new BankTransferEntryFlow(bankTransferReviewDescriptor.getF101962a()));
        }
        if (descriptor instanceof com.revolut.retail.feature.payments.bank_transfer.api.navigation.a) {
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.a aVar = (com.revolut.retail.feature.payments.bank_transfer.api.navigation.a) descriptor;
            BankTransferFlowInputData.NewTransfer newTransferC = aVar.c();
            h hVar = i.Companion;
            i1j.a aVarB = aVar.b();
            hVar.getClass();
            return aVar.a(new BankTransferEntryFlow(newTransferC, h.a(aVarB)));
        }
        if (descriptor instanceof j) {
            j jVar = (j) descriptor;
            return jVar.a(new PaymentsCountryChooserScreen(jVar.b(), jVar.c()));
        }
        if (!(descriptor instanceof BeneficiaryDetailsDescriptor)) {
            return null;
        }
        BeneficiaryDetailsDescriptor beneficiaryDetailsDescriptor = (BeneficiaryDetailsDescriptor) descriptor;
        return beneficiaryDetailsDescriptor.a(new BeneficiaryDetailsController(beneficiaryDetailsDescriptor.getF101965a()));
    }

    @Override // nte.a
    public final List e() {
        return PaymentsBankTransferApi$FeatureToggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BankTransferBridgeFeatureConfig.BridgeDestination) {
            BankTransferBridgeFeatureConfig.BridgeDestination bridgeDestination = (BankTransferBridgeFeatureConfig.BridgeDestination) destination;
            af2.b bVar = (af2.b) this.f302599a;
            return bVar.c() ? bVar.a(bridgeDestination, flowModel) : new BankTransferNavigatingEntryFlow(bridgeDestination.f101923a);
        }
        if (destination instanceof BankTransferWithdrawalBridgeFeatureConfig.BridgeDestination) {
            return new BankTransferNavigatingEntryFlow(((BankTransferWithdrawalBridgeFeatureConfig.BridgeDestination) destination).getF101964a());
        }
        if (!(destination instanceof PriceComparisonDestination)) {
            return null;
        }
        PriceComparisonDestination priceComparisonDestination = (PriceComparisonDestination) destination;
        return new PriceComparisonScreen(new PriceComparisonScreenContract$InputData(priceComparisonDestination.getF101992a(), priceComparisonDestination.getF101993b(), priceComparisonDestination.getF101994c()));
    }

    @Override // aii.p
    public final Set h() {
        return this.f302600b;
    }
}
