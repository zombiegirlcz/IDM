package g9h;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureDescriptor;
import com.revolut.feature.wealth.api.declaration.DualAddMoneyDestination;
import com.revolut.feature.wealth.api.declaration.InstrumentsCollectionDestination;
import com.revolut.feature.wealth.api.declaration.PopularAssetsDestination;
import com.revolut.feature.wealth.api.declaration.WithdrawFeatureConfig;
import com.revolut.feature.wealth.api.declaration.WithdrawFeatureDescriptor;
import com.revolut.feature.wealth.api.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerContract$Descriptor;
import com.revolut.feature.wealth.api.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerContract$Destination;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Descriptor;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Destination;
import com.revolut.feature.wealth.impl.ui.flows.add_money.InvestAddMoneyFlow;
import com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlow;
import com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlowContract$Input;
import com.revolut.feature.wealth.impl.ui.flows.dual_add_money.DualAddMoneyFlow;
import com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management.RecurringTransferManagementFlow;
import com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management.RecurringTransferManagementFlowContract$Input;
import com.revolut.feature.wealth.impl.ui.flows.withdraw.WithdrawFlow;
import com.revolut.feature.wealth.impl.ui.flows.withdraw.WithdrawFlowContract$Input;
import com.revolut.feature.wealth.impl.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerFlow;
import com.revolut.feature.wealth.impl.ui.invest.transactions.list.screen.InvestTransactionsListScreen;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionController;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionControllerContract$InputData;
import com.revolut.feature.wealth.impl.ui.screens.popularassets.PopularAssetsController;
import com.revolut.feature.wealth.impl.ui.screens.popularassets.PopularAssetsControllerContract$InputData;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f141877a;

    public g(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f141877a = deeplinkGateways;
    }

    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof InvestTransactionDetailsPagerContract$Descriptor) {
            InvestTransactionDetailsPagerContract$Descriptor investTransactionDetailsPagerContract$Descriptor = (InvestTransactionDetailsPagerContract$Descriptor) descriptor;
            return investTransactionDetailsPagerContract$Descriptor.a(new InvestTransactionDetailsPagerFlow(investTransactionDetailsPagerContract$Descriptor.getF95355a()));
        }
        if (descriptor instanceof InvestTransactionsListContract$Descriptor) {
            InvestTransactionsListContract$Descriptor investTransactionsListContract$Descriptor = (InvestTransactionsListContract$Descriptor) descriptor;
            return investTransactionsListContract$Descriptor.a(new InvestTransactionsListScreen(investTransactionsListContract$Descriptor.getF95359a()));
        }
        if (descriptor instanceof AddMoneyFeatureDescriptor) {
            AddMoneyFeatureDescriptor addMoneyFeatureDescriptor = (AddMoneyFeatureDescriptor) descriptor;
            return addMoneyFeatureDescriptor.a(new InvestAddMoneyFlow(addMoneyFeatureDescriptor.getF95191a(), addMoneyFeatureDescriptor.getF95192b()));
        }
        if (!(descriptor instanceof WithdrawFeatureDescriptor)) {
            return null;
        }
        WithdrawFeatureDescriptor withdrawFeatureDescriptor = (WithdrawFeatureDescriptor) descriptor;
        return withdrawFeatureDescriptor.a(new WithdrawFlow(new WithdrawFlowContract$Input(withdrawFeatureDescriptor.getF95222a().f95219a, withdrawFeatureDescriptor.getF95222a().f95220b, withdrawFeatureDescriptor.getF95222a().f95221c), withdrawFeatureDescriptor.getF95223b()));
    }

    @Override // nte.a
    public final List e() {
        return FeatureWealthApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AddMoneyFeatureConfig.ManageRecurringFunding.Destination) {
            AddMoneyFeatureConfig.ManageRecurringFunding.Destination destination2 = (AddMoneyFeatureConfig.ManageRecurringFunding.Destination) destination;
            String str = destination2.f95189a;
            if (f.f141876a[destination2.f95190b.ordinal()] == 1) {
                return new RecurringTransferManagementFlow(new RecurringTransferManagementFlowContract$Input(str, sah.a.ROBO));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (destination instanceof AddMoneyFeatureConfig.CompositeAddMoney.Destination) {
            return new InvestAddMoneyFlow(((AddMoneyFeatureConfig.CompositeAddMoney.Destination) destination).f95173a);
        }
        if (destination instanceof AddMoneyFeatureConfig.EditRecurringDeposit.Destination) {
            AddMoneyFeatureConfig.EditRecurringDeposit.Destination destination3 = (AddMoneyFeatureConfig.EditRecurringDeposit.Destination) destination;
            return gc0.c.b(new CompositeAddMoneyFlow(new CompositeAddMoneyFlowContract$Input.UpdateRecurringDeposit(destination3.f95185a, destination3.f95186b)), new ask.a(6));
        }
        if (destination instanceof WithdrawFeatureConfig.Destination) {
            WithdrawFeatureConfig.Destination destination4 = (WithdrawFeatureConfig.Destination) destination;
            return new WithdrawFlow(new WithdrawFlowContract$Input(destination4.f95219a, destination4.f95220b, destination4.f95221c));
        }
        if (destination instanceof InvestTransactionsListContract$Destination) {
            return new InvestTransactionsListScreen(((InvestTransactionsListContract$Destination) destination).f95360a);
        }
        if (destination instanceof InstrumentsCollectionDestination) {
            return new InstrumentsCollectionController(new InstrumentsCollectionControllerContract$InputData(((InstrumentsCollectionDestination) destination).getF95202a()));
        }
        if (destination instanceof PopularAssetsDestination) {
            PopularAssetsDestination popularAssetsDestination = (PopularAssetsDestination) destination;
            return new PopularAssetsController(new PopularAssetsControllerContract$InputData(popularAssetsDestination.getF95210a(), popularAssetsDestination.getF95211b()));
        }
        if (destination instanceof DualAddMoneyDestination) {
            DualAddMoneyDestination dualAddMoneyDestination = (DualAddMoneyDestination) destination;
            return new DualAddMoneyFlow(new oah.d(dualAddMoneyDestination.getF95198a(), dualAddMoneyDestination.getF95199b(), dualAddMoneyDestination.getF95200c(), dualAddMoneyDestination.getD(), dualAddMoneyDestination.getE(), dualAddMoneyDestination.getF(), dualAddMoneyDestination.getF95201g()));
        }
        if (destination instanceof InvestTransactionDetailsPagerContract$Destination) {
            return new InvestTransactionDetailsPagerFlow(((InvestTransactionDetailsPagerContract$Destination) destination).getF95356a());
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f141877a;
    }
}
