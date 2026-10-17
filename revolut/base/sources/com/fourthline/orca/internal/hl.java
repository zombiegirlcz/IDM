package com.fourthline.orca.internal;

import com.fourthline.core.DateSerializer;
import com.fourthline.orca.internal.c50;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0083\b\u0018\u0000 B2\u00020\u0001:\u0002\u001d(B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B{\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u0007\u0010.R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010 R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u00104\u0012\u0004\b;\u00108\u001a\u0004\b:\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b=\u0010 R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/fourthline/orca/internal/hl;", "", "", "documentId", "imageId", "documentType", "", "isPrimaryDocument", "evaluateSecondaryDocument", "documentNumber", "Ljava/util/Date;", "expirationDate", "issueDate", "issuingCountry", "Lcom/fourthline/orca/internal/c50;", "kycFile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/fourthline/orca/internal/c50;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/fourthline/orca/internal/c50;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/hl;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentId", "b", "getImageId", "c", "getDocumentType", "d", "Z", "()Z", "e", "getEvaluateSecondaryDocument", "f", "getDocumentNumber", "g", "Ljava/util/Date;", "getExpirationDate", "()Ljava/util/Date;", "getExpirationDate$annotations", "()V", "h", "getIssueDate", "getIssueDate$annotations", "i", "getIssuingCountry", "j", "Lcom/fourthline/orca/internal/c50;", "getKycFile", "()Lcom/fourthline/orca/internal/c50;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
final /* data */ class hl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String imageId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String documentType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isPrimaryDocument;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean evaluateSecondaryDocument;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String documentNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Date expirationDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Date issueDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String issuingCountry;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c50 kycFile;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29323b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f29322a = aVar;
            f29323b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.capabilities.documentrecognition.network.upload.DocumentImageDetails", aVar, 10);
            pluginGeneratedSerialDescriptor.j("documentId", false);
            pluginGeneratedSerialDescriptor.j("imageId", false);
            pluginGeneratedSerialDescriptor.j("documentType", false);
            pluginGeneratedSerialDescriptor.j("isPrimaryDocument", false);
            pluginGeneratedSerialDescriptor.j("evaluateSecondaryDocument", false);
            pluginGeneratedSerialDescriptor.j("documentNumber", false);
            pluginGeneratedSerialDescriptor.j("expirationDate", false);
            pluginGeneratedSerialDescriptor.j("issueDate", false);
            pluginGeneratedSerialDescriptor.j("issuingCountry", false);
            pluginGeneratedSerialDescriptor.j("kycFile", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hl deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            c50 c50Var = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String str = null;
            Date date = null;
            Date date2 = null;
            String str2 = null;
            boolean z = true;
            int i = 0;
            boolean zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement2 = false;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str);
                        i |= 32;
                        break;
                    case 6:
                        date = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, DateSerializer.INSTANCE, date);
                        i |= 64;
                        break;
                    case 7:
                        date2 = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, DateSerializer.INSTANCE, date2);
                        i |= 128;
                        break;
                    case 8:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str2);
                        i |= 256;
                        break;
                    case 9:
                        c50Var = (c50) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, c50.a.f27371a, c50Var);
                        i |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new hl(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, zDecodeBooleanElement, zDecodeBooleanElement2, str, date, date2, str2, c50Var, null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            KSerializer kSerializerC = nlm.a.c(v1Var);
            DateSerializer dateSerializer = DateSerializer.INSTANCE;
            KSerializer kSerializerC2 = nlm.a.c(dateSerializer);
            KSerializer kSerializerC3 = nlm.a.c(dateSerializer);
            KSerializer kSerializerC4 = nlm.a.c(v1Var);
            qlm.h hVar = qlm.h.f247648a;
            return new KSerializer[]{v1Var, v1Var, v1Var, hVar, hVar, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, c50.a.f27371a};
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // qlm.f0
        public /* bridge */ KSerializer[] typeParametersSerializers() {
            return qlm.j1.f247666a;
        }

        @Override // mlm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, hl value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            hl.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.hl$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f29322a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ hl(int i, String str, String str2, String str3, boolean z, boolean z3, String str4, Date date, Date date2, String str5, c50 c50Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            qlm.j1.f(a.f29322a.getDescriptor(), i, 1023);
            throw null;
        }
        this.documentId = str;
        this.imageId = str2;
        this.documentType = str3;
        this.isPrimaryDocument = z;
        this.evaluateSecondaryDocument = z3;
        this.documentNumber = str4;
        this.expirationDate = date;
        this.issueDate = date2;
        this.issuingCountry = str5;
        this.kycFile = c50Var;
    }

    public static final /* synthetic */ void a(hl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.documentId);
        output.encodeStringElement(serialDesc, 1, self.imageId);
        output.encodeStringElement(serialDesc, 2, self.documentType);
        output.encodeBooleanElement(serialDesc, 3, self.isPrimaryDocument);
        output.encodeBooleanElement(serialDesc, 4, self.evaluateSecondaryDocument);
        qlm.v1 v1Var = qlm.v1.f247718a;
        output.encodeNullableSerializableElement(serialDesc, 5, v1Var, self.documentNumber);
        DateSerializer dateSerializer = DateSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 6, dateSerializer, self.expirationDate);
        output.encodeNullableSerializableElement(serialDesc, 7, dateSerializer, self.issueDate);
        output.encodeNullableSerializableElement(serialDesc, 8, v1Var, self.issuingCountry);
        output.encodeSerializableElement(serialDesc, 9, c50.a.f27371a, self.kycFile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof hl)) {
            return false;
        }
        hl hlVar = (hl) other;
        return Intrinsics.f(this.documentId, hlVar.documentId) && Intrinsics.f(this.imageId, hlVar.imageId) && Intrinsics.f(this.documentType, hlVar.documentType) && this.isPrimaryDocument == hlVar.isPrimaryDocument && this.evaluateSecondaryDocument == hlVar.evaluateSecondaryDocument && Intrinsics.f(this.documentNumber, hlVar.documentNumber) && Intrinsics.f(this.expirationDate, hlVar.expirationDate) && Intrinsics.f(this.issueDate, hlVar.issueDate) && Intrinsics.f(this.issuingCountry, hlVar.issuingCountry) && Intrinsics.f(this.kycFile, hlVar.kycFile);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.documentId.hashCode() * 31) + this.imageId.hashCode()) * 31) + this.documentType.hashCode()) * 31) + Boolean.hashCode(this.isPrimaryDocument)) * 31) + Boolean.hashCode(this.evaluateSecondaryDocument)) * 31;
        String str = this.documentNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.expirationDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.issueDate;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str2 = this.issuingCountry;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.kycFile.hashCode();
    }

    public String toString() {
        return "DocumentImageDetails(documentId=" + this.documentId + ", imageId=" + this.imageId + ", documentType=" + this.documentType + ", isPrimaryDocument=" + this.isPrimaryDocument + ", evaluateSecondaryDocument=" + this.evaluateSecondaryDocument + ", documentNumber=" + this.documentNumber + ", expirationDate=" + this.expirationDate + ", issueDate=" + this.issueDate + ", issuingCountry=" + this.issuingCountry + ", kycFile=" + this.kycFile + ")";
    }

    public hl(String documentId, String imageId, String documentType, boolean z, boolean z3, String str, Date date, Date date2, String str2, c50 kycFile) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(kycFile, "kycFile");
        this.documentId = documentId;
        this.imageId = imageId;
        this.documentType = documentType;
        this.isPrimaryDocument = z;
        this.evaluateSecondaryDocument = z3;
        this.documentNumber = str;
        this.expirationDate = date;
        this.issueDate = date2;
        this.issuingCountry = str2;
        this.kycFile = kycFile;
    }
}
