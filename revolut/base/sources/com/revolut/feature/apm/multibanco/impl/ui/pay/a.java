package com.revolut.feature.apm.multibanco.impl.ui.pay;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.impl.ui.pay.MultibancoPayFlowContract$Step;
import cp5.d;
import e54.r;
import e82.b;
import e82.g;
import e82.i;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {

    @NotNull
    public static final g Companion = new g();
    public final MultibancoPayFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m72.a f62614p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x62.a f62615q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f62616r;

    public a(MultibancoPayFlowContract$InputData inputData, m72.a sdkInteractor, x62.a currencyHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sdkInteractor, "sdkInteractor");
        Intrinsics.checkNotNullParameter(currencyHelper, "currencyHelper");
        this.o = inputData;
        this.f62614p = sdkInteractor;
        this.f62615q = currencyHelper;
        r rVar = new r(this, 7);
        this.f62616r = d.a(this, MultibancoPayFlowContract$Step.Loading.f62612a, f0.f322471a, rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.apm.multibanco.impl.ui.pay.a r26, java.lang.String r27, dj0.d r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.multibanco.impl.ui.pay.a.I2(com.revolut.feature.apm.multibanco.impl.ui.pay.a, java.lang.String, dj0.d, gim.c):java.lang.Object");
    }

    public static final y0 J2(a aVar) {
        return new y0(null, new z(new TextLocalisedClause(R$string.multibanco_qr_error_not_supported, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5);
    }

    public final void K2(y0 y0Var) {
        l.a1(this, X1(y0Var), null, null, new i(this, null, 1), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62616r;
    }
}
