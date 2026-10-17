package com.onfido.api.client.data;

import bl.a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002=>Bw\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011BI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J[\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u00102\u001a\u0004\u0018\u00010\u0005J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001J&\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;HÁ\u0001¢\u0006\u0002\b<R\u001c\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b#\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016¨\u0006?"}, d2 = {"Lcom/onfido/api/client/data/PoaDocumentUpload;", "", "seen1", "", "id", "", "type", "createdAt", "Ljava/util/Date;", "fileName", "fileType", "fileSize", "", "issuingCountry", "applicantId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getApplicantId$annotations", "()V", "getApplicantId", "()Ljava/lang/String;", "getCreatedAt$annotations", "getCreatedAt", "()Ljava/util/Date;", "getFileName$annotations", "getFileName", "getFileSize$annotations", "getFileSize", "()J", "getFileType$annotations", "getFileType", "getId$annotations", "getId", "getIssuingCountry$annotations", "getType$annotations", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "getIssuingCountry", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class PoaDocumentUpload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String applicantId;

    @NotNull
    private final Date createdAt;

    @NotNull
    private final String fileName;
    private final long fileSize;

    @NotNull
    private final String fileType;

    @NotNull
    private final String id;
    private final String issuingCountry;

    @NotNull
    private final String type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/PoaDocumentUpload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/PoaDocumentUpload;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PoaDocumentUpload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ PoaDocumentUpload(int i, String str, String str2, @g(with = a.class) Date date, String str3, String str4, long j2, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (191 != (i & 191)) {
            j1.f(PoaDocumentUpload$$serializer.INSTANCE.getDescriptor(), i, 191);
            throw null;
        }
        this.id = str;
        this.type = str2;
        this.createdAt = date;
        this.fileName = str3;
        this.fileType = str4;
        this.fileSize = j2;
        if ((i & 64) == 0) {
            this.issuingCountry = null;
        } else {
            this.issuingCountry = str5;
        }
        this.applicantId = str6;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public static /* synthetic */ PoaDocumentUpload copy$default(PoaDocumentUpload poaDocumentUpload, String str, String str2, Date date, String str3, String str4, long j2, String str5, String str6, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = poaDocumentUpload.id;
        }
        if ((i & 2) != 0) {
            str2 = poaDocumentUpload.type;
        }
        if ((i & 4) != 0) {
            date = poaDocumentUpload.createdAt;
        }
        if ((i & 8) != 0) {
            str3 = poaDocumentUpload.fileName;
        }
        if ((i & 16) != 0) {
            str4 = poaDocumentUpload.fileType;
        }
        if ((i & 32) != 0) {
            j2 = poaDocumentUpload.fileSize;
        }
        if ((i & 64) != 0) {
            str5 = poaDocumentUpload.issuingCountry;
        }
        if ((i & 128) != 0) {
            str6 = poaDocumentUpload.applicantId;
        }
        long j3 = j2;
        String str7 = str3;
        String str8 = str4;
        Date date2 = date;
        return poaDocumentUpload.copy(str, str2, date2, str7, str8, j3, str5, str6);
    }

    public static /* synthetic */ void getApplicantId$annotations() {
    }

    @g(with = a.class)
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getFileName$annotations() {
    }

    public static /* synthetic */ void getFileSize$annotations() {
    }

    public static /* synthetic */ void getFileType$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    private static /* synthetic */ void getIssuingCountry$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(PoaDocumentUpload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.type);
        output.encodeSerializableElement(serialDesc, 2, a.f16438a, self.createdAt);
        output.encodeStringElement(serialDesc, 3, self.fileName);
        output.encodeStringElement(serialDesc, 4, self.fileType);
        output.encodeLongElement(serialDesc, 5, self.fileSize);
        if (output.d(serialDesc) || self.issuingCountry != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, v1.f247718a, self.issuingCountry);
        }
        output.encodeStringElement(serialDesc, 7, self.applicantId);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFileType() {
        return this.fileType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getApplicantId() {
        return this.applicantId;
    }

    @NotNull
    public final PoaDocumentUpload copy(@NotNull String id10, @NotNull String type, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, long fileSize, String issuingCountry, @NotNull String applicantId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(applicantId, "applicantId");
        return new PoaDocumentUpload(id10, type, createdAt, fileName, fileType, fileSize, issuingCountry, applicantId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoaDocumentUpload)) {
            return false;
        }
        PoaDocumentUpload poaDocumentUpload = (PoaDocumentUpload) other;
        return Intrinsics.f(this.id, poaDocumentUpload.id) && Intrinsics.f(this.type, poaDocumentUpload.type) && Intrinsics.f(this.createdAt, poaDocumentUpload.createdAt) && Intrinsics.f(this.fileName, poaDocumentUpload.fileName) && Intrinsics.f(this.fileType, poaDocumentUpload.fileType) && this.fileSize == poaDocumentUpload.fileSize && Intrinsics.f(this.issuingCountry, poaDocumentUpload.issuingCountry) && Intrinsics.f(this.applicantId, poaDocumentUpload.applicantId);
    }

    @NotNull
    public final String getApplicantId() {
        return this.applicantId;
    }

    @NotNull
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    public final String getFileType() {
        return this.fileType;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = a0.d.c(p.a.c(p.a.c(t61.a.e(this.createdAt, p.a.c(this.id.hashCode() * 31, 31, this.type), 31), 31, this.fileName), 31, this.fileType), 31, this.fileSize);
        String str = this.issuingCountry;
        return this.applicantId.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.type;
        Date date = this.createdAt;
        String str3 = this.fileName;
        String str4 = this.fileType;
        long j2 = this.fileSize;
        String str5 = this.issuingCountry;
        String str6 = this.applicantId;
        StringBuilder sbM = v0.a.m("PoaDocumentUpload(id=", str, ", type=", str2, ", createdAt=");
        sbM.append(date);
        sbM.append(", fileName=");
        sbM.append(str3);
        sbM.append(", fileType=");
        sbM.append(str4);
        sbM.append(", fileSize=");
        sbM.append(j2);
        j6.a.D(sbM, ", issuingCountry=", str5, ", applicantId=", str6);
        sbM.append(")");
        return sbM.toString();
    }

    public PoaDocumentUpload(@NotNull String id10, @NotNull String type, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, long j2, String str, @NotNull String applicantId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(applicantId, "applicantId");
        this.id = id10;
        this.type = type;
        this.createdAt = createdAt;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = j2;
        this.issuingCountry = str;
        this.applicantId = applicantId;
    }

    public /* synthetic */ PoaDocumentUpload(String str, String str2, Date date, String str3, String str4, long j2, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, date, str3, str4, j2, (i & 64) != 0 ? null : str5, str6);
    }
}
