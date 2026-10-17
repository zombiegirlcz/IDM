package ss6;

import aii.g;
import aii.u;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlowContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlowContract$Step;
import com.revolut.feature.freelancer.api.FreelancerApi$Toggles;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$Invoice$Create;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$Invoice$Edit;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor;
import com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy;
import com.revolut.feature.freelancer.api.ui.controller.contract.FreelancerCashbackUpsellContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.flow.FreelancerAcquiringOrderFlow;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.flow.FreelancerAcquiringOrderFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.flow.FreelancerAcquiringOrderFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.flow.FreelancerAcquiringPaymentFlow;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.flow.FreelancerAcquiringPaymentFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.flow.FreelancerAcquiringPaymentFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlow;
import com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.upsell.FreelancerCashbackUpsellScreen;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.number.FreelancerInvoiceNumberSettingsScreen;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.number.FreelancerInvoiceNumberSettingsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.customer.details.FreelancerCustomerDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.customer.details.FreelancerCustomerDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow.FreelancerPluginAuthFlow;
import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow.FreelancerPluginAuthFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.ManageEcommercePluginFlow;
import com.revolut.feature.freelancer.impl.ui.inbound_volume.AnnualInboundVolumeScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.create.flow.InvoiceCreateFlow;
import com.revolut.feature.freelancer.impl.ui.invoice.create.flow.InvoiceCreateFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.list.InvoiceListScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.list.InvoiceListScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.flow.InvoiceSettingsFlow;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlow;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.perks.flow.FreelancerPerksFlow;
import com.revolut.feature.freelancer.impl.ui.perks.flow.FreelancerPerksFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.perks.flow.FreelancerPerksFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.profile.account_closure.FreelancerAccountClosureScreen;
import com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.FreelancerPromotionIneligibilityFlow;
import com.revolut.feature.freelancer.impl.ui.prompt.restrictions.AccountRestrictionsPromptFlow;
import com.revolut.feature.freelancer.impl.ui.prompt.restrictions.AccountRestrictionsPromptFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.flow.FreelancerSaleDetailsFlow;
import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.flow.FreelancerSaleDetailsFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlow;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.orders.OrderInitPageHistoryScreen;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.orders.OrderInitPageHistoryScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.qr.share.FreelancerQrShareScreen;
import com.revolut.feature.freelancer.impl.ui.sales.qr.share.FreelancerQrShareScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.sales.refund.flow.FreelancerRefundFlow;
import com.revolut.feature.freelancer.impl.ui.sales.refund.flow.FreelancerRefundFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.FreelancerCreateTaxPocketFlow;
import com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.FreelancerCreateTaxPocketFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.subaccount.prompt.flow.FreelancerCreateSubaccountPromptFlow;
import com.revolut.feature.freelancer.impl.ui.subaccount.prompt.flow.FreelancerCreateSubaccountPromptFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.FreelancerUpdateTaxPocketFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.TaxHubFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.TaxHubFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.TaxHubFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow.TaxHubSettingsFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow.TaxHubSettingsFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.flow.FreelancerVatReminderSettingsFlow;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.summary.FreelancerVatSummaryScreen;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.summary.FreelancerVatSummaryScreenContract$InputData;
import ct6.t;
import ct6.v;
import hr6.i;
import hr6.j;
import java.util.List;
import jr6.m;
import jr6.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f265347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f265348b;

    public e(m freelancerDialogFactory, r freelancerPendingPromptFactory, ed1.a litePosFlowProvider) {
        Intrinsics.checkNotNullParameter(freelancerDialogFactory, "freelancerDialogFactory");
        Intrinsics.checkNotNullParameter(freelancerPendingPromptFactory, "freelancerPendingPromptFactory");
        Intrinsics.checkNotNullParameter(litePosFlowProvider, "litePosFlowProvider");
        this.f265347a = freelancerDialogFactory;
        this.f265348b = freelancerPendingPromptFactory;
    }

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof hr6.a) {
            return ((hr6.a) descriptor).a(new AnnualInboundVolumeScreen());
        }
        if (descriptor instanceof FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor) {
            FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor freelancerBizFeatureDescriptor$AccountRestrictionDescriptor = (FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor) descriptor;
            return freelancerBizFeatureDescriptor$AccountRestrictionDescriptor.a(new AccountRestrictionsPromptFlow(new AccountRestrictionsPromptFlowContract$InputData(freelancerBizFeatureDescriptor$AccountRestrictionDescriptor.getF73257a())));
        }
        if (descriptor instanceof hr6.c) {
            hr6.c cVar = (hr6.c) descriptor;
            return cVar.a(new FreelancerCreateTaxPocketFlow(new FreelancerCreateTaxPocketFlowContract$InputData(cVar.d(), cVar.c(), cVar.b())));
        }
        if (descriptor instanceof j) {
            j jVar = (j) descriptor;
            return jVar.a(new FreelancerVatSummaryScreen(new FreelancerVatSummaryScreenContract$InputData(jVar.b(), jVar.c())));
        }
        if (descriptor instanceof hr6.e) {
            return ((hr6.e) descriptor).a(((t) this.f265347a).h());
        }
        if (descriptor instanceof i) {
            i iVar = (i) descriptor;
            return iVar.a(new TaxHubReminderScreen(new TaxHubReminderScreenContract$InputData(iVar.b(), true)));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return FreelancerApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        FreelancerAcquiringOrderFlowContract$Step orderList;
        FreelancerAcquiringPaymentFlowContract$Step paymentList;
        FreelancerPerksFlowContract$Step perksDetails;
        TaxHubFlowContract$Step taxProfile;
        FreelancerSaleDetailsFlowContract$InputData saleId;
        FreelancerCashbackFlowContract$Step freelancerCashbackFlowContract$Step;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof FreelancerBizFeatureConfig.SaleAmountCatalogueSinglePick) {
            return gc0.c.a(new LitePosRootFlow(new LitePosRootFlowContract$InputData(LitePosRootFlowContract$Step.CatalogueSinglePick.f60756a)), new ea0.a(this, 1));
        }
        if (destination instanceof FreelancerBizFeatureConfig.OrderInitPageSaleHistoryDestination) {
            return new OrderInitPageHistoryScreen(new OrderInitPageHistoryScreenContract$InputData(((FreelancerBizFeatureConfig.OrderInitPageSaleHistoryDestination) destination).getF73225a()));
        }
        if (destination instanceof FreelancerBizFeatureConfig.InvoiceListDestination) {
            return new InvoiceListScreen(new InvoiceListScreenContract$InputData(((FreelancerBizFeatureConfig.InvoiceListDestination) destination).f73212a));
        }
        if (destination instanceof FreelancerBizFeatureConfig.InvoiceNumberSettingsDestination) {
            return new FreelancerInvoiceNumberSettingsScreen(new FreelancerInvoiceNumberSettingsScreenContract$InputData(((FreelancerBizFeatureConfig.InvoiceNumberSettingsDestination) destination).getF73213a()));
        }
        if (destination instanceof FreelancerBizFeatureConfig.Cashback) {
            int i = d.f265345a[((FreelancerBizFeatureConfig.Cashback) destination).getF73192a().ordinal()];
            if (i == 1) {
                freelancerCashbackFlowContract$Step = FreelancerCashbackFlowContract$Step.Details.f73741a;
            } else if (i == 2) {
                freelancerCashbackFlowContract$Step = FreelancerCashbackFlowContract$Step.Booster.f73739a;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                freelancerCashbackFlowContract$Step = FreelancerCashbackFlowContract$Step.Plan.f73742a;
            }
            return new FreelancerCashbackFlow(new FreelancerCashbackFlowContract$InputData(freelancerCashbackFlowContract$Step));
        }
        if (destination instanceof FreelancerBizFeatureConfig.CashbackUpsell) {
            return new FreelancerCashbackUpsellScreen(new FreelancerCashbackUpsellContract$InputData(((FreelancerBizFeatureConfig.CashbackUpsell) destination).getF73193a()));
        }
        if (destination instanceof FreelancerBizFeatureConfig.NewSale) {
            FreelancerBizFeatureConfig.NewSale newSale = (FreelancerBizFeatureConfig.NewSale) destination;
            return new FreelancerNewSaleFlow(new FreelancerNewSaleFlowContract$InputData(newSale.getF73216a(), newSale.getF73217b()));
        }
        if (destination instanceof FreelancerBizFeatureConfig.AccountRestrictionPrompts) {
            return new AccountRestrictionsPromptFlow(new AccountRestrictionsPromptFlowContract$InputData(((FreelancerBizFeatureConfig.AccountRestrictionPrompts) destination).getF73176a()));
        }
        if (destination instanceof FreelancerBizFeatureConfig.ConfirmEcommerceIntegration) {
            FreelancerBizFeatureConfig.ConfirmEcommerceIntegration confirmEcommerceIntegration = (FreelancerBizFeatureConfig.ConfirmEcommerceIntegration) destination;
            return new FreelancerPluginAuthFlow(new FreelancerPluginAuthFlowContract$InputData(confirmEcommerceIntegration.getF73194a().getE(), confirmEcommerceIntegration.getF73194a().getF(), confirmEcommerceIntegration.getF73194a().getF73457c(), confirmEcommerceIntegration.getF73194a().getD(), confirmEcommerceIntegration.getF73194a().getF73456b(), zhm.u.c(confirmEcommerceIntegration.getF73194a().getF73455a()), confirmEcommerceIntegration.getF73194a().getF73458g()));
        }
        if (destination instanceof FreelancerBizFeatureConfig.ManageEcommercePlugin) {
            return new ManageEcommercePluginFlow();
        }
        if (destination instanceof FreelancerBizFeatureConfig.Onboarding.Default) {
            FreelancerBizFeatureConfig.Onboarding.Default r92 = (FreelancerBizFeatureConfig.Onboarding.Default) destination;
            return new FreelancerOnboardingFlow(new FreelancerOnboardingFlowContract$InputData(r92.getF73219b(), r92.getF73220c(), 2));
        }
        if (destination instanceof FreelancerBizFeatureConfig.Onboarding.RetailBridge) {
            return gc0.c.b(new FreelancerOnboardingFlow(new FreelancerOnboardingFlowContract$InputData(((FreelancerBizFeatureConfig.Onboarding.RetailBridge) destination).getF73222b(), (FreelancerOnboardingNavStrategy) null, 6)), new ogk.b(this, 20));
        }
        if (destination instanceof FreelancerBizFeatureConfig.PendingAccount) {
            boolean f73228a = ((FreelancerBizFeatureConfig.PendingAccount) destination).getF73228a();
            return gc0.c.b(((v) this.f265348b).b(R$drawable.uikit_icn_24_back_button_arrow, f73228a), new ogk.b(21));
        }
        if (destination instanceof FreelancerBizFeatureConfig$Invoice$Create) {
            return new InvoiceCreateFlow(new InvoiceCreateFlowContract$InputData(null));
        }
        if (destination instanceof FreelancerBizFeatureConfig$Invoice$Edit) {
            return new InvoiceCreateFlow(new InvoiceCreateFlowContract$InputData(((FreelancerBizFeatureConfig$Invoice$Edit) destination).getF73209b()));
        }
        if (destination instanceof FreelancerBizFeatureConfig.AutomaticSaleTransfer) {
            return new FreelancerUpdateTaxPocketFlow();
        }
        if (destination instanceof FreelancerBizFeatureConfig.VatReminderSettings) {
            return new FreelancerVatReminderSettingsFlow();
        }
        if (destination instanceof FreelancerBizFeatureConfig.CreateSubaccountPrompt) {
            if (d.f265346b[((FreelancerBizFeatureConfig.CreateSubaccountPrompt) destination).getF73195a().ordinal()] == 1) {
                return new FreelancerCreateSubaccountPromptFlow(new FreelancerCreateSubaccountPromptFlowContract$InputData(v27.c.ACCOUNT_CHECK));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (destination instanceof FreelancerBizFeatureConfig.SaleDetails) {
            FreelancerBizFeatureConfig.SaleDetails.Sale f73243a = ((FreelancerBizFeatureConfig.SaleDetails) destination).getF73243a();
            if (f73243a instanceof FreelancerBizFeatureConfig.SaleDetails.Sale.C0487SaleDetails) {
                saleId = new FreelancerSaleDetailsFlowContract$InputData.SaleDetails(((FreelancerBizFeatureConfig.SaleDetails.Sale.C0487SaleDetails) f73243a).getF73244a());
            } else {
                if (!(f73243a instanceof FreelancerBizFeatureConfig.SaleDetails.Sale.SaleId)) {
                    throw new NoWhenBranchMatchedException();
                }
                saleId = new FreelancerSaleDetailsFlowContract$InputData.SaleId(((FreelancerBizFeatureConfig.SaleDetails.Sale.SaleId) f73243a).getF73245a());
            }
            return new FreelancerSaleDetailsFlow(saleId);
        }
        if (destination instanceof FreelancerBizFeatureConfig.SaleRefund) {
            FreelancerBizFeatureConfig.SaleRefund saleRefund = (FreelancerBizFeatureConfig.SaleRefund) destination;
            return new FreelancerRefundFlow(new FreelancerRefundFlowContract$InputData.Order(saleRefund.getF73247b(), saleRefund.getF73246a()));
        }
        if (destination instanceof FreelancerBizFeatureConfig.OrderPaymentRefund) {
            FreelancerBizFeatureConfig.OrderPaymentRefund orderPaymentRefund = (FreelancerBizFeatureConfig.OrderPaymentRefund) destination;
            return new FreelancerRefundFlow(new FreelancerRefundFlowContract$InputData.OrderPayment(orderPaymentRefund.getF73226a(), orderPaymentRefund.getF73227b()));
        }
        if (destination instanceof FreelancerBizFeatureConfig.QrShare) {
            FreelancerBizFeatureConfig.QrShare qrShare = (FreelancerBizFeatureConfig.QrShare) destination;
            return new FreelancerQrShareScreen(new FreelancerQrShareScreenContract$InputData(qrShare.getF73239a(), qrShare.getF73240b()));
        }
        if (destination instanceof FreelancerBizFeatureConfig.InvoiceSettingsDestination) {
            return new InvoiceSettingsFlow();
        }
        if (destination instanceof FreelancerBizFeatureConfig.TaxHub) {
            FreelancerBizFeatureConfig.TaxHub.InitialStep f73249a = ((FreelancerBizFeatureConfig.TaxHub) destination).getF73249a();
            if (f73249a instanceof FreelancerBizFeatureConfig.TaxHub.InitialStep.Assessment) {
                FreelancerBizFeatureConfig.TaxHub.InitialStep.Assessment assessment = (FreelancerBizFeatureConfig.TaxHub.InitialStep.Assessment) f73249a;
                taxProfile = new TaxHubFlowContract$Step.TaxAssessment(assessment.getF73251b(), assessment.getF73250a());
            } else if (f73249a instanceof FreelancerBizFeatureConfig.TaxHub.InitialStep.TaxProfile) {
                taxProfile = new TaxHubFlowContract$Step.TaxProfile(((FreelancerBizFeatureConfig.TaxHub.InitialStep.TaxProfile) f73249a).getF73253a());
            } else {
                if (!(f73249a instanceof FreelancerBizFeatureConfig.TaxHub.InitialStep.Hub)) {
                    throw new NoWhenBranchMatchedException();
                }
                taxProfile = TaxHubFlowContract$Step.Hub.f74266a;
            }
            return new TaxHubFlow(new TaxHubFlowContract$InputData(taxProfile));
        }
        if (destination instanceof FreelancerBizFeatureConfig.TaxProfile) {
            FreelancerBizFeatureConfig.TaxProfile taxProfile2 = (FreelancerBizFeatureConfig.TaxProfile) destination;
            return new TaxHubSettingsFlow(new TaxHubSettingsFlowContract$InputData(taxProfile2.getF73254a(), taxProfile2.getF73255b(), false));
        }
        if (destination instanceof FreelancerBizFeatureConfig.ProPerks) {
            FreelancerBizFeatureConfig.ProPerks.InitialStep f73229a = ((FreelancerBizFeatureConfig.ProPerks) destination).getF73229a();
            if (f73229a instanceof FreelancerBizFeatureConfig.ProPerks.InitialStep.PerkDetails) {
                perksDetails = new FreelancerPerksFlowContract$Step.PerksDetails(((FreelancerBizFeatureConfig.ProPerks.InitialStep.PerkDetails) f73229a).getF73230a());
            } else {
                if (!(f73229a instanceof FreelancerBizFeatureConfig.ProPerks.InitialStep.Perks)) {
                    throw new NoWhenBranchMatchedException();
                }
                perksDetails = FreelancerPerksFlowContract$Step.PerksList.f74010a;
            }
            return new FreelancerPerksFlow(new FreelancerPerksFlowContract$InputData(perksDetails));
        }
        if (destination instanceof FreelancerBizFeatureConfig.AccountClosure) {
            return new FreelancerAccountClosureScreen();
        }
        if (destination instanceof FreelancerBizFeatureConfig.AcquiringPayments) {
            FreelancerBizFeatureConfig.AcquiringPayments.InitialStep f73182a = ((FreelancerBizFeatureConfig.AcquiringPayments) destination).getF73182a();
            if (f73182a instanceof FreelancerBizFeatureConfig.AcquiringPayments.InitialStep.PaymentDetails) {
                paymentList = new FreelancerAcquiringPaymentFlowContract$Step.PaymentDetails(((FreelancerBizFeatureConfig.AcquiringPayments.InitialStep.PaymentDetails) f73182a).getF73183a());
            } else {
                if (!(f73182a instanceof FreelancerBizFeatureConfig.AcquiringPayments.InitialStep.Payments)) {
                    throw new NoWhenBranchMatchedException();
                }
                paymentList = new FreelancerAcquiringPaymentFlowContract$Step.PaymentList(((FreelancerBizFeatureConfig.AcquiringPayments.InitialStep.Payments) f73182a).getF73184a());
            }
            return new FreelancerAcquiringPaymentFlow(new FreelancerAcquiringPaymentFlowContract$InputData(paymentList));
        }
        if (!(destination instanceof FreelancerBizFeatureConfig.AcquiringOrders)) {
            if (destination instanceof FreelancerBizFeatureConfig.CustomerDetails) {
                return new FreelancerCustomerDetailsScreen(new FreelancerCustomerDetailsScreenContract$InputData(((FreelancerBizFeatureConfig.CustomerDetails) destination).getF73196a()));
            }
            if (destination instanceof FreelancerBizFeatureConfig.FreelancerIneligibility) {
                return new FreelancerPromotionIneligibilityFlow();
            }
            return null;
        }
        FreelancerBizFeatureConfig.AcquiringOrders.InitialStep f73177a = ((FreelancerBizFeatureConfig.AcquiringOrders) destination).getF73177a();
        if (f73177a instanceof FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.EcommerceOrders) {
            orderList = new FreelancerAcquiringOrderFlowContract$Step.OrderList(ou6.a.E_COMMERCE, ((FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.EcommerceOrders) f73177a).getF73178a());
        } else if (f73177a instanceof FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.InPersonOrders) {
            orderList = new FreelancerAcquiringOrderFlowContract$Step.OrderList(ou6.a.IN_PERSON, ((FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.InPersonOrders) f73177a).getF73179a());
        } else if (f73177a instanceof FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.OrderDetails) {
            orderList = new FreelancerAcquiringOrderFlowContract$Step.OrderDetails(((FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.OrderDetails) f73177a).getF73180a());
        } else {
            if (!(f73177a instanceof FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.RegularOrders)) {
                throw new NoWhenBranchMatchedException();
            }
            orderList = new FreelancerAcquiringOrderFlowContract$Step.OrderList(ou6.a.REGULAR, ((FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.RegularOrders) f73177a).getF73181a());
        }
        return new FreelancerAcquiringOrderFlow(new FreelancerAcquiringOrderFlowContract$InputData(orderList));
    }
}
