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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ljr/c0;", "Ljr/e0;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class c0 implements e0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f177773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f177774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f177775c;
    public final String d;
    public final Integer e;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f177776a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f177776a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("SELFIE_WITHOUT_PREVIEW", aVar, 5);
            pluginGeneratedSerialDescriptor.j("photoSettings", true);
            pluginGeneratedSerialDescriptor.j("video", true);
            pluginGeneratedSerialDescriptor.j("fallback", false);
            pluginGeneratedSerialDescriptor.j("id", true);
            pluginGeneratedSerialDescriptor.j("attemptIndex", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(t.f177843a), nlm.a.c(l0.f177804a), w.f177858a, nlm.a.c(qlm.v1.f247718a), nlm.a.c(qlm.n0.f247680a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            v vVar = null;
            n0 n0Var = null;
            y yVar = null;
            String str = null;
            Integer num = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    vVar = (v) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, t.f177843a, vVar);
                    i |= 1;
                } else if (iD == 1) {
                    n0Var = (n0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, l0.f177804a, n0Var);
                    i |= 2;
                } else if (iD == 2) {
                    yVar = (y) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, w.f177858a, yVar);
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
            return new c0(i, vVar, n0Var, yVar, str, num);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            c0 value = (c0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f177773a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, t.f177843a, value.f177773a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f177774b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, l0.f177804a, value.f177774b);
            }
            w wVar = w.f177858a;
            y yVar = value.f177775c;
            Integer num = value.e;
            String str = value.d;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, wVar, yVar);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || num != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, num);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: jr.c0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f177776a;
        }
    }

    public /* synthetic */ c0(int i, v vVar, n0 n0Var, y yVar, String str, Integer num) {
        if (4 != (i & 4)) {
            qlm.j1.f(a.f177776a.getDescriptor(), i, 4);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f177773a = null;
        } else {
            this.f177773a = vVar;
        }
        if ((i & 2) == 0) {
            this.f177774b = null;
        } else {
            this.f177774b = n0Var;
        }
        this.f177775c = yVar;
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
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f177773a, c0Var.f177773a) && Intrinsics.f(this.f177774b, c0Var.f177774b) && Intrinsics.f(this.f177775c, c0Var.f177775c) && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e);
    }

    @Override // jr.e0
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final int hashCode() {
        v vVar = this.f177773a;
        int iHashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        n0 n0Var = this.f177774b;
        int iHashCode2 = (this.f177775c.hashCode() + ((iHashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31)) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
