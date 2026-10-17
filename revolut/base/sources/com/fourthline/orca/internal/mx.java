package com.fourthline.orca.internal;

import com.fourthline.core.DateSerializer;
import com.fourthline.orca.internal.d50;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0002\u001b&BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fBe\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0005\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b6\u0010\u001eR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/fourthline/orca/internal/mx;", "", "", "documentType", "", "isPrimaryDocument", "evaluateSecondaryDocument", "Ljava/util/Date;", "expirationDate", "issuingCountry", "documentNumber", "", "Lcom/fourthline/orca/internal/d50;", "kycFiles", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;ZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/mx;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentType", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "c", "Z", "getEvaluateSecondaryDocument", "()Z", "d", "Ljava/util/Date;", "getExpirationDate", "()Ljava/util/Date;", "getExpirationDate$annotations", "()V", "e", "getIssuingCountry", "f", "getDocumentNumber", "g", "Ljava/util/List;", "getKycFiles", "()Ljava/util/List;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class mx {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f31287h = 8;
    private static final Lazy[] i = {null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new wp1(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String documentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Boolean isPrimaryDocument;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean evaluateSecondaryDocument;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Date expirationDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String issuingCountry;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String documentNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List kycFiles;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31293b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f31292a = aVar;
            f31293b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.upload_idv.upload.FileUploadRequest", aVar, 7);
            pluginGeneratedSerialDescriptor.j("documentType", false);
            pluginGeneratedSerialDescriptor.j("isPrimaryDocument", true);
            pluginGeneratedSerialDescriptor.j("evaluateSecondaryDocument", false);
            pluginGeneratedSerialDescriptor.j("expirationDate", true);
            pluginGeneratedSerialDescriptor.j("issuingCountry", true);
            pluginGeneratedSerialDescriptor.j("documentNumber", true);
            pluginGeneratedSerialDescriptor.j("kycFiles", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mx deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = mx.i;
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            String strDecodeStringElement = null;
            Boolean bool = null;
            Date date = null;
            String str = null;
            String str2 = null;
            List list = null;
            boolean z = true;
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
                        bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.h.f247648a, bool);
                        i |= 2;
                        break;
                    case 2:
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        date = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, DateSerializer.INSTANCE, date);
                        i |= 8;
                        break;
                    case 4:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str);
                        i |= 16;
                        break;
                    case 5:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str2);
                        i |= 32;
                        break;
                    case 6:
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new mx(i, strDecodeStringElement, bool, zDecodeBooleanElement, date, str, str2, list, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = mx.i;
            qlm.v1 v1Var = qlm.v1.f247718a;
            qlm.h hVar = qlm.h.f247648a;
            return new KSerializer[]{v1Var, nlm.a.c(hVar), hVar, nlm.a.c(DateSerializer.INSTANCE), nlm.a.c(v1Var), nlm.a.c(v1Var), lazyArr[6].getValue()};
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
        public final void serialize(Encoder encoder, mx value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            mx.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mx$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f31292a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ mx(int i2, String str, Boolean bool, boolean z, Date date, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (69 != (i2 & 69)) {
            qlm.j1.f(a.f31292a.getDescriptor(), i2, 69);
            throw null;
        }
        this.documentType = str;
        if ((i2 & 2) == 0) {
            this.isPrimaryDocument = null;
        } else {
            this.isPrimaryDocument = bool;
        }
        this.evaluateSecondaryDocument = z;
        if ((i2 & 8) == 0) {
            this.expirationDate = null;
        } else {
            this.expirationDate = date;
        }
        if ((i2 & 16) == 0) {
            this.issuingCountry = null;
        } else {
            this.issuingCountry = str2;
        }
        if ((i2 & 32) == 0) {
            this.documentNumber = null;
        } else {
            this.documentNumber = str3;
        }
        this.kycFiles = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return new qlm.e(d50.a.f27646a);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof mx)) {
            return false;
        }
        mx mxVar = (mx) other;
        return Intrinsics.f(this.documentType, mxVar.documentType) && Intrinsics.f(this.isPrimaryDocument, mxVar.isPrimaryDocument) && this.evaluateSecondaryDocument == mxVar.evaluateSecondaryDocument && Intrinsics.f(this.expirationDate, mxVar.expirationDate) && Intrinsics.f(this.issuingCountry, mxVar.issuingCountry) && Intrinsics.f(this.documentNumber, mxVar.documentNumber) && Intrinsics.f(this.kycFiles, mxVar.kycFiles);
    }

    public int hashCode() {
        int iHashCode = this.documentType.hashCode() * 31;
        Boolean bool = this.isPrimaryDocument;
        int iHashCode2 = (((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.evaluateSecondaryDocument)) * 31;
        Date date = this.expirationDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.issuingCountry;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.documentNumber;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.kycFiles.hashCode();
    }

    public String toString() {
        return "FileUploadRequest(documentType=" + this.documentType + ", isPrimaryDocument=" + this.isPrimaryDocument + ", evaluateSecondaryDocument=" + this.evaluateSecondaryDocument + ", expirationDate=" + this.expirationDate + ", issuingCountry=" + this.issuingCountry + ", documentNumber=" + this.documentNumber + ", kycFiles=" + this.kycFiles + ")";
    }

    public mx(String documentType, Boolean bool, boolean z, Date date, String str, String str2, List kycFiles) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(kycFiles, "kycFiles");
        this.documentType = documentType;
        this.isPrimaryDocument = bool;
        this.evaluateSecondaryDocument = z;
        this.expirationDate = date;
        this.issuingCountry = str;
        this.documentNumber = str2;
        this.kycFiles = kycFiles;
    }

    public static final /* synthetic */ void a(mx self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = i;
        output.encodeStringElement(serialDesc, 0, self.documentType);
        if (output.d(serialDesc) || self.isPrimaryDocument != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, qlm.h.f247648a, self.isPrimaryDocument);
        }
        output.encodeBooleanElement(serialDesc, 2, self.evaluateSecondaryDocument);
        if (output.d(serialDesc) || self.expirationDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, DateSerializer.INSTANCE, self.expirationDate);
        }
        if (output.d(serialDesc) || self.issuingCountry != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, qlm.v1.f247718a, self.issuingCountry);
        }
        if (output.d(serialDesc) || self.documentNumber != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, qlm.v1.f247718a, self.documentNumber);
        }
        output.encodeSerializableElement(serialDesc, 6, (mlm.h) lazyArr[6].getValue(), self.kycFiles);
    }
}
