package com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow;

import av8.n;
import aza.g;
import com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.ReferralsFlowContract$Step;
import jxa.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n5j.i;
import oki.h;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends h implements aza.b {
    public final zja.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f81947p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f01.a f81948q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ReferralsFlowContract$InputData f81949r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f81950s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jxa.b f81951t;
    public final yki.i u;

    public e(zja.a productArticleInteractor, i c2BReferralProvider, f01.a uiKitResources, ReferralsFlowContract$InputData inputData, j sharedReferralsNavigationInteractor, jxa.b sharedC2BInteractor) {
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(c2BReferralProvider, "c2BReferralProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedReferralsNavigationInteractor, "sharedReferralsNavigationInteractor");
        Intrinsics.checkNotNullParameter(sharedC2BInteractor, "sharedC2BInteractor");
        this.o = productArticleInteractor;
        this.f81947p = c2BReferralProvider;
        this.f81948q = uiKitResources;
        this.f81949r = inputData;
        this.f81950s = sharedReferralsNavigationInteractor;
        this.f81951t = sharedC2BInteractor;
        this.u = d8l.d.a(this, new n(this, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e.I2(com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        ReferralsFlowContract$Step referralsFlowContract$Step = this.f81949r.f81931a;
        Continuation continuation = null;
        if (referralsFlowContract$Step instanceof ReferralsFlowContract$Step.C2BReferrals) {
            l2(new g(this, continuation, 0), new yi5.b(26));
        } else {
            h.u2(this, this.u, referralsFlowContract$Step, null, 6);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
