package com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow;

import gr6.p;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import q06.l;
import qki.d;
import wtj.c;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements ww6.b {
    public final jf1.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gr6.a f73800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f73801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f73802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f73803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f73804t;

    public b(jf1.a proMerchantTogglesInteractor, gr6.a freelancerAccountDetailsInteractor, p freelancerProductArticleInteractor, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(proMerchantTogglesInteractor, "proMerchantTogglesInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerProductArticleInteractor, "freelancerProductArticleInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.o = proMerchantTogglesInteractor;
        this.f73800p = freelancerAccountDetailsInteractor;
        this.f73801q = freelancerProductArticleInteractor;
        this.f73802r = deeplinkRouter;
        this.f73803s = d8l.d.a(this, new c(this, 16));
        this.f73804t = e.b(this, new ManageEcommercePluginFlowContract$State(0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        if (r12 == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b.I2(com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new ww6.e(this, null, 1), new yi5.b(26));
    }

    @Override // qki.e
    public final d getState() {
        return this.f73804t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f73803s;
    }
}
