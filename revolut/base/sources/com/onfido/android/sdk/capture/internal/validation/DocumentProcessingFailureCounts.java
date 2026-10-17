package com.onfido.android.sdk.capture.internal.validation;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingFailureCounts;", "Landroid/os/Parcelable;", "glareFailureCount", "", "blurFailureCount", "edgeDetectionFailureCount", "barcodeFailureCount", "mrzValidationFailureCount", "faceOnDocumentDetectionFailureCount", "(IIIIII)V", "getBarcodeFailureCount", "()I", "getBlurFailureCount", "getEdgeDetectionFailureCount", "getFaceOnDocumentDetectionFailureCount", "getGlareFailureCount", "getMrzValidationFailureCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DocumentProcessingFailureCounts implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentProcessingFailureCounts> CREATOR = new Creator();
    private final int barcodeFailureCount;
    private final int blurFailureCount;
    private final int edgeDetectionFailureCount;
    private final int faceOnDocumentDetectionFailureCount;
    private final int glareFailureCount;
    private final int mrzValidationFailureCount;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DocumentProcessingFailureCounts> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DocumentProcessingFailureCounts createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentProcessingFailureCounts(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DocumentProcessingFailureCounts[] newArray(int i) {
            return new DocumentProcessingFailureCounts[i];
        }
    }

    public DocumentProcessingFailureCounts() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ DocumentProcessingFailureCounts copy$default(DocumentProcessingFailureCounts documentProcessingFailureCounts, int i, int i2, int i3, int i5, int i6, int i21, int i22, Object obj2) {
        if ((i22 & 1) != 0) {
            i = documentProcessingFailureCounts.glareFailureCount;
        }
        if ((i22 & 2) != 0) {
            i2 = documentProcessingFailureCounts.blurFailureCount;
        }
        if ((i22 & 4) != 0) {
            i3 = documentProcessingFailureCounts.edgeDetectionFailureCount;
        }
        if ((i22 & 8) != 0) {
            i5 = documentProcessingFailureCounts.barcodeFailureCount;
        }
        if ((i22 & 16) != 0) {
            i6 = documentProcessingFailureCounts.mrzValidationFailureCount;
        }
        if ((i22 & 32) != 0) {
            i21 = documentProcessingFailureCounts.faceOnDocumentDetectionFailureCount;
        }
        int i32 = i6;
        int i33 = i21;
        return documentProcessingFailureCounts.copy(i, i2, i3, i5, i32, i33);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGlareFailureCount() {
        return this.glareFailureCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBlurFailureCount() {
        return this.blurFailureCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEdgeDetectionFailureCount() {
        return this.edgeDetectionFailureCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBarcodeFailureCount() {
        return this.barcodeFailureCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMrzValidationFailureCount() {
        return this.mrzValidationFailureCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getFaceOnDocumentDetectionFailureCount() {
        return this.faceOnDocumentDetectionFailureCount;
    }

    @NotNull
    public final DocumentProcessingFailureCounts copy(int glareFailureCount, int blurFailureCount, int edgeDetectionFailureCount, int barcodeFailureCount, int mrzValidationFailureCount, int faceOnDocumentDetectionFailureCount) {
        return new DocumentProcessingFailureCounts(glareFailureCount, blurFailureCount, edgeDetectionFailureCount, barcodeFailureCount, mrzValidationFailureCount, faceOnDocumentDetectionFailureCount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentProcessingFailureCounts)) {
            return false;
        }
        DocumentProcessingFailureCounts documentProcessingFailureCounts = (DocumentProcessingFailureCounts) other;
        return this.glareFailureCount == documentProcessingFailureCounts.glareFailureCount && this.blurFailureCount == documentProcessingFailureCounts.blurFailureCount && this.edgeDetectionFailureCount == documentProcessingFailureCounts.edgeDetectionFailureCount && this.barcodeFailureCount == documentProcessingFailureCounts.barcodeFailureCount && this.mrzValidationFailureCount == documentProcessingFailureCounts.mrzValidationFailureCount && this.faceOnDocumentDetectionFailureCount == documentProcessingFailureCounts.faceOnDocumentDetectionFailureCount;
    }

    public final int getBarcodeFailureCount() {
        return this.barcodeFailureCount;
    }

    public final int getBlurFailureCount() {
        return this.blurFailureCount;
    }

    public final int getEdgeDetectionFailureCount() {
        return this.edgeDetectionFailureCount;
    }

    public final int getFaceOnDocumentDetectionFailureCount() {
        return this.faceOnDocumentDetectionFailureCount;
    }

    public final int getGlareFailureCount() {
        return this.glareFailureCount;
    }

    public final int getMrzValidationFailureCount() {
        return this.mrzValidationFailureCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.faceOnDocumentDetectionFailureCount) + a.b(this.mrzValidationFailureCount, a.b(this.barcodeFailureCount, a.b(this.edgeDetectionFailureCount, a.b(this.blurFailureCount, Integer.hashCode(this.glareFailureCount) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("DocumentProcessingFailureCounts(glareFailureCount=");
        sb6.append(this.glareFailureCount);
        sb6.append(", blurFailureCount=");
        sb6.append(this.blurFailureCount);
        sb6.append(", edgeDetectionFailureCount=");
        sb6.append(this.edgeDetectionFailureCount);
        sb6.append(", barcodeFailureCount=");
        sb6.append(this.barcodeFailureCount);
        sb6.append(", mrzValidationFailureCount=");
        sb6.append(this.mrzValidationFailureCount);
        sb6.append(", faceOnDocumentDetectionFailureCount=");
        return a.t(sb6, this.faceOnDocumentDetectionFailureCount, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.glareFailureCount);
        parcel.writeInt(this.blurFailureCount);
        parcel.writeInt(this.edgeDetectionFailureCount);
        parcel.writeInt(this.barcodeFailureCount);
        parcel.writeInt(this.mrzValidationFailureCount);
        parcel.writeInt(this.faceOnDocumentDetectionFailureCount);
    }

    public DocumentProcessingFailureCounts(int i, int i2, int i3, int i5, int i6, int i21) {
        this.glareFailureCount = i;
        this.blurFailureCount = i2;
        this.edgeDetectionFailureCount = i3;
        this.barcodeFailureCount = i5;
        this.mrzValidationFailureCount = i6;
        this.faceOnDocumentDetectionFailureCount = i21;
    }

    public /* synthetic */ DocumentProcessingFailureCounts(int i, int i2, int i3, int i5, int i6, int i21, int i22, DefaultConstructorMarker defaultConstructorMarker) {
        this((i22 & 1) != 0 ? 0 : i, (i22 & 2) != 0 ? 0 : i2, (i22 & 4) != 0 ? 0 : i3, (i22 & 8) != 0 ? 0 : i5, (i22 & 16) != 0 ? 0 : i6, (i22 & 32) != 0 ? 0 : i21);
    }
}
