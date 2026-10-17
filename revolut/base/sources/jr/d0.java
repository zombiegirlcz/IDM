package jr;

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

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ljr/d0;", "Ljr/e0;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class d0 implements e0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f177780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f177781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f177782c;
    public final String d;
    public final Integer e;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f177783a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f177783a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("SELFIE", aVar, 5);
            pluginGeneratedSerialDescriptor.j("manualFallbackTimeout", false);
            pluginGeneratedSerialDescriptor.j("photoSettings", true);
            pluginGeneratedSerialDescriptor.j("video", true);
            pluginGeneratedSerialDescriptor.j("id", true);
            pluginGeneratedSerialDescriptor.j("attemptIndex", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{qlm.t0.f247706a, nlm.a.c(t.f177843a), nlm.a.c(l0.f177804a), nlm.a.c(qlm.v1.f247718a), nlm.a.c(qlm.n0.f247680a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            long jDecodeLongElement = 0;
            Integer num = null;
            String str = null;
            v vVar = null;
            n0 n0Var = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    vVar = (v) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, t.f177843a, vVar);
                    i |= 2;
                } else if (iD == 2) {
                    n0Var = (n0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, l0.f177804a, n0Var);
                    i |= 4;
                } else if (iD == 3) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, num);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new d0(i, jDecodeLongElement, num, str, vVar, n0Var);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            d0 value = (d0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            long j2 = value.f177780a;
            Integer num = value.e;
            String str = value.d;
            n0 n0Var = value.f177782c;
            v vVar = value.f177781b;
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, j2);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || vVar != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, t.f177843a, vVar);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || n0Var != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, l0.f177804a, n0Var);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || num != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, num);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: jr.d0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f177783a;
        }
    }

    public /* synthetic */ d0(int i, long j2, Integer num, String str, v vVar, n0 n0Var) {
        if (1 != (i & 1)) {
            qlm.j1.f(a.f177783a.getDescriptor(), i, 1);
            throw null;
        }
        this.f177780a = j2;
        if ((i & 2) == 0) {
            this.f177781b = null;
        } else {
            this.f177781b = vVar;
        }
        if ((i & 4) == 0) {
            this.f177782c = null;
        } else {
            this.f177782c = n0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
    }

    @Override // jr.e0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getE() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f177780a == d0Var.f177780a && Intrinsics.f(this.f177781b, d0Var.f177781b) && Intrinsics.f(this.f177782c, d0Var.f177782c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e);
    }

    @Override // jr.e0
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f177780a) * 31;
        v vVar = this.f177781b;
        int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
        n0 n0Var = this.f177782c;
        int iHashCode3 = (iHashCode2 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }
}
