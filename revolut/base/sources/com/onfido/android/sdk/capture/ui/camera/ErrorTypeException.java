package com.onfido.android.sdk.capture.ui.camera;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.upload.ErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/ErrorTypeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "(Lcom/onfido/android/sdk/capture/upload/ErrorType;)V", "getErrorType", "()Lcom/onfido/android/sdk/capture/upload/ErrorType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ErrorTypeException extends Exception {

    @NotNull
    private final ErrorType errorType;

    public ErrorTypeException(@NotNull ErrorType errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        this.errorType = errorType;
    }

    public static /* synthetic */ ErrorTypeException copy$default(ErrorTypeException errorTypeException, ErrorType errorType, int i, Object obj2) {
        if ((i & 1) != 0) {
            errorType = errorTypeException.errorType;
        }
        return errorTypeException.copy(errorType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ErrorType getErrorType() {
        return this.errorType;
    }

    @NotNull
    public final ErrorTypeException copy(@NotNull ErrorType errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        return new ErrorTypeException(errorType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ErrorTypeException) && Intrinsics.f(this.errorType, ((ErrorTypeException) other).errorType);
    }

    @NotNull
    public final ErrorType getErrorType() {
        return this.errorType;
    }

    public int hashCode() {
        return this.errorType.hashCode();
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "ErrorTypeException(errorType=" + this.errorType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
