package j3c;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0004R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0004R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\b\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u0012\u0004\b\u0013\u0010\b\u001a\u0004\b\u0012\u0010\u0004R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u0016\u0010\b\u001a\u0004\b\u0015\u0010\u0004R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u0012\u0004\b\u0019\u0010\b\u001a\u0004\b\u0018\u0010\u0004R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u0012\u0004\b\u001b\u0010\b\u001a\u0004\b\r\u0010\u0004R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u0011\u0010\u0004¨\u0006 "}, d2 = {"Lj3c/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCity$annotations", "()V", "city", "b", "getCountry$annotations", "country", "c", "e", "getPostcode$annotations", "postcode", "d", "g", "getStreetLine1$annotations", "streetLine1", "h", "getStreetLine2$annotations", "streetLine2", "f", "getRegion$annotations", "region", "getFullAddress$annotations", "fullAddress", "getNeighbourhood$annotations", "neighbourhood", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("city")
    private final String city;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("postcode")
    @NotNull
    private final String postcode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("streetLine1")
    private final String streetLine1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("streetLine2")
    private final String streetLine2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("region")
    private final String region;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("fullAddress")
    private final String fullAddress;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("neighbourhood")
    private final String neighbourhood;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171025a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f171025a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.AddressDto", aVar, 8);
            pluginGeneratedSerialDescriptor.j("city", false);
            pluginGeneratedSerialDescriptor.j("country", false);
            pluginGeneratedSerialDescriptor.j("postcode", false);
            pluginGeneratedSerialDescriptor.j("streetLine1", false);
            pluginGeneratedSerialDescriptor.j("streetLine2", false);
            pluginGeneratedSerialDescriptor.j("region", false);
            pluginGeneratedSerialDescriptor.j("fullAddress", false);
            pluginGeneratedSerialDescriptor.j("neighbourhood", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                        break;
                    case 1:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                        i |= 8;
                        break;
                    case 4:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                        i |= 16;
                        break;
                    case 5:
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str4);
                        i |= 32;
                        break;
                    case 6:
                        str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str5);
                        i |= 64;
                        break;
                    case 7:
                        str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str6);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, str, strDecodeStringElement, strDecodeStringElement2, str2, str3, str4, str5, str6);
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
            b.i(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j3c.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f171025a;
        }
    }

    public /* synthetic */ b(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (255 != (i & 255)) {
            j1.f(a.f171025a.getDescriptor(), i, 255);
            throw null;
        }
        this.city = str;
        this.country = str2;
        this.postcode = str3;
        this.streetLine1 = str4;
        this.streetLine2 = str5;
        this.region = str6;
        this.fullAddress = str7;
        this.neighbourhood = str8;
    }

    public static final /* synthetic */ void i(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, bVar.city);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bVar.country);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, bVar.postcode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, bVar.streetLine1);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, bVar.streetLine2);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, bVar.region);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, bVar.fullAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, bVar.neighbourhood);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFullAddress() {
        return this.fullAddress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNeighbourhood() {
        return this.neighbourhood;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.city, bVar.city) && Intrinsics.f(this.country, bVar.country) && Intrinsics.f(this.postcode, bVar.postcode) && Intrinsics.f(this.streetLine1, bVar.streetLine1) && Intrinsics.f(this.streetLine2, bVar.streetLine2) && Intrinsics.f(this.region, bVar.region) && Intrinsics.f(this.fullAddress, bVar.fullAddress) && Intrinsics.f(this.neighbourhood, bVar.neighbourhood);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStreetLine1() {
        return this.streetLine1;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStreetLine2() {
        return this.streetLine2;
    }

    public final int hashCode() {
        String str = this.city;
        int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.country), 31, this.postcode);
        String str2 = this.streetLine1;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.streetLine2;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.region;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fullAddress;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.neighbourhood;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public b(String str, String country, String postcode, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        this.city = str;
        this.country = country;
        this.postcode = postcode;
        this.streetLine1 = str2;
        this.streetLine2 = str3;
        this.region = str4;
        this.fullAddress = str5;
        this.neighbourhood = str6;
    }
}
