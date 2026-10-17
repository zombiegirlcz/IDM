package com.revolut.feature.crypto.qr.parser.impl.ui.scanner;

import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.qr.parser.impl.ui.scanner.CryptoQrScannerControllerContract$ProcessingState;
import com.revolut.retail.common.ui.R$string;
import efm.r;
import ff4.z;
import fg8.e0;
import fj5.c;
import fj5.f;
import fj5.g;
import fj5.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import skm.a2;
import te0.w;
import vkm.j2;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements c {

    @NotNull
    public static final f Companion = new f();
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y80.a f70903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ar2.c f70904q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f70905r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f70906s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f70907t;
    public final y u;

    public a(n mapper, i qrInteractor, y80.a permissionProvider, ar2.c frameProcessor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(qrInteractor, "qrInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(frameProcessor, "frameProcessor");
        this.o = qrInteractor;
        this.f70903p = permissionProvider;
        this.f70904q = frameProcessor;
        this.f70905r = q.c(Boolean.FALSE);
        this.u = d.b(this, new fj5.b(CryptoQrScannerControllerContract$ProcessingState.Detecting.f70899a), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new g(this, null), new yi5.b(26));
        I2();
    }

    public final void I2() {
        a2 a2Var = this.f70906s;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        ar2.c cVar = this.f70904q;
        r rVarHide = cVar.f8507g.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        r map = w.l(rVarHide, e.c(this.u.B(new fj5.e(3)), kotlin.coroutines.g.f186406a)).filter(new e0(27, new fg8.g(29))).map(new e0(28, new fj5.e(0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f70906s = l.a1(this, e.b(map), null, null, new f9d.c(this, continuation, 22), 3);
        a2 a2Var2 = this.f70907t;
        if (a2Var2 != null) {
            a2Var2.f(null);
        }
        this.f70907t = l.a1(this, e.b(cVar.f8505b.f128528a), null, null, new z(this, continuation, 9), 3);
    }

    public final void J2() {
        l.b1(this, X1(new y0("ERROR_DIALOG_ID", new nii.z(new TextLocalisedClause(R$string.error_camera, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, new fj5.h(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
