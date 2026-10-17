package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.model.FaceAlignment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.model.FaceAlignmentFeedback;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/mapper/ToFaceAlignmentFeedbackAccessibilityMapper;", "", "()V", "map", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/model/FaceAlignmentFeedback;", "faceAlignment", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/model/FaceAlignment;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ToFaceAlignmentFeedbackAccessibilityMapper {
    @NotNull
    public final FaceAlignmentFeedback map(@NotNull FaceAlignment faceAlignment) {
        Intrinsics.checkNotNullParameter(faceAlignment, "faceAlignment");
        if (Intrinsics.f(faceAlignment, FaceAlignment.FaceCenterIsNotAligned.FaceIsTooLeft.INSTANCE)) {
            return FaceAlignmentFeedback.MoveDeviceLeft.INSTANCE;
        }
        if (Intrinsics.f(faceAlignment, FaceAlignment.FaceCenterIsNotAligned.FaceIsTooRight.INSTANCE)) {
            return FaceAlignmentFeedback.MoveDeviceRight.INSTANCE;
        }
        if (Intrinsics.f(faceAlignment, FaceAlignment.FaceCenterIsNotAligned.FaceIsTooUp.INSTANCE)) {
            return FaceAlignmentFeedback.MoveDeviceUp.INSTANCE;
        }
        if (Intrinsics.f(faceAlignment, FaceAlignment.FaceCenterIsNotAligned.FaceIsTooDown.INSTANCE)) {
            return FaceAlignmentFeedback.MoveDeviceDown.INSTANCE;
        }
        if (Intrinsics.f(faceAlignment, FaceAlignment.FaceCenterIsAligned.FaceIsTooBig.INSTANCE)) {
            return FaceAlignmentFeedback.MoveBack.INSTANCE;
        }
        if (Intrinsics.f(faceAlignment, FaceAlignment.FaceCenterIsAligned.FaceIsTooSmall.INSTANCE)) {
            return FaceAlignmentFeedback.MoveCloser.INSTANCE;
        }
        if (Intrinsics.f(faceAlignment, FaceAlignment.FaceCenterIsAligned.FaceIsAligned.INSTANCE)) {
            return FaceAlignmentFeedback.FaceAligned.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
