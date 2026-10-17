package com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2;

import ang.f;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.ExchangeGlobalAccessFlowV2Contract$Step;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import cu8.r0;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import s99.j;
import til.m;
import u69.g;
import u7k.w;
import u99.e;
import u99.k;
import vkm.q;
import yji.l;
import yki.i;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements u99.c {
    public static final Set A;

    @NotNull
    public static final e Companion = new e();
    public final ExchangeGlobalAccessFlowV2Contract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fn2.c f78275p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jla.h f78276q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f78277r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zja.a f78278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tja.a f78279t;
    public final m u;
    public final r0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f78280w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u99.a f78281x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y0 f78282y;
    public final i z;

    static {
        Integer[] elements = {500, 502, 503, 504, 429};
        Intrinsics.checkNotNullParameter(elements, "elements");
        A = d.y0(elements);
    }

    public c(ExchangeGlobalAccessFlowV2Contract$InputData inputData, fn2.c productCatalogueLoader, jla.h productCatalogueInteractor, f userInteractor, zja.a productArticleInteractor, tja.a productActivationInteractor, m workflowFlowProvider, r0 kycRequiredActionTransformer, j supportedCountriesConfiguration, u99.a articleKeysConfiguration) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productCatalogueLoader, "productCatalogueLoader");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(productActivationInteractor, "productActivationInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(supportedCountriesConfiguration, "supportedCountriesConfiguration");
        Intrinsics.checkNotNullParameter(articleKeysConfiguration, "articleKeysConfiguration");
        this.o = inputData;
        this.f78275p = productCatalogueLoader;
        this.f78276q = productCatalogueInteractor;
        this.f78277r = userInteractor;
        this.f78278s = productArticleInteractor;
        this.f78279t = productActivationInteractor;
        this.u = workflowFlowProvider;
        this.v = kycRequiredActionTransformer;
        this.f78280w = supportedCountriesConfiguration;
        this.f78281x = articleKeysConfiguration;
        this.f78282y = new y0("exchange_global_access_v2_loading", new c0(null, null, null, true, null, false, false, null, 1903), false, 4);
        this.z = d8l.d.a(this, new w(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c r21, wi0.b r22, gim.c r23) {
        /*
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof u99.h
            if (r2 == 0) goto L17
            r2 = r1
            u99.h r2 = (u99.h) r2
            int r3 = r2.f278424x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f278424x = r3
            goto L1c
        L17:
            u99.h r2 = new u99.h
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f278424x
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L36
            if (r4 != r6) goto L2e
            wi0.b r2 = r2.u
            yhm.o.b(r1)
            goto L54
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            yhm.o.b(r1)
            com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.ExchangeGlobalAccessFlowV2Contract$InputData r1 = r0.o
            bla.c r1 = r1.f78271b
            if (r1 != 0) goto L57
            su4.n r1 = new su4.n
            r4 = 22
            r1.<init>(r0, r5, r4)
            r4 = r22
            r2.u = r4
            r2.f278424x = r6
            java.lang.Object r1 = r0.L2(r1, r2)
            if (r1 != r3) goto L53
            return r3
        L53:
            r2 = r4
        L54:
            bla.c r1 = (bla.c) r1
            goto L5a
        L57:
            r4 = r22
            r2 = r4
        L5a:
            int[] r3 = u99.f.f278421a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 == r6) goto Lb6
            r3 = 2
            if (r1 == r3) goto Lb2
            r2 = 3
            r3 = 4
            if (r1 == r2) goto L74
            if (r1 != r3) goto L6e
            goto L74
        L6e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L74:
            nii.y0 r1 = new nii.y0
            nii.z r6 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.onboarding.impl.R$string.mcy_activation_errors_feature_not_available
            r4 = 14
            r7.<init>(r2, r5, r5, r4)
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.retail.common.ui.R$string.common_action_got_it
            r9.<init>(r2, r5, r5, r4)
            r19 = 0
            r20 = 32758(0x7ff6, float:4.5904E-41)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2 = 0
            java.lang.String r4 = "exchange_global_access_v2_feature_not_available"
            r1.<init>(r4, r6, r2, r3)
            kotlinx.coroutines.flow.Flow r1 = r0.X1(r1)
            u99.l r4 = new u99.l
            r4.<init>(r0, r5)
            r5 = 3
            r2 = 0
            r3 = 0
            yji.l.a1(r0, r1, r2, r3, r4, r5)
            goto Lbb
        Lb2:
            r0.J2(r2)
            goto Lbb
        Lb6:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput$FeatureAvailable r1 = com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput.FeatureAvailable.f78171a
            r0.K2(r1)
        Lbb:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c.I2(com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c, wi0.b, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.g(((kka.h) this.f78278s).d), null, null, new k(this, null), 3);
    }

    public final void J2(wi0.b countryCode) {
        ProductArticleKey productArticleKey;
        Continuation continuation = null;
        if (countryCode != null) {
            this.f78281x.getClass();
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            productArticleKey = (ProductArticleKey) u99.a.f278416a.get(countryCode);
        } else {
            productArticleKey = null;
        }
        if (productArticleKey != null) {
            h.t2(this, this.z, new ExchangeGlobalAccessFlowV2Contract$Step.Article(productArticleKey), false, null, false, 12);
        } else {
            l2(new u99.i(this, continuation, 0), new g(this, new u1.g(this, countryCode, 23), 15));
        }
    }

    public final void K2(ExchangeGlobalAccessOutput exchangeGlobalAccessOutput) {
        ExchangeGlobalAccessFlowV2Contract$InputData exchangeGlobalAccessFlowV2Contract$InputData = this.o;
        if (exchangeGlobalAccessFlowV2Contract$InputData.d != null && (exchangeGlobalAccessOutput instanceof ExchangeGlobalAccessOutput.FeatureAvailable)) {
            h.D2(this.z);
            C1(new BridgeDestination(exchangeGlobalAccessFlowV2Contract$InputData.d));
        } else if (exchangeGlobalAccessFlowV2Contract$InputData.f78272c) {
            C1(new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("EXCHANGE_GLOBAL_ACCESS_OUTPUT", exchangeGlobalAccessOutput)), null, 4)));
        } else {
            C2(exchangeGlobalAccessOutput);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(kotlin.jvm.functions.Function1 r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof u99.n
            if (r0 == 0) goto L13
            r0 = r7
            u99.n r0 = (u99.n) r0
            int r1 = r0.f278428w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278428w = r1
            goto L18
        L13:
            u99.n r0 = new u99.n
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278428w
            r3 = 1
            nii.y0 r4 = r5.f78282y
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L42
        L29:
            r6 = move-exception
            goto L46
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            r5.X1(r4)     // Catch: java.lang.Throwable -> L29
            r0.f278428w = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L42
            return r1
        L42:
            r5.t1(r4)
            return r7
        L46:
            r5.t1(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c.L2(kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new u99.g(this, null), new g(this, new u99.d(this, 0), 15));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.z;
    }
}
