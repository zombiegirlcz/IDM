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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002WXB³\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019B}\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u001aJ\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u000bHÆ\u0003J\t\u0010E\u001a\u00020\rHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0093\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u0003HÖ\u0001J\t\u0010N\u001a\u00020\u0005HÖ\u0001J&\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UHÁ\u0001¢\u0006\u0002\bVR\u001c\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010!R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010$R\u001c\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001eR\u001c\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001eR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010\u001eR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001c\u001a\u0004\b3\u0010\u001eR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001c\u001a\u0004\b5\u0010\u001eR\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001c\u001a\u0004\b7\u00108R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\u001c\u001a\u0004\b:\u0010;¨\u0006Y"}, d2 = {"Lcom/onfido/api/client/data/DocumentUpload;", "", "seen1", "", "id", "", "createdAt", "Ljava/util/Date;", "fileName", "fileType", "fileSize", "", "type", "Lcom/onfido/api/client/data/DocType;", "side", "warningsBundle", "Lcom/onfido/api/client/data/DocumentValidationWarningsBundle;", "issuingCountry", "href", "downloadHref", "applicantId", "documentFeatures", "Lcom/onfido/api/client/data/DocumentFeatures;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;JLcom/onfido/api/client/data/DocType;Ljava/lang/String;Lcom/onfido/api/client/data/DocumentValidationWarningsBundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/DocumentFeatures;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;JLcom/onfido/api/client/data/DocType;Ljava/lang/String;Lcom/onfido/api/client/data/DocumentValidationWarningsBundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/DocumentFeatures;)V", "getApplicantId$annotations", "()V", "getApplicantId", "()Ljava/lang/String;", "getCreatedAt$annotations", "getCreatedAt", "()Ljava/util/Date;", "getDocumentFeatures$annotations", "getDocumentFeatures", "()Lcom/onfido/api/client/data/DocumentFeatures;", "getDownloadHref$annotations", "getDownloadHref", "getFileName$annotations", "getFileName", "getFileSize$annotations", "getFileSize", "()J", "getFileType$annotations", "getFileType", "getHref$annotations", "getHref", "getId$annotations", "getId", "getIssuingCountry$annotations", "getIssuingCountry", "getSide$annotations", "getSide", "getType$annotations", "getType", "()Lcom/onfido/api/client/data/DocType;", "getWarningsBundle$annotations", "getWarningsBundle", "()Lcom/onfido/api/client/data/DocumentValidationWarningsBundle;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class DocumentUpload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String applicantId;

    @NotNull
    private final Date createdAt;
    private final DocumentFeatures documentFeatures;

    @NotNull
    private final String downloadHref;

    @NotNull
    private final String fileName;
    private final long fileSize;

    @NotNull
    private final String fileType;

    @NotNull
    private final String href;

    @NotNull
    private final String id;
    private final String issuingCountry;
    private final String side;

    @NotNull
    private final DocType type;
    private final DocumentValidationWarningsBundle warningsBundle;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/DocumentUpload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/DocumentUpload;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DocumentUpload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ DocumentUpload(int i, String str, @g(with = a.class) Date date, String str2, String str3, long j2, DocType docType, String str4, DocumentValidationWarningsBundle documentValidationWarningsBundle, String str5, String str6, String str7, String str8, DocumentFeatures documentFeatures, SerializationConstructorMarker serializationConstructorMarker) {
        if (3647 != (i & 3647)) {
            j1.f(DocumentUpload$$serializer.INSTANCE.getDescriptor(), i, 3647);
            throw null;
        }
        this.id = str;
        this.createdAt = date;
        this.fileName = str2;
        this.fileType = str3;
        this.fileSize = j2;
        this.type = docType;
        if ((i & 64) == 0) {
            this.side = null;
        } else {
            this.side = str4;
        }
        if ((i & 128) == 0) {
            this.warningsBundle = null;
        } else {
            this.warningsBundle = documentValidationWarningsBundle;
        }
        if ((i & 256) == 0) {
            this.issuingCountry = null;
        } else {
            this.issuingCountry = str5;
        }
        this.href = str6;
        this.downloadHref = str7;
        this.applicantId = str8;
        if ((i & 4096) == 0) {
            this.documentFeatures = null;
        } else {
            this.documentFeatures = documentFeatures;
        }
    }

    public static /* synthetic */ void getApplicantId$annotations() {
    }

    @g(with = a.class)
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getDocumentFeatures$annotations() {
    }

    public static /* synthetic */ void getDownloadHref$annotations() {
    }

    public static /* synthetic */ void getFileName$annotations() {
    }

    public static /* synthetic */ void getFileSize$annotations() {
    }

    public static /* synthetic */ void getFileType$annotations() {
    }

    public static /* synthetic */ void getHref$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getIssuingCountry$annotations() {
    }

    public static /* synthetic */ void getSide$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getWarningsBundle$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(DocumentUpload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, a.f16438a, self.createdAt);
        output.encodeStringElement(serialDesc, 2, self.fileName);
        output.encodeStringElement(serialDesc, 3, self.fileType);
        output.encodeLongElement(serialDesc, 4, self.fileSize);
        output.encodeSerializableElement(serialDesc, 5, DocType$$serializer.INSTANCE, self.type);
        if (output.d(serialDesc) || self.side != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, v1.f247718a, self.side);
        }
        if (output.d(serialDesc) || self.warningsBundle != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, DocumentValidationWarningsBundle$$serializer.INSTANCE, self.warningsBundle);
        }
        if (output.d(serialDesc) || self.issuingCountry != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, v1.f247718a, self.issuingCountry);
        }
        output.encodeStringElement(serialDesc, 9, self.href);
        output.encodeStringElement(serialDesc, 10, self.downloadHref);
        output.encodeStringElement(serialDesc, 11, self.applicantId);
        if (!output.d(serialDesc) && self.documentFeatures == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, DocumentFeatures$$serializer.INSTANCE, self.documentFeatures);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getHref() {
        return this.href;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDownloadHref() {
        return this.downloadHref;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getApplicantId() {
        return this.applicantId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final DocumentFeatures getDocumentFeatures() {
        return this.documentFeatures;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileType() {
        return this.fileType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DocType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DocumentValidationWarningsBundle getWarningsBundle() {
        return this.warningsBundle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    @NotNull
    public final DocumentUpload copy(@NotNull String id10, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, long fileSize, @NotNull DocType type, String side, DocumentValidationWarningsBundle warningsBundle, String issuingCountry, @NotNull String href, @NotNull String downloadHref, @NotNull String applicantId, DocumentFeatures documentFeatures) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(href, "href");
        Intrinsics.checkNotNullParameter(downloadHref, "downloadHref");
        Intrinsics.checkNotNullParameter(applicantId, "applicantId");
        return new DocumentUpload(id10, createdAt, fileName, fileType, fileSize, type, side, warningsBundle, issuingCountry, href, downloadHref, applicantId, documentFeatures);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentUpload)) {
            return false;
        }
        DocumentUpload documentUpload = (DocumentUpload) other;
        return Intrinsics.f(this.id, documentUpload.id) && Intrinsics.f(this.createdAt, documentUpload.createdAt) && Intrinsics.f(this.fileName, documentUpload.fileName) && Intrinsics.f(this.fileType, documentUpload.fileType) && this.fileSize == documentUpload.fileSize && this.type == documentUpload.type && Intrinsics.f(this.side, documentUpload.side) && Intrinsics.f(this.warningsBundle, documentUpload.warningsBundle) && Intrinsics.f(this.issuingCountry, documentUpload.issuingCountry) && Intrinsics.f(this.href, documentUpload.href) && Intrinsics.f(this.downloadHref, documentUpload.downloadHref) && Intrinsics.f(this.applicantId, documentUpload.applicantId) && Intrinsics.f(this.documentFeatures, documentUpload.documentFeatures);
    }

    @NotNull
    public final String getApplicantId() {
        return this.applicantId;
    }

    @NotNull
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final DocumentFeatures getDocumentFeatures() {
        return this.documentFeatures;
    }

    @NotNull
    public final String getDownloadHref() {
        return this.downloadHref;
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
    public final String getHref() {
        return this.href;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final DocType getType() {
        return this.type;
    }

    public final DocumentValidationWarningsBundle getWarningsBundle() {
        return this.warningsBundle;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + a0.d.c(p.a.c(p.a.c(t61.a.e(this.createdAt, this.id.hashCode() * 31, 31), 31, this.fileName), 31, this.fileType), 31, this.fileSize)) * 31;
        String str = this.side;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DocumentValidationWarningsBundle documentValidationWarningsBundle = this.warningsBundle;
        int iHashCode3 = (iHashCode2 + (documentValidationWarningsBundle == null ? 0 : documentValidationWarningsBundle.hashCode())) * 31;
        String str2 = this.issuingCountry;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.href), 31, this.downloadHref), 31, this.applicantId);
        DocumentFeatures documentFeatures = this.documentFeatures;
        return iC + (documentFeatures != null ? documentFeatures.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        Date date = this.createdAt;
        String str2 = this.fileName;
        String str3 = this.fileType;
        long j2 = this.fileSize;
        DocType docType = this.type;
        String str4 = this.side;
        DocumentValidationWarningsBundle documentValidationWarningsBundle = this.warningsBundle;
        String str5 = this.issuingCountry;
        String str6 = this.href;
        String str7 = this.downloadHref;
        String str8 = this.applicantId;
        DocumentFeatures documentFeatures = this.documentFeatures;
        StringBuilder sb6 = new StringBuilder("DocumentUpload(id=");
        sb6.append(str);
        sb6.append(", createdAt=");
        sb6.append(date);
        sb6.append(", fileName=");
        j6.a.D(sb6, str2, ", fileType=", str3, ", fileSize=");
        sb6.append(j2);
        sb6.append(", type=");
        sb6.append(docType);
        sb6.append(", side=");
        sb6.append(str4);
        sb6.append(", warningsBundle=");
        sb6.append(documentValidationWarningsBundle);
        j6.a.D(sb6, ", issuingCountry=", str5, ", href=", str6);
        j6.a.D(sb6, ", downloadHref=", str7, ", applicantId=", str8);
        sb6.append(", documentFeatures=");
        sb6.append(documentFeatures);
        sb6.append(")");
        return sb6.toString();
    }

    public DocumentUpload(@NotNull String id10, @NotNull Date createdAt, @NotNull String fileName, @NotNull String fileType, long j2, @NotNull DocType type, String str, DocumentValidationWarningsBundle documentValidationWarningsBundle, String str2, @NotNull String href, @NotNull String downloadHref, @NotNull String applicantId, DocumentFeatures documentFeatures) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(href, "href");
        Intrinsics.checkNotNullParameter(downloadHref, "downloadHref");
        Intrinsics.checkNotNullParameter(applicantId, "applicantId");
        this.id = id10;
        this.createdAt = createdAt;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = j2;
        this.type = type;
        this.side = str;
        this.warningsBundle = documentValidationWarningsBundle;
        this.issuingCountry = str2;
        this.href = href;
        this.downloadHref = downloadHref;
        this.applicantId = applicantId;
        this.documentFeatures = documentFeatures;
    }

    public /* synthetic */ DocumentUpload(String str, Date date, String str2, String str3, long j2, DocType docType, String str4, DocumentValidationWarningsBundle documentValidationWarningsBundle, String str5, String str6, String str7, String str8, DocumentFeatures documentFeatures, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, str3, j2, docType, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : documentValidationWarningsBundle, (i & 256) != 0 ? null : str5, str6, str7, str8, (i & 4096) != 0 ? null : documentFeatures);
    }
}
