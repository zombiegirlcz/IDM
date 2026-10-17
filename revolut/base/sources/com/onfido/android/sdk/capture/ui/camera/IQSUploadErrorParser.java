package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.api.client.data.ErrorData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\bH\u0002J\"\u0010\u000b\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006H\u0002J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/IQSUploadErrorParser;", "", "()V", "parseDocumentCaptureWarning", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "errorFields", "", "", "", "parseOriginalDocumentDetectionError", "errorValues", "parseSelfieCaptureWarning", "parseUploadError", "errorData", "Lcom/onfido/api/client/data/ErrorData;", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IQSUploadErrorParser {

    @Deprecated
    @NotNull
    public static final String BLUR_DETECTION_ERROR_KEY = "detect_blur";

    @Deprecated
    @NotNull
    public static final String DOCUMENT_DETECTION_ERROR_KEY = "document_detection";

    @Deprecated
    @NotNull
    public static final String GLARE_DETECTION_ERROR_KEY = "detect_glare";

    @Deprecated
    @NotNull
    public static final String SCREENSHOT_DETECTION_ERROR = "screenshot";

    @Deprecated
    @NotNull
    public static final String CUTOFF_DETECTION_ERROR_KEY = "detect_cutoff";

    @Deprecated
    @NotNull
    public static final String MULTIPLE_FACES_ERROR_STRING = "Multiple faces";

    @Deprecated
    @NotNull
    public static final String ORIGINAL_DOCUMENT_DETECTION_ERROR_KEY = "detect_original_document_present";

    @Deprecated
    @NotNull
    public static final String NO_FACE_ERROR_STRING = "Face not detected";

    @Deprecated
    @NotNull
    public static final String SCAN_DETECTION_ERROR = "scan";

    @Deprecated
    @NotNull
    public static final String BARCODE_DETECTION_ERROR_KEY = "detect_barcode";

    @Deprecated
    @NotNull
    public static final String DOCUMENT_ON_PRINTED_PAPER_DETECTION_ERROR = "document_on_printed_paper";

    @Deprecated
    @NotNull
    public static final String FACE_DETECTION_ERROR_KEY = "face_detection";

    @Deprecated
    @NotNull
    public static final String PHOTO_OF_SCREEN_DETECTION_ERROR = "photo_of_screen";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/IQSUploadErrorParser$Companion;", "", "()V", "BARCODE_DETECTION_ERROR_KEY", "", "BLUR_DETECTION_ERROR_KEY", "CUTOFF_DETECTION_ERROR_KEY", "DOCUMENT_DETECTION_ERROR_KEY", "DOCUMENT_ON_PRINTED_PAPER_DETECTION_ERROR", "FACE_DETECTION_ERROR_KEY", "GLARE_DETECTION_ERROR_KEY", "MULTIPLE_FACES_ERROR_STRING", "NO_FACE_ERROR_STRING", "ORIGINAL_DOCUMENT_DETECTION_ERROR_KEY", "PHOTO_OF_SCREEN_DETECTION_ERROR", "SCAN_DETECTION_ERROR", "SCREENSHOT_DETECTION_ERROR", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final ErrorType parseDocumentCaptureWarning(Map<String, ? extends List<String>> errorFields) {
        return errorFields.containsKey("document_detection") ? ErrorType.Document.INSTANCE : errorFields.containsKey("detect_cutoff") ? ErrorType.Cutoff.INSTANCE : errorFields.containsKey("detect_glare") ? ErrorType.Glare.INSTANCE : errorFields.containsKey("detect_blur") ? ErrorType.Blur.INSTANCE : errorFields.containsKey("detect_barcode") ? ErrorType.Barcode.INSTANCE : errorFields.containsKey("detect_original_document_present") ? parseOriginalDocumentDetectionError(errorFields.get("detect_original_document_present")) : ErrorType.Generic.INSTANCE;
    }

    private final ErrorType parseOriginalDocumentDetectionError(List<String> errorValues) {
        String str = errorValues != null ? (String) d0.d0(errorValues) : null;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1123599395) {
                if (iHashCode != -416447130) {
                    if (iHashCode != 3524221) {
                        if (iHashCode == 1217094151 && str.equals("photo_of_screen")) {
                            return ErrorType.PhotoOfScreen.INSTANCE;
                        }
                    } else if (str.equals("scan")) {
                        return ErrorType.Scan.INSTANCE;
                    }
                } else if (str.equals("screenshot")) {
                    return ErrorType.Screenshot.INSTANCE;
                }
            } else if (str.equals("document_on_printed_paper")) {
                return ErrorType.Photocopy.INSTANCE;
            }
        }
        return ErrorType.Generic.INSTANCE;
    }

    private final ErrorType parseSelfieCaptureWarning(Map<String, ? extends List<String>> errorFields) {
        List<String> list;
        String str;
        if (errorFields.containsKey("face_detection") && (list = errorFields.get("face_detection")) != null && (str = (String) d0.d0(list)) != null) {
            ErrorType errorType = kotlin.text.d0.J(str, "Face not detected", false) ? ErrorType.NoFace.INSTANCE : kotlin.text.d0.J(str, "Multiple faces", false) ? ErrorType.MultipleFaces.INSTANCE : ErrorType.Generic.INSTANCE;
            if (errorType != null) {
                return errorType;
            }
        }
        return ErrorType.Generic.INSTANCE;
    }

    @NotNull
    public final ErrorType parseUploadError(@NotNull ErrorData errorData, @NotNull CaptureType captureType) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        if (errorData.getError().getFields() == null) {
            return ErrorType.Generic.INSTANCE;
        }
        Map<String, List<String>> fields = errorData.getError().getFields();
        if (captureType == CaptureType.DOCUMENT) {
            if (fields == null) {
                fields = r0.g();
            }
            return parseDocumentCaptureWarning(fields);
        }
        if (fields == null) {
            fields = r0.g();
        }
        return parseSelfieCaptureWarning(fields);
    }
}
