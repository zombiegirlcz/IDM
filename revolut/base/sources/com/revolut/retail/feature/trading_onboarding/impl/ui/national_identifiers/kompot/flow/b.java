package com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow;

import c0l.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qki.d;
import yki.i;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h implements c0l.b {

    @NotNull
    private static final e Companion = new e();
    public final kye.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e1l.a f104215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zzk.a f104216q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f104217r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f104218s;

    public b(kye.e interactor, e1l.a errorDialogProvider, zzk.a nationalIdentifiersUtils) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(errorDialogProvider, "errorDialogProvider");
        Intrinsics.checkNotNullParameter(nationalIdentifiersUtils, "nationalIdentifiersUtils");
        this.o = interactor;
        this.f104215p = errorDialogProvider;
        this.f104216q = nationalIdentifiersUtils;
        this.f104217r = d8l.d.a(this, new bwd.a(this, 9));
        this.f104218s = hx7.e.b(this, new NationalIdentifiersFlowContract$State(0));
    }

    @Override // yki.j
    public final void M0() {
        l2(new bv4.h(this, null, 5), new c0l.d(this, 0));
    }

    @Override // qki.e
    public final d getState() {
        return this.f104218s;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f104217r;
    }
}
