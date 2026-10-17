package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerCallback;
import com.fourthline.vision.selfie.SelfieScannerCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class dg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36114b;

    public /* synthetic */ dg(Object obj2, int i) {
        this.f36113a = i;
        this.f36114b = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36113a) {
            case 0:
                return a8.buildDaggerSubcomponent$lambda$1((SelfieScannerCallback) this.f36114b);
            case 1:
                return Integer.valueOf(((ya) this.f36114b).getCurrentRandomnessLivenessStepIndex());
            case 2:
                return ((xc) this.f36114b).get();
            case 3:
                return d3.locationProvider_delegate$lambda$0((d3) this.f36114b);
            case 4:
                return gf.setup$lambda$0$2((gf) this.f36114b);
            case 5:
                return j5.buildDaggerSubcomponent$lambda$1((DocumentScannerCallback) this.f36114b);
            case 6:
                return m5.videoRecorderManager$lambda$0((m5) this.f36114b);
            case 7:
                return o3.provideStepsDataSource$lambda$0((na) this.f36114b);
            case 8:
                return oc.CameraXSelfieScanner$lambda$5$0((Function1) this.f36114b);
            case 9:
                return sc.videoRecorderManager$lambda$0((sc) this.f36114b);
            case 10:
                return ((vf) this.f36114b).getRecognitionToScreenCoordsMatrixAndTranslation$fourthline_vision_release();
            default:
                return za.locationProvider_delegate$lambda$0((za) this.f36114b);
        }
    }
}
