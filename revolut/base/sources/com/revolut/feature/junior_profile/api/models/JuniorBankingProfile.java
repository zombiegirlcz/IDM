package com.revolut.feature.junior_profile.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.junior_profile.api.models.JuniorProfileCompany;
import ie0.m;
import java.time.LocalDate;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import wp5.y;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0002\u0007\bJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/feature/junior_profile/api/models/JuniorBankingProfile;", "Lcom/revolut/feature/junior_profile/api/models/a;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_junior_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class JuniorBankingProfile extends com.revolut.feature.junior_profile.api.models.a implements Parcelable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Lazy[] f77097q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77100c;
    public final bj0.b d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f77101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f77102h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f77103j;
    public final Address k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ij8.h f77104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kf8.b f77105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f77106n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JuniorProfileCompany f77107p;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<JuniorBankingProfile> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f77108a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f77108a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.junior_profile.api.models.JuniorBankingProfile", aVar, 16);
            pluginGeneratedSerialDescriptor.j("individualId", false);
            pluginGeneratedSerialDescriptor.j("firstName", false);
            pluginGeneratedSerialDescriptor.j("lastName", false);
            pluginGeneratedSerialDescriptor.j("gender", false);
            pluginGeneratedSerialDescriptor.j("email", false);
            pluginGeneratedSerialDescriptor.j("phone", false);
            pluginGeneratedSerialDescriptor.j("code", false);
            pluginGeneratedSerialDescriptor.j("username", false);
            pluginGeneratedSerialDescriptor.j("birthDate", false);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("address", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("relationship", false);
            pluginGeneratedSerialDescriptor.j("requestedTermination", false);
            pluginGeneratedSerialDescriptor.j("receiveTransferUrl", false);
            pluginGeneratedSerialDescriptor.j("company", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = JuniorBankingProfile.f77097q;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, lazyArr[3].getValue(), nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), m.f160609a, v1Var, po3.a.f237883a, lazyArr[11].getValue(), kf8.c.f183314a, qlm.h.f247648a, nlm.a.c(v1Var), nlm.a.c(JuniorProfileCompany.a.f77110a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = JuniorBankingProfile.f77097q;
            dVarBeginStructure.getClass();
            LocalDate localDate = null;
            JuniorProfileCompany juniorProfileCompany = null;
            String str2 = null;
            kf8.b bVar = null;
            Address address = null;
            ij8.h hVar = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            bj0.b bVar2 = null;
            String str3 = null;
            String str4 = null;
            String strDecodeStringElement3 = null;
            String str5 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            int i = 0;
            boolean z = true;
            boolean zDecodeBooleanElement = false;
            while (true) {
                String str6 = strDecodeStringElement;
                if (!z) {
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new JuniorBankingProfile(i, strDecodeStringElement5, strDecodeStringElement, strDecodeStringElement2, bVar2, str3, str4, strDecodeStringElement3, str5, localDate, strDecodeStringElement4, address, hVar, bVar, zDecodeBooleanElement, str2, juniorProfileCompany);
                }
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        str = strDecodeStringElement2;
                        z = false;
                        strDecodeStringElement = str6;
                        strDecodeStringElement2 = str;
                        break;
                    case 0:
                        str = strDecodeStringElement2;
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        strDecodeStringElement = str6;
                        strDecodeStringElement2 = str;
                        break;
                    case 1:
                        str = strDecodeStringElement2;
                        i |= 2;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        strDecodeStringElement2 = str;
                        break;
                    case 2:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        strDecodeStringElement = str6;
                        break;
                    case 3:
                        str = strDecodeStringElement2;
                        bVar2 = (bj0.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), bVar2);
                        i |= 8;
                        strDecodeStringElement = str6;
                        strDecodeStringElement2 = str;
                        break;
                    case 4:
                        str = strDecodeStringElement2;
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                        i |= 16;
                        strDecodeStringElement = str6;
                        strDecodeStringElement2 = str;
                        break;
                    case 5:
                        str = strDecodeStringElement2;
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str4);
                        i |= 32;
                        strDecodeStringElement = str6;
                        strDecodeStringElement2 = str;
                        break;
                    case 6:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        strDecodeStringElement = str6;
                        break;
                    case 7:
                        str = strDecodeStringElement2;
                        str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str5);
                        i |= 128;
                        strDecodeStringElement = str6;
                        strDecodeStringElement2 = str;
                        break;
                    case 8:
                        str = strDecodeStringElement2;
                        localDate = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, m.f160609a, localDate);
                        i |= 256;
                        strDecodeStringElement = str6;
                        strDecodeStringElement2 = str;
                        break;
                    case 9:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i |= 512;
                        strDecodeStringElement = str6;
                        break;
                    case 10:
                        str = strDecodeStringElement2;
                        address = (Address) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, po3.a.f237883a, address);
                        i |= 1024;
                        strDecodeStringElement = str6;
                        strDecodeStringElement2 = str;
                        break;
                    case 11:
                        str = strDecodeStringElement2;
                        hVar = (ij8.h) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr[11].getValue(), hVar);
                        i |= 2048;
                        strDecodeStringElement = str6;
                        strDecodeStringElement2 = str;
                        break;
                    case 12:
                        str = strDecodeStringElement2;
                        bVar = (kf8.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 12, kf8.c.f183314a, bVar);
                        i |= 4096;
                        strDecodeStringElement = str6;
                        strDecodeStringElement2 = str;
                        break;
                    case 13:
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        i |= 8192;
                        strDecodeStringElement = str6;
                        break;
                    case 14:
                        str = strDecodeStringElement2;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, v1.f247718a, str2);
                        i |= 16384;
                        strDecodeStringElement = str6;
                        strDecodeStringElement2 = str;
                        break;
                    case 15:
                        str = strDecodeStringElement2;
                        juniorProfileCompany = (JuniorProfileCompany) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, JuniorProfileCompany.a.f77110a, juniorProfileCompany);
                        i |= 32768;
                        strDecodeStringElement = str6;
                        strDecodeStringElement2 = str;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            JuniorBankingProfile value = (JuniorBankingProfile) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = JuniorBankingProfile.f77097q;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f77098a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f77099b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f77100c);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
            v1 v1Var = v1.f247718a;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f77101g);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, value.f77102h);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, m.f160609a, value.i);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.f77103j);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, po3.a.f237883a, value.k);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, (mlm.h) lazyArr[11].getValue(), value.f77104l);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, kf8.c.f183314a, value.f77105m);
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 13, value.f77106n);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, v1Var, value.o);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, JuniorProfileCompany.a.f77110a, value.f77107p);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.junior_profile.api.models.JuniorBankingProfile$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f77108a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorBankingProfile(parcel.readString(), parcel.readString(), parcel.readString(), bj0.b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), parcel.readString(), (Address) parcel.readParcelable(JuniorBankingProfile.class.getClassLoader()), ij8.h.valueOf(parcel.readString()), kf8.b.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : JuniorProfileCompany.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorBankingProfile[i];
        }
    }

    static {
        k kVar = k.PUBLICATION;
        f77097q = new Lazy[]{null, null, null, j.c(kVar, new igb.j(9)), null, null, null, null, null, null, null, j.c(kVar, new igb.j(10)), null, null, null, null};
    }

    public JuniorBankingProfile(int i, String str, String str2, String str3, bj0.b bVar, String str4, String str5, String str6, String str7, LocalDate localDate, String str8, Address address, ij8.h hVar, kf8.b bVar2, boolean z, String str9, JuniorProfileCompany juniorProfileCompany) {
        if (65535 != (i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) {
            j1.f(a.f77108a.getDescriptor(), i, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            throw null;
        }
        this.f77098a = str;
        this.f77099b = str2;
        this.f77100c = str3;
        this.d = bVar;
        this.e = str4;
        this.f = str5;
        this.f77101g = str6;
        this.f77102h = str7;
        this.i = localDate;
        this.f77103j = str8;
        this.k = address;
        this.f77104l = hVar;
        this.f77105m = bVar2;
        this.f77106n = z;
        this.o = str9;
        this.f77107p = juniorProfileCompany;
    }

    @Override // com.revolut.feature.junior_profile.api.models.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getI() {
        return this.i;
    }

    @Override // com.revolut.feature.junior_profile.api.models.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final bj0.b getD() {
        return this.d;
    }

    @Override // com.revolut.feature.junior_profile.api.models.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF77098a() {
        return this.f77098a;
    }

    @Override // com.revolut.feature.junior_profile.api.models.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF77100c() {
        return this.f77100c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ij8.h getF77104l() {
        return this.f77104l;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorBankingProfile)) {
            return false;
        }
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj2;
        return Intrinsics.f(this.f77098a, juniorBankingProfile.f77098a) && Intrinsics.f(this.f77099b, juniorBankingProfile.f77099b) && Intrinsics.f(this.f77100c, juniorBankingProfile.f77100c) && this.d == juniorBankingProfile.d && Intrinsics.f(this.e, juniorBankingProfile.e) && Intrinsics.f(this.f, juniorBankingProfile.f) && Intrinsics.f(this.f77101g, juniorBankingProfile.f77101g) && Intrinsics.f(this.f77102h, juniorBankingProfile.f77102h) && Intrinsics.f(this.i, juniorBankingProfile.i) && Intrinsics.f(this.f77103j, juniorBankingProfile.f77103j) && Intrinsics.f(this.k, juniorBankingProfile.k) && this.f77104l == juniorBankingProfile.f77104l && this.f77105m == juniorBankingProfile.f77105m && this.f77106n == juniorBankingProfile.f77106n && Intrinsics.f(this.o, juniorBankingProfile.o) && Intrinsics.f(this.f77107p, juniorBankingProfile.f77107p);
    }

    /* JADX INFO: renamed from: getCode, reason: from getter */
    public final String getF77101g() {
        return this.f77101g;
    }

    @Override // com.revolut.feature.junior_profile.api.models.a
    /* JADX INFO: renamed from: getFirstName, reason: from getter */
    public final String getF77099b() {
        return this.f77099b;
    }

    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF77103j() {
        return this.f77103j;
    }

    @Override // com.revolut.feature.junior_profile.api.models.a
    /* JADX INFO: renamed from: getPhone, reason: from getter */
    public final String getF() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f77098a.hashCode() * 31, 31, this.f77099b), 31, this.f77100c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iC = p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f77101g);
        String str3 = this.f77102h;
        int iC2 = j6.a.c((this.f77105m.hashCode() + ((this.f77104l.hashCode() + ((this.k.hashCode() + p.a.c(y.a((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i), 31, this.f77103j)) * 31)) * 31)) * 31, 31, this.f77106n);
        String str4 = this.o;
        int iHashCode3 = (iC2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        JuniorProfileCompany juniorProfileCompany = this.f77107p;
        return iHashCode3 + (juniorProfileCompany != null ? juniorProfileCompany.f77109a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77098a);
        dest.writeString(this.f77099b);
        dest.writeString(this.f77100c);
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f77101g);
        dest.writeString(this.f77102h);
        dest.writeSerializable(this.i);
        dest.writeString(this.f77103j);
        dest.writeParcelable(this.k, i);
        dest.writeString(this.f77104l.name());
        dest.writeString(this.f77105m.name());
        dest.writeInt(this.f77106n ? 1 : 0);
        dest.writeString(this.o);
        JuniorProfileCompany juniorProfileCompany = this.f77107p;
        if (juniorProfileCompany == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            juniorProfileCompany.writeToParcel(dest, i);
        }
    }

    public JuniorBankingProfile(String individualId, String firstName, String lastName, bj0.b gender, String str, String str2, String code, String str3, LocalDate birthDate, String id10, Address address, ij8.h state, kf8.b relationship, boolean z, String str4, JuniorProfileCompany juniorProfileCompany) {
        Intrinsics.checkNotNullParameter(individualId, "individualId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        this.f77098a = individualId;
        this.f77099b = firstName;
        this.f77100c = lastName;
        this.d = gender;
        this.e = str;
        this.f = str2;
        this.f77101g = code;
        this.f77102h = str3;
        this.i = birthDate;
        this.f77103j = id10;
        this.k = address;
        this.f77104l = state;
        this.f77105m = relationship;
        this.f77106n = z;
        this.o = str4;
        this.f77107p = juniorProfileCompany;
    }
}
