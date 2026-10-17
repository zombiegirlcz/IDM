package ij8;

import com.revolut.feature.address.models.Address;
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
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lij8/d;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_junior_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f161724h = {yhm.j.c(yhm.k.PUBLICATION, new igb.j(11)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bj0.b f161725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161727c;
    public final Address d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f161728g;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f161729a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f161729a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.junior_profile.api.models.JuniorProfileChangeRequest", aVar, 7);
            pluginGeneratedSerialDescriptor.j("gender", true);
            pluginGeneratedSerialDescriptor.j("email", true);
            pluginGeneratedSerialDescriptor.j("picture", true);
            pluginGeneratedSerialDescriptor.j("address", true);
            pluginGeneratedSerialDescriptor.j("firstName", true);
            pluginGeneratedSerialDescriptor.j("lastName", true);
            pluginGeneratedSerialDescriptor.j("birthDate", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c((KSerializer) d.f161724h[0].getValue());
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{kSerializerC, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(po3.a.f237883a), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(m.f160609a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = d.f161724h;
            dVarBeginStructure.getClass();
            int i = 0;
            bj0.b bVar = null;
            String str = null;
            String str2 = null;
            Address address = null;
            String str3 = null;
            String str4 = null;
            LocalDate localDate = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        bVar = (bj0.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), bVar);
                        i |= 1;
                        break;
                    case 1:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                        i |= 2;
                        break;
                    case 2:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                        i |= 4;
                        break;
                    case 3:
                        address = (Address) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, po3.a.f237883a, address);
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
                        localDate = (LocalDate) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, m.f160609a, localDate);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new d(i, bVar, str, str2, address, str3, str4, localDate);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            d value = (d) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = d.f161724h;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f161725a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f161725a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f161726b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f161726b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f161727c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.f161727c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, po3.a.f237883a, value.d);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.e != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, value.e);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, value.f);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f161728g != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, m.f160609a, value.f161728g);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ij8.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f161729a;
        }
    }

    public d() {
        this(null, null, null, null, null, null, CertificateBody.profileType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f161725a == dVar.f161725a && Intrinsics.f(this.f161726b, dVar.f161726b) && Intrinsics.f(this.f161727c, dVar.f161727c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f161728g, dVar.f161728g);
    }

    public final int hashCode() {
        bj0.b bVar = this.f161725a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        String str = this.f161726b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f161727c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.d;
        int iHashCode4 = (iHashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LocalDate localDate = this.f161728g;
        return iHashCode6 + (localDate != null ? localDate.hashCode() : 0);
    }

    public /* synthetic */ d(int i, bj0.b bVar, String str, String str2, Address address, String str3, String str4, LocalDate localDate) {
        if ((i & 1) == 0) {
            this.f161725a = null;
        } else {
            this.f161725a = bVar;
        }
        if ((i & 2) == 0) {
            this.f161726b = null;
        } else {
            this.f161726b = str;
        }
        if ((i & 4) == 0) {
            this.f161727c = null;
        } else {
            this.f161727c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = address;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.f161728g = null;
        } else {
            this.f161728g = localDate;
        }
    }

    public d(bj0.b bVar, String str, Address address, String str2, String str3, LocalDate localDate, int i) {
        bVar = (i & 1) != 0 ? null : bVar;
        str = (i & 2) != 0 ? null : str;
        address = (i & 8) != 0 ? null : address;
        str2 = (i & 16) != 0 ? null : str2;
        str3 = (i & 32) != 0 ? null : str3;
        localDate = (i & 64) != 0 ? null : localDate;
        this.f161725a = bVar;
        this.f161726b = str;
        this.f161727c = null;
        this.d = address;
        this.e = str2;
        this.f = str3;
        this.f161728g = localDate;
    }
}
