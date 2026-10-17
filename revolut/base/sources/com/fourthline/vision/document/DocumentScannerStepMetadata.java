package com.fourthline.vision.document;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.location.Coordinate;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\t\u0010\u0013¨\u0006*"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerStepMetadata;", "", "Ljava/util/Date;", "timestamp", "Lcom/fourthline/core/location/Coordinate;", "location", "Lcom/fourthline/core/DocumentFileSide;", "fileSide", "", "isAngled", "<init>", "(Ljava/util/Date;Lcom/fourthline/core/location/Coordinate;Lcom/fourthline/core/DocumentFileSide;Z)V", "component1", "()Ljava/util/Date;", "component2", "()Lcom/fourthline/core/location/Coordinate;", "component3", "()Lcom/fourthline/core/DocumentFileSide;", "component4", "()Z", "copy", "(Ljava/util/Date;Lcom/fourthline/core/location/Coordinate;Lcom/fourthline/core/DocumentFileSide;Z)Lcom/fourthline/vision/document/DocumentScannerStepMetadata;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "getTimestamp", "b", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "c", "Lcom/fourthline/core/DocumentFileSide;", "getFileSide", "d", "Z", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentScannerStepMetadata {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Date timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Coordinate location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DocumentFileSide fileSide;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isAngled;

    public DocumentScannerStepMetadata(@NotNull Date timestamp, Coordinate coordinate, @NotNull DocumentFileSide fileSide, boolean z) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(fileSide, "fileSide");
        this.timestamp = timestamp;
        this.location = coordinate;
        this.fileSide = fileSide;
        this.isAngled = z;
    }

    public static /* synthetic */ DocumentScannerStepMetadata copy$default(DocumentScannerStepMetadata documentScannerStepMetadata, Date date, Coordinate coordinate, DocumentFileSide documentFileSide, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            date = documentScannerStepMetadata.timestamp;
        }
        if ((i & 2) != 0) {
            coordinate = documentScannerStepMetadata.location;
        }
        if ((i & 4) != 0) {
            documentFileSide = documentScannerStepMetadata.fileSide;
        }
        if ((i & 8) != 0) {
            z = documentScannerStepMetadata.isAngled;
        }
        return documentScannerStepMetadata.copy(date, coordinate, documentFileSide, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Coordinate getLocation() {
        return this.location;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DocumentFileSide getFileSide() {
        return this.fileSide;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsAngled() {
        return this.isAngled;
    }

    @NotNull
    public final DocumentScannerStepMetadata copy(@NotNull Date timestamp, Coordinate location, @NotNull DocumentFileSide fileSide, boolean isAngled) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(fileSide, "fileSide");
        return new DocumentScannerStepMetadata(timestamp, location, fileSide, isAngled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentScannerStepMetadata)) {
            return false;
        }
        DocumentScannerStepMetadata documentScannerStepMetadata = (DocumentScannerStepMetadata) other;
        return Intrinsics.f(this.timestamp, documentScannerStepMetadata.timestamp) && Intrinsics.f(this.location, documentScannerStepMetadata.location) && this.fileSide == documentScannerStepMetadata.fileSide && this.isAngled == documentScannerStepMetadata.isAngled;
    }

    @NotNull
    public final DocumentFileSide getFileSide() {
        return this.fileSide;
    }

    public final Coordinate getLocation() {
        return this.location;
    }

    @NotNull
    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.timestamp.hashCode() * 31;
        Coordinate coordinate = this.location;
        return ((((iHashCode + (coordinate == null ? 0 : coordinate.hashCode())) * 31) + this.fileSide.hashCode()) * 31) + Boolean.hashCode(this.isAngled);
    }

    public final boolean isAngled() {
        return this.isAngled;
    }

    @NotNull
    public String toString() {
        return "DocumentScannerStepMetadata(timestamp=" + this.timestamp + ", location=" + this.location + ", fileSide=" + this.fileSide + ", isAngled=" + this.isAngled + ")";
    }
}
