package com.revolut.feature.credit.application.plugins.impl.ui.application.extensions;

import al4.p;
import al4.u;
import ang.f;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditProductArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.vc.ViewController;
import ft3.a1;
import ft3.d1;
import ft3.j1;
import ft3.u0;
import ft3.y0;
import ft3.z0;
import it3.k;
import j24.e;
import j54.v;
import j54.z;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import om4.s3;
import skm.a2;
import yji.n;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends n implements z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CreditApplicationFlowContract$InputData f67111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f67112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zja.a f67113n;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f67114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f67115q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f67116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f67117s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewController f67118t;

    public d(CreditApplicationFlowContract$InputData inputData, f userInteractor, zja.a productArticleInteractor, p creditCardProductFeatureTogglesInteractor, u securedCreditCardProductFeatureTogglesInteractor, v lifecycleExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(securedCreditCardProductFeatureTogglesInteractor, "securedCreditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(lifecycleExtension, "lifecycleExtension");
        this.f67111l = inputData;
        this.f67112m = userInteractor;
        this.f67113n = productArticleInteractor;
        this.o = creditCardProductFeatureTogglesInteractor;
        this.f67114p = securedCreditCardProductFeatureTogglesInteractor;
        this.f67115q = lifecycleExtension;
        this.f67116r = new AtomicBoolean(false);
    }

    public final ProductArticleParams.ArticleReference.Key Z2(wi0.b countryCode, com.revolut.feature.credit.application.plugins.impl.ui.application.a variant) {
        CreditProductArticleKey.Companion companion = CreditProductArticleKey.INSTANCE;
        CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData = this.f67111l;
        d1 d1Var = creditApplicationFlowContract$InputData.f67053a;
        gt3.f fVar = d1Var.f137811b;
        String str = null;
        if (fVar == null) {
            fVar = (d1Var.f137810a == j1.CREDIT_CARD && ((s3) this.o).p()) ? gt3.c.PREMIUM : null;
        }
        d1 productClassification = d1.c(d1Var, fVar, null, 5);
        a1 entryPointPayload = creditApplicationFlowContract$InputData.f67054b;
        companion.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
        Intrinsics.checkNotNullParameter(variant, "variant");
        j1 j1Var = productClassification.f137810a;
        gt3.f fVar2 = productClassification.f137811b;
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
        int[] iArr = e.f170693a;
        switch (iArr[j1Var.ordinal()]) {
            case 1:
                boolean z = fVar2 == gt3.c.PREMIUM;
                boolean z3 = entryPointPayload.f137799c == z0.BALANCE_TRANSFER;
                str = (!z || !z3) ? !z ? !z3 ? "credit" : "credit_balance_transfer" : "credit_premium" : "credit_premium_balance_transfer";
                break;
            case 2:
                str = fVar2 != gt3.d.REFINANCING ? "loan" : "refinancing_loan";
                break;
            case 3:
                str = "mortgage";
                break;
            case 4:
                str = "refinancing_mortgage";
                break;
            case 5:
                str = "overdraft";
                break;
            case 6:
                str = "bnpl";
                break;
            case 7:
                str = !(entryPointPayload.d instanceof u0) ? "family_credit_card" : "family_credit_card_invitee";
                break;
            case 8:
                str = "ne-ci-cc";
                break;
            case 9:
                str = "ne-ci-ftc";
                break;
            case 10:
                y0 y0Var = entryPointPayload.d;
                if ((y0Var != null ? y0Var.c0() : null) == k.CC_CLI_USER_INITIATED) {
                    str = "credit-limit-increase";
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (str == null) {
            throw new IllegalStateException("Credit application for this product is not supported yet=" + j1Var);
        }
        String str2 = countryCode.f297794a;
        Locale locale = Locale.ENGLISH;
        String str3 = p.a.r(locale, "ENGLISH", str2, locale, "toLowerCase(...)") + "-" + str;
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        Intrinsics.checkNotNullParameter(variant, "variant");
        String str4 = "tutorial";
        switch (iArr[j1Var.ordinal()]) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            case 3:
            case 4:
                int i = e.f170694b[variant.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str4 = "waiting_list";
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                throw new IllegalStateException(("articleVariant is not supported for " + j1Var + ", variant " + variant).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new ProductArticleParams.ArticleReference.Key(new CreditProductArticleKey("credit", str3, str4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof j54.b0
            if (r0 == 0) goto L13
            r0 = r7
            j54.b0 r0 = (j54.b0) r0
            int r1 = r0.f171496w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171496w = r1
            goto L18
        L13:
            j54.b0 r0 = new j54.b0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171496w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            ang.f r7 = r6.f67112m
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            j3f.d r2 = new j3f.d
            r4 = 15
            r2.<init>(r4)
            j4e.c r4 = new j4e.c
            r5 = 4
            r4.<init>(r5, r2)
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f171496w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d.b3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(com.revolut.feature.credit.application.plugins.impl.ui.application.a r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d.c3(com.revolut.feature.credit.application.plugins.impl.ui.application.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof j54.e0
            if (r0 == 0) goto L13
            r0 = r5
            j54.e0 r0 = (j54.e0) r0
            int r1 = r0.f171506w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171506w = r1
            goto L18
        L13:
            j54.e0 r0 = new j54.e0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171506w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData r5 = r4.f67111l
            ft3.d1 r5 = r5.f67053a
            ft3.j1 r5 = r5.f137810a
            ft3.j1 r2 = ft3.j1.CREDIT_CARD
            if (r5 != r2) goto L5c
            al4.u r5 = r4.f67114p
            om4.q4 r5 = (om4.q4) r5
            kotlinx.coroutines.flow.Flow r5 = r5.d()
            r0.f171506w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r5 = r5.getContent()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r0)
            if (r5 == 0) goto L5c
            goto L5d
        L5c:
            r3 = 0
        L5d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d.d3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (f3(r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r7.invoke(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(h54.k r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof j54.f0
            if (r0 == 0) goto L13
            r0 = r8
            j54.f0 r0 = (j54.f0) r0
            int r1 = r0.f171508x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171508x = r1
            goto L18
        L13:
            j54.f0 r0 = new j54.f0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171508x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L71
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            goto L63
        L39:
            h54.k r7 = r0.u
            yhm.o.b(r8)
            goto L4f
        L3f:
            yhm.o.b(r8)
            r0.u = r7
            r0.f171508x = r5
            com.revolut.feature.credit.application.plugins.impl.ui.application.a r8 = com.revolut.feature.credit.application.plugins.impl.ui.application.a.Tutorial
            java.lang.Object r8 = r6.c3(r8, r0)
            if (r8 != r1) goto L4f
            goto L70
        L4f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L66
            r0.u = r2
            r0.f171508x = r4
            java.lang.Object r7 = r6.f3(r0)
            if (r7 != r1) goto L63
            goto L70
        L63:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L66:
            r0.u = r2
            r0.f171508x = r3
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d.e3(h54.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof j54.g0
            if (r0 == 0) goto L13
            r0 = r6
            j54.g0 r0 = (j54.g0) r0
            int r1 = r0.f171513x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171513x = r1
            goto L18
        L13:
            j54.g0 r0 = new j54.g0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171513x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aii.o r0 = r0.u
            yhm.o.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            aii.o r6 = r5.r2()
            r0.u = r6
            r0.f171513x = r3
            java.lang.Object r0 = r5.b3(r0)
            if (r0 != r1) goto L43
            return r1
        L43:
            r4 = r0
            r0 = r6
            r6 = r4
        L46:
            wi0.b r6 = (wi0.b) r6
            com.revolut.feature.credit.application.plugins.impl.ui.application.a r1 = com.revolut.feature.credit.application.plugins.impl.ui.application.a.Tutorial
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ProductArticles r2 = new com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ProductArticles
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ProductArticles$NextAction$NextApplicationStep r3 = com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract.Step.ProductArticles.NextAction.NextApplicationStep.f67083a
            r2.<init>(r6, r3, r1)
            h54.d r6 = new h54.d
            r6.<init>(r2)
            r0.M0(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d.f3(gim.c):java.lang.Object");
    }
}
