package com.revolut.feature.payments.profile.impl.ui_kompot.scanner;

import ax9.i;
import e60.s;
import kotlin.jvm.internal.Intrinsics;
import q06.l;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i4b.f f79658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f79659m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final uc.d f79660n;
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e60.a f79661p;

    public b(i4b.f qrInteractor, i dialogModelProvider, uc.d barcodeFileDetector, l deeplinkRouter, e60.a mediaPickerControllerExtension) {
        Intrinsics.checkNotNullParameter(qrInteractor, "qrInteractor");
        Intrinsics.checkNotNullParameter(dialogModelProvider, "dialogModelProvider");
        Intrinsics.checkNotNullParameter(barcodeFileDetector, "barcodeFileDetector");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        this.f79658l = qrInteractor;
        this.f79659m = dialogModelProvider;
        this.f79660n = barcodeFileDetector;
        this.o = deeplinkRouter;
        this.f79661p = mediaPickerControllerExtension;
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, rd0.e.b(((s) this.f79661p).f122868g), null, new avk.i(this, null, 6), 3);
    }
}
