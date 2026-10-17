package com.onfido.api.client.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.e;
import qlm.j1;
import yhm.d;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0019\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/onfido/api/client/data/DocumentCreate;", "", "seen1", "", "documentMediaList", "", "Lcom/onfido/api/client/data/DocumentMedia;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getDocumentMediaList$annotations", "()V", "getDocumentMediaList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class DocumentCreate {

    @NotNull
    private final List<DocumentMedia> documentMediaList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KSerializer[] $childSerializers = {new e(DocumentMedia$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/api/client/data/DocumentCreate$Companion;", "", "()V", "fromBinaryMediaUuidList", "Lcom/onfido/api/client/data/DocumentCreate;", "uuidList", "", "", "serializer", "Lkotlinx/serialization/KSerializer;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DocumentCreate fromBinaryMediaUuidList(@NotNull List<String> uuidList) {
            Intrinsics.checkNotNullParameter(uuidList, "uuidList");
            ArrayList arrayListZ = d0.Z(uuidList);
            ArrayList arrayList = new ArrayList(w.t(arrayListZ, 10));
            Iterator it8 = arrayListZ.iterator();
            while (it8.hasNext()) {
                arrayList.add(DocumentMedia.INSTANCE.valueOf((String) it8.next()));
            }
            return new DocumentCreate(arrayList);
        }

        @NotNull
        public final KSerializer serializer() {
            return DocumentCreate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ DocumentCreate(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 == (i & 1)) {
            this.documentMediaList = list;
        } else {
            j1.f(DocumentCreate$$serializer.INSTANCE.getDescriptor(), i, 1);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentCreate copy$default(DocumentCreate documentCreate, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = documentCreate.documentMediaList;
        }
        return documentCreate.copy(list);
    }

    @NotNull
    public static final DocumentCreate fromBinaryMediaUuidList(@NotNull List<String> list) {
        return INSTANCE.fromBinaryMediaUuidList(list);
    }

    public static /* synthetic */ void getDocumentMediaList$annotations() {
    }

    @NotNull
    public final List<DocumentMedia> component1() {
        return this.documentMediaList;
    }

    @NotNull
    public final DocumentCreate copy(@NotNull List<DocumentMedia> documentMediaList) {
        Intrinsics.checkNotNullParameter(documentMediaList, "documentMediaList");
        return new DocumentCreate(documentMediaList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentCreate) && Intrinsics.f(this.documentMediaList, ((DocumentCreate) other).documentMediaList);
    }

    @NotNull
    public final List<DocumentMedia> getDocumentMediaList() {
        return this.documentMediaList;
    }

    public int hashCode() {
        return this.documentMediaList.hashCode();
    }

    @NotNull
    public String toString() {
        return "DocumentCreate(documentMediaList=" + this.documentMediaList + ")";
    }

    public DocumentCreate(@NotNull List<DocumentMedia> documentMediaList) {
        Intrinsics.checkNotNullParameter(documentMediaList, "documentMediaList");
        this.documentMediaList = documentMediaList;
    }
}
