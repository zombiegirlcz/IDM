package u59;

import aii.p;
import aii.u;
import c69.k;
import c69.l;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.masav.api.MasavApi$Toggles$MasavDirectDebits;
import com.revolut.feature.masav.api.MasavApi$Toggles$MasavPayToMerchant;
import com.revolut.feature.masav.api.navigation.MasavDirectDebitsAdjustLimitsDestination;
import com.revolut.feature.masav.api.navigation.MasavDirectDebitsDestination;
import com.revolut.feature.masav.api.navigation.MasavDirectDebitsEditDestination;
import com.revolut.feature.masav.api.navigation.MasavPayToMerchantDestination;
import com.revolut.feature.masav.impl.ui.MasavDirectDebitsFlow;
import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreen;
import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreenContract$InputData;
import com.revolut.feature.masav.impl.ui.payment_authorisation.confirmation.MasavPayToMerchantConfirmationScreen;
import com.revolut.feature.masav.impl.ui.payment_authorisation.confirmation.MasavPayToMerchantConfirmationScreenContract$InputData;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import dki.g;
import java.util.List;
import java.util.Set;
import knm.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ohi.a, nte.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f277401a;

    public a(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f277401a = deeplinkGateways;
    }

    public static void a(g gVar, l lVar) {
        if (lVar instanceof k) {
            b.j(gVar.l1(), new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((k) lVar).f21731a, false, null, 6))));
        }
        gVar.I2();
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nte.a
    public final List e() {
        return v.k(MasavApi$Toggles$MasavDirectDebits.f78088c, MasavApi$Toggles$MasavPayToMerchant.f78089c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        MasavPayToMerchantConfirmationScreenContract$InputData withPendingAction;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof MasavDirectDebitsDestination) {
            MasavDirectDebitsFlow masavDirectDebitsFlow = new MasavDirectDebitsFlow();
            de6.b block = new de6.b(flowModel, 3);
            Intrinsics.checkNotNullParameter(block, "block");
            masavDirectDebitsFlow.H = block;
            return masavDirectDebitsFlow;
        }
        if (destination instanceof MasavDirectDebitsEditDestination) {
            MasavDirectDebitFormScreen masavDirectDebitFormScreen = new MasavDirectDebitFormScreen(new MasavDirectDebitFormScreenContract$InputData.Edit(((MasavDirectDebitsEditDestination) destination).f78092a));
            de6.b block2 = new de6.b(this, flowModel, 4);
            Intrinsics.checkNotNullParameter(block2, "block");
            masavDirectDebitFormScreen.H = block2;
            return masavDirectDebitFormScreen;
        }
        if (destination instanceof MasavDirectDebitsAdjustLimitsDestination) {
            MasavDirectDebitFormScreen masavDirectDebitFormScreen2 = new MasavDirectDebitFormScreen(new MasavDirectDebitFormScreenContract$InputData.AdjustLimits(((MasavDirectDebitsAdjustLimitsDestination) destination).f78090a));
            de6.b block3 = new de6.b(this, flowModel, 5);
            Intrinsics.checkNotNullParameter(block3, "block");
            masavDirectDebitFormScreen2.H = block3;
            return masavDirectDebitFormScreen2;
        }
        if (!(destination instanceof MasavPayToMerchantDestination)) {
            return null;
        }
        MasavPayToMerchantDestination masavPayToMerchantDestination = (MasavPayToMerchantDestination) destination;
        if (masavPayToMerchantDestination instanceof MasavPayToMerchantDestination.WithId) {
            withPendingAction = new MasavPayToMerchantConfirmationScreenContract$InputData.WithId(((MasavPayToMerchantDestination.WithId) destination).f78093a);
        } else {
            if (!(masavPayToMerchantDestination instanceof MasavPayToMerchantDestination.WithPendingAction)) {
                throw new NoWhenBranchMatchedException();
            }
            withPendingAction = new MasavPayToMerchantConfirmationScreenContract$InputData.WithPendingAction(((MasavPayToMerchantDestination.WithPendingAction) destination).f78094a);
        }
        return new MasavPayToMerchantConfirmationScreen(withPendingAction);
    }

    @Override // aii.p
    public final Set h() {
        return this.f277401a;
    }
}
