package com.onfido.android.sdk.capture.utils;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.errors.ErrorDescriptor;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResults;
import com.onfido.android.sdk.capture.upload.ErrorType;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ!\u0010\f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/DocumentUtils;", "", "()V", "getErrorDescriptorForProcessingResult", "Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;", "results", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "isMrzDetectionEnabled", "", "getErrorDescriptorForProcessingResult$onfido_capture_sdk_core_release", "isFoldedFormatSupported", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "isFoldedFormatSupported$onfido_capture_sdk_core_release", "mrzWarningForDocumentType", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentUtils {

    @NotNull
    public static final DocumentUtils INSTANCE = new DocumentUtils();

    private DocumentUtils() {
    }

    private final ErrorDescriptor mrzWarningForDocumentType(DocumentType documentType) {
        return documentType == DocumentType.PASSPORT ? new ErrorDescriptor(R.string.onfido_doc_capture_alert_no_mrz_title, Integer.valueOf(R.string.onfido_doc_capture_alert_no_mrz_detail)) : new ErrorDescriptor(R.string.onfido_doc_capture_alert_no_mrz3_title, Integer.valueOf(R.string.onfido_doc_capture_alert_no_mrz_detail));
    }

    public final ErrorDescriptor getErrorDescriptorForProcessingResult$onfido_capture_sdk_core_release(@NotNull DocumentProcessingResults results, @NotNull DocumentType documentType, boolean isMrzDetectionEnabled) {
        ErrorType errorType;
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        if (results.getBlurResults().getHasBlur()) {
            errorType = ErrorType.Blur.INSTANCE;
        } else {
            if (!results.getMrzValidationResult().isValid() && isMrzDetectionEnabled) {
                return mrzWarningForDocumentType(documentType);
            }
            if (!results.getBarcodeResults().isValid()) {
                errorType = ErrorType.Barcode.INSTANCE;
            } else {
                if (results.getFaceOnDocumentDetectionResult().isValid()) {
                    return null;
                }
                errorType = ErrorType.NoFace.INSTANCE;
            }
        }
        return ErrorTypeUtilsKt.mapErrorType(errorType);
    }

    public final boolean isFoldedFormatSupported$onfido_capture_sdk_core_release(DocumentType documentType, CountryCode countryCode) {
        if (documentType == DocumentType.DRIVING_LICENCE) {
            CountryCode[] elements = {CountryCode.FR, CountryCode.DE};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (d0.T(d.y0(elements), countryCode)) {
                return true;
            }
        }
        return documentType == DocumentType.NATIONAL_IDENTITY_CARD && d0.T(y0.b(CountryCode.ZA), countryCode);
    }
}
