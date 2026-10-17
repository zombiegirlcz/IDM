package com.onfido.android.sdk.capture.internal.usecase.validation;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import com.onfido.api.client.data.DocSide;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0016\u001a\u00020\tHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u0012R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationTargets;", "", "Lcom/onfido/android/sdk/capture/DocumentType;", "documentType", "Lcom/onfido/api/client/data/DocSide;", "documentSide", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "minimumCaptureArea", "maximumCaptureArea", "Lkotlin/time/b;", "holdDuration", "<init>", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/api/client/data/DocSide;Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/onfido/android/sdk/capture/DocumentType;", "component2", "()Lcom/onfido/api/client/data/DocSide;", "component3", "()Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "component4", "component5-UwyO8pc", "()J", "component5", "copy-9VgGkz4", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/api/client/data/DocSide;Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;J)Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationTargets;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/onfido/android/sdk/capture/DocumentType;", "getDocumentType", "Lcom/onfido/api/client/data/DocSide;", "getDocumentSide", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "getMinimumCaptureArea", "getMaximumCaptureArea", "J", "getHoldDuration-UwyO8pc", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DocumentValidationTargets {
    private final DocSide documentSide;
    private final DocumentType documentType;
    private final long holdDuration;

    @NotNull
    private final OnfidoRectF maximumCaptureArea;

    @NotNull
    private final OnfidoRectF minimumCaptureArea;

    private DocumentValidationTargets(DocumentType documentType, DocSide docSide, OnfidoRectF minimumCaptureArea, OnfidoRectF maximumCaptureArea, long j2) {
        Intrinsics.checkNotNullParameter(minimumCaptureArea, "minimumCaptureArea");
        Intrinsics.checkNotNullParameter(maximumCaptureArea, "maximumCaptureArea");
        this.documentType = documentType;
        this.documentSide = docSide;
        this.minimumCaptureArea = minimumCaptureArea;
        this.maximumCaptureArea = maximumCaptureArea;
        this.holdDuration = j2;
    }

    /* JADX INFO: renamed from: copy-9VgGkz4$default, reason: not valid java name */
    public static /* synthetic */ DocumentValidationTargets m3702copy9VgGkz4$default(DocumentValidationTargets documentValidationTargets, DocumentType documentType, DocSide docSide, OnfidoRectF onfidoRectF, OnfidoRectF onfidoRectF2, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            documentType = documentValidationTargets.documentType;
        }
        if ((i & 2) != 0) {
            docSide = documentValidationTargets.documentSide;
        }
        if ((i & 4) != 0) {
            onfidoRectF = documentValidationTargets.minimumCaptureArea;
        }
        if ((i & 8) != 0) {
            onfidoRectF2 = documentValidationTargets.maximumCaptureArea;
        }
        if ((i & 16) != 0) {
            j2 = documentValidationTargets.holdDuration;
        }
        long j3 = j2;
        return documentValidationTargets.m3704copy9VgGkz4(documentType, docSide, onfidoRectF, onfidoRectF2, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DocSide getDocumentSide() {
        return this.documentSide;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OnfidoRectF getMinimumCaptureArea() {
        return this.minimumCaptureArea;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OnfidoRectF getMaximumCaptureArea() {
        return this.maximumCaptureArea;
    }

    /* JADX INFO: renamed from: component5-UwyO8pc, reason: not valid java name and from getter */
    public final long getHoldDuration() {
        return this.holdDuration;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-9VgGkz4, reason: not valid java name */
    public final DocumentValidationTargets m3704copy9VgGkz4(DocumentType documentType, DocSide documentSide, @NotNull OnfidoRectF minimumCaptureArea, @NotNull OnfidoRectF maximumCaptureArea, long holdDuration) {
        Intrinsics.checkNotNullParameter(minimumCaptureArea, "minimumCaptureArea");
        Intrinsics.checkNotNullParameter(maximumCaptureArea, "maximumCaptureArea");
        return new DocumentValidationTargets(documentType, documentSide, minimumCaptureArea, maximumCaptureArea, holdDuration, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentValidationTargets)) {
            return false;
        }
        DocumentValidationTargets documentValidationTargets = (DocumentValidationTargets) other;
        return this.documentType == documentValidationTargets.documentType && this.documentSide == documentValidationTargets.documentSide && Intrinsics.f(this.minimumCaptureArea, documentValidationTargets.minimumCaptureArea) && Intrinsics.f(this.maximumCaptureArea, documentValidationTargets.maximumCaptureArea) && b.d(this.holdDuration, documentValidationTargets.holdDuration);
    }

    public final DocSide getDocumentSide() {
        return this.documentSide;
    }

    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: getHoldDuration-UwyO8pc, reason: not valid java name */
    public final long m3705getHoldDurationUwyO8pc() {
        return this.holdDuration;
    }

    @NotNull
    public final OnfidoRectF getMaximumCaptureArea() {
        return this.maximumCaptureArea;
    }

    @NotNull
    public final OnfidoRectF getMinimumCaptureArea() {
        return this.minimumCaptureArea;
    }

    public int hashCode() {
        DocumentType documentType = this.documentType;
        int iHashCode = (documentType == null ? 0 : documentType.hashCode()) * 31;
        DocSide docSide = this.documentSide;
        int iHashCode2 = (this.maximumCaptureArea.hashCode() + ((this.minimumCaptureArea.hashCode() + ((iHashCode + (docSide != null ? docSide.hashCode() : 0)) * 31)) * 31)) * 31;
        long j2 = this.holdDuration;
        b.Companion companion = b.INSTANCE;
        return Long.hashCode(j2) + iHashCode2;
    }

    @NotNull
    public String toString() {
        return "DocumentValidationTargets(documentType=" + this.documentType + ", documentSide=" + this.documentSide + ", minimumCaptureArea=" + this.minimumCaptureArea + ", maximumCaptureArea=" + this.maximumCaptureArea + ", holdDuration=" + ((Object) b.o(this.holdDuration)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ DocumentValidationTargets(DocumentType documentType, DocSide docSide, OnfidoRectF onfidoRectF, OnfidoRectF onfidoRectF2, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : documentType, (i & 2) != 0 ? null : docSide, onfidoRectF, onfidoRectF2, j2, null);
    }

    public /* synthetic */ DocumentValidationTargets(DocumentType documentType, DocSide docSide, OnfidoRectF onfidoRectF, OnfidoRectF onfidoRectF2, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentType, docSide, onfidoRectF, onfidoRectF2, j2);
    }
}
