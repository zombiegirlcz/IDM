package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.util.OnfidoPointF;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006)"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/tfmodel/Detection;", "", "face", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "leftEye", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoPointF;", "rightEye", "nose", "mouth", "leftEar", "rightEar", "confidence", "", "(Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;Lcom/onfido/android/sdk/capture/internal/util/OnfidoPointF;Lcom/onfido/android/sdk/capture/internal/util/OnfidoPointF;Lcom/onfido/android/sdk/capture/internal/util/OnfidoPointF;Lcom/onfido/android/sdk/capture/internal/util/OnfidoPointF;Lcom/onfido/android/sdk/capture/internal/util/OnfidoPointF;Lcom/onfido/android/sdk/capture/internal/util/OnfidoPointF;F)V", "getConfidence", "()F", "getFace", "()Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "getLeftEar", "()Lcom/onfido/android/sdk/capture/internal/util/OnfidoPointF;", "getLeftEye", "getMouth", "getNose", "getRightEar", "getRightEye", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Detection {
    private final float confidence;

    @NotNull
    private final OnfidoRectF face;

    @NotNull
    private final OnfidoPointF leftEar;

    @NotNull
    private final OnfidoPointF leftEye;

    @NotNull
    private final OnfidoPointF mouth;

    @NotNull
    private final OnfidoPointF nose;

    @NotNull
    private final OnfidoPointF rightEar;

    @NotNull
    private final OnfidoPointF rightEye;

    public Detection(@NotNull OnfidoRectF face, @NotNull OnfidoPointF leftEye, @NotNull OnfidoPointF rightEye, @NotNull OnfidoPointF nose, @NotNull OnfidoPointF mouth, @NotNull OnfidoPointF leftEar, @NotNull OnfidoPointF rightEar, float f) {
        Intrinsics.checkNotNullParameter(face, "face");
        Intrinsics.checkNotNullParameter(leftEye, "leftEye");
        Intrinsics.checkNotNullParameter(rightEye, "rightEye");
        Intrinsics.checkNotNullParameter(nose, "nose");
        Intrinsics.checkNotNullParameter(mouth, "mouth");
        Intrinsics.checkNotNullParameter(leftEar, "leftEar");
        Intrinsics.checkNotNullParameter(rightEar, "rightEar");
        this.face = face;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.nose = nose;
        this.mouth = mouth;
        this.leftEar = leftEar;
        this.rightEar = rightEar;
        this.confidence = f;
    }

    public static /* synthetic */ Detection copy$default(Detection detection, OnfidoRectF onfidoRectF, OnfidoPointF onfidoPointF, OnfidoPointF onfidoPointF2, OnfidoPointF onfidoPointF3, OnfidoPointF onfidoPointF4, OnfidoPointF onfidoPointF5, OnfidoPointF onfidoPointF6, float f, int i, Object obj2) {
        if ((i & 1) != 0) {
            onfidoRectF = detection.face;
        }
        if ((i & 2) != 0) {
            onfidoPointF = detection.leftEye;
        }
        if ((i & 4) != 0) {
            onfidoPointF2 = detection.rightEye;
        }
        if ((i & 8) != 0) {
            onfidoPointF3 = detection.nose;
        }
        if ((i & 16) != 0) {
            onfidoPointF4 = detection.mouth;
        }
        if ((i & 32) != 0) {
            onfidoPointF5 = detection.leftEar;
        }
        if ((i & 64) != 0) {
            onfidoPointF6 = detection.rightEar;
        }
        if ((i & 128) != 0) {
            f = detection.confidence;
        }
        OnfidoPointF onfidoPointF7 = onfidoPointF6;
        float f4 = f;
        OnfidoPointF onfidoPointF8 = onfidoPointF4;
        OnfidoPointF onfidoPointF9 = onfidoPointF5;
        return detection.copy(onfidoRectF, onfidoPointF, onfidoPointF2, onfidoPointF3, onfidoPointF8, onfidoPointF9, onfidoPointF7, f4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OnfidoRectF getFace() {
        return this.face;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OnfidoPointF getLeftEye() {
        return this.leftEye;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OnfidoPointF getRightEye() {
        return this.rightEye;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OnfidoPointF getNose() {
        return this.nose;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OnfidoPointF getMouth() {
        return this.mouth;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OnfidoPointF getLeftEar() {
        return this.leftEar;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final OnfidoPointF getRightEar() {
        return this.rightEar;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getConfidence() {
        return this.confidence;
    }

    @NotNull
    public final Detection copy(@NotNull OnfidoRectF face, @NotNull OnfidoPointF leftEye, @NotNull OnfidoPointF rightEye, @NotNull OnfidoPointF nose, @NotNull OnfidoPointF mouth, @NotNull OnfidoPointF leftEar, @NotNull OnfidoPointF rightEar, float confidence) {
        Intrinsics.checkNotNullParameter(face, "face");
        Intrinsics.checkNotNullParameter(leftEye, "leftEye");
        Intrinsics.checkNotNullParameter(rightEye, "rightEye");
        Intrinsics.checkNotNullParameter(nose, "nose");
        Intrinsics.checkNotNullParameter(mouth, "mouth");
        Intrinsics.checkNotNullParameter(leftEar, "leftEar");
        Intrinsics.checkNotNullParameter(rightEar, "rightEar");
        return new Detection(face, leftEye, rightEye, nose, mouth, leftEar, rightEar, confidence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Detection)) {
            return false;
        }
        Detection detection = (Detection) other;
        return Intrinsics.f(this.face, detection.face) && Intrinsics.f(this.leftEye, detection.leftEye) && Intrinsics.f(this.rightEye, detection.rightEye) && Intrinsics.f(this.nose, detection.nose) && Intrinsics.f(this.mouth, detection.mouth) && Intrinsics.f(this.leftEar, detection.leftEar) && Intrinsics.f(this.rightEar, detection.rightEar) && Float.compare(this.confidence, detection.confidence) == 0;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    @NotNull
    public final OnfidoRectF getFace() {
        return this.face;
    }

    @NotNull
    public final OnfidoPointF getLeftEar() {
        return this.leftEar;
    }

    @NotNull
    public final OnfidoPointF getLeftEye() {
        return this.leftEye;
    }

    @NotNull
    public final OnfidoPointF getMouth() {
        return this.mouth;
    }

    @NotNull
    public final OnfidoPointF getNose() {
        return this.nose;
    }

    @NotNull
    public final OnfidoPointF getRightEar() {
        return this.rightEar;
    }

    @NotNull
    public final OnfidoPointF getRightEye() {
        return this.rightEye;
    }

    public int hashCode() {
        return Float.hashCode(this.confidence) + ((this.rightEar.hashCode() + ((this.leftEar.hashCode() + ((this.mouth.hashCode() + ((this.nose.hashCode() + ((this.rightEye.hashCode() + ((this.leftEye.hashCode() + (this.face.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("Detection(face=");
        sb6.append(this.face);
        sb6.append(", leftEye=");
        sb6.append(this.leftEye);
        sb6.append(", rightEye=");
        sb6.append(this.rightEye);
        sb6.append(", nose=");
        sb6.append(this.nose);
        sb6.append(", mouth=");
        sb6.append(this.mouth);
        sb6.append(", leftEar=");
        sb6.append(this.leftEar);
        sb6.append(", rightEar=");
        sb6.append(this.rightEar);
        sb6.append(", confidence=");
        return b.s(sb6, this.confidence, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
