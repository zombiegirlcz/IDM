package com.fourthline.vision.internal;

import com.google.mlkit.vision.barcode.BarcodeScanner;

/* JADX INFO: loaded from: classes23.dex */
public final class l2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f36467a;

    private l2(k2 k2Var) {
        this.f36467a = k2Var;
    }

    public static BarcodeScanner b(k2 k2Var) {
        BarcodeScanner barcodeScannerProvideBarcodeScanner = k2Var.provideBarcodeScanner();
        vc.s.k(barcodeScannerProvideBarcodeScanner);
        return barcodeScannerProvideBarcodeScanner;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BarcodeScanner get() {
        return b(this.f36467a);
    }

    public static l2 a(k2 k2Var) {
        return new l2(k2Var);
    }
}
