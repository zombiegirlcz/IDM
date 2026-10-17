package bl5;

import bl5.a;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0004R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u000f\u0010\u0004R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0013\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0005\u0010\u0014R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u0017\u0010\t\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u001a"}, d2 = {"Lbl5/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "getName$annotations", "()V", "name", "b", "e", "getType$annotations", "type", "d", "getSurname$annotations", "surname", "Lbl5/a;", "Lbl5/a;", "()Lbl5/a;", "getAddress$annotations", "address", "getBusinessRegistrationNumber$annotations", "businessRegistrationNumber", "Companion", "feature_crypto_remittance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("surname")
    private final String surname;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("address")
    private final bl5.a address;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("businessRegistrationNumber")
    private final String businessRegistrationNumber;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16474a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f16474a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.remittance.models.dto.beneficiary.CryptoBeneficiaryDetailsDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("surname", false);
            pluginGeneratedSerialDescriptor.j("address", false);
            pluginGeneratedSerialDescriptor.j("businessRegistrationNumber", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), nlm.a.c(a.C0112a.f16470a), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            String strDecodeStringElement = null;
            String str2 = null;
            bl5.a aVar = null;
            String str3 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                    i |= 4;
                } else if (iD == 3) {
                    aVar = (bl5.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.C0112a.f16470a, aVar);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, str, strDecodeStringElement, str2, aVar, str3);
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
            b.f(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: bl5.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f16474a;
        }
    }

    public /* synthetic */ b(int i, String str, String str2, String str3, bl5.a aVar, String str4) {
        if (31 != (i & 31)) {
            j1.f(a.f16474a.getDescriptor(), i, 31);
            throw null;
        }
        this.name = str;
        this.type = str2;
        this.surname = str3;
        this.address = aVar;
        this.businessRegistrationNumber = str4;
    }

    public static final /* synthetic */ void f(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, bVar.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bVar.type);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, bVar.surname);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, a.C0112a.f16470a, bVar.address);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, bVar.businessRegistrationNumber);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final bl5.a getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBusinessRegistrationNumber() {
        return this.businessRegistrationNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.surname, bVar.surname) && Intrinsics.f(this.address, bVar.address) && Intrinsics.f(this.businessRegistrationNumber, bVar.businessRegistrationNumber);
    }

    public final int hashCode() {
        String str = this.name;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
        String str2 = this.surname;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        bl5.a aVar = this.address;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.businessRegistrationNumber;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public b(String str, String type, String str2, bl5.a aVar, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.name = str;
        this.type = type;
        this.surname = str2;
        this.address = aVar;
        this.businessRegistrationNumber = str3;
    }
}
