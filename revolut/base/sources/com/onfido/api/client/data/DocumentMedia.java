package com.onfido.api.client.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0005HÂ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\rHÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/onfido/api/client/data/DocumentMedia;", "", "seen1", "", "binaryMedia", "Lcom/onfido/api/client/data/DocumentBinaryMedia;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/onfido/api/client/data/DocumentBinaryMedia;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/api/client/data/DocumentBinaryMedia;)V", "getBinaryMedia$annotations", "()V", "mediaId", "", "getMediaId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class DocumentMedia {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final DocumentBinaryMedia binaryMedia;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/onfido/api/client/data/DocumentMedia$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/DocumentMedia;", "valueOf", "uuid", "", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DocumentMedia$$serializer.INSTANCE;
        }

        @NotNull
        public final DocumentMedia valueOf(@NotNull String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return new DocumentMedia(new DocumentBinaryMedia(uuid));
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ DocumentMedia(int i, DocumentBinaryMedia documentBinaryMedia, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 == (i & 1)) {
            this.binaryMedia = documentBinaryMedia;
        } else {
            j1.f(DocumentMedia$$serializer.INSTANCE.getDescriptor(), i, 1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final DocumentBinaryMedia getBinaryMedia() {
        return this.binaryMedia;
    }

    public static /* synthetic */ DocumentMedia copy$default(DocumentMedia documentMedia, DocumentBinaryMedia documentBinaryMedia, int i, Object obj2) {
        if ((i & 1) != 0) {
            documentBinaryMedia = documentMedia.binaryMedia;
        }
        return documentMedia.copy(documentBinaryMedia);
    }

    private static /* synthetic */ void getBinaryMedia$annotations() {
    }

    @NotNull
    public static final DocumentMedia valueOf(@NotNull String str) {
        return INSTANCE.valueOf(str);
    }

    @NotNull
    public final DocumentMedia copy(@NotNull DocumentBinaryMedia binaryMedia) {
        Intrinsics.checkNotNullParameter(binaryMedia, "binaryMedia");
        return new DocumentMedia(binaryMedia);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentMedia) && Intrinsics.f(this.binaryMedia, ((DocumentMedia) other).binaryMedia);
    }

    @NotNull
    public final String getMediaId() {
        return this.binaryMedia.getMediaId();
    }

    public int hashCode() {
        return this.binaryMedia.hashCode();
    }

    @NotNull
    public String toString() {
        return "DocumentMedia(binaryMedia=" + this.binaryMedia + ")";
    }

    public DocumentMedia(@NotNull DocumentBinaryMedia binaryMedia) {
        Intrinsics.checkNotNullParameter(binaryMedia, "binaryMedia");
        this.binaryMedia = binaryMedia;
    }
}
