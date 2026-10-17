package com.onfido.android.sdk.capture.detector.rectangle;

import com.google.mlkit.vision.common.InputImage;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import dki.h;
import igm.q;
import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.internal.Intrinsics;
import ml.i0;
import ml.k0;
import nl.p0;
import nl.w0;
import nl.x0;
import ogm.e;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49911a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f49912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49913c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(x0 x0Var, CaptureStepDataBundle captureStepDataBundle, Observable observable, boolean z) {
        this.f49913c = x0Var;
        this.d = captureStepDataBundle;
        this.e = observable;
        this.f49912b = z;
    }

    @Override // igm.q
    public final Object get() {
        switch (this.f49911a) {
            case 0:
                return RectangleDetectorGoogle.process$lambda$1(this.f49912b, (RectangleDetectorGoogle) this.f49913c, (InputImage) this.d, (DocumentDetectionFrame) this.e);
            default:
                x0 this$0 = (x0) this.f49913c;
                CaptureStepDataBundle captureStepDataBundle = (CaptureStepDataBundle) this.d;
                Observable uiEvents = (Observable) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(captureStepDataBundle, "$captureStepDataBundle");
                Intrinsics.checkNotNullParameter(uiEvents, "$uiEvents");
                if (this$0.f216963b.hasPermissionsForCaptureType(captureStepDataBundle.getCaptureType())) {
                    Observable observableJust = Observable.just(captureStepDataBundle);
                    Intrinsics.h(observableJust);
                    return observableJust;
                }
                e eVar = new e(new com.onfido.android.sdk.capture.internal.analytics.inhouse.a(this$0, captureStepDataBundle, 7), 2);
                Observable observableCast = uiEvents.filter(p0.d).cast(k0.class);
                Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
                Observable observableDoOnNext = observableCast.doOnNext(new h(this$0, this.f49912b, 5));
                Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
                Observable observableCast2 = observableDoOnNext.filter(p0.e).cast(i0.class);
                Intrinsics.checkNotNullExpressionValue(observableCast2, "cast(...)");
                w0 function = w0.f;
                Intrinsics.checkNotNullParameter(function, "function");
                mgm.b bVarD = eVar.d(observableCast2.map(new p0(9)).take(1L));
                Intrinsics.checkNotNullExpressionValue(bVarD, "andThen(...)");
                return bVarD;
        }
    }

    public /* synthetic */ a(boolean z, RectangleDetectorGoogle rectangleDetectorGoogle, InputImage inputImage, DocumentDetectionFrame documentDetectionFrame) {
        this.f49912b = z;
        this.f49913c = rectangleDetectorGoogle;
        this.d = inputImage;
        this.e = documentDetectionFrame;
    }
}
