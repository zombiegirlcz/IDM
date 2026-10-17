package com.fourthline.vision.internal;

import com.google.mlkit.vision.barcode.BarcodeScanner;

/* JADX INFO: loaded from: classes23.dex */
public final class p2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f36677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f36679c;

    private p2(k2 k2Var, e4m.e eVar, e4m.e eVar2) {
        this.f36677a = k2Var;
        this.f36678b = eVar;
        this.f36679c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z9 get() {
        return a(this.f36677a, (BarcodeScanner) this.f36678b.get(), (v9) this.f36679c.get());
    }

    public static p2 a(k2 k2Var, e4m.e eVar, e4m.e eVar2) {
        return new p2(k2Var, eVar, eVar2);
    }

    public static z9 a(k2 k2Var, BarcodeScanner barcodeScanner, v9 v9Var) {
        z9 z9VarProvideQrCodeTextDetector = k2Var.provideQrCodeTextDetector(barcodeScanner, v9Var);
        vc.s.k(z9VarProvideQrCodeTextDetector);
        return z9VarProvideQrCodeTextDetector;
    }
}
