package com.fourthline.orca.internal;

import com.fourthline.core.RelaxedDateSerializer;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b&\b\u0081\b\u0018\u0000 K2\u00020\u0001:\u0002\u001e-B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ¬\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010)\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010,R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\"\"\u0004\b/\u0010,R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010)\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010,R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010)\u001a\u0004\b4\u0010\"\"\u0004\b5\u0010,R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010)\u001a\u0004\b7\u0010\"\"\u0004\b8\u0010,R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010)\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010,R*\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u0010;\u0012\u0004\b@\u0010A\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b1\u0010;\u0012\u0004\bC\u0010A\u001a\u0004\b6\u0010=\"\u0004\bB\u0010?R*\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b<\u0010;\u0012\u0004\bE\u0010A\u001a\u0004\b-\u0010=\"\u0004\bD\u0010?R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010)\u001a\u0004\b\u001e\u0010\"\"\u0004\bF\u0010,R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b0\u0010\"\"\u0004\bG\u0010,R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010)\u001a\u0004\b3\u0010\"\"\u0004\bH\u0010,R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010)\u001a\u0004\bI\u0010\"\"\u0004\bJ\u0010,¨\u0006L"}, d2 = {"Lcom/fourthline/orca/internal/gg0;", "", "", "firstName", "lastName", "initials", "gender", "nationality", "issuingCountry", "Ljava/util/Date;", "issueDate", "expirationDate", "dateOfBirth", "birthPlace", "documentNumber", "documentType", "taxIdentificationNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/gg0;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/orca/internal/gg0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "setFirstName", "(Ljava/lang/String;)V", "b", "k", "setLastName", "c", "h", "setInitials", "d", "g", "setGender", "e", "l", "setNationality", "j", "setIssuingCountry", "Ljava/util/Date;", "i", "()Ljava/util/Date;", "setIssueDate", "(Ljava/util/Date;)V", "getIssueDate$annotations", "()V", "setExpirationDate", "getExpirationDate$annotations", "setDateOfBirth", "getDateOfBirth$annotations", "setBirthPlace", "setDocumentNumber", "setDocumentType", "m", "setTaxIdentificationNumber", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class gg0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f28873n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String lastName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String initials;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String gender;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String nationality;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String issuingCountry;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Date issueDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Date expirationDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Date dateOfBirth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String birthPlace;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String documentNumber;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String documentType;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String taxIdentificationNumber;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28883b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f28882a = aVar;
            f28883b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.capabilities.documentrecognition.network.analysis.OcrData", aVar, 13);
            pluginGeneratedSerialDescriptor.j("firstName", true);
            pluginGeneratedSerialDescriptor.j("lastName", true);
            pluginGeneratedSerialDescriptor.j("initials", true);
            pluginGeneratedSerialDescriptor.j("gender", true);
            pluginGeneratedSerialDescriptor.j("nationality", true);
            pluginGeneratedSerialDescriptor.j("issuingCountry", true);
            pluginGeneratedSerialDescriptor.j("issueDate", true);
            pluginGeneratedSerialDescriptor.j("expirationDate", true);
            pluginGeneratedSerialDescriptor.j("dateOfBirth", true);
            pluginGeneratedSerialDescriptor.j("birthPlace", true);
            pluginGeneratedSerialDescriptor.j("documentNumber", true);
            pluginGeneratedSerialDescriptor.j("documentType", true);
            pluginGeneratedSerialDescriptor.j("taxIdentificationNumber", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg0 deserialize(Decoder decoder) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            Date date = null;
            Date date2 = null;
            Date date3 = null;
            int i = 0;
            boolean z = true;
            while (z) {
                String str13 = str7;
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        str2 = str4;
                        str7 = str13;
                        z = false;
                        i = i;
                        str4 = str2;
                        break;
                    case 0:
                        str2 = str4;
                        str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str13);
                        i |= 1;
                        str4 = str2;
                        break;
                    case 1:
                        str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str8);
                        i |= 2;
                        str7 = str13;
                        break;
                    case 2:
                        str = str8;
                        str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str9);
                        i |= 4;
                        str7 = str13;
                        str8 = str;
                        break;
                    case 3:
                        str = str8;
                        str10 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str10);
                        i |= 8;
                        str7 = str13;
                        str8 = str;
                        break;
                    case 4:
                        str = str8;
                        str11 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str11);
                        i |= 16;
                        str7 = str13;
                        str8 = str;
                        break;
                    case 5:
                        str = str8;
                        str12 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str12);
                        i |= 32;
                        str7 = str13;
                        str8 = str;
                        break;
                    case 6:
                        str = str8;
                        date = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, RelaxedDateSerializer.INSTANCE, date);
                        i |= 64;
                        str7 = str13;
                        str8 = str;
                        break;
                    case 7:
                        str = str8;
                        date2 = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, RelaxedDateSerializer.INSTANCE, date2);
                        i |= 128;
                        str7 = str13;
                        str8 = str;
                        break;
                    case 8:
                        str = str8;
                        date3 = (Date) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, RelaxedDateSerializer.INSTANCE, date3);
                        i |= 256;
                        str7 = str13;
                        str8 = str;
                        break;
                    case 9:
                        str = str8;
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.v1.f247718a, str3);
                        i |= 512;
                        str7 = str13;
                        str8 = str;
                        break;
                    case 10:
                        str = str8;
                        str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.v1.f247718a, str5);
                        i |= 1024;
                        str7 = str13;
                        str8 = str;
                        break;
                    case 11:
                        str = str8;
                        str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, qlm.v1.f247718a, str6);
                        i |= 2048;
                        str7 = str13;
                        str8 = str;
                        break;
                    case 12:
                        str = str8;
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.v1.f247718a, str4);
                        i |= 4096;
                        str7 = str13;
                        str8 = str;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new gg0(i, str7, str8, str9, str10, str11, str12, date, date2, date3, str3, str5, str6, str4, null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            KSerializer kSerializerC = nlm.a.c(v1Var);
            KSerializer kSerializerC2 = nlm.a.c(v1Var);
            KSerializer kSerializerC3 = nlm.a.c(v1Var);
            KSerializer kSerializerC4 = nlm.a.c(v1Var);
            KSerializer kSerializerC5 = nlm.a.c(v1Var);
            KSerializer kSerializerC6 = nlm.a.c(v1Var);
            RelaxedDateSerializer relaxedDateSerializer = RelaxedDateSerializer.INSTANCE;
            return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, nlm.a.c(relaxedDateSerializer), nlm.a.c(relaxedDateSerializer), nlm.a.c(relaxedDateSerializer), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
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
        public final void serialize(Encoder encoder, gg0 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            gg0.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gg0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f28882a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ gg0(int i, String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, Date date3, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.firstName = null;
        } else {
            this.firstName = str;
        }
        if ((i & 2) == 0) {
            this.lastName = null;
        } else {
            this.lastName = str2;
        }
        if ((i & 4) == 0) {
            this.initials = null;
        } else {
            this.initials = str3;
        }
        if ((i & 8) == 0) {
            this.gender = null;
        } else {
            this.gender = str4;
        }
        if ((i & 16) == 0) {
            this.nationality = null;
        } else {
            this.nationality = str5;
        }
        if ((i & 32) == 0) {
            this.issuingCountry = null;
        } else {
            this.issuingCountry = str6;
        }
        if ((i & 64) == 0) {
            this.issueDate = null;
        } else {
            this.issueDate = date;
        }
        if ((i & 128) == 0) {
            this.expirationDate = null;
        } else {
            this.expirationDate = date2;
        }
        if ((i & 256) == 0) {
            this.dateOfBirth = null;
        } else {
            this.dateOfBirth = date3;
        }
        if ((i & 512) == 0) {
            this.birthPlace = null;
        } else {
            this.birthPlace = str7;
        }
        if ((i & 1024) == 0) {
            this.documentNumber = null;
        } else {
            this.documentNumber = str8;
        }
        if ((i & 2048) == 0) {
            this.documentType = null;
        } else {
            this.documentType = str9;
        }
        if ((i & 4096) == 0) {
            this.taxIdentificationNumber = null;
        } else {
            this.taxIdentificationNumber = str10;
        }
    }

    public final gg0 a(String firstName, String lastName, String initials, String gender, String nationality, String issuingCountry, Date issueDate, Date expirationDate, Date dateOfBirth, String birthPlace, String documentNumber, String documentType, String taxIdentificationNumber) {
        return new gg0(firstName, lastName, initials, gender, nationality, issuingCountry, issueDate, expirationDate, dateOfBirth, birthPlace, documentNumber, documentType, taxIdentificationNumber);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof gg0)) {
            return false;
        }
        gg0 gg0Var = (gg0) other;
        return Intrinsics.f(this.firstName, gg0Var.firstName) && Intrinsics.f(this.lastName, gg0Var.lastName) && Intrinsics.f(this.initials, gg0Var.initials) && Intrinsics.f(this.gender, gg0Var.gender) && Intrinsics.f(this.nationality, gg0Var.nationality) && Intrinsics.f(this.issuingCountry, gg0Var.issuingCountry) && Intrinsics.f(this.issueDate, gg0Var.issueDate) && Intrinsics.f(this.expirationDate, gg0Var.expirationDate) && Intrinsics.f(this.dateOfBirth, gg0Var.dateOfBirth) && Intrinsics.f(this.birthPlace, gg0Var.birthPlace) && Intrinsics.f(this.documentNumber, gg0Var.documentNumber) && Intrinsics.f(this.documentType, gg0Var.documentType) && Intrinsics.f(this.taxIdentificationNumber, gg0Var.taxIdentificationNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getInitials() {
        return this.initials;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initials;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gender;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nationality;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.issuingCountry;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Date date = this.issueDate;
        int iHashCode7 = (iHashCode6 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode8 = (iHashCode7 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.dateOfBirth;
        int iHashCode9 = (iHashCode8 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str7 = this.birthPlace;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.documentNumber;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.documentType;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.taxIdentificationNumber;
        return iHashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Date getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getNationality() {
        return this.nationality;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTaxIdentificationNumber() {
        return this.taxIdentificationNumber;
    }

    public String toString() {
        return "OcrData(firstName=" + this.firstName + ", lastName=" + this.lastName + ", initials=" + this.initials + ", gender=" + this.gender + ", nationality=" + this.nationality + ", issuingCountry=" + this.issuingCountry + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", dateOfBirth=" + this.dateOfBirth + ", birthPlace=" + this.birthPlace + ", documentNumber=" + this.documentNumber + ", documentType=" + this.documentType + ", taxIdentificationNumber=" + this.taxIdentificationNumber + ")";
    }

    public gg0(String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, Date date3, String str7, String str8, String str9, String str10) {
        this.firstName = str;
        this.lastName = str2;
        this.initials = str3;
        this.gender = str4;
        this.nationality = str5;
        this.issuingCountry = str6;
        this.issueDate = date;
        this.expirationDate = date2;
        this.dateOfBirth = date3;
        this.birthPlace = str7;
        this.documentNumber = str8;
        this.documentType = str9;
        this.taxIdentificationNumber = str10;
    }

    public static /* synthetic */ gg0 a(gg0 gg0Var, String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, Date date3, String str7, String str8, String str9, String str10, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = gg0Var.firstName;
        }
        return gg0Var.a(str, (i & 2) != 0 ? gg0Var.lastName : str2, (i & 4) != 0 ? gg0Var.initials : str3, (i & 8) != 0 ? gg0Var.gender : str4, (i & 16) != 0 ? gg0Var.nationality : str5, (i & 32) != 0 ? gg0Var.issuingCountry : str6, (i & 64) != 0 ? gg0Var.issueDate : date, (i & 128) != 0 ? gg0Var.expirationDate : date2, (i & 256) != 0 ? gg0Var.dateOfBirth : date3, (i & 512) != 0 ? gg0Var.birthPlace : str7, (i & 1024) != 0 ? gg0Var.documentNumber : str8, (i & 2048) != 0 ? gg0Var.documentType : str9, (i & 4096) != 0 ? gg0Var.taxIdentificationNumber : str10);
    }

    public static final /* synthetic */ void a(gg0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.d(serialDesc) || self.firstName != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, qlm.v1.f247718a, self.firstName);
        }
        if (output.d(serialDesc) || self.lastName != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, qlm.v1.f247718a, self.lastName);
        }
        if (output.d(serialDesc) || self.initials != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, qlm.v1.f247718a, self.initials);
        }
        if (output.d(serialDesc) || self.gender != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, qlm.v1.f247718a, self.gender);
        }
        if (output.d(serialDesc) || self.nationality != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, qlm.v1.f247718a, self.nationality);
        }
        if (output.d(serialDesc) || self.issuingCountry != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, qlm.v1.f247718a, self.issuingCountry);
        }
        if (output.d(serialDesc) || self.issueDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, RelaxedDateSerializer.INSTANCE, self.issueDate);
        }
        if (output.d(serialDesc) || self.expirationDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, RelaxedDateSerializer.INSTANCE, self.expirationDate);
        }
        if (output.d(serialDesc) || self.dateOfBirth != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, RelaxedDateSerializer.INSTANCE, self.dateOfBirth);
        }
        if (output.d(serialDesc) || self.birthPlace != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, qlm.v1.f247718a, self.birthPlace);
        }
        if (output.d(serialDesc) || self.documentNumber != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, qlm.v1.f247718a, self.documentNumber);
        }
        if (output.d(serialDesc) || self.documentType != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, qlm.v1.f247718a, self.documentType);
        }
        if (!output.d(serialDesc) && self.taxIdentificationNumber == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, qlm.v1.f247718a, self.taxIdentificationNumber);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBirthPlace() {
        return this.birthPlace;
    }
}
