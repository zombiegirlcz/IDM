package com.revolut.feature.apm.core.ui.impl.ui.qr.scanner;

import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.QrScannerFlowContract$Step;
import cp5.d;
import g12.l;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import umd.n;
import v32.c;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements c {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e60.a f62383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f62384q;

    public a(l qrHandler, e60.a mediaPickerControllerExtension) {
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        this.o = qrHandler;
        this.f62383p = mediaPickerControllerExtension;
        n nVar = new n(this, 29);
        this.f62384q = d.a(this, QrScannerFlowContract$Step.Camera.f62382a, f0.f322471a, nVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f62384q;
    }
}
