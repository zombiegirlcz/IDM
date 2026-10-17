package oq3;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_order_new.api.GetCardFeatureConfig;
import com.revolut.feature.credit.api.navigation.EmptyStateFeatureConfig;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import efm.d0;
import ffk.t;
import gfa.a;
import grl.k9;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import n68.w;
import pfm.z;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements kq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f227730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q89.e f227731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lfa.b f227732c;
    public final t d;

    public o(sri.m navigator, q89.e onboardingInteractor, lfa.b postActivationInteractor, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(postActivationInteractor, "postActivationInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f227730a = navigator;
        this.f227731b = onboardingInteractor;
        this.f227732c = postActivationInteractor;
        this.d = pricingPlanInteractor;
    }

    public static FeatureCommand b(hha.d dVar, String str, String str2) {
        Object next;
        zn3.a aVar = zn3.a.ONBOARDING;
        Iterator<E> it8 = hha.i.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((hha.i) next).name(), str)) {
                break;
            }
        }
        pi3.h hVar = new pi3.h(dVar, (hha.i) next, str2 != null ? new PricingPlanOffer(str2, null) : null, false, 48);
        k9 value = k9.Onboarding;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new FeatureCommand(new GetCardFeatureConfig(aVar, hVar, false, new AnalyticsProduct.Retail(value), 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ft3.q0 c(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L28
            kotlin.enums.EnumEntries r1 = ft3.j1.a()
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            r3 = r2
            ft3.j1 r3 = (ft3.j1) r3
            java.lang.String r3 = r3.name()
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)
            if (r3 == 0) goto Lb
            goto L24
        L23:
            r2 = r0
        L24:
            ft3.j1 r2 = (ft3.j1) r2
            if (r2 != 0) goto L2a
        L28:
            ft3.j1 r2 = ft3.j1.CREDIT_CARD
        L2a:
            ft3.c1 r4 = ft3.d1.Companion
            ft3.d1 r4 = mif.a.m(r4, r2, r0)
            r1 = 3
            ft3.q0 r4 = ft3.g1.d(r4, r0, r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oq3.o.c(java.lang.String):ft3.q0");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        lq3.c.Companion.getClass();
        return lq3.a.a(deeplink) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(lq3.b r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof oq3.n
            if (r0 == 0) goto L13
            r0 = r8
            oq3.n r0 = (oq3.n) r0
            int r1 = r0.f227729y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227729y = r1
            goto L18
        L13:
            oq3.n r0 = new oq3.n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f227727w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227729y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r7 = r0.v
            lq3.b r0 = r0.u
            yhm.o.b(r8)
            goto L5d
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            jf0.c r8 = r7.f199186b
            java.util.HashMap r8 = r8.d
            java.lang.String r2 = "planId"
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L46
            goto L65
        L46:
            ffk.t r2 = r6.d
            efm.d0 r2 = r2.f(r8)
            r0.u = r7
            r0.v = r8
            r0.f227729y = r3
            java.lang.Object r0 = nim.a.b(r2, r0)
            if (r0 != r1) goto L59
            return r1
        L59:
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r5
        L5d:
            od0.i r8 = (od0.i) r8
            boolean r1 = r8.d()
            if (r1 != 0) goto L66
        L65:
            return r4
        L66:
            lfa.b r1 = r6.f227732c
            r1.c(r7)
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            java.lang.Object r8 = r8.c()
            hha.d r8 = (hha.d) r8
            jf0.c r2 = r0.f199186b
            java.util.HashMap r2 = r2.d
            java.lang.String r3 = "billingCycle"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            jf0.c r0 = r0.f199186b
            java.util.HashMap r0 = r0.d
            java.lang.String r3 = "offerToken"
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            com.revolut.retail.core.navigation.FeatureCommand r8 = b(r8, r2, r0)
            r1.<init>(r8)
            r7.<init>(r1, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oq3.o.d(lq3.b, gim.c):java.lang.Object");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        lq3.c.Companion.getClass();
        lq3.c cVarA = lq3.a.a(cVar);
        if (cVarA != null && (cVarA instanceof lq3.b)) {
            if (((db9.d) this.f227731b).c()) {
                return new q06.h(new BridgeDestination(new FeatureCommand(new EmptyStateFeatureConfig(c((String) ((lq3.b) cVarA).f199186b.d.get("product"))))), null);
            }
            lq3.b bVar = (lq3.b) cVarA;
            String str = (String) bVar.f199186b.d.get("flowId");
            lfa.b bVar2 = this.f227732c;
            gfa.a aVarA = str != null ? bVar2.a(str) : null;
            if (Intrinsics.f(aVarA, a.C0829a.f143371a)) {
                return d(bVar, (gim.c) continuation);
            }
            if (Intrinsics.f(aVarA, a.e.f143375a)) {
                m70.a.c(t0.f186434a);
                bVar2.c("");
                k9 k9Var = k9.Onboarding;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new q06.h(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.PlanSelection(true, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)))), null);
            }
        }
        return null;
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        lfa.b bVar;
        gfa.a aVarA;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        lq3.c.Companion.getClass();
        lq3.c cVarA = lq3.a.a(deeplink);
        if (!(cVarA instanceof lq3.b)) {
            if (cVarA != null) {
                throw new NoWhenBranchMatchedException();
            }
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        jf0.c cVar = ((lq3.b) cVarA).f199186b;
        String str = (String) cVar.d.get("flowId");
        String str2 = (String) cVar.d.get("planId");
        String str3 = (String) cVar.d.get("billingCycle");
        String str4 = (String) cVar.d.get("offerToken");
        String str5 = (String) cVar.d.get("product");
        int i = 17;
        if (((db9.d) this.f227731b).c()) {
            pfm.h hVar = new pfm.h(new ne0.o(this, new FeatureCommand(new EmptyStateFeatureConfig(c(str5))), i), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            z zVarD = hVar.D(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
            return zVarD;
        }
        if (str == null || (aVarA = (bVar = this.f227732c).a(str)) == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "CreditRetailOnboardingActionPerformerImpl", p.a.p("Cannot parse post activation status for flow '", str, "'"), null, h0Var);
            ufm.b bVarM2 = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        if (aVarA.equals(a.C0829a.f143371a)) {
            if (str2 == null) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "CreditRetailOnboardingActionPerformerImpl", "planId must not be null", null, h0Var2);
                ufm.b bVarM3 = d0.m(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
                return bVarM3;
            }
            d0 d0VarF = this.d.f(str2);
            f fVar = new f(7, new w((Object) this, str2, (Serializable) str3, (Object) str4, 20));
            d0VarF.getClass();
            ufm.i iVar = new ufm.i(d0VarF, fVar, 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        if (!aVarA.equals(a.e.f143375a)) {
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "CreditRetailOnboardingActionPerformerImpl", p.a.p("Cannot handle post activation status for flow '", str, "'"), null, h0Var3);
            return d0.m(Boolean.FALSE);
        }
        m70.a.c(t0.f186434a);
        bVar.c("");
        k9 k9Var = k9.Onboarding;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        pfm.h hVar2 = new pfm.h(new ne0.o(this, new FeatureCommand(new PricingPlanFeatureConfig.PlanSelection(true, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var))), i), 2);
        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
        z zVarD2 = hVar2.D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD2, "toSingleDefault(...)");
        return zVarD2;
    }
}
