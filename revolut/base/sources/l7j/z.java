package l7j;

import com.revolut.data.model.Data;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.CommodityOrderReviewScreenContract$InputData;
import ip0.v7;
import kkf.x5;
import klf.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends oki.h implements j {
    public final cli.y A;
    public final l4i.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f192696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.a f192697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n7j.c f192698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c7j.f f192699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b7j.b f192700t;
    public final com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a u;
    public final o7.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final rea.m f192701w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ffk.t f192702x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mre.c f192703y;
    public final tga.k z;

    public z(l4i.a amountConverter, j60.a bottomDialogViewControllerExtension, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.a commodityOrderErrorDialogProvider, n7j.c commodityOrderPriceDialogFactory, c7j.f commodityOrderSuccessDialogProvider, b7j.b draftMutator, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a exchangeAction, o7.b orderQuoteInteractor, rea.m pocketDetailsInteractor, ffk.t pricingPlanInteractor, mre.c termsNavigationFactory, tga.k upgradeEntryPointsItemProvider, cli.n stateMapper, CommodityOrderReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(bottomDialogViewControllerExtension, "bottomDialogViewControllerExtension");
        Intrinsics.checkNotNullParameter(commodityOrderErrorDialogProvider, "commodityOrderErrorDialogProvider");
        Intrinsics.checkNotNullParameter(commodityOrderPriceDialogFactory, "commodityOrderPriceDialogFactory");
        Intrinsics.checkNotNullParameter(commodityOrderSuccessDialogProvider, "commodityOrderSuccessDialogProvider");
        Intrinsics.checkNotNullParameter(draftMutator, "draftMutator");
        Intrinsics.checkNotNullParameter(exchangeAction, "exchangeAction");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(upgradeEntryPointsItemProvider, "upgradeEntryPointsItemProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = amountConverter;
        this.f192696p = bottomDialogViewControllerExtension;
        this.f192697q = commodityOrderErrorDialogProvider;
        this.f192698r = commodityOrderPriceDialogFactory;
        this.f192699s = commodityOrderSuccessDialogProvider;
        this.f192700t = draftMutator;
        this.u = exchangeAction;
        this.v = orderQuoteInteractor;
        this.f192701w = pocketDetailsInteractor;
        this.f192702x = pricingPlanInteractor;
        this.f192703y = termsNavigationFactory;
        this.z = upgradeEntryPointsItemProvider;
        ExchangeOrderDraft exchangeOrderDraft = inputData.f99911a;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        od0.i.Companion.getClass();
        this.A = mra.d.b(this, new g(exchangeOrderDraft, data, data2, od0.i.f224256b), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.CommodityExchangeResult, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(l7j.z r36, gim.c r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l7j.z.I2(l7j.z, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r14 == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(java.lang.Exception r12, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r13, gim.c r14) throws java.lang.Exception {
        /*
            r11 = this;
            boolean r0 = r14 instanceof l7j.s
            if (r0 == 0) goto L13
            r0 = r14
            l7j.s r0 = (l7j.s) r0
            int r1 = r0.f192690x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192690x = r1
            goto L18
        L13:
            l7j.s r0 = new l7j.s
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f192690x
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r14)
            r6 = r11
            goto L76
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            java.lang.Exception r12 = r0.u
            yhm.o.b(r14)
            r6 = r11
            goto L5a
        L3b:
            yhm.o.b(r14)
            j54.v0 r5 = new j54.v0
            r10 = 17
            r6 = r11
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r0.u = r7
            r0.f192690x = r4
            tji.f r12 = r11.X()
            java.lang.String r13 = "SUBMIT_BUTTON_LOADING_TAG"
            java.lang.Object r14 = zh9.u0.b0(r12, r13, r5, r0)
            if (r14 != r1) goto L59
            goto L75
        L59:
            r12 = r7
        L5a:
            nii.m0 r14 = (nii.m0) r14
            if (r14 == 0) goto Lb4
            l34.a r13 = new l34.a
            r2 = 9
            r13.<init>(r11, r14, r9, r2)
            skm.p0 r14 = skm.p0.f264001a
            tkm.e r14 = zkm.o.f323119a
            tkm.e r14 = r14.e
            r0.u = r12
            r0.f192690x = r3
            java.lang.Object r14 = skm.e0.J(r14, r13, r0)
            if (r14 != r1) goto L76
        L75:
            return r1
        L76:
            nii.n1 r14 = (nii.n1) r14
            boolean r12 = r14 instanceof nii.j1
            if (r12 == 0) goto Lb1
            nii.j1 r14 = (nii.j1) r14
            nii.m0 r12 = r14.f216179a
            android.os.Parcelable r12 = r12.a()
            boolean r13 = r12 instanceof com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.CommodityOrderErrorDialogProvider$Payload.CurrencyNotAvailableError
            if (r13 == 0) goto L8b
            r9 = r12
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.CommodityOrderErrorDialogProvider$Payload$CurrencyNotAvailableError r9 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.CommodityOrderErrorDialogProvider$Payload.CurrencyNotAvailableError) r9
        L8b:
            if (r9 != 0) goto L90
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L90:
            com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig$DashboardByFeature r0 = new com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig$DashboardByFeature
            hha.u r12 = r9.f99819a
            if (r12 != 0) goto L9d
            hha.t r12 = hha.u.Companion
            r12.getClass()
            hha.u r12 = hha.u.f
        L9d:
            r1 = r12
            xfa.b r2 = xfa.b.FX_LIMIT_PITCH
            r4 = 0
            r5 = 1020(0x3fc, float:1.43E-42)
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            com.revolut.kompot.bridge.navigation.BridgeDestination r12 = zh9.u0.c(r0)
            r11.C1(r12)
            r11.B2()
        Lb1:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        Lb4:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l7j.z.J2(java.lang.Exception, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        cli.y yVar = this.A;
        ExchangeOrderDraft exchangeOrderDraft = ((g) ((j2) yVar.f22677a).getValue()).f192670a;
        Long l2 = exchangeOrderDraft.f99885a.f99904b;
        boolean z = l2 == null || l2.longValue() == 0;
        Long l3 = exchangeOrderDraft.f99886b.f99904b;
        boolean z3 = l3 == null || l3.longValue() == 0;
        Continuation continuation = null;
        if (z && z3) {
            r6.b.D("Input is empty");
        } else {
            yji.l.b1(this, vkm.q.Q(vkm.q.q(new x5(vkm.q.q(yVar.B(new l5a.u(14))), 27)), new a3(continuation, this, 22)), null, new p(this, continuation, 2), 3);
        }
        yji.l.b1(this, v7.w(yVar.B(new l5a.u(13))), null, new p(this, continuation, 0), 3);
        yji.l.b1(this, rd0.e.b(this.f192702x.t(true)), null, new p(this, continuation, 1), 3);
        tga.k kVar = this.z;
        kVar.getClass();
        UpgradeEntryPointItemContract$ItemType.ReviewOrder.Commodity type = UpgradeEntryPointItemContract$ItemType.ReviewOrder.Commodity.f80980a;
        Intrinsics.checkNotNullParameter(type, "type");
        yji.l.b1(this, rd0.e.b(m70.a.g(kVar.c(type), null, new tc6.b(22), 1)), null, new p(this, continuation, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }
}
