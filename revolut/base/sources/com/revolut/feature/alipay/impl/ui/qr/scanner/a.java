package com.revolut.feature.alipay.impl.ui.qr.scanner;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.alipay.api.R$string;
import com.revolut.feature.alipay.impl.ui.qr.scanner.AlipayPlusQrScannerFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qk1.f;
import xk1.b;
import xk1.c;
import xk1.g;
import xk1.i;
import xk1.k;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements c {

    @NotNull
    public static final i Companion = new i();
    public final k18.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f61076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f61077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f61078r;

    public a(k stateMapper, k18.c qrCodeRepository, f sdkInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(qrCodeRepository, "qrCodeRepository");
        Intrinsics.checkNotNullParameter(sdkInteractor, "sdkInteractor");
        this.o = qrCodeRepository;
        this.f61076p = sdkInteractor;
        this.f61077q = d.b(this, new b(g.DETECTING), stateMapper, null, false, 12);
        xif.k kVar = new xif.k(this, 2);
        this.f61078r = cp5.d.a(this, AlipayPlusQrScannerFlowContract$Step.Camera.f61075a, f0.f322471a, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.alipay.impl.ui.qr.scanner.a r9, ik1.c r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.alipay.impl.ui.qr.scanner.a.I2(com.revolut.feature.alipay.impl.ui.qr.scanner.a, ik1.c, gim.c):java.lang.Object");
    }

    public final void J2() {
        H2(this.f61077q, new xif.c(11));
        l.a1(this, X1(new y0("INVALID_QR_DIALOG_ID", new z(new TextLocalisedClause(R$string.alipay_plus_scan_qr_error_invalid_title, null, null, 14), null, new TextLocalisedClause(R$string.alipay_plus_scan_qr_error_invalid_retry, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new x0f.g(this, null, 23), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f61077q;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61078r;
    }
}
