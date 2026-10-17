package com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase;

import com.google.android.gms.tasks.OnFailureListener;
import com.onfido.android.sdk.capture.detector.mrz.MRZDetectorGoogle;
import com.onfido.android.sdk.capture.internal.util.TaskExtensionKt;
import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SingleEmitter f49878b;

    public /* synthetic */ a(SingleEmitter singleEmitter, int i) {
        this.f49877a = i;
        this.f49878b = singleEmitter;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc2) {
        switch (this.f49877a) {
            case 0:
                GetFaceDetectionModuleAvailabilityUseCase.invoke$lambda$2$lambda$1(this.f49878b, exc2);
                break;
            case 1:
                MRZDetectorGoogle.addSuccessAndFailureListeners$lambda$2(this.f49878b, exc2);
                break;
            default:
                TaskExtensionKt.toSingle$lambda$2$lambda$1(this.f49878b, exc2);
                break;
        }
    }
}
