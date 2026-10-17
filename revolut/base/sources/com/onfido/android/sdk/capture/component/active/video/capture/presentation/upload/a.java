package com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload;

import androidx.lifecycle.Observer;
import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment;
import com.onfido.android.sdk.capture.ui.proofOfAddress.documentDetails.PoaDocumentDetailsFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f49901b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f49900a = i;
        this.f49901b = function1;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj2) {
        switch (this.f49900a) {
            case 0:
                MotionUploadFragment.onViewCreated$lambda$0(this.f49901b, obj2);
                break;
            case 1:
                LivenessCaptureFragment.setupObservers$lambda$0(this.f49901b, obj2);
                break;
            case 2:
                LivenessCaptureFragment.setupObservers$lambda$1(this.f49901b, obj2);
                break;
            case 3:
                LivenessCaptureFragment.setupObservers$lambda$2(this.f49901b, obj2);
                break;
            case 4:
                LivenessCaptureFragment.setupObservers$lambda$3(this.f49901b, obj2);
                break;
            case 5:
                LivenessCaptureFragment.setupObservers$lambda$4(this.f49901b, obj2);
                break;
            case 6:
                LivenessCaptureFragment.setupObservers$lambda$5(this.f49901b, obj2);
                break;
            case 7:
                LivenessCaptureFragment.setupObservers$lambda$6(this.f49901b, obj2);
                break;
            default:
                PoaDocumentDetailsFragment.onViewCreated$lambda$0(this.f49901b, obj2);
                break;
        }
    }
}
