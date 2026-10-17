package com.onfido.android.sdk.capture.ui.camera.face.stepbuilder;

import com.onfido.android.sdk.capture.ui.options.FlowAction;
import com.onfido.android.sdk.capture.ui.options.FlowStep;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/face/stepbuilder/MotionCaptureStepBuilder;", "Lcom/onfido/android/sdk/capture/ui/camera/face/stepbuilder/BaseFaceCaptureStepBuilder;", "()V", "audioEnabled", "", "isTestEnv", "showIntro", "build", "Lcom/onfido/android/sdk/capture/ui/options/FlowStep;", "withAudio", "enabled", "withIntro", "withTestEnv", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionCaptureStepBuilder extends BaseFaceCaptureStepBuilder {
    private boolean audioEnabled;
    private boolean isTestEnv;
    private boolean showIntro = true;

    @Override // com.onfido.android.sdk.capture.ui.camera.face.stepbuilder.BaseFaceCaptureStepBuilder
    @NotNull
    public FlowStep build() {
        FlowStep flowStep = new FlowStep(FlowAction.ACTIVE_VIDEO_CAPTURE);
        flowStep.setOptions(new MotionCaptureVariantOptions(this.showIntro, this.audioEnabled, this.isTestEnv, null, 8, null));
        return flowStep;
    }

    @NotNull
    public final MotionCaptureStepBuilder withAudio(boolean enabled) {
        this.audioEnabled = enabled;
        return this;
    }

    @NotNull
    public final MotionCaptureStepBuilder withIntro(boolean enabled) {
        this.showIntro = enabled;
        return this;
    }

    @NotNull
    public final MotionCaptureStepBuilder withTestEnv(boolean enabled) {
        this.isTestEnv = enabled;
        return this;
    }
}
