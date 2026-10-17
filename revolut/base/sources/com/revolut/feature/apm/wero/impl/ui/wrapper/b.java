package com.revolut.feature.apm.wero.impl.ui.wrapper;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$InputData;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rbh.k;
import rhj.m;
import ri2.c;
import yki.i;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements ri2.b {

    @NotNull
    public static final c Companion = new c();
    public final WeroNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final uw1.c f63111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f63112q;

    public b(WeroNavigation$InputData inputData, uw1.c apmFeatureChecker) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        this.o = inputData;
        this.f63111p = apmFeatureChecker;
        this.f63112q = d.a(this, new m(this, 2));
    }

    public static final void I2(b bVar) {
        bVar.X1(new y0("NOT_AVAILABLE_DIALOG_ID", new z(new TextLocalisedClause(R$string.apm_error_unsupported, u.c(ApmWero.f61829c.e()), null, 12), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4));
        h.D2(bVar.f63112q);
    }

    @Override // yki.j
    public final void M0() {
        l2(new k(this, null, 4), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f63112q;
    }
}
