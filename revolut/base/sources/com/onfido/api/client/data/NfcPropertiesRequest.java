package com.onfido.api.client.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.e;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J%\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/onfido/api/client/data/NfcPropertiesRequest;", "", "seen1", "", "documentId", "", "", "mrzDocument", "Lcom/onfido/api/client/data/MRZDocument;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lcom/onfido/api/client/data/MRZDocument;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lcom/onfido/api/client/data/MRZDocument;)V", "getDocumentId$annotations", "()V", "getDocumentId", "()Ljava/util/List;", "getMrzDocument$annotations", "getMrzDocument", "()Lcom/onfido/api/client/data/MRZDocument;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class NfcPropertiesRequest {

    @NotNull
    private final List<String> documentId;
    private final MRZDocument mrzDocument;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KSerializer[] $childSerializers = {new e(v1.f247718a), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/NfcPropertiesRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/NfcPropertiesRequest;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return NfcPropertiesRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ NfcPropertiesRequest(int i, List list, MRZDocument mRZDocument, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            j1.f(NfcPropertiesRequest$$serializer.INSTANCE.getDescriptor(), i, 3);
            throw null;
        }
        this.documentId = list;
        this.mrzDocument = mRZDocument;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NfcPropertiesRequest copy$default(NfcPropertiesRequest nfcPropertiesRequest, List list, MRZDocument mRZDocument, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = nfcPropertiesRequest.documentId;
        }
        if ((i & 2) != 0) {
            mRZDocument = nfcPropertiesRequest.mrzDocument;
        }
        return nfcPropertiesRequest.copy(list, mRZDocument);
    }

    public static /* synthetic */ void getDocumentId$annotations() {
    }

    public static /* synthetic */ void getMrzDocument$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(NfcPropertiesRequest self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.documentId);
        output.encodeNullableSerializableElement(serialDesc, 1, MRZDocument$$serializer.INSTANCE, self.mrzDocument);
    }

    @NotNull
    public final List<String> component1() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MRZDocument getMrzDocument() {
        return this.mrzDocument;
    }

    @NotNull
    public final NfcPropertiesRequest copy(@NotNull List<String> documentId, MRZDocument mrzDocument) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return new NfcPropertiesRequest(documentId, mrzDocument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcPropertiesRequest)) {
            return false;
        }
        NfcPropertiesRequest nfcPropertiesRequest = (NfcPropertiesRequest) other;
        return Intrinsics.f(this.documentId, nfcPropertiesRequest.documentId) && Intrinsics.f(this.mrzDocument, nfcPropertiesRequest.mrzDocument);
    }

    @NotNull
    public final List<String> getDocumentId() {
        return this.documentId;
    }

    public final MRZDocument getMrzDocument() {
        return this.mrzDocument;
    }

    public int hashCode() {
        int iHashCode = this.documentId.hashCode() * 31;
        MRZDocument mRZDocument = this.mrzDocument;
        return iHashCode + (mRZDocument == null ? 0 : mRZDocument.hashCode());
    }

    @NotNull
    public String toString() {
        return "NfcPropertiesRequest(documentId=" + this.documentId + ", mrzDocument=" + this.mrzDocument + ")";
    }

    public NfcPropertiesRequest(@NotNull List<String> documentId, MRZDocument mRZDocument) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        this.documentId = documentId;
        this.mrzDocument = mRZDocument;
    }
}
