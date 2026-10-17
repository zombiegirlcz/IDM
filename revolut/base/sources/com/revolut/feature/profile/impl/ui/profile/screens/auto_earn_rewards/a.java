package com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards;

import avd.b;
import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import umd.n;
import una.c;
import una.d;
import una.g;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements d {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final iq6.a f81443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hq6.a f81444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f81445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f81446s;

    public a(g mapper, b flexibleStakingConsentInteractor, iq6.a autoStakingResultPopupProvider, hq6.a autoStakingDisableConfirmDialogProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(flexibleStakingConsentInteractor, "flexibleStakingConsentInteractor");
        Intrinsics.checkNotNullParameter(autoStakingResultPopupProvider, "autoStakingResultPopupProvider");
        Intrinsics.checkNotNullParameter(autoStakingDisableConfirmDialogProvider, "autoStakingDisableConfirmDialogProvider");
        this.o = flexibleStakingConsentInteractor;
        this.f81443p = autoStakingResultPopupProvider;
        this.f81444q = autoStakingDisableConfirmDialogProvider;
        this.f81445r = mra.d.b(this, new c(0), mapper, null, false, 12);
        this.f81446s = e.a(this, new n(this, 4));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f81446s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.o.a(), null, new uf0.d(this, null, 23), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f81445r;
    }
}
