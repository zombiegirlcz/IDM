package com.onfido.android.sdk.capture.detector.barcode;

import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSource;
import fgm.q;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements q, CameraSource.AutoFocusCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f49905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49907c;

    public /* synthetic */ a(Object obj2, Object obj3, boolean z) {
        this.f49906b = obj2;
        this.f49907c = obj3;
        this.f49905a = z;
    }

    @Override // fgm.q
    public void c(tgm.a aVar) {
        BarcodeDetectorGoogle.detect$lambda$0((BarcodeDetectorGoogle) this.f49906b, (DocumentDetectionFrame) this.f49907c, this.f49905a, aVar);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.AutoFocusCallback
    public void onAutoFocus(boolean z) {
        ((CameraSource) this.f49906b).lambda$autoFocusOnce$8((CameraSource.AutoFocusCallback) this.f49907c, this.f49905a, z);
    }
}
