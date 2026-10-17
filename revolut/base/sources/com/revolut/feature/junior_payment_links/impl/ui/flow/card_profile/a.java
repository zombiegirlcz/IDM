package com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile;

import cli.y;
import d8l.d;
import kd8.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import te8.z;
import wsg.n;
import yi8.b;
import yi8.c;
import yi8.g;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements c, g {
    public final JuniorCardProfileFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f77085p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f77086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f77087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hj8.a f77088s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xi8.c f77089t;
    public final i u;
    public final y v;

    public a(JuniorCardProfileFlowContract$Input input, e juniorConsentInteractor, n walletInteractor, z juniorProductsInteractor, hj8.a juniorProfileInteractor, xi8.c juniorPaymentLinkShotDialogConfirmationProvider) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorPaymentLinkShotDialogConfirmationProvider, "juniorPaymentLinkShotDialogConfirmationProvider");
        this.o = input;
        this.f77085p = juniorConsentInteractor;
        this.f77086q = walletInteractor;
        this.f77087r = juniorProductsInteractor;
        this.f77088s = juniorProfileInteractor;
        this.f77089t = juniorPaymentLinkShotDialogConfirmationProvider;
        this.u = d.a(this, new yi3.d(this, 1));
        this.v = mra.d.b(this, new b(null), new w72.g(4), null, false, 12);
    }

    @Override // yki.j
    public final void M0() {
        l2(new y7i.h(this, null, 16), new yi8.e(this, 0));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
