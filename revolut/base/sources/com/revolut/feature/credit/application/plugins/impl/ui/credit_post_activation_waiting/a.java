package com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_order_new.api.GetCardFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.CreditPostActivationWaitingFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import gfa.a;
import grl.k9;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import mz3.r;
import n68.x;
import n84.b;
import n84.c;
import n84.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {

    @NotNull
    private static final d Companion = new d();
    public final zw3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lfa.b f67410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qki.d f67411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f67412r;

    public a(zw3.a delayedCreditCheckInteractor, lfa.b postActivationInteractor) {
        Intrinsics.checkNotNullParameter(delayedCreditCheckInteractor, "delayedCreditCheckInteractor");
        Intrinsics.checkNotNullParameter(postActivationInteractor, "postActivationInteractor");
        this.o = delayedCreditCheckInteractor;
        this.f67410p = postActivationInteractor;
        this.f67411q = e.b(this, new CreditPostActivationWaitingFlowContract$DomainState(0));
        r rVar = new r(this, 26);
        this.f67412r = cp5.d.a(this, CreditPostActivationWaitingFlowContract$Step.Loading.f67408a, f0.f322471a, rVar);
    }

    @Override // yji.l
    public final void I1() {
        n2(new x(this, null, 3), new c(this, 0));
    }

    public final void I2() {
        gfa.a aVarA;
        String str = ((CreditPostActivationWaitingFlowContract$DomainState) ((j2) this.f67411q.f22677a).getValue()).d;
        a.e eVar = a.e.f143375a;
        if (str == null || (aVarA = this.f67410p.a(str)) == null) {
            aVarA = eVar;
        }
        if (aVarA.equals(a.C0829a.f143371a)) {
            zn3.a aVar = zn3.a.ONBOARDING;
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.k;
            companion.getClass();
            AnalyticsProduct.Companion.a(k9Var);
            C1(u0.b(gc0.c.f(new GetCardFeatureConfig(aVar, null, false, new AnalyticsProduct.Retail(k9Var), 12))));
            return;
        }
        if (aVarA.equals(eVar)) {
            AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
            k9 k9Var2 = frl.a.k;
            C1(u0.b(gc0.c.f(new PricingPlanFeatureConfig.PlanSelection(true, com.google.android.gms.internal.mlkit_vision_face.a.g(companion2, k9Var2, k9Var2)))));
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CreditPostActivationWaitingFlowModel", "Cannot handle post activation status for flow " + aVarA, null, h0Var);
        AnalyticsProduct.Companion companion3 = AnalyticsProduct.INSTANCE;
        k9 k9Var3 = frl.a.k;
        C1(u0.b(gc0.c.f(new PricingPlanFeatureConfig.PlanSelection(true, com.google.android.gms.internal.mlkit_vision_face.a.g(companion3, k9Var3, k9Var3)))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x019a, code lost:
    
        if (J2(r1, r7) != r8) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(com.revolut.feature.credit.application.plugins.api.models.delayed_credit_check.DelayedCreditCheckResponse r27, gim.c r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a.J2(com.revolut.feature.credit.application.plugins.api.models.delayed_credit_check.DelayedCreditCheckResponse, gim.c):java.lang.Object");
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f67411q;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67412r;
    }
}
