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
import qlm.v1;
import v0.a;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BO\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB;\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J?\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012¨\u0006."}, d2 = {"Lcom/onfido/api/client/data/DocumentCreateResponse;", "", "seen1", "", "uuid", "", "applicantUuid", "documentType", "documentParts", "", "Lcom/onfido/api/client/data/DocumentMedia;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getApplicantUuid$annotations", "()V", "getApplicantUuid", "()Ljava/lang/String;", "getDocumentParts$annotations", "getDocumentParts", "()Ljava/util/List;", "getDocumentType$annotations", "getDocumentType", "getUuid$annotations", "getUuid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class DocumentCreateResponse {
    private final String applicantUuid;
    private final List<DocumentMedia> documentParts;
    private final String documentType;
    private final String uuid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KSerializer[] $childSerializers = {null, null, null, new e(DocumentMedia$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/DocumentCreateResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/DocumentCreateResponse;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DocumentCreateResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DocumentCreateResponse() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentCreateResponse copy$default(DocumentCreateResponse documentCreateResponse, String str, String str2, String str3, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = documentCreateResponse.uuid;
        }
        if ((i & 2) != 0) {
            str2 = documentCreateResponse.applicantUuid;
        }
        if ((i & 4) != 0) {
            str3 = documentCreateResponse.documentType;
        }
        if ((i & 8) != 0) {
            list = documentCreateResponse.documentParts;
        }
        return documentCreateResponse.copy(str, str2, str3, list);
    }

    public static /* synthetic */ void getApplicantUuid$annotations() {
    }

    public static /* synthetic */ void getDocumentParts$annotations() {
    }

    public static /* synthetic */ void getDocumentType$annotations() {
    }

    public static /* synthetic */ void getUuid$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(DocumentCreateResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        if (output.d(serialDesc) || self.uuid != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, v1.f247718a, self.uuid);
        }
        if (output.d(serialDesc) || self.applicantUuid != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, v1.f247718a, self.applicantUuid);
        }
        if (output.d(serialDesc) || self.documentType != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, v1.f247718a, self.documentType);
        }
        if (!output.d(serialDesc) && self.documentParts == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.documentParts);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplicantUuid() {
        return this.applicantUuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    public final List<DocumentMedia> component4() {
        return this.documentParts;
    }

    @NotNull
    public final DocumentCreateResponse copy(String uuid, String applicantUuid, String documentType, List<DocumentMedia> documentParts) {
        return new DocumentCreateResponse(uuid, applicantUuid, documentType, documentParts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentCreateResponse)) {
            return false;
        }
        DocumentCreateResponse documentCreateResponse = (DocumentCreateResponse) other;
        return Intrinsics.f(this.uuid, documentCreateResponse.uuid) && Intrinsics.f(this.applicantUuid, documentCreateResponse.applicantUuid) && Intrinsics.f(this.documentType, documentCreateResponse.documentType) && Intrinsics.f(this.documentParts, documentCreateResponse.documentParts);
    }

    public final String getApplicantUuid() {
        return this.applicantUuid;
    }

    public final List<DocumentMedia> getDocumentParts() {
        return this.documentParts;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        String str = this.uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applicantUuid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.documentType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<DocumentMedia> list = this.documentParts;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        String str2 = this.applicantUuid;
        String str3 = this.documentType;
        List<DocumentMedia> list = this.documentParts;
        StringBuilder sbM = a.m("DocumentCreateResponse(uuid=", str, ", applicantUuid=", str2, ", documentType=");
        sbM.append(str3);
        sbM.append(", documentParts=");
        sbM.append(list);
        sbM.append(")");
        return sbM.toString();
    }

    @d
    public /* synthetic */ DocumentCreateResponse(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str;
        }
        if ((i & 2) == 0) {
            this.applicantUuid = null;
        } else {
            this.applicantUuid = str2;
        }
        if ((i & 4) == 0) {
            this.documentType = null;
        } else {
            this.documentType = str3;
        }
        if ((i & 8) == 0) {
            this.documentParts = null;
        } else {
            this.documentParts = list;
        }
    }

    public DocumentCreateResponse(String str, String str2, String str3, List<DocumentMedia> list) {
        this.uuid = str;
        this.applicantUuid = str2;
        this.documentType = str3;
        this.documentParts = list;
    }

    public /* synthetic */ DocumentCreateResponse(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
    }
}
