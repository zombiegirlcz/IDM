package com.onfido.android.sdk.capture.detector.mrzextraction;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult;", "", "Failed", "NotFound", "Skipped", "Success", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult$Failed;", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult$NotFound;", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult$Skipped;", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult$Success;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MRZResult {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult$Failed;", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failed implements MRZResult {

        @NotNull
        private final String message;

        public Failed(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = failed.message;
            }
            return failed.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Failed copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Failed(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.f(this.message, ((Failed) other).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return a.u(new StringBuilder("Failed(message="), this.message, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult$NotFound;", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotFound implements MRZResult {

        @NotNull
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult$Skipped;", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Skipped implements MRZResult {

        @NotNull
        public static final Skipped INSTANCE = new Skipped();

        private Skipped() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult$Success;", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult;", "document", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;", "(Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;)V", "getDocument", "()Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success implements MRZResult {

        @NotNull
        private final MRZDocument document;

        public Success(@NotNull MRZDocument document) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.document = document;
        }

        public static /* synthetic */ Success copy$default(Success success, MRZDocument mRZDocument, int i, Object obj2) {
            if ((i & 1) != 0) {
                mRZDocument = success.document;
            }
            return success.copy(mRZDocument);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MRZDocument getDocument() {
            return this.document;
        }

        @NotNull
        public final Success copy(@NotNull MRZDocument document) {
            Intrinsics.checkNotNullParameter(document, "document");
            return new Success(document);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.f(this.document, ((Success) other).document);
        }

        @NotNull
        public final MRZDocument getDocument() {
            return this.document;
        }

        public int hashCode() {
            return this.document.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(document=" + this.document + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }
}
