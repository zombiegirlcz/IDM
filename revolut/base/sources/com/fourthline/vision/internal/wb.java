package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerCallback;

/* JADX INFO: loaded from: classes23.dex */
public abstract class wb implements e4m.e {
    public static SelfieScannerCallback a(bb bbVar) {
        SelfieScannerCallback selfieScannerCallbackProvideSelfieScannerCallback = bbVar.provideSelfieScannerCallback();
        vc.s.k(selfieScannerCallbackProvideSelfieScannerCallback);
        return selfieScannerCallbackProvideSelfieScannerCallback;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
