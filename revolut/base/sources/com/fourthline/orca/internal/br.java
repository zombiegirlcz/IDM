package com.fourthline.orca.internal;

import com.fourthline.core.DateSerializer;
import com.fourthline.nfc.NfcAuthenticationChecks;
import com.fourthline.nfc.NfcAuthenticationChecks$;
import com.fourthline.orca.internal.d50;
import com.fourthline.orca.internal.ed0;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b+\b\u0081\b\u0018\u0000 J2\u00020\u0001:\u0002!,B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u0005\u0010.R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u00106\u0012\u0004\b=\u0010:\u001a\u0004\b<\u00108R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\b?\u0010$R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/fourthline/orca/internal/br;", "", "", "documentType", "", "isPrimaryDocument", "evaluateSecondaryDocument", "documentNumber", "documentId", "Ljava/util/Date;", "expirationDate", "issueDate", "issuingCountry", "", "Lcom/fourthline/orca/internal/d50;", "kycFiles", "Lcom/fourthline/orca/internal/ed0;", "nfcDataGroups", "Lcom/fourthline/nfc/NfcAuthenticationChecks;", "sdkAuthenticationChecks", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/fourthline/nfc/NfcAuthenticationChecks;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/fourthline/nfc/NfcAuthenticationChecks;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/br;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentType", "b", "Z", "()Z", "c", "getEvaluateSecondaryDocument", "d", "getDocumentNumber", "e", "getDocumentId", "f", "Ljava/util/Date;", "getExpirationDate", "()Ljava/util/Date;", "getExpirationDate$annotations", "()V", "g", "getIssueDate", "getIssueDate$annotations", "h", "getIssuingCountry", "i", "Ljava/util/List;", "getKycFiles", "()Ljava/util/List;", "j", "getNfcDataGroups", "k", "Lcom/fourthline/nfc/NfcAuthenticationChecks;", "getSdkAuthenticationChecks", "()Lcom/fourthline/nfc/NfcAuthenticationChecks;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class br {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f27199l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Lazy[] f27200m;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String documentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isPrimaryDocument;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean evaluateSecondaryDocument;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String documentNumber;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String documentId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Date expirationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Date issueDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String issuingCountry;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List kycFiles;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List nfcDataGroups;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final NfcAuthenticationChecks sdkAuthenticationChecks;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27208b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f27207a = aVar;
            f27208b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.upload_idv.upload.DocumentUploadRequest", aVar, 11);
            pluginGeneratedSerialDescriptor.j("documentType", false);
            pluginGeneratedSerialDescriptor.j("isPrimaryDocument", false);
            pluginGeneratedSerialDescriptor.j("evaluateSecondaryDocument", false);
            pluginGeneratedSerialDescriptor.j("documentNumber", true);
            pluginGeneratedSerialDescriptor.j("documentId", true);
            pluginGeneratedSerialDescriptor.j("expirationDate", true);
            pluginGeneratedSerialDescriptor.j("issueDate", true);
            pluginGeneratedSerialDescriptor.j("issuingCountry", true);
            pluginGeneratedSerialDescriptor.j("kycFiles", true);
            pluginGeneratedSerialDescriptor.j("nfcDataGroups", true);
            pluginGeneratedSerialDescriptor.j("sdkAuthenticationChecks", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final br deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = br.f27200m;
            dVarBeginStructure.getClass();
            List list = null;
            List list2 = null;
            NfcAuthenticationChecks nfcAuthenticationChecks = null;
            String strDecodeStringElement = null;
            String str = null;
            String str2 = null;
            Date date = null;
            Date date2 = null;
            String str3 = null;
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
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
                        i |= 8;
                        break;
                    case 4:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str2);
                        i |= 16;
                        break;
                    case 5:
                        date = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, DateSerializer.INSTANCE, date);
                        i |= 32;
                        break;
                    case 6:
                        date2 = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, DateSerializer.INSTANCE, date2);
                        i |= 64;
                        break;
                    case 7:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str3);
                        i |= 128;
                        break;
                    case 8:
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), list);
                        i |= 256;
                        break;
                    case 9:
                        list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list2);
                        i |= 512;
                        break;
                    case 10:
                        nfcAuthenticationChecks = (NfcAuthenticationChecks) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, NfcAuthenticationChecks$.serializer.INSTANCE, nfcAuthenticationChecks);
                        i |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new br(i, strDecodeStringElement, zDecodeBooleanElement, zDecodeBooleanElement2, str, str2, date, date2, str3, list, list2, nfcAuthenticationChecks, (SerializationConstructorMarker) null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = br.f27200m;
            qlm.v1 v1Var = qlm.v1.f247718a;
            KSerializer kSerializerC = nlm.a.c(v1Var);
            KSerializer kSerializerC2 = nlm.a.c(v1Var);
            DateSerializer dateSerializer = DateSerializer.INSTANCE;
            KSerializer kSerializerC3 = nlm.a.c(dateSerializer);
            KSerializer kSerializerC4 = nlm.a.c(dateSerializer);
            KSerializer kSerializerC5 = nlm.a.c(v1Var);
            KSerializer kSerializerC6 = nlm.a.c((KSerializer) lazyArr[8].getValue());
            KSerializer kSerializerC7 = nlm.a.c((KSerializer) lazyArr[9].getValue());
            KSerializer kSerializerC8 = nlm.a.c(NfcAuthenticationChecks$.serializer.INSTANCE);
            qlm.h hVar = qlm.h.f247648a;
            return new KSerializer[]{v1Var, hVar, hVar, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8};
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
        public final void serialize(Encoder encoder, br value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            br.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.br$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f27207a;
        }

        private Companion() {
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f27200m = new Lazy[]{null, null, null, null, null, null, null, null, yhm.j.c(kVar, new vk1(26)), yhm.j.c(kVar, new vk1(27)), null};
    }

    public /* synthetic */ br(int i, String str, boolean z, boolean z3, String str2, String str3, Date date, Date date2, String str4, List list, List list2, NfcAuthenticationChecks nfcAuthenticationChecks, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f27207a.getDescriptor(), i, 7);
            throw null;
        }
        this.documentType = str;
        this.isPrimaryDocument = z;
        this.evaluateSecondaryDocument = z3;
        if ((i & 8) == 0) {
            this.documentNumber = null;
        } else {
            this.documentNumber = str2;
        }
        if ((i & 16) == 0) {
            this.documentId = null;
        } else {
            this.documentId = str3;
        }
        if ((i & 32) == 0) {
            this.expirationDate = null;
        } else {
            this.expirationDate = date;
        }
        if ((i & 64) == 0) {
            this.issueDate = null;
        } else {
            this.issueDate = date2;
        }
        if ((i & 128) == 0) {
            this.issuingCountry = null;
        } else {
            this.issuingCountry = str4;
        }
        if ((i & 256) == 0) {
            this.kycFiles = null;
        } else {
            this.kycFiles = list;
        }
        if ((i & 512) == 0) {
            this.nfcDataGroups = null;
        } else {
            this.nfcDataGroups = list2;
        }
        if ((i & 1024) == 0) {
            this.sdkAuthenticationChecks = null;
        } else {
            this.sdkAuthenticationChecks = nfcAuthenticationChecks;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return new qlm.e(d50.a.f27646a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new qlm.e(ed0.a.f28109a);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof br)) {
            return false;
        }
        br brVar = (br) other;
        return Intrinsics.f(this.documentType, brVar.documentType) && this.isPrimaryDocument == brVar.isPrimaryDocument && this.evaluateSecondaryDocument == brVar.evaluateSecondaryDocument && Intrinsics.f(this.documentNumber, brVar.documentNumber) && Intrinsics.f(this.documentId, brVar.documentId) && Intrinsics.f(this.expirationDate, brVar.expirationDate) && Intrinsics.f(this.issueDate, brVar.issueDate) && Intrinsics.f(this.issuingCountry, brVar.issuingCountry) && Intrinsics.f(this.kycFiles, brVar.kycFiles) && Intrinsics.f(this.nfcDataGroups, brVar.nfcDataGroups) && Intrinsics.f(this.sdkAuthenticationChecks, brVar.sdkAuthenticationChecks);
    }

    public int hashCode() {
        int iHashCode = ((((this.documentType.hashCode() * 31) + Boolean.hashCode(this.isPrimaryDocument)) * 31) + Boolean.hashCode(this.evaluateSecondaryDocument)) * 31;
        String str = this.documentNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.documentId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.expirationDate;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.issueDate;
        int iHashCode5 = (iHashCode4 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str3 = this.issuingCountry;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.kycFiles;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.nfcDataGroups;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        NfcAuthenticationChecks nfcAuthenticationChecks = this.sdkAuthenticationChecks;
        return iHashCode8 + (nfcAuthenticationChecks != null ? nfcAuthenticationChecks.hashCode() : 0);
    }

    public String toString() {
        return "DocumentUploadRequest(documentType=" + this.documentType + ", isPrimaryDocument=" + this.isPrimaryDocument + ", evaluateSecondaryDocument=" + this.evaluateSecondaryDocument + ", documentNumber=" + this.documentNumber + ", documentId=" + this.documentId + ", expirationDate=" + this.expirationDate + ", issueDate=" + this.issueDate + ", issuingCountry=" + this.issuingCountry + ", kycFiles=" + this.kycFiles + ", nfcDataGroups=" + this.nfcDataGroups + ", sdkAuthenticationChecks=" + this.sdkAuthenticationChecks + ")";
    }

    public br(String documentType, boolean z, boolean z3, String str, String str2, Date date, Date date2, String str3, List list, List list2, NfcAuthenticationChecks nfcAuthenticationChecks) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.documentType = documentType;
        this.isPrimaryDocument = z;
        this.evaluateSecondaryDocument = z3;
        this.documentNumber = str;
        this.documentId = str2;
        this.expirationDate = date;
        this.issueDate = date2;
        this.issuingCountry = str3;
        this.kycFiles = list;
        this.nfcDataGroups = list2;
        this.sdkAuthenticationChecks = nfcAuthenticationChecks;
    }

    public static final /* synthetic */ void a(br self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f27200m;
        output.encodeStringElement(serialDesc, 0, self.documentType);
        output.encodeBooleanElement(serialDesc, 1, self.isPrimaryDocument);
        output.encodeBooleanElement(serialDesc, 2, self.evaluateSecondaryDocument);
        if (output.d(serialDesc) || self.documentNumber != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, qlm.v1.f247718a, self.documentNumber);
        }
        if (output.d(serialDesc) || self.documentId != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, qlm.v1.f247718a, self.documentId);
        }
        if (output.d(serialDesc) || self.expirationDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, DateSerializer.INSTANCE, self.expirationDate);
        }
        if (output.d(serialDesc) || self.issueDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, DateSerializer.INSTANCE, self.issueDate);
        }
        if (output.d(serialDesc) || self.issuingCountry != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, qlm.v1.f247718a, self.issuingCountry);
        }
        if (output.d(serialDesc) || self.kycFiles != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (mlm.h) lazyArr[8].getValue(), self.kycFiles);
        }
        if (output.d(serialDesc) || self.nfcDataGroups != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, (mlm.h) lazyArr[9].getValue(), self.nfcDataGroups);
        }
        if (!output.d(serialDesc) && self.sdkAuthenticationChecks == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, NfcAuthenticationChecks$.serializer.INSTANCE, self.sdkAuthenticationChecks);
    }

    public /* synthetic */ br(String str, boolean z, boolean z3, String str2, String str3, Date date, Date date2, String str4, List list, List list2, NfcAuthenticationChecks nfcAuthenticationChecks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z3, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : date, (i & 64) != 0 ? null : date2, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : nfcAuthenticationChecks);
    }
}
