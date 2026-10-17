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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ljr/z;", "Ljr/e0;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class z implements e0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f177876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f177877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f177878c;
    public final String d;
    public final Integer e;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f177879a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f177879a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ACTIVE_LIVENESS_WITH_CODE", aVar, 5);
            pluginGeneratedSerialDescriptor.j("video", false);
            pluginGeneratedSerialDescriptor.j("photoSettings", true);
            pluginGeneratedSerialDescriptor.j("manualFallbackTimeout", false);
            pluginGeneratedSerialDescriptor.j("id", true);
            pluginGeneratedSerialDescriptor.j("attemptIndex", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{l0.f177804a, nlm.a.c(t.f177843a), qlm.t0.f247706a, nlm.a.c(qlm.v1.f247718a), nlm.a.c(qlm.n0.f247680a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            Integer num = null;
            String str = null;
            v vVar = null;
            n0 n0Var = null;
            long jDecodeLongElement = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    n0Var = (n0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, l0.f177804a, n0Var);
                    i |= 1;
                } else if (iD == 1) {
                    vVar = (v) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, t.f177843a, vVar);
                    i |= 2;
                } else if (iD == 2) {
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
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
            return new z(i, jDecodeLongElement, num, str, vVar, n0Var);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            z value = (z) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            l0 l0Var = l0.f177804a;
            n0 n0Var = value.f177876a;
            Integer num = value.e;
            String str = value.d;
            v vVar = value.f177877b;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, l0Var, n0Var);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || vVar != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, t.f177843a, vVar);
            }
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.f177878c);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || num != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, num);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: jr.z$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f177879a;
        }
    }

    public /* synthetic */ z(int i, long j2, Integer num, String str, v vVar, n0 n0Var) {
        if (5 != (i & 5)) {
            qlm.j1.f(a.f177879a.getDescriptor(), i, 5);
            throw null;
        }
        this.f177876a = n0Var;
        if ((i & 2) == 0) {
            this.f177877b = null;
        } else {
            this.f177877b = vVar;
        }
        this.f177878c = j2;
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
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f177876a, zVar.f177876a) && Intrinsics.f(this.f177877b, zVar.f177877b) && this.f177878c == zVar.f177878c && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e);
    }

    @Override // jr.e0
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.f177876a.hashCode() * 31;
        v vVar = this.f177877b;
        int iC = a0.d.c((iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31, 31, this.f177878c);
        String str = this.d;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
