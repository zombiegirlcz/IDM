package com.onfido.android.sdk.capture.utils;

import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.errors.ErrorDescriptor;
import com.onfido.android.sdk.capture.upload.ErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"mapErrorType", "Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ErrorTypeUtilsKt {
    @NotNull
    public static final ErrorDescriptor mapErrorType(@NotNull ErrorType errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        return Intrinsics.f(errorType, ErrorType.Barcode.INSTANCE) ? new ErrorDescriptor(R.string.onfido_doc_capture_alert_no_barcode_title, Integer.valueOf(R.string.onfido_doc_capture_alert_no_barcode_detail)) : Intrinsics.f(errorType, ErrorType.Blur.INSTANCE) ? new ErrorDescriptor(R.string.onfido_doc_confirmation_alert_blur_title, Integer.valueOf(R.string.onfido_doc_confirmation_alert_blur_detail)) : Intrinsics.f(errorType, ErrorType.Cutoff.INSTANCE) ? new ErrorDescriptor(R.string.onfido_doc_confirmation_alert_crop_title, Integer.valueOf(R.string.onfido_doc_confirmation_alert_crop_detail)) : Intrinsics.f(errorType, ErrorType.Document.INSTANCE) ? new ErrorDescriptor(R.string.onfido_doc_confirmation_alert_no_doc_title, Integer.valueOf(R.string.onfido_doc_confirmation_alert_no_doc_detail)) : Intrinsics.f(errorType, ErrorType.Glare.INSTANCE) ? new ErrorDescriptor(R.string.onfido_doc_capture_alert_glare_title, Integer.valueOf(R.string.onfido_doc_capture_alert_glare_detail)) : Intrinsics.f(errorType, ErrorType.NoFace.INSTANCE) ? new ErrorDescriptor(R.string.onfido_selfie_confirmation_alert_no_face_title, Integer.valueOf(R.string.onfido_selfie_confirmation_alert_no_face_detail)) : Intrinsics.f(errorType, ErrorType.MultipleFaces.INSTANCE) ? new ErrorDescriptor(R.string.onfido_doc_confirmation_alert_multi_face_title, Integer.valueOf(R.string.onfido_doc_confirmation_alert_multi_face_detail)) : Intrinsics.f(errorType, ErrorType.PhotoOfScreen.INSTANCE) ? new ErrorDescriptor(R.string.onfido_doc_confirmation_alert_odp_photo_of_screen_title, Integer.valueOf(R.string.onfido_doc_confirmation_alert_odp_detail)) : Intrinsics.f(errorType, ErrorType.Screenshot.INSTANCE) ? new ErrorDescriptor(R.string.onfido_doc_confirmation_alert_odp_screenshot_title, Integer.valueOf(R.string.onfido_doc_confirmation_alert_odp_detail)) : Intrinsics.f(errorType, ErrorType.Photocopy.INSTANCE) ? new ErrorDescriptor(R.string.onfido_doc_confirmation_alert_odp_photocopy_title, Integer.valueOf(R.string.onfido_doc_confirmation_alert_odp_detail)) : Intrinsics.f(errorType, ErrorType.Scan.INSTANCE) ? new ErrorDescriptor(R.string.onfido_doc_confirmation_alert_odp_scan_title, Integer.valueOf(R.string.onfido_doc_confirmation_alert_odp_detail)) : new ErrorDescriptor(R.string.onfido_generic_error_network_title, Integer.valueOf(R.string.onfido_generic_error_detail));
    }
}
