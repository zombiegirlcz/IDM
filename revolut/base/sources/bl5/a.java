package bl5;

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
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0004R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0014"}, d2 = {"Lbl5/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "getCountry$annotations", "()V", "country", "b", "c", "getCity$annotations", "city", "getAddressLine1$annotations", "addressLine1", "getAddressLine2$annotations", "addressLine2", "Companion", "feature_crypto_remittance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("city")
    private final String city;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("addressLine1")
    @NotNull
    private final String addressLine1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("addressLine2")
    private final String addressLine2;

    /* JADX INFO: renamed from: bl5.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0112a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0112a f16470a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C0112a c0112a = new C0112a();
            f16470a = c0112a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.remittance.models.dto.beneficiary.CryptoBeneficiaryAddressDto", c0112a, 4);
            pluginGeneratedSerialDescriptor.j("country", false);
            pluginGeneratedSerialDescriptor.j("city", false);
            pluginGeneratedSerialDescriptor.j("addressLine1", false);
            pluginGeneratedSerialDescriptor.j("addressLine2", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0112a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String str = null;
            String strDecodeStringElement2 = null;
            String str2 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                } else if (iD == 2) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, strDecodeStringElement, str, strDecodeStringElement2, str2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            a value = (a) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            a.e(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: bl5.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0112a.f16470a;
        }
    }

    public /* synthetic */ a(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(C0112a.f16470a.getDescriptor(), i, 15);
            throw null;
        }
        this.country = str;
        this.city = str2;
        this.addressLine1 = str3;
        this.addressLine2 = str4;
    }

    public static final /* synthetic */ void e(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aVar.country);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, aVar.city);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, aVar.addressLine1);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, aVar.addressLine2);
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

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.country, aVar.country) && Intrinsics.f(this.city, aVar.city) && Intrinsics.f(this.addressLine1, aVar.addressLine1) && Intrinsics.f(this.addressLine2, aVar.addressLine2);
    }

    public final int hashCode() {
        int iHashCode = this.country.hashCode() * 31;
        String str = this.city;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.addressLine1);
        String str2 = this.addressLine2;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public a(String country, String str, String addressLine1, String str2) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(addressLine1, "addressLine1");
        this.country = country;
        this.city = str;
        this.addressLine1 = addressLine1;
        this.addressLine2 = str2;
    }
}
