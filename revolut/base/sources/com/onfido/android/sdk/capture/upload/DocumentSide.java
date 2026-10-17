package com.onfido.android.sdk.capture.upload;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.api.client.data.DocSide;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/onfido/android/sdk/capture/upload/DocumentSide;", "Ljava/io/Serializable;", "id", "", "side", "Lcom/onfido/api/client/data/DocSide;", "type", "Lcom/onfido/android/sdk/capture/DocumentType;", "nfcSupported", "", "(Ljava/lang/String;Lcom/onfido/api/client/data/DocSide;Lcom/onfido/android/sdk/capture/DocumentType;Z)V", "getId", "()Ljava/lang/String;", "getNfcSupported", "()Z", "getSide", "()Lcom/onfido/api/client/data/DocSide;", "getType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DocumentSide implements Serializable {

    @NotNull
    private final String id;
    private final boolean nfcSupported;

    @NotNull
    private final DocSide side;

    @NotNull
    private final DocumentType type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocumentSide(@NotNull String id10, @NotNull DocSide side, @NotNull DocumentType type) {
        this(id10, side, type, false, 8, null);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    public static /* synthetic */ DocumentSide copy$default(DocumentSide documentSide, String str, DocSide docSide, DocumentType documentType, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = documentSide.id;
        }
        if ((i & 2) != 0) {
            docSide = documentSide.side;
        }
        if ((i & 4) != 0) {
            documentType = documentSide.type;
        }
        if ((i & 8) != 0) {
            z = documentSide.nfcSupported;
        }
        return documentSide.copy(str, docSide, documentType, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DocSide getSide() {
        return this.side;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DocumentType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNfcSupported() {
        return this.nfcSupported;
    }

    @NotNull
    public final DocumentSide copy(@NotNull String id10, @NotNull DocSide side, @NotNull DocumentType type, boolean nfcSupported) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type, "type");
        return new DocumentSide(id10, side, type, nfcSupported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentSide)) {
            return false;
        }
        DocumentSide documentSide = (DocumentSide) other;
        return Intrinsics.f(this.id, documentSide.id) && this.side == documentSide.side && this.type == documentSide.type && this.nfcSupported == documentSide.nfcSupported;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getNfcSupported() {
        return this.nfcSupported;
    }

    @NotNull
    public final DocSide getSide() {
        return this.side;
    }

    @NotNull
    public final DocumentType getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.nfcSupported) + ((this.type.hashCode() + ((this.side.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "DocumentSide(id=" + this.id + ", side=" + this.side + ", type=" + this.type + ", nfcSupported=" + this.nfcSupported + ")";
    }

    public DocumentSide(@NotNull String id10, @NotNull DocSide side, @NotNull DocumentType type, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id10;
        this.side = side;
        this.type = type;
        this.nfcSupported = z;
    }

    public /* synthetic */ DocumentSide(String str, DocSide docSide, DocumentType documentType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, docSide, documentType, (i & 8) != 0 ? false : z);
    }
}
