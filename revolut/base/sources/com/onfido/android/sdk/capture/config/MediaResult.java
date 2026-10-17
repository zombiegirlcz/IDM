package com.onfido.android.sdk.capture.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/config/MediaResult;", "", "DocumentResult", "LivenessResult", "SelfieResult", "Lcom/onfido/android/sdk/capture/config/MediaResult$DocumentResult;", "Lcom/onfido/android/sdk/capture/config/MediaResult$LivenessResult;", "Lcom/onfido/android/sdk/capture/config/MediaResult$SelfieResult;", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MediaResult {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/config/MediaResult$DocumentResult;", "Lcom/onfido/android/sdk/capture/config/MediaResult;", "fileData", "Lcom/onfido/android/sdk/capture/config/MediaFile;", "documentMetadata", "Lcom/onfido/android/sdk/capture/config/DocumentMetadata;", "(Lcom/onfido/android/sdk/capture/config/MediaFile;Lcom/onfido/android/sdk/capture/config/DocumentMetadata;)V", "getDocumentMetadata", "()Lcom/onfido/android/sdk/capture/config/DocumentMetadata;", "getFileData", "()Lcom/onfido/android/sdk/capture/config/MediaFile;", "equals", "", "other", "", "hashCode", "", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DocumentResult implements MediaResult {

        @NotNull
        private final DocumentMetadata documentMetadata;

        @NotNull
        private final MediaFile fileData;

        public DocumentResult(@NotNull MediaFile fileData, @NotNull DocumentMetadata documentMetadata) {
            Intrinsics.checkNotNullParameter(fileData, "fileData");
            Intrinsics.checkNotNullParameter(documentMetadata, "documentMetadata");
            this.fileData = fileData;
            this.documentMetadata = documentMetadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!DocumentResult.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.i(other, "null cannot be cast to non-null type com.onfido.android.sdk.capture.config.MediaResult.DocumentResult");
            DocumentResult documentResult = (DocumentResult) other;
            return Intrinsics.f(this.fileData, documentResult.fileData) && Intrinsics.f(this.documentMetadata, documentResult.documentMetadata);
        }

        @NotNull
        public final DocumentMetadata getDocumentMetadata() {
            return this.documentMetadata;
        }

        @NotNull
        public final MediaFile getFileData() {
            return this.fileData;
        }

        public int hashCode() {
            return this.documentMetadata.hashCode() + (this.fileData.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/config/MediaResult$LivenessResult;", "Lcom/onfido/android/sdk/capture/config/MediaResult;", "fileData", "Lcom/onfido/android/sdk/capture/config/MediaFile;", "(Lcom/onfido/android/sdk/capture/config/MediaFile;)V", "getFileData", "()Lcom/onfido/android/sdk/capture/config/MediaFile;", "equals", "", "other", "", "hashCode", "", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LivenessResult implements MediaResult {

        @NotNull
        private final MediaFile fileData;

        public LivenessResult(@NotNull MediaFile fileData) {
            Intrinsics.checkNotNullParameter(fileData, "fileData");
            this.fileData = fileData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!LivenessResult.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.i(other, "null cannot be cast to non-null type com.onfido.android.sdk.capture.config.MediaResult.LivenessResult");
            return Intrinsics.f(this.fileData, ((LivenessResult) other).fileData);
        }

        @NotNull
        public final MediaFile getFileData() {
            return this.fileData;
        }

        public int hashCode() {
            return this.fileData.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/config/MediaResult$SelfieResult;", "Lcom/onfido/android/sdk/capture/config/MediaResult;", "fileData", "Lcom/onfido/android/sdk/capture/config/MediaFile;", "(Lcom/onfido/android/sdk/capture/config/MediaFile;)V", "getFileData", "()Lcom/onfido/android/sdk/capture/config/MediaFile;", "equals", "", "other", "", "hashCode", "", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelfieResult implements MediaResult {

        @NotNull
        private final MediaFile fileData;

        public SelfieResult(@NotNull MediaFile fileData) {
            Intrinsics.checkNotNullParameter(fileData, "fileData");
            this.fileData = fileData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!SelfieResult.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.i(other, "null cannot be cast to non-null type com.onfido.android.sdk.capture.config.MediaResult.SelfieResult");
            return Intrinsics.f(this.fileData, ((SelfieResult) other).fileData);
        }

        @NotNull
        public final MediaFile getFileData() {
            return this.fileData;
        }

        public int hashCode() {
            return this.fileData.hashCode();
        }
    }
}
