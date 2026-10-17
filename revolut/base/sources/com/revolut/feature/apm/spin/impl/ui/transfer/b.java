package com.revolut.feature.apm.spin.impl.ui.transfer;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import rd2.c;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements zd2.b {
    public final SpinTransferFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f62891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x2k.a f62892q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oy1.b f62893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f62894s;

    public b(SpinTransferFlowContract$InputData inputData, c spinAliasInteractor, x2k.a bankTransferNavigationProvider, oy1.b apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(spinAliasInteractor, "spinAliasInteractor");
        Intrinsics.checkNotNullParameter(bankTransferNavigationProvider, "bankTransferNavigationProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.o = inputData;
        this.f62891p = spinAliasInteractor;
        this.f62892q = bankTransferNavigationProvider;
        this.f62893r = apmNavigationProvider;
        this.f62894s = d.a(this, new zba.a(this, 4));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new z3f.b(this, null, 8), 3);
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62894s;
    }
}
