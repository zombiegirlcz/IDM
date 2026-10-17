package fia;

import aii.u;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$ProSales$Destination;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.Set;
import jr6.r;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;
import vha.s;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f135365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f135366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tha.a f135367n;

    public g(s proAccountsInteractor, r freelancerPendingPromptFactory, tha.a proAccountsCommandFactory) {
        Intrinsics.checkNotNullParameter(proAccountsInteractor, "proAccountsInteractor");
        Intrinsics.checkNotNullParameter(freelancerPendingPromptFactory, "freelancerPendingPromptFactory");
        Intrinsics.checkNotNullParameter(proAccountsCommandFactory, "proAccountsCommandFactory");
        this.f135365l = proAccountsInteractor;
        this.f135366m = freelancerPendingPromptFactory;
        this.f135367n = proAccountsCommandFactory;
    }

    public final void Z2(FreelancerWidgetClickData.Cashback cashback) {
        u cashbackUpsell;
        boolean z = cashback instanceof FreelancerWidgetClickData.Cashback.Tile;
        tha.a aVar = this.f135367n;
        if (z) {
            ((aia.b) aVar).getClass();
            cashbackUpsell = new FreelancerBizFeatureConfig.Cashback(0);
        } else {
            if (!(cashback instanceof FreelancerWidgetClickData.Cashback.Upgrade)) {
                throw new NoWhenBranchMatchedException();
            }
            ((aia.b) aVar).getClass();
            cashbackUpsell = new FreelancerBizFeatureConfig.CashbackUpsell(null);
        }
        A2(cashbackUpsell);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData.Pockets r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof fia.b
            if (r0 == 0) goto L13
            r0 = r6
            fia.b r0 = (fia.b) r0
            int r1 = r0.f135358x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135358x = r1
            goto L18
        L13:
            fia.b r0 = new fia.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135358x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fia.g r5 = r0.u
            yhm.o.b(r6)
            goto L54
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            boolean r6 = r5 instanceof com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData.Pockets.NewPocket
            tha.a r2 = r4.f135367n
            if (r6 == 0) goto L5a
            r0.u = r4
            r0.f135358x = r3
            aia.b r2 = (aia.b) r2
            hr6.l r5 = r2.f5226a
            kotlin.enums.EnumEntries r6 = hr6.k.a()
            java.util.Set r6 = zhm.d0.i1(r6)
            ct6.m r5 = (ct6.m) r5
            java.lang.Object r6 = r5.d(r6, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            r5 = r4
        L54:
            aii.u r6 = (aii.u) r6
            r5.A2(r6)
            goto L89
        L5a:
            boolean r6 = r5 instanceof com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData.Pockets.RegularPocket
            if (r6 == 0) goto L72
            com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData$Pockets$RegularPocket r5 = (com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData.Pockets.RegularPocket) r5
            java.lang.String r5 = r5.f74451a
            com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType$Pro r6 = com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType.Pro.INSTANCE
            aia.b r2 = (aia.b) r2
            com.revolut.retail.core.navigation.FeatureCommand r5 = r2.a(r5, r6)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r5)
            r4.A2(r5)
            goto L89
        L72:
            boolean r6 = r5 instanceof com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData.Pockets.TaxPocket
            if (r6 == 0) goto L8c
            com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData$Pockets$TaxPocket r5 = (com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData.Pockets.TaxPocket) r5
            java.lang.String r5 = r5.f74452a
            com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType$ProTax r6 = com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType.ProTax.INSTANCE
            aia.b r2 = (aia.b) r2
            com.revolut.retail.core.navigation.FeatureCommand r5 = r2.a(r5, r6)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r5)
            r4.A2(r5)
        L89:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L8c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fia.g.b3(com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData$Pockets, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (r10 == r1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData.Toolbox r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fia.g.c3(com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData$Toolbox, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d3(j jVar, Continuation continuation) {
        u invoiceListDestination;
        p pVar = jVar instanceof p ? (p) jVar : null;
        if (pVar == null) {
            return Unit.f186387a;
        }
        Object o = pVar.getO();
        FreelancerWidgetClickData freelancerWidgetClickData = o instanceof FreelancerWidgetClickData ? (FreelancerWidgetClickData) o : null;
        if (freelancerWidgetClickData == null) {
            return Unit.f186387a;
        }
        if (freelancerWidgetClickData instanceof FreelancerWidgetClickData.Cashback) {
            Z2((FreelancerWidgetClickData.Cashback) freelancerWidgetClickData);
        } else {
            if (freelancerWidgetClickData instanceof FreelancerWidgetClickData.Pockets) {
                Object objB3 = b3((FreelancerWidgetClickData.Pockets) freelancerWidgetClickData, continuation);
                return objB3 == fim.a.COROUTINE_SUSPENDED ? objB3 : Unit.f186387a;
            }
            boolean z = freelancerWidgetClickData instanceof FreelancerWidgetClickData.Sales;
            tha.a aVar = this.f135367n;
            if (z) {
                FreelancerWidgetClickData.Sales sales = (FreelancerWidgetClickData.Sales) freelancerWidgetClickData;
                if (sales instanceof FreelancerWidgetClickData.Sales.Ecommerce) {
                    ((aia.b) aVar).getClass();
                    invoiceListDestination = new FreelancerBizFeatureConfig.AcquiringOrders(new FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.EcommerceOrders(null));
                } else if (sales instanceof FreelancerWidgetClickData.Sales.InPerson) {
                    ((aia.b) aVar).getClass();
                    invoiceListDestination = new FreelancerBizFeatureConfig.AcquiringOrders(new FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.InPersonOrders(null));
                } else if (sales instanceof FreelancerWidgetClickData.Sales.Invoices) {
                    ((aia.b) aVar).getClass();
                    invoiceListDestination = new FreelancerBizFeatureConfig.InvoiceListDestination(0);
                } else {
                    if (!(sales instanceof FreelancerWidgetClickData.Sales.PaymentLinks)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.getClass();
                    invoiceListDestination = FreelancerBizFeatureConfig.OrderInitPageListDestination.f73224a;
                }
                A2(invoiceListDestination);
            } else if (freelancerWidgetClickData instanceof FreelancerWidgetClickData.SalesAnalytics) {
                if (!(((FreelancerWidgetClickData.SalesAnalytics) freelancerWidgetClickData) instanceof FreelancerWidgetClickData.SalesAnalytics.SalesThisMonth)) {
                    throw new NoWhenBranchMatchedException();
                }
                A2(new AnalyticsFeatureConfig$ProSales$Destination(com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE)));
            } else {
                if (freelancerWidgetClickData instanceof FreelancerWidgetClickData.Toolbox) {
                    Object objC3 = c3((FreelancerWidgetClickData.Toolbox) freelancerWidgetClickData, continuation);
                    return objC3 == fim.a.COROUTINE_SUSPENDED ? objC3 : Unit.f186387a;
                }
                if (freelancerWidgetClickData instanceof FreelancerWidgetClickData.TaxHub) {
                    FreelancerWidgetClickData.TaxHub taxHub = (FreelancerWidgetClickData.TaxHub) freelancerWidgetClickData;
                    if (taxHub instanceof FreelancerWidgetClickData.TaxHub.CalendarEvent) {
                        TaxHubCalendarEvent taxHubCalendarEvent = ((FreelancerWidgetClickData.TaxHub.CalendarEvent) taxHub).f74460a;
                        String taxCalendarEventId = taxHubCalendarEvent.f73483a;
                        ds6.j taxType = taxHubCalendarEvent.f73484b;
                        ((aia.b) aVar).getClass();
                        Intrinsics.checkNotNullParameter(taxCalendarEventId, "taxCalendarEventId");
                        Intrinsics.checkNotNullParameter(taxType, "taxType");
                        A2(new FreelancerBizFeatureConfig.TaxHub(new FreelancerBizFeatureConfig.TaxHub.InitialStep.Assessment(taxType, taxCalendarEventId)));
                    } else if (taxHub instanceof FreelancerWidgetClickData.TaxHub.C0496TaxHub) {
                        ((aia.b) aVar).getClass();
                        A2(new FreelancerBizFeatureConfig.TaxHub(0));
                    } else {
                        if (!(taxHub instanceof FreelancerWidgetClickData.TaxHub.TaxProfile)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Set allowedTaxTypes = ((FreelancerWidgetClickData.TaxHub.TaxProfile) taxHub).f74462a;
                        ((aia.b) aVar).getClass();
                        Intrinsics.checkNotNullParameter(allowedTaxTypes, "allowedTaxTypes");
                        A2(new FreelancerBizFeatureConfig.TaxHub(new FreelancerBizFeatureConfig.TaxHub.InitialStep.TaxProfile(allowedTaxTypes)));
                    }
                } else if (freelancerWidgetClickData instanceof FreelancerWidgetClickData.ProPerks) {
                    FreelancerWidgetClickData.ProPerks proPerks = (FreelancerWidgetClickData.ProPerks) freelancerWidgetClickData;
                    if (proPerks.equals(FreelancerWidgetClickData.ProPerks.AllPerks.f74453a)) {
                        ((aia.b) aVar).getClass();
                        A2(new FreelancerBizFeatureConfig.ProPerks(FreelancerBizFeatureConfig.ProPerks.InitialStep.Perks.f73231a));
                    } else {
                        if (!(proPerks instanceof FreelancerWidgetClickData.ProPerks.Perk)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String perkId = ((FreelancerWidgetClickData.ProPerks.Perk) proPerks).f74454a;
                        ((aia.b) aVar).getClass();
                        Intrinsics.checkNotNullParameter(perkId, "perkId");
                        A2(new FreelancerBizFeatureConfig.ProPerks(new FreelancerBizFeatureConfig.ProPerks.InitialStep.PerkDetails(perkId)));
                    }
                } else if (!(freelancerWidgetClickData instanceof FreelancerWidgetClickData.VatReminder)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fia.f
            if (r0 == 0) goto L13
            r0 = r5
            fia.f r0 = (fia.f) r0
            int r1 = r0.f135364w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135364w = r1
            goto L18
        L13:
            fia.f r0 = new fia.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135364w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            vha.s r5 = r4.f135365l
            mt8.d r5 = r5.f
            ufm.b r5 = r5.getKyc()
            r0.f135364w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            yt8.c r5 = (yt8.c) r5
            yt8.i r5 = r5.f316662a
            boolean r5 = ngm.n.p(r5)
            jr6.r r0 = r4.f135366m
            com.revolut.feature.full_screen_prompt.PromptMarketingScreen r5 = jr6.r.a(r0, r5)
            r0 = 0
            r1 = 2
            com.revolut.kompot.common.ModalDestination$Style$POPUP r2 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            yji.n.P2(r4, r5, r2, r0, r1)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fia.g.e3(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
