package ct6;

import com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements hr6.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nd1.b f108633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr6.a f108634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gr6.e f108635c;
    public final gr6.h d;
    public final gr6.p e;
    public final zjh.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zja.a f108636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qka.c f108637h;
    public final Lazy i;

    public m(nd1.b catalogueAvailabilityInteractor, gr6.a freelancerAccountDetailsInteractor, gr6.e freelancerAvailabilityInteractor, gr6.h freelancerCashbackInteractor, gr6.p freelancerProductArticleInteractor, zjh.i freelancerTaxPocketsInteractor, zja.a productArticleInteractor, qka.c productArticleNavigationProvider) {
        Intrinsics.checkNotNullParameter(catalogueAvailabilityInteractor, "catalogueAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(freelancerProductArticleInteractor, "freelancerProductArticleInteractor");
        Intrinsics.checkNotNullParameter(freelancerTaxPocketsInteractor, "freelancerTaxPocketsInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        this.f108633a = catalogueAvailabilityInteractor;
        this.f108634b = freelancerAccountDetailsInteractor;
        this.f108635c = freelancerAvailabilityInteractor;
        this.d = freelancerCashbackInteractor;
        this.e = freelancerProductArticleInteractor;
        this.f = freelancerTaxPocketsInteractor;
        this.f108636g = productArticleInteractor;
        this.f108637h = productArticleNavigationProvider;
        this.i = yhm.j.b(new cpi.b(11));
    }

    public static ir6.e j(SubaccountType subaccountType) {
        if (Intrinsics.f(subaccountType, SubaccountType.Pro.f88964a)) {
            return ir6.e.PRO_REGULAR;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.ProTax.f88965a)) {
            return ir6.e.PRO_TAX;
        }
        throw new IllegalArgumentException(subaccountType + " subaccount type is not supported by pro product articles.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r2.invoke(r9, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r10.invoke(r11, r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.jvm.functions.Function2 r9, kotlin.jvm.functions.Function2 r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ct6.g
            if (r0 == 0) goto L13
            r0 = r11
            ct6.g r0 = (ct6.g) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ct6.g r0 = new ct6.g
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f108623x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r11)
            goto Lab
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            yhm.o.b(r11)
            goto L94
        L3a:
            com.revolut.feature.product_article.api.models.ProductArticleParams r9 = r0.f108622w
            gim.i r10 = r0.v
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            gim.i r2 = r0.u
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            yhm.o.b(r11)
            goto L76
        L48:
            yhm.o.b(r11)
            com.revolut.feature.product_article.api.models.ProductArticleParams r11 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.freelancer.api.article.ProProductArticleKey r6 = com.revolut.feature.freelancer.api.article.ProProductArticleKey.CATALOGUE_INTRO
            r2.<init>(r6)
            r11.<init>(r2)
            r2 = r9
            gim.i r2 = (gim.i) r2
            r0.u = r2
            r2 = r10
            gim.i r2 = (gim.i) r2
            r0.v = r2
            r0.f108622w = r11
            r0.z = r5
            zja.a r2 = r8.f108636g
            kka.h r2 = (kka.h) r2
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r6 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r2 = r2.e(r11, r6, r0)
            if (r2 != r1) goto L72
            goto Laa
        L72:
            r7 = r2
            r2 = r9
            r9 = r11
            r11 = r7
        L76:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r6 = 0
            if (r11 != 0) goto L97
            a27.d r9 = new a27.d
            r10 = 3
            r9.<init>(r5, r10, r6)
            r0.u = r6
            r0.v = r6
            r0.f108622w = r6
            r0.z = r4
            java.lang.Object r9 = r2.invoke(r9, r0)
            if (r9 != r1) goto L94
            goto Laa
        L94:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L97:
            ct6.h r11 = new ct6.h
            r11.<init>(r8, r9, r6)
            r0.u = r6
            r0.v = r6
            r0.f108622w = r6
            r0.z = r3
            java.lang.Object r9 = r10.invoke(r11, r0)
            if (r9 != r1) goto Lab
        Laa:
            return r1
        Lab:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ct6.m.c(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02fc A[Catch: Exception -> 0x006d, TryCatch #0 {Exception -> 0x006d, blocks: (B:13:0x005f, B:117:0x038f, B:107:0x02f6, B:109:0x02fc, B:113:0x034b, B:118:0x03a2, B:19:0x009f, B:22:0x00c5, B:102:0x02c7, B:25:0x00df, B:98:0x02a7, B:92:0x0273, B:94:0x0279, B:103:0x02da, B:106:0x02eb), top: B:129:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03a2 A[Catch: Exception -> 0x006d, TRY_LEAVE, TryCatch #0 {Exception -> 0x006d, blocks: (B:13:0x005f, B:117:0x038f, B:107:0x02f6, B:109:0x02fc, B:113:0x034b, B:118:0x03a2, B:19:0x009f, B:22:0x00c5, B:102:0x02c7, B:25:0x00df, B:98:0x02a7, B:92:0x0273, B:94:0x0279, B:103:0x02da, B:106:0x02eb), top: B:129:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0173 A[Catch: all -> 0x0137, TRY_ENTER, TryCatch #1 {all -> 0x0137, blocks: (B:30:0x0131, B:46:0x0184, B:43:0x0173), top: B:129:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023f  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v11, types: [int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v19, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0384 -> B:15:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01b8 -> B:74:0x0230). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01f6 -> B:74:0x0230). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0224 -> B:71:0x0225). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Set r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ct6.m.d(java.util.Set, gim.c):java.lang.Object");
    }

    public final FeatureCommand e(FreelancerOnboardingArticleConfig freelancerOnboardingArticleConfig, FreelancerOnboardingNavStrategy freelancerOnboardingNavStrategy) {
        return u0.f(new FreelancerBizFeatureConfig.Onboarding.Default(freelancerOnboardingArticleConfig, freelancerOnboardingNavStrategy, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.retail.core.navigation.NaviCommand r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ct6.j
            if (r0 == 0) goto L13
            r0 = r13
            ct6.j r0 = (ct6.j) r0
            int r1 = r0.f108630x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108630x = r1
            goto L18
        L13:
            ct6.j r0 = new ct6.j
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108630x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.revolut.retail.core.navigation.NaviCommand r12 = r0.u
            yhm.o.b(r13)
        L28:
            r3 = r12
            goto L46
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r13)
            ir6.c r13 = ir6.c.ONBOARDING
            r0.u = r12
            r0.f108630x = r3
            gr6.p r2 = r11.e
            et6.x2 r2 = (et6.x2) r2
            java.lang.Object r13 = r2.g(r13, r0)
            if (r13 != r1) goto L28
            return r1
        L46:
            com.revolut.feature.product_article.api.models.ProductArticleParams r13 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r13
            if (r3 == 0) goto L55
            com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor r2 = new com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor
            r4 = 0
            r7 = 2
            r5 = r3
            r6 = r3
            r2.<init>(r3, r4, r5, r6, r7)
        L53:
            r7 = r2
            goto L57
        L55:
            r2 = 0
            goto L53
        L57:
            r9 = 0
            r10 = 120(0x78, float:1.68E-43)
            qka.c r4 = r11.f108637h
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$AlwaysShow r6 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.AlwaysShow.f81285a
            r8 = 0
            r5 = r13
            com.revolut.kompot.bridge.navigation.KompotFeatureConfig r12 = cka.b.a(r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ct6.m.f(com.revolut.retail.core.navigation.NaviCommand, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ct6.l
            if (r0 == 0) goto L13
            r0 = r9
            ct6.l r0 = (ct6.l) r0
            int r1 = r0.f108632w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108632w = r1
            goto L18
        L13:
            ct6.l r0 = new ct6.l
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108632w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L55
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            yhm.o.b(r9)
            gr6.h r9 = r8.d
            et6.y0 r9 = (et6.y0) r9
            akg.n r9 = r9.h()
            clk.b r2 = new clk.b
            r4 = 28
            r2.<init>(r4)
            r4 = 0
            jhi.b r9 = mo3.a.g(r9, r4, r2, r3)
            a87.b r2 = new a87.b
            r4 = 7
            r2.<init>(r9, r4)
            r0.f108632w = r3
            java.lang.Object r9 = vkm.q.x(r2, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            r2 = r9
            java.util.List r2 = (java.util.List) r2
            com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy$NavigateNext r4 = new com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy$NavigateNext
            kotlin.Lazy r9 = r8.i
            java.lang.Object r9 = r9.getValue()
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$Cashback r0 = new com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$Cashback
            r1 = 0
            r0.<init>(r1)
            com.revolut.retail.core.navigation.FeatureCommand r0 = zh9.u0.f(r0)
            com.revolut.retail.core.navigation.CompositeCommand r9 = com.revolut.retail.core.navigation.a.c(r9, r0)
            r4.<init>(r9)
            xfa.b r6 = xfa.b.FREELANCER_UPGRADE_CASHBACK_SCREEN
            com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig$DashboardByPlans r0 = new com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig$DashboardByPlans
            r5 = 0
            r7 = 165(0xa5, float:2.31E-43)
            r1 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.revolut.retail.core.navigation.FeatureCommand r9 = gc0.c.f(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ct6.m.g(gim.c):java.lang.Object");
    }

    public final FreelancerBizFeatureConfig.SaleDetails h(FreelancerOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return new FreelancerBizFeatureConfig.SaleDetails(new FreelancerBizFeatureConfig.SaleDetails.Sale.C0487SaleDetails(order));
    }

    public final FreelancerBizFeatureConfig.AcquiringOrders i(cs6.g target, Set paymentMethods) {
        AcquiringOrderFilter.Channel channel;
        List listC;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(paymentMethods, "<this>");
        if (paymentMethods.isEmpty()) {
            channel = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it8 = paymentMethods.iterator();
            while (it8.hasNext()) {
                switch (ss6.a.f265312a[((cs6.e) it8.next()).ordinal()]) {
                    case 1:
                        listC = zhm.u.c(nr6.e.LINK);
                        break;
                    case 2:
                        listC = zhm.u.c(nr6.e.QR);
                        break;
                    case 3:
                        listC = zhm.u.c(nr6.e.INVOICE);
                        break;
                    case 4:
                        listC = zhm.u.c(nr6.e.CARD_READER);
                        break;
                    case 5:
                        listC = zhm.u.c(nr6.e.POS);
                        break;
                    case 6:
                        listC = zhm.u.c(nr6.e.APPLE_TAP_TO_PAY);
                        break;
                    case 7:
                        listC = zhm.v.k(nr6.e.PRESTASHOP, nr6.e.WOOCOMMERCE, nr6.e.SHOPIFY, nr6.e.SHOPIFY_RPAY);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                a0.x(listC, arrayList);
            }
            channel = new AcquiringOrderFilter.Channel(d0.i1(arrayList));
        }
        return new FreelancerBizFeatureConfig.AcquiringOrders(new FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.RegularOrders(channel));
    }
}
