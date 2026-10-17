package zjh;

import au6.x1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.network.services.TopupService;
import com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.data.network.ProductFeatureOnboardingService;
import com.revolut.feature.apm.upi.impl.flow.model.ScreenConfiguration;
import com.revolut.feature.credit.card.impl.network.CreditCardService;
import com.revolut.feature.hidden_accounts.impl.network.HiddenAccountsService;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormController;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesScreen;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreen;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.PrivateCompanyDetailsFlowController;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewController;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dce.l0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import yhm.m;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements zk0.c, tw0.b0, g5b.d, n2h.g, kfm.o, com.bumptech.glide.load.data.g, q2h.k, dcf.b, fgm.b, a3h.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f322830b;

    public c(a26.s function) {
        this.f322829a = 10;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f322830b = function;
    }

    @Override // n2h.g
    public efm.r C0() {
        PrivateCompanyDetailsFlowController privateCompanyDetailsFlowController = (PrivateCompanyDetailsFlowController) this.f322830b;
        KProperty[] kPropertyArr = PrivateCompanyDetailsFlowController.R;
        return privateCompanyDetailsFlowController.d3().f312933b.d();
    }

    @Override // n2h.g
    public efm.r G0() {
        PrivateCompanyDetailsFlowController privateCompanyDetailsFlowController = (PrivateCompanyDetailsFlowController) this.f322830b;
        KProperty[] kPropertyArr = PrivateCompanyDetailsFlowController.R;
        return privateCompanyDetailsFlowController.d3().f312933b.c();
    }

    @Override // tw0.b0
    public void G1() {
        ((com.revolut.feature.tab.accounts.impl.ui.spaces.i) ((AccountSpacesScreen) this.f322830b).k3()).K2();
    }

    @Override // tw0.b0
    public void I1() {
        com.revolut.feature.tab.accounts.impl.ui.spaces.i iVar = (com.revolut.feature.tab.accounts.impl.ui.spaces.i) ((AccountSpacesScreen) this.f322830b).k3();
        if (!iVar.G) {
            ((r70.e) iVar.f89641t).c(r70.b.SHORT, true);
        }
        iVar.l2(new aie.w(1, iVar, null), new yi5.b(26));
    }

    @Override // com.bumptech.glide.load.data.g
    public Object a() {
        l8.x xVar = (l8.x) this.f322830b;
        xVar.reset();
        return xVar;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f322829a) {
            case 9:
                break;
            case 10:
                break;
            case 26:
                break;
        }
        return ((fa9.c) this.f322830b).invoke(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(w4l.k r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof et6.j2
            if (r0 == 0) goto L13
            r0 = r6
            et6.j2 r0 = (et6.j2) r0
            int r1 = r0.f129254w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129254w = r1
            goto L18
        L13:
            et6.j2 r0 = new et6.j2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129254w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            vkm.d r5 = r4.k(r5)
            r6 = 3
            r2 = 0
            jhi.b r5 = mo3.a.g(r5, r2, r2, r6)
            r0.f129254w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            zr6.a r6 = (zr6.a) r6
            java.util.List r5 = r6.getItems()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.c.b(w4l.k, gim.c):java.lang.Object");
    }

    @Override // q2h.k
    public RowDelegate c() {
        return ((CommodityAssetDetailsScreen) this.f322830b).Q;
    }

    @Override // com.bumptech.glide.load.data.g
    public void cleanup() {
        ((l8.x) this.f322830b).release();
    }

    @Override // a3h.h
    public FixedTabsDelegate d() {
        return (FixedTabsDelegate) this.f322830b;
    }

    @Override // dcf.b
    public void e(Flow flow, Function1 consumer) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        com.revolut.kompot.navigable.a.g2((TradingAddOnsMainScreen) this.f322830b, flow, null, new a97.i(2, consumer, kotlin.jvm.internal.s.class, "suspendConversion0", "bind$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 11), 3);
    }

    @Override // g5b.d
    public CellDetailsActionDelegate f() {
        return (CellDetailsActionDelegate) this.f322830b;
    }

    @Override // zk0.c
    public void g(FileOutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        outputStream.write((byte[]) this.f322830b);
    }

    public Image h(re7.j card, boolean z) {
        Intrinsics.checkNotNullParameter(card, "card");
        return ((ia3.h) ((m93.d) this.f322830b)).b(new b93.j(new b93.b(card.f253538a), card.f253540c), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(w4l.k r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof et6.k2
            if (r0 == 0) goto L13
            r0 = r6
            et6.k2 r0 = (et6.k2) r0
            int r1 = r0.f129261w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129261w = r1
            goto L18
        L13:
            et6.k2 r0 = new et6.k2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129261w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f129261w = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r5 = r6.iterator()
        L41:
            boolean r6 = r5.hasNext()
            r0 = 0
            if (r6 == 0) goto L5a
            java.lang.Object r6 = r5.next()
            r1 = r6
            zr6.f r1 = (zr6.f) r1
            zr6.e r2 = r1.f324611a
            zr6.e r3 = zr6.e.CUSTOMER_NOT_PRESENT
            if (r2 != r3) goto L41
            zr6.g r1 = r1.d
            if (r1 == 0) goto L41
            goto L5b
        L5a:
            r6 = r0
        L5b:
            zr6.f r6 = (zr6.f) r6
            if (r6 == 0) goto L66
            zr6.g r5 = r6.d
            if (r5 == 0) goto L66
            zr6.d r5 = r5.f324617b
            return r5
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.c.i(w4l.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(com.revolut.feature.checkout.models.CheckoutOrder r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof fxe.a
            if (r0 == 0) goto L13
            r0 = r8
            fxe.a r0 = (fxe.a) r0
            int r1 = r0.f138809w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138809w = r1
            goto L18
        L13:
            fxe.a r0 = new fxe.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f138809w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L8c
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            pi3.d r8 = r7.d
            java.lang.String r2 = "empty(...)"
            if (r8 != 0) goto L40
            java.util.Optional r7 = java.util.Optional.empty()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            return r7
        L40:
            c93.j r4 = r8.f236393j
            if (r4 != 0) goto L4c
            java.util.Optional r7 = java.util.Optional.empty()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            return r7
        L4c:
            pi3.e r7 = r7.e
            if (r7 == 0) goto L92
            java.lang.String r7 = r7.f236399a
            if (r7 != 0) goto L55
            goto L92
        L55:
            java.lang.Object r2 = r6.f322830b
            hy2.f r2 = (hy2.f) r2
            b93.b r8 = r8.f236390c
            r5 = 0
            efm.r r7 = r2.h(r8, r7, r5)
            fwf.n r8 = new fwf.n
            r2 = 9
            r8.<init>(r2)
            efm.r r7 = nim.a.w(r7, r8)
            fv0.c r8 = new fv0.c
            r2 = 11
            r8.<init>(r2)
            efm.r r7 = m70.a.g(r7, r5, r8, r3)
            java.util.Optional r8 = java.util.Optional.ofNullable(r4)
            efm.d0 r7 = r7.first(r8)
            java.lang.String r8 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r0.f138809w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        L92:
            java.util.Optional r7 = java.util.Optional.ofNullable(r4)
            java.lang.String r8 = "ofNullable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.c.j(com.revolut.feature.checkout.models.CheckoutOrder, gim.c):java.lang.Object");
    }

    public vkm.d k(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x1 x1Var = (x1) this.f322830b;
        x1Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return x1Var.e.b(Unit.f186387a, loadingStrategy);
    }

    public ScheduleTransferScreen l(ScreenConfiguration screenConfiguration, TransferScheduleData scheduleData) {
        List listA;
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        zof.f fVar = (zof.f) this.f322830b;
        if (screenConfiguration.f62989g) {
            listA = jli.c.a();
        } else {
            EnumEntries enumEntriesA = jli.c.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : enumEntriesA) {
                if (((jli.c) obj2) != jli.c.PERIOD_SELECTION_NONE) {
                    arrayList.add(obj2);
                }
            }
            listA = arrayList;
        }
        boolean z = screenConfiguration.f62987b;
        return ((qpf.h) fVar).d(new ScheduleTransferInputData((TextLocalisedClause) null, scheduleData, z ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED, (TextLocalisedClause) null, listA, !z, (AnalyticsContext) null, (LocalDate) null, (LocalDate) null, screenConfiguration.f, false, screenConfiguration.e, 3017));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    @Override // tw0.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1(int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.c.m1(int, int):void");
    }

    @Override // fgm.b
    public void onComplete() {
        skm.l lVar = (skm.l) this.f322830b;
        m.Companion companion = yhm.m.INSTANCE;
        lVar.resumeWith(Unit.f186387a);
    }

    @Override // fgm.b, efm.f0
    public void onError(Throwable th10) {
        skm.l lVar = (skm.l) this.f322830b;
        m.Companion companion = yhm.m.INSTANCE;
        lVar.resumeWith(yhm.o.a(th10));
    }

    @Override // fgm.b
    public void onSubscribe(Disposable disposable) {
        ((skm.l) this.f322830b).r(new l0(disposable, 27));
    }

    public c(b9i.h function) {
        this.f322829a = 9;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f322830b = function;
    }

    public c(fa9.c function) {
        this.f322829a = 26;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f322830b = function;
    }

    public c(fa9.c function, byte b4) {
        this.f322829a = 27;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f322830b = function;
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f322829a = i;
        this.f322830b = obj2;
    }

    public c(d9k.k recipientNavbarMapper) {
        this.f322829a = 15;
        Intrinsics.checkNotNullParameter(recipientNavbarMapper, "recipientNavbarMapper");
        this.f322830b = recipientNavbarMapper;
    }

    public c(CreditCardService api2) {
        this.f322829a = 19;
        Intrinsics.checkNotNullParameter(api2, "api");
        this.f322830b = api2;
    }

    public c(m93.d cardThumbnailImageProvider) {
        this.f322829a = 25;
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        this.f322830b = cardThumbnailImageProvider;
    }

    public c(ProductFeatureOnboardingService service) {
        this.f322829a = 8;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f322830b = service;
    }

    public c(wul.j scheduleSettingsMapper) {
        this.f322829a = 24;
        Intrinsics.checkNotNullParameter(scheduleSettingsMapper, "scheduleSettingsMapper");
        this.f322830b = scheduleSettingsMapper;
    }

    public c(ang.f userInteractor) {
        this.f322829a = 13;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f322830b = userInteractor;
    }

    public c(vdl.h repository) {
        this.f322829a = 3;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f322830b = repository;
    }

    public c(HiddenAccountsService service) {
        this.f322829a = 2;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f322830b = service;
    }

    public c(hy2.f cardDesignInteractor) {
        this.f322829a = 29;
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        this.f322830b = cardDesignInteractor;
    }

    public c(zof.f transferFeatureScreensProvider) {
        this.f322829a = 17;
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        this.f322830b = transferFeatureScreensProvider;
    }

    public c(TopupService topupService) {
        this.f322829a = 21;
        Intrinsics.checkNotNullParameter(topupService, "topupService");
        this.f322830b = topupService;
    }

    public c(ue0.c storage) {
        this.f322829a = 12;
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f322830b = storage;
    }

    public c(yxc.l uiMapper) {
        this.f322829a = 5;
        Intrinsics.checkNotNullParameter(uiMapper, "uiMapper");
        this.f322830b = uiMapper;
    }

    public c(x1 pricingPlanRepository) {
        this.f322829a = 23;
        Intrinsics.checkNotNullParameter(pricingPlanRepository, "pricingPlanRepository");
        this.f322830b = pricingPlanRepository;
    }

    public c(dwi.a passDetailsInteractor) {
        this.f322829a = 20;
        Intrinsics.checkNotNullParameter(passDetailsInteractor, "passDetailsInteractor");
        this.f322830b = passDetailsInteractor;
    }

    public c(InputStream inputStream, f8.f fVar) {
        this.f322829a = 11;
        l8.x xVar = new l8.x(inputStream, fVar);
        this.f322830b = xVar;
        xVar.mark(5242880);
    }

    public c(CfdOrderFormController cfdOrderFormController) {
        this.f322829a = 6;
        this.f322830b = cfdOrderFormController.N;
    }

    public c(o7.d dVar) {
        this.f322829a = 22;
        this.f322830b = (HashMap) dVar.f222642b;
    }

    public c(CashBalanceController cashBalanceController) {
        this.f322829a = 0;
        this.f322830b = cashBalanceController.L;
    }

    public c(EtfDetailsOverviewController etfDetailsOverviewController) {
        this.f322829a = 28;
        this.f322830b = etfDetailsOverviewController.S;
    }
}
