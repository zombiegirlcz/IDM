package no3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b3\b\u0087\b\u0018\u0000 42\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0004R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\b\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u0012\u0004\b\u0012\u0010\b\u001a\u0004\b\r\u0010\u0004R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0016\u0010\b\u001a\u0004\b\u0015\u0010\u0004R \u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u0012\u0004\b\u0019\u0010\b\u001a\u0004\b\u0011\u0010\u0004R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0004R\"\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\b\u001a\u0004\b \u0010\u0004R\"\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0006\u0012\u0004\b$\u0010\b\u001a\u0004\b\u001f\u0010\u0004R\"\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u0006\u0012\u0004\b'\u0010\b\u001a\u0004\b\u0014\u0010\u0004R\"\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u0012\u0004\b)\u0010\b\u001a\u0004\b&\u0010\u0004R\"\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b+\u0010\b\u001a\u0004\b\u001b\u0010\u0004R\"\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b.\u0010\b\u001a\u0004\b-\u0010\u0004R\"\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0006\u0012\u0004\b0\u0010\b\u001a\u0004\b#\u0010\u0004R\"\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u0006\u0012\u0004\b2\u0010\b\u001a\u0004\b\u0018\u0010\u0004¨\u00065"}, d2 = {"Lno3/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getAddressLine1$annotations", "()V", "addressLine1", "b", "getAddressLine2$annotations", "addressLine2", "c", "l", "getRegion$annotations", "region", "d", "getCity$annotations", "city", "e", "k", "getPostcode$annotations", "postcode", "f", "getCountry$annotations", "country", "g", "m", "getStreet$annotations", "street", "h", "n", "getStreetName$annotations", "streetName", "i", "getHouseNumber$annotations", "houseNumber", "j", "getFlat$annotations", "flat", "getNeighborhood$annotations", "neighborhood", "getHouseName$annotations", "houseName", "o", "getStreetType$annotations", "streetType", "getLandmark$annotations", "landmark", "getFormat$annotations", "format", "Companion", "feature_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine1")
    private final String addressLine1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine2")
    private final String addressLine2;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("region")
    private final String region;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("city")
    private final String city;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("postcode")
    private final String postcode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("street")
    private final String street;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetName")
    private final String streetName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("houseNumber")
    private final String houseNumber;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("flat")
    private final String flat;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("neighbourhood")
    private final String neighborhood;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("houseName")
    private final String houseName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetType")
    private final String streetType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("landmark")
    private final String landmark;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("format")
    private final String format;

    /* JADX INFO: loaded from: classes21.dex */
    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f217911a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f217911a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.core.model.network.address.AddressDto", aVar, 15);
            pluginGeneratedSerialDescriptor.j("streetLine1", false);
            pluginGeneratedSerialDescriptor.j("streetLine2", false);
            pluginGeneratedSerialDescriptor.j("region", false);
            pluginGeneratedSerialDescriptor.j("city", false);
            pluginGeneratedSerialDescriptor.j("postcode", false);
            pluginGeneratedSerialDescriptor.j("country", false);
            pluginGeneratedSerialDescriptor.j("street", false);
            pluginGeneratedSerialDescriptor.j("streetName", true);
            pluginGeneratedSerialDescriptor.j("houseNumber", false);
            pluginGeneratedSerialDescriptor.j("flat", false);
            pluginGeneratedSerialDescriptor.j("neighbourhood", false);
            pluginGeneratedSerialDescriptor.j("houseName", false);
            pluginGeneratedSerialDescriptor.j("streetType", false);
            pluginGeneratedSerialDescriptor.j("landmark", true);
            pluginGeneratedSerialDescriptor.j("format", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String strDecodeStringElement = null;
            String str20 = null;
            int i = 0;
            boolean z = true;
            while (z) {
                String str21 = str12;
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        str2 = str8;
                        str3 = str13;
                        str4 = str20;
                        str5 = str21;
                        str6 = str9;
                        z = false;
                        str12 = str5;
                        str9 = str6;
                        str13 = str3;
                        str20 = str4;
                        str8 = str2;
                        break;
                    case 0:
                        str2 = str8;
                        str3 = str13;
                        str5 = str21;
                        String str22 = str20;
                        str6 = str9;
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str22);
                        i |= 1;
                        str12 = str5;
                        str9 = str6;
                        str13 = str3;
                        str20 = str4;
                        str8 = str2;
                        break;
                    case 1:
                        str2 = str8;
                        str12 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str21);
                        i |= 2;
                        str13 = str13;
                        str8 = str2;
                        break;
                    case 2:
                        str2 = str8;
                        str13 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str13);
                        i |= 4;
                        str12 = str21;
                        str8 = str2;
                        break;
                    case 3:
                        str = str13;
                        str14 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str14);
                        i |= 8;
                        str12 = str21;
                        str13 = str;
                        break;
                    case 4:
                        str = str13;
                        str15 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str15);
                        i |= 16;
                        str12 = str21;
                        str13 = str;
                        break;
                    case 5:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        str12 = str21;
                        break;
                    case 6:
                        str = str13;
                        str17 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str17);
                        i |= 64;
                        str12 = str21;
                        str13 = str;
                        break;
                    case 7:
                        str = str13;
                        str18 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str18);
                        i |= 128;
                        str12 = str21;
                        str13 = str;
                        break;
                    case 8:
                        str = str13;
                        str19 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str19);
                        i |= 256;
                        str12 = str21;
                        str13 = str;
                        break;
                    case 9:
                        str = str13;
                        str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, v1.f247718a, str7);
                        i |= 512;
                        str12 = str21;
                        str13 = str;
                        break;
                    case 10:
                        str = str13;
                        str10 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, v1.f247718a, str10);
                        i |= 1024;
                        str12 = str21;
                        str13 = str;
                        break;
                    case 11:
                        str = str13;
                        str11 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, v1.f247718a, str11);
                        i |= 2048;
                        str12 = str21;
                        str13 = str;
                        break;
                    case 12:
                        str = str13;
                        str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, v1.f247718a, str9);
                        i |= 4096;
                        str12 = str21;
                        str13 = str;
                        break;
                    case 13:
                        str = str13;
                        str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, v1.f247718a, str8);
                        i |= 8192;
                        str12 = str21;
                        str13 = str;
                        break;
                    case 14:
                        str = str13;
                        str16 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, v1.f247718a, str16);
                        i |= 16384;
                        str12 = str21;
                        str13 = str;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            String str23 = str8;
            String str24 = str20;
            String str25 = str12;
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, str24, str25, str13, str14, str15, strDecodeStringElement, str17, str18, str19, str7, str10, str11, str9, str23, str16);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            b value = (b) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            b.p(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: no3.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f217911a;
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, String country, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i) {
        String str14 = (i & 8192) != 0 ? null : str12;
        String str15 = (i & 16384) != 0 ? null : str13;
        Intrinsics.checkNotNullParameter(country, "country");
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.region = str3;
        this.city = str4;
        this.postcode = str5;
        this.country = country;
        this.street = str6;
        this.streetName = null;
        this.houseNumber = str7;
        this.flat = str8;
        this.neighborhood = str9;
        this.houseName = str10;
        this.streetType = str11;
        this.landmark = str14;
        this.format = str15;
    }

    public static final /* synthetic */ void p(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, bVar.addressLine1);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, bVar.addressLine2);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, bVar.region);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, bVar.city);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, bVar.postcode);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, bVar.country);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, bVar.street);
        if (compositeEncoder.d(serialDescriptor) || bVar.streetName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, bVar.streetName);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, bVar.houseNumber);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, v1Var, bVar.flat);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, v1Var, bVar.neighborhood);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, v1Var, bVar.houseName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, v1Var, bVar.streetType);
        if (compositeEncoder.d(serialDescriptor) || bVar.landmark != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, v1Var, bVar.landmark);
        }
        if (!compositeEncoder.d(serialDescriptor) && bVar.format == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, v1Var, bVar.format);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFlat() {
        return this.flat;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.addressLine1, bVar.addressLine1) && Intrinsics.f(this.addressLine2, bVar.addressLine2) && Intrinsics.f(this.region, bVar.region) && Intrinsics.f(this.city, bVar.city) && Intrinsics.f(this.postcode, bVar.postcode) && Intrinsics.f(this.country, bVar.country) && Intrinsics.f(this.street, bVar.street) && Intrinsics.f(this.streetName, bVar.streetName) && Intrinsics.f(this.houseNumber, bVar.houseNumber) && Intrinsics.f(this.flat, bVar.flat) && Intrinsics.f(this.neighborhood, bVar.neighborhood) && Intrinsics.f(this.houseName, bVar.houseName) && Intrinsics.f(this.streetType, bVar.streetType) && Intrinsics.f(this.landmark, bVar.landmark) && Intrinsics.f(this.format, bVar.format);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getHouseName() {
        return this.houseName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getHouseNumber() {
        return this.houseNumber;
    }

    public final int hashCode() {
        String str = this.addressLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressLine2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.region;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postcode;
        int iC = p.a.c((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.country);
        String str6 = this.street;
        int iHashCode5 = (iC + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.streetName;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.houseNumber;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.flat;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.neighborhood;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.houseName;
        int iHashCode10 = (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.streetType;
        int iHashCode11 = (iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.landmark;
        int iHashCode12 = (iHashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.format;
        return iHashCode12 + (str14 != null ? str14.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLandmark() {
        return this.landmark;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getNeighborhood() {
        return this.neighborhood;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getStreetName() {
        return this.streetName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getStreetType() {
        return this.streetType;
    }

    public /* synthetic */ b(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        if (8063 != (i & 8063)) {
            j1.f(a.f217911a.getDescriptor(), i, 8063);
            throw null;
        }
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.region = str3;
        this.city = str4;
        this.postcode = str5;
        this.country = str6;
        this.street = str7;
        if ((i & 128) == 0) {
            this.streetName = null;
        } else {
            this.streetName = str8;
        }
        this.houseNumber = str9;
        this.flat = str10;
        this.neighborhood = str11;
        this.houseName = str12;
        this.streetType = str13;
        if ((i & 8192) == 0) {
            this.landmark = null;
        } else {
            this.landmark = str14;
        }
        if ((i & 16384) == 0) {
            this.format = null;
        } else {
            this.format = str15;
        }
    }
}
