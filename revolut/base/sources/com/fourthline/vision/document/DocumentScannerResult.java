package com.fourthline.vision.document;

import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.ScannerMetadata;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0018\u001a\u00060\u000bj\u0002`\fHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JP\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\b\u0002\u0010\r\u001a\u00060\u000bj\u0002`\fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0017R\u001b\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0019¨\u00065"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerResult;", "", "Lcom/fourthline/core/VideoRecording;", "videoRecording", "Lcom/fourthline/core/mrz/MrzInfo;", "mrzInfo", "Lcom/fourthline/core/DocumentType;", "documentType", "", "Lcom/fourthline/vision/document/DocumentScannerStepResult;", "stepResults", "Lcom/fourthline/vision/ScannerMetadata;", "Lcom/fourthline/vision/document/DocumentScannerMetadata;", "metadata", "<init>", "(Lcom/fourthline/core/VideoRecording;Lcom/fourthline/core/mrz/MrzInfo;Lcom/fourthline/core/DocumentType;Ljava/util/List;Lcom/fourthline/vision/ScannerMetadata;)V", "component1", "()Lcom/fourthline/core/VideoRecording;", "component2", "()Lcom/fourthline/core/mrz/MrzInfo;", "component3", "()Lcom/fourthline/core/DocumentType;", "component4", "()Ljava/util/List;", "component5", "()Lcom/fourthline/vision/ScannerMetadata;", "copy", "(Lcom/fourthline/core/VideoRecording;Lcom/fourthline/core/mrz/MrzInfo;Lcom/fourthline/core/DocumentType;Ljava/util/List;Lcom/fourthline/vision/ScannerMetadata;)Lcom/fourthline/vision/document/DocumentScannerResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/VideoRecording;", "getVideoRecording", "b", "Lcom/fourthline/core/mrz/MrzInfo;", "getMrzInfo", "c", "Lcom/fourthline/core/DocumentType;", "getDocumentType", "d", "Ljava/util/List;", "getStepResults", "e", "Lcom/fourthline/vision/ScannerMetadata;", "getMetadata", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentScannerResult {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final VideoRecording videoRecording;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MrzInfo mrzInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DocumentType documentType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List stepResults;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ScannerMetadata metadata;

    public DocumentScannerResult(VideoRecording videoRecording, MrzInfo mrzInfo, @NotNull DocumentType documentType, @NotNull List<DocumentScannerStepResult> stepResults, @NotNull ScannerMetadata metadata) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(stepResults, "stepResults");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.videoRecording = videoRecording;
        this.mrzInfo = mrzInfo;
        this.documentType = documentType;
        this.stepResults = stepResults;
        this.metadata = metadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentScannerResult copy$default(DocumentScannerResult documentScannerResult, VideoRecording videoRecording, MrzInfo mrzInfo, DocumentType documentType, List list, ScannerMetadata scannerMetadata, int i, Object obj2) {
        if ((i & 1) != 0) {
            videoRecording = documentScannerResult.videoRecording;
        }
        if ((i & 2) != 0) {
            mrzInfo = documentScannerResult.mrzInfo;
        }
        if ((i & 4) != 0) {
            documentType = documentScannerResult.documentType;
        }
        if ((i & 8) != 0) {
            list = documentScannerResult.stepResults;
        }
        if ((i & 16) != 0) {
            scannerMetadata = documentScannerResult.metadata;
        }
        ScannerMetadata scannerMetadata2 = scannerMetadata;
        DocumentType documentType2 = documentType;
        return documentScannerResult.copy(videoRecording, mrzInfo, documentType2, list, scannerMetadata2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MrzInfo getMrzInfo() {
        return this.mrzInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    @NotNull
    public final List<DocumentScannerStepResult> component4() {
        return this.stepResults;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ScannerMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final DocumentScannerResult copy(VideoRecording videoRecording, MrzInfo mrzInfo, @NotNull DocumentType documentType, @NotNull List<DocumentScannerStepResult> stepResults, @NotNull ScannerMetadata metadata) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(stepResults, "stepResults");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new DocumentScannerResult(videoRecording, mrzInfo, documentType, stepResults, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentScannerResult)) {
            return false;
        }
        DocumentScannerResult documentScannerResult = (DocumentScannerResult) other;
        return Intrinsics.f(this.videoRecording, documentScannerResult.videoRecording) && Intrinsics.f(this.mrzInfo, documentScannerResult.mrzInfo) && this.documentType == documentScannerResult.documentType && Intrinsics.f(this.stepResults, documentScannerResult.stepResults) && Intrinsics.f(this.metadata, documentScannerResult.metadata);
    }

    @NotNull
    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    @NotNull
    public final ScannerMetadata getMetadata() {
        return this.metadata;
    }

    public final MrzInfo getMrzInfo() {
        return this.mrzInfo;
    }

    @NotNull
    public final List<DocumentScannerStepResult> getStepResults() {
        return this.stepResults;
    }

    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    public int hashCode() {
        VideoRecording videoRecording = this.videoRecording;
        int iHashCode = (videoRecording == null ? 0 : videoRecording.hashCode()) * 31;
        MrzInfo mrzInfo = this.mrzInfo;
        return ((((((iHashCode + (mrzInfo != null ? mrzInfo.hashCode() : 0)) * 31) + this.documentType.hashCode()) * 31) + this.stepResults.hashCode()) * 31) + this.metadata.hashCode();
    }

    @NotNull
    public String toString() {
        return "DocumentScannerResult(videoRecording=" + this.videoRecording + ", mrzInfo=" + this.mrzInfo + ", documentType=" + this.documentType + ", stepResults=" + this.stepResults + ", metadata=" + this.metadata + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DocumentScannerResult(VideoRecording videoRecording, MrzInfo mrzInfo, DocumentType documentType, List list, ScannerMetadata scannerMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ScannerMetadata scannerMetadata2;
        List list2;
        DocumentType documentType2;
        MrzInfo mrzInfo2;
        videoRecording = (i & 1) != 0 ? null : videoRecording;
        if ((i & 2) != 0) {
            scannerMetadata2 = scannerMetadata;
            list2 = list;
            documentType2 = documentType;
            mrzInfo2 = null;
        } else {
            scannerMetadata2 = scannerMetadata;
            list2 = list;
            documentType2 = documentType;
            mrzInfo2 = mrzInfo;
        }
        this(videoRecording, mrzInfo2, documentType2, list2, scannerMetadata2);
    }
}
