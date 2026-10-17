package com.onfido.android.sdk.capture.ui.camera;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.api.client.data.DocumentValidationWarningsBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult;", "", "()V", "documentId", "", "getDocumentId", "()Ljava/lang/String;", "BinaryUploaded", "Error", "NfcPropertiesFetched", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$BinaryUploaded;", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$Error;", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$NfcPropertiesFetched;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class UploadBinaryResult {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$BinaryUploaded;", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult;", "documentId", "", "warning", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "documentNfcSupported", "", "warningsBundle", "Lcom/onfido/api/client/data/DocumentValidationWarningsBundle;", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/upload/ErrorType;ZLcom/onfido/api/client/data/DocumentValidationWarningsBundle;)V", "getDocumentId", "()Ljava/lang/String;", "getDocumentNfcSupported", "()Z", "getWarning", "()Lcom/onfido/android/sdk/capture/upload/ErrorType;", "getWarningsBundle", "()Lcom/onfido/api/client/data/DocumentValidationWarningsBundle;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BinaryUploaded extends UploadBinaryResult {

        @NotNull
        private final String documentId;
        private final boolean documentNfcSupported;
        private final ErrorType warning;
        private final DocumentValidationWarningsBundle warningsBundle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BinaryUploaded(@NotNull String documentId, ErrorType errorType, boolean z, DocumentValidationWarningsBundle documentValidationWarningsBundle) {
            super(null);
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            this.documentId = documentId;
            this.warning = errorType;
            this.documentNfcSupported = z;
            this.warningsBundle = documentValidationWarningsBundle;
        }

        public static /* synthetic */ BinaryUploaded copy$default(BinaryUploaded binaryUploaded, String str, ErrorType errorType, boolean z, DocumentValidationWarningsBundle documentValidationWarningsBundle, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = binaryUploaded.documentId;
            }
            if ((i & 2) != 0) {
                errorType = binaryUploaded.warning;
            }
            if ((i & 4) != 0) {
                z = binaryUploaded.documentNfcSupported;
            }
            if ((i & 8) != 0) {
                documentValidationWarningsBundle = binaryUploaded.warningsBundle;
            }
            return binaryUploaded.copy(str, errorType, z, documentValidationWarningsBundle);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ErrorType getWarning() {
            return this.warning;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getDocumentNfcSupported() {
            return this.documentNfcSupported;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final DocumentValidationWarningsBundle getWarningsBundle() {
            return this.warningsBundle;
        }

        @NotNull
        public final BinaryUploaded copy(@NotNull String documentId, ErrorType warning, boolean documentNfcSupported, DocumentValidationWarningsBundle warningsBundle) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            return new BinaryUploaded(documentId, warning, documentNfcSupported, warningsBundle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BinaryUploaded)) {
                return false;
            }
            BinaryUploaded binaryUploaded = (BinaryUploaded) other;
            return Intrinsics.f(this.documentId, binaryUploaded.documentId) && Intrinsics.f(this.warning, binaryUploaded.warning) && this.documentNfcSupported == binaryUploaded.documentNfcSupported && Intrinsics.f(this.warningsBundle, binaryUploaded.warningsBundle);
        }

        @Override // com.onfido.android.sdk.capture.ui.camera.UploadBinaryResult
        @NotNull
        public String getDocumentId() {
            return this.documentId;
        }

        public final boolean getDocumentNfcSupported() {
            return this.documentNfcSupported;
        }

        public final ErrorType getWarning() {
            return this.warning;
        }

        public final DocumentValidationWarningsBundle getWarningsBundle() {
            return this.warningsBundle;
        }

        public int hashCode() {
            int iHashCode = this.documentId.hashCode() * 31;
            ErrorType errorType = this.warning;
            int iC = j6.a.c((iHashCode + (errorType == null ? 0 : errorType.hashCode())) * 31, 31, this.documentNfcSupported);
            DocumentValidationWarningsBundle documentValidationWarningsBundle = this.warningsBundle;
            return iC + (documentValidationWarningsBundle != null ? documentValidationWarningsBundle.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "BinaryUploaded(documentId=" + this.documentId + ", warning=" + this.warning + ", documentNfcSupported=" + this.documentNfcSupported + ", warningsBundle=" + this.warningsBundle + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$Error;", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult;", "throwable", "", "(Ljava/lang/Throwable;)V", "documentId", "", "getDocumentId", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends UploadBinaryResult {
        private final String documentId;

        @NotNull
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th10, int i, Object obj2) {
            if ((i & 1) != 0) {
                th10 = error.throwable;
            }
            return error.copy(th10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @NotNull
        public final Error copy(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.f(this.throwable, ((Error) other).throwable);
        }

        @Override // com.onfido.android.sdk.capture.ui.camera.UploadBinaryResult
        public String getDocumentId() {
            return this.documentId;
        }

        @NotNull
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(throwable=" + this.throwable + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$NfcPropertiesFetched;", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult;", "documentId", "", "nfcProperties", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "warning", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "warningsBundle", "Lcom/onfido/api/client/data/DocumentValidationWarningsBundle;", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;Lcom/onfido/android/sdk/capture/upload/ErrorType;Lcom/onfido/api/client/data/DocumentValidationWarningsBundle;)V", "getDocumentId", "()Ljava/lang/String;", "getNfcProperties", "()Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "getWarning", "()Lcom/onfido/android/sdk/capture/upload/ErrorType;", "getWarningsBundle", "()Lcom/onfido/api/client/data/DocumentValidationWarningsBundle;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NfcPropertiesFetched extends UploadBinaryResult {

        @NotNull
        private final String documentId;

        @NotNull
        private final NfcProperties nfcProperties;
        private final ErrorType warning;
        private final DocumentValidationWarningsBundle warningsBundle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcPropertiesFetched(@NotNull String documentId, @NotNull NfcProperties nfcProperties, ErrorType errorType, DocumentValidationWarningsBundle documentValidationWarningsBundle) {
            super(null);
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(nfcProperties, "nfcProperties");
            this.documentId = documentId;
            this.nfcProperties = nfcProperties;
            this.warning = errorType;
            this.warningsBundle = documentValidationWarningsBundle;
        }

        public static /* synthetic */ NfcPropertiesFetched copy$default(NfcPropertiesFetched nfcPropertiesFetched, String str, NfcProperties nfcProperties, ErrorType errorType, DocumentValidationWarningsBundle documentValidationWarningsBundle, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = nfcPropertiesFetched.documentId;
            }
            if ((i & 2) != 0) {
                nfcProperties = nfcPropertiesFetched.nfcProperties;
            }
            if ((i & 4) != 0) {
                errorType = nfcPropertiesFetched.warning;
            }
            if ((i & 8) != 0) {
                documentValidationWarningsBundle = nfcPropertiesFetched.warningsBundle;
            }
            return nfcPropertiesFetched.copy(str, nfcProperties, errorType, documentValidationWarningsBundle);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final NfcProperties getNfcProperties() {
            return this.nfcProperties;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ErrorType getWarning() {
            return this.warning;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final DocumentValidationWarningsBundle getWarningsBundle() {
            return this.warningsBundle;
        }

        @NotNull
        public final NfcPropertiesFetched copy(@NotNull String documentId, @NotNull NfcProperties nfcProperties, ErrorType warning, DocumentValidationWarningsBundle warningsBundle) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(nfcProperties, "nfcProperties");
            return new NfcPropertiesFetched(documentId, nfcProperties, warning, warningsBundle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NfcPropertiesFetched)) {
                return false;
            }
            NfcPropertiesFetched nfcPropertiesFetched = (NfcPropertiesFetched) other;
            return Intrinsics.f(this.documentId, nfcPropertiesFetched.documentId) && Intrinsics.f(this.nfcProperties, nfcPropertiesFetched.nfcProperties) && Intrinsics.f(this.warning, nfcPropertiesFetched.warning) && Intrinsics.f(this.warningsBundle, nfcPropertiesFetched.warningsBundle);
        }

        @Override // com.onfido.android.sdk.capture.ui.camera.UploadBinaryResult
        @NotNull
        public String getDocumentId() {
            return this.documentId;
        }

        @NotNull
        public final NfcProperties getNfcProperties() {
            return this.nfcProperties;
        }

        public final ErrorType getWarning() {
            return this.warning;
        }

        public final DocumentValidationWarningsBundle getWarningsBundle() {
            return this.warningsBundle;
        }

        public int hashCode() {
            int iHashCode = (this.nfcProperties.hashCode() + (this.documentId.hashCode() * 31)) * 31;
            ErrorType errorType = this.warning;
            int iHashCode2 = (iHashCode + (errorType == null ? 0 : errorType.hashCode())) * 31;
            DocumentValidationWarningsBundle documentValidationWarningsBundle = this.warningsBundle;
            return iHashCode2 + (documentValidationWarningsBundle != null ? documentValidationWarningsBundle.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NfcPropertiesFetched(documentId=" + this.documentId + ", nfcProperties=" + this.nfcProperties + ", warning=" + this.warning + ", warningsBundle=" + this.warningsBundle + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private UploadBinaryResult() {
    }

    public abstract String getDocumentId();

    public /* synthetic */ UploadBinaryResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
