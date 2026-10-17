package com.revolut.feature.apm.spin.impl.ui;

import c12.z;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$InputData;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$StartType;
import com.revolut.feature.apm.spin.impl.common.SpinArticles;
import com.revolut.feature.apm.spin.impl.ui.SpinFlowContract$Step;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import sd2.d;
import yki.i;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements sd2.b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ProductArticleParams f62871t = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(SpinArticles.ONBOARDING));
    public final td2.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f62872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zja.a f62873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f62874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SpinFlowContract$Step f62875s;

    public b(SpinNavigation$InputData flowInputData, td2.b spinNewContactNavigationProvider, z apmRecipientListExtension, zja.a productArticleInteractor) {
        SpinFlowContract$Step deregister;
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(spinNewContactNavigationProvider, "spinNewContactNavigationProvider");
        Intrinsics.checkNotNullParameter(apmRecipientListExtension, "apmRecipientListExtension");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = spinNewContactNavigationProvider;
        this.f62872p = apmRecipientListExtension;
        this.f62873q = productArticleInteractor;
        this.f62874r = d8l.d.a(this, new scl.h(this, 1));
        SpinNavigation$StartType spinNavigation$StartType = flowInputData.f62861a;
        if (spinNavigation$StartType instanceof SpinNavigation$StartType.NewContact) {
            deregister = SpinFlowContract$Step.NewContact.f62868a;
        } else if (spinNavigation$StartType instanceof SpinNavigation$StartType.RecipientList) {
            deregister = SpinFlowContract$Step.RecipientsList.f62869a;
        } else {
            if (!(spinNavigation$StartType instanceof SpinNavigation$StartType.Deregister)) {
                throw new NoWhenBranchMatchedException();
            }
            deregister = new SpinFlowContract$Step.Deregister(((SpinNavigation$StartType.Deregister) spinNavigation$StartType).f62862a);
        }
        this.f62875s = deregister;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.apm.spin.impl.ui.b r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof sd2.f
            if (r0 == 0) goto L13
            r0 = r5
            sd2.f r0 = (sd2.f) r0
            int r1 = r0.f261808w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261808w = r1
            goto L18
        L13:
            sd2.f r0 = new sd2.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261808w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            zja.a r4 = r4.f62873q
            r0.f261808w = r3
            kka.h r4 = (kka.h) r4
            com.revolut.feature.product_article.api.models.ProductArticleParams r5 = com.revolut.feature.apm.spin.impl.ui.b.f62871t
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r5 = r4.e(r5, r2, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r4 = r4 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.spin.impl.ui.b.I2(com.revolut.feature.apm.spin.impl.ui.b, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62874r;
    }
}
