package com.fourthline.orca.internal;

import com.fourthline.core.DateSerializer;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u0000 :2\u00020\u0001:\u0002\u001a&BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBu\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010\u001dR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b9\u0010\u001d¨\u0006;"}, d2 = {"Lcom/fourthline/orca/internal/wj0;", "", "", "type", "name", "firstName", "lastName", "nationality", "gender", "Ljava/util/Date;", "birthDate", "placeOfBirth", "countryOfBirth", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/wj0;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "b", "getName", "c", "getFirstName", "d", "getLastName", "e", "getNationality", "f", "getGender", "g", "Ljava/util/Date;", "getBirthDate", "()Ljava/util/Date;", "getBirthDate$annotations", "()V", "h", "getPlaceOfBirth", "i", "getCountryOfBirth", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class wj0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f34713j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String firstName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String lastName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String nationality;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String gender;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Date birthDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String placeOfBirth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String countryOfBirth;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34720b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f34719a = aVar;
            f34720b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.upload_idv.upload.Person", aVar, 9);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("firstName", false);
            pluginGeneratedSerialDescriptor.j("lastName", false);
            pluginGeneratedSerialDescriptor.j("nationality", false);
            pluginGeneratedSerialDescriptor.j("gender", false);
            pluginGeneratedSerialDescriptor.j("birthDate", false);
            pluginGeneratedSerialDescriptor.j("placeOfBirth", false);
            pluginGeneratedSerialDescriptor.j("countryOfBirth", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wj0 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            Date date = null;
            String str = null;
            String str2 = null;
            int i = 0;
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
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        date = (Date) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, DateSerializer.INSTANCE, date);
                        i |= 64;
                        break;
                    case 7:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str);
                        i |= 128;
                        break;
                    case 8:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str2);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new wj0(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, date, str, str2, null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, DateSerializer.INSTANCE, nlm.a.c(v1Var), nlm.a.c(v1Var)};
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
        public final void serialize(Encoder encoder, wj0 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            wj0.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wj0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f34719a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ wj0(int i, String str, String str2, String str3, String str4, String str5, String str6, Date date, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            qlm.j1.f(a.f34719a.getDescriptor(), i, 511);
            throw null;
        }
        this.type = str;
        this.name = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.nationality = str5;
        this.gender = str6;
        this.birthDate = date;
        this.placeOfBirth = str7;
        this.countryOfBirth = str8;
    }

    public static final /* synthetic */ void a(wj0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeStringElement(serialDesc, 1, self.name);
        output.encodeStringElement(serialDesc, 2, self.firstName);
        output.encodeStringElement(serialDesc, 3, self.lastName);
        output.encodeStringElement(serialDesc, 4, self.nationality);
        output.encodeStringElement(serialDesc, 5, self.gender);
        output.encodeSerializableElement(serialDesc, 6, DateSerializer.INSTANCE, self.birthDate);
        qlm.v1 v1Var = qlm.v1.f247718a;
        output.encodeNullableSerializableElement(serialDesc, 7, v1Var, self.placeOfBirth);
        output.encodeNullableSerializableElement(serialDesc, 8, v1Var, self.countryOfBirth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof wj0)) {
            return false;
        }
        wj0 wj0Var = (wj0) other;
        return Intrinsics.f(this.type, wj0Var.type) && Intrinsics.f(this.name, wj0Var.name) && Intrinsics.f(this.firstName, wj0Var.firstName) && Intrinsics.f(this.lastName, wj0Var.lastName) && Intrinsics.f(this.nationality, wj0Var.nationality) && Intrinsics.f(this.gender, wj0Var.gender) && Intrinsics.f(this.birthDate, wj0Var.birthDate) && Intrinsics.f(this.placeOfBirth, wj0Var.placeOfBirth) && Intrinsics.f(this.countryOfBirth, wj0Var.countryOfBirth);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.type.hashCode() * 31) + this.name.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.nationality.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.birthDate.hashCode()) * 31;
        String str = this.placeOfBirth;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countryOfBirth;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Person(type=" + this.type + ", name=" + this.name + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", nationality=" + this.nationality + ", gender=" + this.gender + ", birthDate=" + this.birthDate + ", placeOfBirth=" + this.placeOfBirth + ", countryOfBirth=" + this.countryOfBirth + ")";
    }

    public wj0(String type, String name, String firstName, String lastName, String nationality, String gender, Date birthDate, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        this.type = type;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.gender = gender;
        this.birthDate = birthDate;
        this.placeOfBirth = str;
        this.countryOfBirth = str2;
    }
}
