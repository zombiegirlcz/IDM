package com.onfido.android.sdk.capture.ui.camera.rx;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSource;
import com.onfido.android.sdk.capture.utils.CountryCode;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements ObservableTransformer, CameraSource.AutoFocusCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f50035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f50036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50037c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(DocumentCaptureDelayTransformer documentCaptureDelayTransformer, boolean z, DocumentType documentType, CountryCode countryCode, boolean z3) {
        this.f50037c = documentCaptureDelayTransformer;
        this.f50035a = z;
        this.d = documentType;
        this.e = countryCode;
        this.f50036b = z3;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public ObservableSource b(Observable observable) {
        return DocumentCaptureDelayTransformer.transform$lambda$0((DocumentCaptureDelayTransformer) this.f50037c, this.f50035a, (DocumentType) this.d, (CountryCode) this.e, this.f50036b, observable);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.AutoFocusCallback
    public void onAutoFocus(boolean z) {
        ((CameraSource) this.f50037c).lambda$takePictureWithAutoFocus$5((CameraSource.ShutterCallback) this.d, (CameraSource.PictureCallback) this.e, this.f50035a, this.f50036b, z);
    }

    public /* synthetic */ b(CameraSource cameraSource, CameraSource.ShutterCallback shutterCallback, CameraSource.PictureCallback pictureCallback, boolean z, boolean z3) {
        this.f50037c = cameraSource;
        this.d = shutterCallback;
        this.e = pictureCallback;
        this.f50035a = z;
        this.f50036b = z3;
    }
}
