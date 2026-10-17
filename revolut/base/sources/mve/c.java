package mve;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.topup_screen.api.destination.CheckoutCustomAmountBridgeDestination;
import com.revolut.feature.topup_screen.api.destination.ExternalCardDetailsDestination;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.topup_screen.api.destination.StoredMethodDestination;
import com.revolut.feature.topup_screen.impl.destination.CvvDestination;
import com.revolut.feature.topup_screen.impl.destination.RevertTransferDestination;
import com.revolut.feature.topup_screen.impl.destination.ThreeDsDestination;
import com.revolut.feature.topup_screen.impl.destination.TopupFlowDestination;
import com.revolut.feature.topup_screen.impl.flow.add_card.AddCardFlow;
import com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlow;
import com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flow.init_top_up.InitTopUpFlow;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreen;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.cvv.flow.CvvFlow;
import com.revolut.feature.topup_screen.impl.flows.revert_transfer.RevertTransferFlow;
import com.revolut.feature.topup_screen.impl.flows.stored_method.flow.StoredMethodFlow;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.edit_label.EditStoredMethodLabelScreen;
import com.revolut.feature.topup_screen.impl.flows.three_ds_flow.ThreeDsFlow;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlow;
import com.revolut.feature.topup_screen.impl.flows.topup.limits.TopUpLimitsBottomSheetController;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade.FacadeCardTopupFlow;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.TopupWithNewCardFlow;
import com.revolut.feature.topup_screen.impl.google_pay.flow.GooglePayFlow;
import com.revolut.feature.topup_screen.impl.mcy.McyTopupFlow;
import com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreen;
import com.revolut.navigation.destination.McyTopupAccountVerificationDestination;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ote.d;
import ste.a0;
import ste.f;
import ste.k;
import ste.q;
import ste.v;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements ohi.a, nte.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f209251a;

    public c(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f209251a = deeplinkGateways;
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof sli.b) {
            return ((sli.b) descriptor).a(new AddCardFlow());
        }
        if (descriptor instanceof k) {
            k kVar = (k) descriptor;
            return kVar.a(new FacadeCardTopupFlow(kVar.b()));
        }
        if (descriptor instanceof a0) {
            a0 a0Var = (a0) descriptor;
            return a0Var.a(new TopupWithNewCardFlow(a0Var.b()));
        }
        if (descriptor instanceof ste.c) {
            ste.c cVar = (ste.c) descriptor;
            return cVar.a(new CardDetailsScreen(cVar.b()));
        }
        if (descriptor instanceof ste.p) {
            ste.p pVar = (ste.p) descriptor;
            return pVar.a(gc0.c.b(new GooglePayFlow(pVar.b()), new aab.b(25)));
        }
        if (descriptor instanceof v) {
            v vVar = (v) descriptor;
            return vVar.a(new TopUpLimitsBottomSheetController(vVar.b()));
        }
        if (descriptor instanceof f) {
            f fVar = (f) descriptor;
            return fVar.a(new EditStoredMethodLabelScreen(fVar.b()));
        }
        if (!(descriptor instanceof q)) {
            return null;
        }
        q qVar = (q) descriptor;
        return qVar.a(new InitTopUpFlow(new gwe.c(qVar.b())));
    }

    @Override // nte.a
    public final List e() {
        return d0.E0(d.a(), TopupApi$Toggles.a());
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof McyTopupAccountVerificationDestination) {
            McyTopupAccountVerificationDestination mcyTopupAccountVerificationDestination = (McyTopupAccountVerificationDestination) destination;
            return new McyTopupFlow(new McyTopupFlowContract$InputData.AccountVerification(mcyTopupAccountVerificationDestination.getF98465c(), mcyTopupAccountVerificationDestination.getD(), mcyTopupAccountVerificationDestination.getF98464b(), mcyTopupAccountVerificationDestination.getF98463a()));
        }
        if (destination instanceof TopupFlowDestination) {
            TopupFlowDestination topupFlowDestination = (TopupFlowDestination) destination;
            return new TopupFlow(new uye.g(topupFlowDestination.f90590a, topupFlowDestination.f90591b, topupFlowDestination.f90592c, topupFlowDestination.d, topupFlowDestination.e, topupFlowDestination.f));
        }
        if (destination instanceof CvvDestination) {
            CvvDestination cvvDestination = (CvvDestination) destination;
            return new CvvFlow(new nxe.b(cvvDestination.f90584a, cvvDestination.f90585b));
        }
        if (destination instanceof ThreeDsDestination) {
            ThreeDsDestination threeDsDestination = (ThreeDsDestination) destination;
            return new ThreeDsFlow(new dye.b(threeDsDestination.f90587a, threeDsDestination.f90588b, threeDsDestination.f90589c));
        }
        if (destination instanceof StoredMethodDestination) {
            StoredMethodDestination storedMethodDestination = (StoredMethodDestination) destination;
            return new StoredMethodFlow(new sxe.c(storedMethodDestination.getF90511a(), storedMethodDestination.getF90512b(), storedMethodDestination.getF90513c(), null));
        }
        if (destination instanceof RevertTransferDestination) {
            return new RevertTransferFlow(new rxe.c(((RevertTransferDestination) destination).getF90586a()));
        }
        if (destination instanceof ExternalCardDetailsDestination) {
            ExternalCardDetailsDestination externalCardDetailsDestination = (ExternalCardDetailsDestination) destination;
            String f90507a = externalCardDetailsDestination.getF90507a();
            return new ExternalCardDetailsFlow(new ExternalCardDetailsFlowContract$InputData(externalCardDetailsDestination.getF90509c(), externalCardDetailsDestination.getF90508b(), f90507a, externalCardDetailsDestination.getD()));
        }
        if (destination instanceof InitTopUpDestination) {
            return new InitTopUpFlow(new gwe.c(((InitTopUpDestination) destination).getF90510a()));
        }
        if (!(destination instanceof CheckoutCustomAmountBridgeDestination)) {
            return null;
        }
        CheckoutCustomAmountBridgeDestination checkoutCustomAmountBridgeDestination = (CheckoutCustomAmountBridgeDestination) destination;
        return gc0.c.b(new CheckoutCustomAmountScreen(new CheckoutCustomAmountScreenContract$InputData(checkoutCustomAmountBridgeDestination.getF90504a(), checkoutCustomAmountBridgeDestination.getF90505b())), new c3b.b(destination, 1));
    }

    @Override // aii.p
    public final Set h() {
        return this.f209251a;
    }
}
