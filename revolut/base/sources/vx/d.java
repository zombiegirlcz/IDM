package vx;

import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeDetectorSettings;
import e4m.e;
import zhm.v;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements e {
    public static MsBarcodeDetectorSettings a() {
        b.Companion.getClass();
        return new MsBarcodeDetectorSettings(bh0.a.CODE_128, v.k(bh0.a.CODE_39, bh0.a.CODE_93, bh0.a.CODABAR, bh0.a.EAN_13, bh0.a.EAN_8, bh0.a.ITF, bh0.a.UPC_A, bh0.a.UPC_E));
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
