package com.revolut.feature.travel.experiences.impl.ui.flow.home;

import c1g.k;
import cli.y;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.travel.experiences.impl.ui.flow.checkout.TravelExperiencesCheckoutFlowContract$Step;
import com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlowContract$PagerItem;
import eub.e;
import f1g.d;
import imk.p0;
import j1g.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import p1g.f;
import p1g.g;
import vkm.j2;
import yki.i;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements j1g.b {
    public final TravelExperiencesHomeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f92997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f92998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zja.a f92999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f93000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f93001t;
    public final i u;

    public b(TravelExperiencesHomeFlowContract$InputData inputData, k configInteractor, d productArticleFactory, zja.a productArticleInteractor, e revPointsCountryOptInPolicyInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(productArticleFactory, "productArticleFactory");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(revPointsCountryOptInPolicyInteractor, "revPointsCountryOptInPolicyInteractor");
        this.o = inputData;
        this.f92997p = configInteractor;
        this.f92998q = productArticleFactory;
        this.f92999r = productArticleInteractor;
        this.f93000s = revPointsCountryOptInPolicyInteractor;
        this.f93001t = mra.d.b(this, new c(0), new a54.b(14), null, false, 12);
        this.u = d8l.d.a(this, new in1.a(this, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006a A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x002a, B:31:0x0062, B:33:0x006a, B:35:0x0070, B:19:0x0038, B:25:0x004a, B:27:0x004e, B:37:0x0075, B:22:0x003f), top: B:41:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x002a, B:31:0x0062, B:33:0x006a, B:35:0x0070, B:19:0x0038, B:25:0x004a, B:27:0x004e, B:37:0x0075, B:22:0x003f), top: B:41:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.travel.experiences.impl.ui.flow.home.b r7, gim.c r8) {
        /*
            com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$InputData r0 = r7.o
            boolean r1 = r8 instanceof j1g.g
            if (r1 == 0) goto L15
            r1 = r8
            j1g.g r1 = (j1g.g) r1
            int r2 = r1.f170461x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f170461x = r2
            goto L1a
        L15:
            j1g.g r1 = new j1g.g
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f170461x
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            com.revolut.feature.product_article.api.models.ProductArticleParams r1 = r1.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto L62
        L2e:
            r8 = move-exception
            goto L7a
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto L4a
        L3c:
            yhm.o.b(r8)
            f1g.d r8 = r7.f92998q     // Catch: java.lang.Throwable -> L2e
            r1.f170461x = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r8.a(r1)     // Catch: java.lang.Throwable -> L2e
            if (r8 != r2) goto L4a
            goto L5e
        L4a:
            com.revolut.feature.product_article.api.models.ProductArticleParams r8 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r8     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L75
            zja.a r3 = r7.f92999r     // Catch: java.lang.Throwable -> L2e
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r5 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a     // Catch: java.lang.Throwable -> L2e
            r1.u = r8     // Catch: java.lang.Throwable -> L2e
            r1.f170461x = r4     // Catch: java.lang.Throwable -> L2e
            kka.h r3 = (kka.h) r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r1 = r3.e(r8, r5, r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 != r2) goto L5f
        L5e:
            return r2
        L5f:
            r6 = r1
            r1 = r8
            r8 = r6
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L2e
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L70
            com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step$Onboarding r8 = new com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step$Onboarding     // Catch: java.lang.Throwable -> L2e
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            return r8
        L70:
            com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step r7 = r7.J2(r0)     // Catch: java.lang.Throwable -> L2e
            return r7
        L75:
            com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step r7 = r7.J2(r0)     // Catch: java.lang.Throwable -> L2e
            return r7
        L7a:
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            r3 = 0
            rd0.d.a(r2, r3, r3, r8, r1)
            com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step r7 = r7.J2(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.experiences.impl.ui.flow.home.b.I2(com.revolut.feature.travel.experiences.impl.ui.flow.home.b, gim.c):java.lang.Object");
    }

    public final TravelExperiencesHomeFlowContract$Step J2(TravelExperiencesHomeFlowContract$InputData travelExperiencesHomeFlowContract$InputData) {
        if (travelExperiencesHomeFlowContract$InputData instanceof TravelExperiencesHomeFlowContract$InputData.Experience) {
            return new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Details(null, ((c) ((j2) this.f93001t.f22677a).getValue()).f170454a, ((TravelExperiencesHomeFlowContract$InputData.Experience) travelExperiencesHomeFlowContract$InputData).f92980a), null);
        }
        if (travelExperiencesHomeFlowContract$InputData instanceof TravelExperiencesHomeFlowContract$InputData.Booking) {
            return new TravelExperiencesHomeFlowContract$Step.BookingDetails(((TravelExperiencesHomeFlowContract$InputData.Booking) travelExperiencesHomeFlowContract$InputData).f92977a, false);
        }
        if (travelExperiencesHomeFlowContract$InputData instanceof TravelExperiencesHomeFlowContract$InputData.Home) {
            return new TravelExperiencesHomeFlowContract$Step.Home(new TravelExperiencesTabsFlowContract$PagerItem.Discover(0));
        }
        if (travelExperiencesHomeFlowContract$InputData instanceof TravelExperiencesHomeFlowContract$InputData.SearchResults) {
            TravelExperiencesHomeFlowContract$InputData.SearchResults searchResults = (TravelExperiencesHomeFlowContract$InputData.SearchResults) travelExperiencesHomeFlowContract$InputData;
            return new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.SearchResults.Destination(searchResults.f92983a, searchResults.f92984b, searchResults.f92985c, new TravelExperienceFiltersSelection(27, searchResults.d)), null);
        }
        if (travelExperiencesHomeFlowContract$InputData instanceof TravelExperiencesHomeFlowContract$InputData.Discovery) {
            TravelExperiencesHomeFlowContract$InputData.Discovery discovery = (TravelExperiencesHomeFlowContract$InputData.Discovery) travelExperiencesHomeFlowContract$InputData;
            return new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.DestinationDiscovery(discovery.f92978a, discovery.f92979b), null);
        }
        if (travelExperiencesHomeFlowContract$InputData instanceof TravelExperiencesHomeFlowContract$InputData.Search) {
            return new TravelExperiencesHomeFlowContract$Step.CheckoutFlow(new TravelExperiencesCheckoutFlowContract$Step.Search(((TravelExperiencesHomeFlowContract$InputData.Search) travelExperiencesHomeFlowContract$InputData).f92982a, 1), null);
        }
        if (travelExperiencesHomeFlowContract$InputData instanceof TravelExperiencesHomeFlowContract$InputData.ActiveBookings) {
            return TravelExperiencesHomeFlowContract$Step.ActiveBookings.f92986a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void K2(g gVar) {
        boolean z = gVar instanceof f;
        i iVar = this.u;
        if (z) {
            h.t2(this, iVar, new TravelExperiencesHomeFlowContract$Step.BookingDetails(((f) gVar).f231922a, false), true, null, false, 12);
        } else if (gVar instanceof g.b) {
            h.t2(this, iVar, TravelExperiencesHomeFlowContract$Step.PastAndCancelledBookings.f92994a, true, null, false, 12);
        } else {
            int i = jli.h.f175850a;
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new p0(this, null, 12), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f93001t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
