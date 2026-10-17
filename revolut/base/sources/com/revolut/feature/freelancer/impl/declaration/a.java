package com.revolut.feature.freelancer.impl.declaration;

import aii.u;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.impl.declaration.FreelancerFeatureFlowStep;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.customer.FreelancerAddCustomerScreen;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.customer.FreelancerAddCustomerScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.notes.FreelancerAddNotesScreen;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.notes.FreelancerAddNotesScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.tax_rates.AddTaxRateScreen;
import com.revolut.feature.freelancer.impl.ui.inbound_volume.AnnualInboundVolumeScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.details.flow.InvoiceDetailsFlow;
import com.revolut.feature.freelancer.impl.ui.invoice.details.flow.InvoiceDetailsFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.FreelancerProfileFlow;
import com.revolut.feature.freelancer.impl.ui.profile.FreelancerProfileFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.prompt.post_activation.ProPostActivationScreen;
import com.revolut.feature.freelancer.impl.ui.prompt.post_activation.ProPostActivationScreenContract$Action;
import com.revolut.feature.freelancer.impl.ui.prompt.post_activation.ProPostActivationScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.referral_info.FreelancerReferralInfoScreen;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreen;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.details.OrderInitPageDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.details.OrderInitPageDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.OrderInitPageListScreen;
import com.revolut.kompot.FeatureFlowStep;
import dki.g;
import gc0.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ohi.b;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends b {
    @Override // ohi.b
    public final com.revolut.kompot.navigable.a a(FeatureFlowStep featureFlowStep, g flowModel) {
        ProPostActivationScreenContract$Action selectPlan;
        FreelancerFeatureFlowStep step = (FreelancerFeatureFlowStep) featureFlowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (step instanceof FreelancerFeatureFlowStep.InvoiceDetails) {
            return new InvoiceDetailsFlow(new InvoiceDetailsFlowContract$InputData(((FreelancerFeatureFlowStep.InvoiceDetails) step).getF73525a()));
        }
        if (step instanceof FreelancerFeatureFlowStep.AddTaxRate) {
            return new AddTaxRateScreen();
        }
        if (step instanceof FreelancerFeatureFlowStep.AnnualInboundVolume) {
            return new AnnualInboundVolumeScreen();
        }
        if (step instanceof FreelancerFeatureFlowStep.SalesFilters) {
            return new FreelancerSalesFiltersScreen(new FreelancerSalesFiltersScreenContract$InputData(((FreelancerFeatureFlowStep.SalesFilters) step).getF73532a()));
        }
        if (step instanceof FreelancerFeatureFlowStep.AddCustomer) {
            FreelancerFeatureFlowStep.AddCustomer addCustomer = (FreelancerFeatureFlowStep.AddCustomer) step;
            return new FreelancerAddCustomerScreen(new FreelancerAddCustomerScreenContract$InputData(addCustomer.getF73518a(), addCustomer.getF73519b(), addCustomer.getF73520c(), addCustomer.getD(), addCustomer.getE(), addCustomer.getF()));
        }
        if (step instanceof FreelancerFeatureFlowStep.FreelancerProfile) {
            return new FreelancerProfileFlow(new FreelancerProfileFlowContract$InputData(((FreelancerFeatureFlowStep.FreelancerProfile) step).getF73524a()));
        }
        if (step instanceof FreelancerFeatureFlowStep.AddInvoiceNotes) {
            return c.b(new FreelancerAddNotesScreen(new FreelancerAddNotesScreenContract$InputData(((FreelancerFeatureFlowStep.AddInvoiceNotes) step).getF73521a())), new ogk.b(22));
        }
        if (step instanceof FreelancerFeatureFlowStep.OrderInitPageList) {
            return new OrderInitPageListScreen();
        }
        if (step instanceof FreelancerFeatureFlowStep.OrderInitPageDetails) {
            return new OrderInitPageDetailsScreen(new OrderInitPageDetailsScreenContract$InputData(((FreelancerFeatureFlowStep.OrderInitPageDetails) step).getF73526a()));
        }
        if (!(step instanceof FreelancerFeatureFlowStep.ProPostActivationPrompt)) {
            if (step.equals(FreelancerFeatureFlowStep.ReferralInfo.f73531a)) {
                return new FreelancerReferralInfoScreen();
            }
            throw new NoWhenBranchMatchedException();
        }
        FreelancerFeatureFlowStep.ProPostActivationPrompt proPostActivationPrompt = (FreelancerFeatureFlowStep.ProPostActivationPrompt) step;
        dr6.a f73528a = proPostActivationPrompt.getF73528a();
        FreelancerBizFeatureConfig.ProPostActivationPromptDestination.NotNowAction f73529b = proPostActivationPrompt.getF73529b();
        if (Intrinsics.f(f73529b, FreelancerBizFeatureConfig.ProPostActivationPromptDestination.NotNowAction.DoNothing.f73235a)) {
            selectPlan = ProPostActivationScreenContract$Action.DoNothing.f74089a;
        } else if (f73529b instanceof FreelancerBizFeatureConfig.ProPostActivationPromptDestination.NotNowAction.IssueVirtualCard) {
            selectPlan = new ProPostActivationScreenContract$Action.IssueVirtualCard(((FreelancerBizFeatureConfig.ProPostActivationPromptDestination.NotNowAction.IssueVirtualCard) proPostActivationPrompt.getF73529b()).getF73236a(), ((FreelancerBizFeatureConfig.ProPostActivationPromptDestination.NotNowAction.IssueVirtualCard) proPostActivationPrompt.getF73529b()).getF73237b());
        } else {
            if (!(f73529b instanceof FreelancerBizFeatureConfig.ProPostActivationPromptDestination.NotNowAction.SelectPlan)) {
                throw new NoWhenBranchMatchedException();
            }
            selectPlan = new ProPostActivationScreenContract$Action.SelectPlan(((FreelancerBizFeatureConfig.ProPostActivationPromptDestination.NotNowAction.SelectPlan) proPostActivationPrompt.getF73529b()).getF73238a());
        }
        return new ProPostActivationScreen(new ProPostActivationScreenContract$InputData(f73528a, selectPlan, proPostActivationPrompt.getF73530c()));
    }

    @Override // ohi.b
    public final nhi.c c(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof FreelancerBizFeatureConfig.InvoiceDetailsNavigationDestination) {
            return new nhi.c(new FreelancerFeatureFlowStep.InvoiceDetails(((FreelancerBizFeatureConfig.InvoiceDetailsNavigationDestination) destination).f73211a));
        }
        if (destination instanceof FreelancerBizFeatureConfig.AddTaxRateNavigationDestination) {
            return new nhi.c(FreelancerFeatureFlowStep.AddTaxRate.f73522a);
        }
        if (destination instanceof FreelancerBizFeatureConfig.AnnualInboundVolumeDestination) {
            return new nhi.c(FreelancerFeatureFlowStep.AnnualInboundVolume.f73523a);
        }
        if (destination instanceof FreelancerBizFeatureConfig.SalesFiltersDestination) {
            return new nhi.c(new FreelancerFeatureFlowStep.SalesFilters(((FreelancerBizFeatureConfig.SalesFiltersDestination) destination).f73248a));
        }
        if (destination instanceof FreelancerBizFeatureConfig.AddCustomerDestination) {
            FreelancerBizFeatureConfig.AddCustomerDestination addCustomerDestination = (FreelancerBizFeatureConfig.AddCustomerDestination) destination;
            return new nhi.c(new FreelancerFeatureFlowStep.AddCustomer(addCustomerDestination.f73185a, addCustomerDestination.f73186b, addCustomerDestination.f73187c, addCustomerDestination.d, addCustomerDestination.e, addCustomerDestination.f));
        }
        if (destination instanceof FreelancerBizFeatureConfig.FreelancerProfileDestination) {
            return new nhi.c(new FreelancerFeatureFlowStep.FreelancerProfile(((FreelancerBizFeatureConfig.FreelancerProfileDestination) destination).f73202a));
        }
        if (destination instanceof FreelancerBizFeatureConfig.AddInvoiceNotesDestination) {
            return new nhi.c(new FreelancerFeatureFlowStep.AddInvoiceNotes(((FreelancerBizFeatureConfig.AddInvoiceNotesDestination) destination).f73188a));
        }
        if (destination instanceof FreelancerBizFeatureConfig.OrderInitPageListDestination) {
            return new nhi.c(FreelancerFeatureFlowStep.OrderInitPageList.f73527a);
        }
        if (destination instanceof FreelancerBizFeatureConfig.OrderInitPageDetailsDestination) {
            return new nhi.c(new FreelancerFeatureFlowStep.OrderInitPageDetails(((FreelancerBizFeatureConfig.OrderInitPageDetailsDestination) destination).f73223a));
        }
        if (destination instanceof FreelancerBizFeatureConfig.ProPostActivationPromptDestination) {
            FreelancerBizFeatureConfig.ProPostActivationPromptDestination proPostActivationPromptDestination = (FreelancerBizFeatureConfig.ProPostActivationPromptDestination) destination;
            return new nhi.c(new FreelancerFeatureFlowStep.ProPostActivationPrompt(proPostActivationPromptDestination.f73232a, proPostActivationPromptDestination.f73233b, proPostActivationPromptDestination.f73234c));
        }
        if (destination instanceof FreelancerBizFeatureConfig.ReferralInfoDestination) {
            return new nhi.c(FreelancerFeatureFlowStep.ReferralInfo.f73531a);
        }
        return null;
    }
}
