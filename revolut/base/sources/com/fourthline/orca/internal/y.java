package com.fourthline.orca.internal;

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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002\u0016\"B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u0019¨\u0006-"}, d2 = {"Lcom/fourthline/orca/internal/y;", "", "", "street", "streetNumber", "streetNumberSuffix", "postalCode", "city", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/y;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStreet", "b", "getStreetNumber", "c", "getStreetNumberSuffix", "d", "getPostalCode", "e", "getCity", "f", "getCountry", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class y {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String street;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String streetNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String streetNumberSuffix;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String postalCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String city;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String country;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f35122b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f35121a = aVar;
            f35122b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.kyc.internal.flow.upload_idv.upload.Address", aVar, 6);
            pluginGeneratedSerialDescriptor.j("street", false);
            pluginGeneratedSerialDescriptor.j("streetNumber", false);
            pluginGeneratedSerialDescriptor.j("streetNumberSuffix", false);
            pluginGeneratedSerialDescriptor.j("postalCode", false);
            pluginGeneratedSerialDescriptor.j("city", false);
            pluginGeneratedSerialDescriptor.j("country", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String str = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
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
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str);
                        i |= 4;
                        break;
                    case 3:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new y(i, strDecodeStringElement, strDecodeStringElement2, str, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), v1Var, v1Var, v1Var};
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
        public final void serialize(Encoder encoder, y value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            y.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.y$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f35121a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ y(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            qlm.j1.f(a.f35121a.getDescriptor(), i, 63);
            throw null;
        }
        this.street = str;
        this.streetNumber = str2;
        this.streetNumberSuffix = str3;
        this.postalCode = str4;
        this.city = str5;
        this.country = str6;
    }

    public static final /* synthetic */ void a(y self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.street);
        output.encodeStringElement(serialDesc, 1, self.streetNumber);
        output.encodeNullableSerializableElement(serialDesc, 2, qlm.v1.f247718a, self.streetNumberSuffix);
        output.encodeStringElement(serialDesc, 3, self.postalCode);
        output.encodeStringElement(serialDesc, 4, self.city);
        output.encodeStringElement(serialDesc, 5, self.country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y)) {
            return false;
        }
        y yVar = (y) other;
        return Intrinsics.f(this.street, yVar.street) && Intrinsics.f(this.streetNumber, yVar.streetNumber) && Intrinsics.f(this.streetNumberSuffix, yVar.streetNumberSuffix) && Intrinsics.f(this.postalCode, yVar.postalCode) && Intrinsics.f(this.city, yVar.city) && Intrinsics.f(this.country, yVar.country);
    }

    public int hashCode() {
        int iHashCode = ((this.street.hashCode() * 31) + this.streetNumber.hashCode()) * 31;
        String str = this.streetNumberSuffix;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.postalCode.hashCode()) * 31) + this.city.hashCode()) * 31) + this.country.hashCode();
    }

    public String toString() {
        return "Address(street=" + this.street + ", streetNumber=" + this.streetNumber + ", streetNumberSuffix=" + this.streetNumberSuffix + ", postalCode=" + this.postalCode + ", city=" + this.city + ", country=" + this.country + ")";
    }

    public y(String street, String streetNumber, String str, String postalCode, String city, String country) {
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(streetNumber, "streetNumber");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(country, "country");
        this.street = street;
        this.streetNumber = streetNumber;
        this.streetNumberSuffix = str;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }
}
