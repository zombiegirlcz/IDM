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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ljr/p;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class p {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f177816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f177817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1 f177818c;
    public final k0 d;
    public final q1 e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t1 f177819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x1 f177820h;
    public final x1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f177821j;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f177822a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f177822a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.instructions.BiometricVerificationFeaturesDto", aVar, 10);
            pluginGeneratedSerialDescriptor.j("a", true);
            pluginGeneratedSerialDescriptor.j("b", true);
            pluginGeneratedSerialDescriptor.j("c", true);
            pluginGeneratedSerialDescriptor.j("validity", true);
            pluginGeneratedSerialDescriptor.j("deviceFingerprint", true);
            pluginGeneratedSerialDescriptor.j("mm", true);
            pluginGeneratedSerialDescriptor.j("im", true);
            pluginGeneratedSerialDescriptor.j("vv_video", true);
            pluginGeneratedSerialDescriptor.j("vv_photo", true);
            pluginGeneratedSerialDescriptor.j("yu", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c(f1.f177786a);
            KSerializer kSerializerC2 = nlm.a.c(i1.f177795a);
            KSerializer kSerializerC3 = nlm.a.c(l1.f177805a);
            KSerializer kSerializerC4 = nlm.a.c(i0.f177794a);
            KSerializer kSerializerC5 = nlm.a.c(o1.f177815a);
            m mVar = m.f177806a;
            KSerializer kSerializerC6 = nlm.a.c(mVar);
            KSerializer kSerializerC7 = nlm.a.c(r1.f177835a);
            v1 v1Var = v1.f177857a;
            return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(mVar)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            o oVar = null;
            h1 h1Var = null;
            k1 k1Var = null;
            n1 n1Var = null;
            k0 k0Var = null;
            q1 q1Var = null;
            o oVar2 = null;
            t1 t1Var = null;
            x1 x1Var = null;
            x1 x1Var2 = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        h1Var = (h1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, f1.f177786a, h1Var);
                        i |= 1;
                        break;
                    case 1:
                        k1Var = (k1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, i1.f177795a, k1Var);
                        i |= 2;
                        break;
                    case 2:
                        n1Var = (n1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, l1.f177805a, n1Var);
                        i |= 4;
                        break;
                    case 3:
                        k0Var = (k0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, i0.f177794a, k0Var);
                        i |= 8;
                        break;
                    case 4:
                        q1Var = (q1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, o1.f177815a, q1Var);
                        i |= 16;
                        break;
                    case 5:
                        oVar2 = (o) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, m.f177806a, oVar2);
                        i |= 32;
                        break;
                    case 6:
                        t1Var = (t1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, r1.f177835a, t1Var);
                        i |= 64;
                        break;
                    case 7:
                        x1Var = (x1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f177857a, x1Var);
                        i |= 128;
                        break;
                    case 8:
                        x1Var2 = (x1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f177857a, x1Var2);
                        i |= 256;
                        break;
                    case 9:
                        oVar = (o) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, m.f177806a, oVar);
                        i |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new p(i, h1Var, k1Var, n1Var, k0Var, q1Var, oVar2, t1Var, x1Var, x1Var2, oVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            p value = (p) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f177816a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, f1.f177786a, value.f177816a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f177817b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, i1.f177795a, value.f177817b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f177818c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, l1.f177805a, value.f177818c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, i0.f177794a, value.d);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.e != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, o1.f177815a, value.e);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, m.f177806a, value.f);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f177819g != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, r1.f177835a, value.f177819g);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f177820h != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1.f177857a, value.f177820h);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.i != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1.f177857a, value.i);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f177821j != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, m.f177806a, value.f177821j);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: jr.p$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f177822a;
        }
    }

    public p() {
        this.f177816a = null;
        this.f177817b = null;
        this.f177818c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f177819g = null;
        this.f177820h = null;
        this.i = null;
        this.f177821j = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f177816a, pVar.f177816a) && Intrinsics.f(this.f177817b, pVar.f177817b) && Intrinsics.f(this.f177818c, pVar.f177818c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f177819g, pVar.f177819g) && Intrinsics.f(this.f177820h, pVar.f177820h) && Intrinsics.f(this.i, pVar.i) && Intrinsics.f(this.f177821j, pVar.f177821j);
    }

    public final int hashCode() {
        h1 h1Var = this.f177816a;
        int iHashCode = (h1Var == null ? 0 : h1Var.hashCode()) * 31;
        k1 k1Var = this.f177817b;
        int iHashCode2 = (iHashCode + (k1Var == null ? 0 : k1Var.hashCode())) * 31;
        n1 n1Var = this.f177818c;
        int iHashCode3 = (iHashCode2 + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
        k0 k0Var = this.d;
        int iHashCode4 = (iHashCode3 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        q1 q1Var = this.e;
        int iHashCode5 = (iHashCode4 + (q1Var == null ? 0 : q1Var.hashCode())) * 31;
        o oVar = this.f;
        int iHashCode6 = (iHashCode5 + (oVar == null ? 0 : Boolean.hashCode(oVar.f177813a))) * 31;
        t1 t1Var = this.f177819g;
        int iHashCode7 = (iHashCode6 + (t1Var == null ? 0 : t1Var.hashCode())) * 31;
        x1 x1Var = this.f177820h;
        int iHashCode8 = (iHashCode7 + (x1Var == null ? 0 : x1Var.hashCode())) * 31;
        x1 x1Var2 = this.i;
        int iHashCode9 = (iHashCode8 + (x1Var2 == null ? 0 : x1Var2.hashCode())) * 31;
        o oVar2 = this.f177821j;
        return iHashCode9 + (oVar2 != null ? Boolean.hashCode(oVar2.f177813a) : 0);
    }

    public /* synthetic */ p(int i, h1 h1Var, k1 k1Var, n1 n1Var, k0 k0Var, q1 q1Var, o oVar, t1 t1Var, x1 x1Var, x1 x1Var2, o oVar2) {
        if ((i & 1) == 0) {
            this.f177816a = null;
        } else {
            this.f177816a = h1Var;
        }
        if ((i & 2) == 0) {
            this.f177817b = null;
        } else {
            this.f177817b = k1Var;
        }
        if ((i & 4) == 0) {
            this.f177818c = null;
        } else {
            this.f177818c = n1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = k0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = q1Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = oVar;
        }
        if ((i & 64) == 0) {
            this.f177819g = null;
        } else {
            this.f177819g = t1Var;
        }
        if ((i & 128) == 0) {
            this.f177820h = null;
        } else {
            this.f177820h = x1Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = x1Var2;
        }
        if ((i & 512) == 0) {
            this.f177821j = null;
        } else {
            this.f177821j = oVar2;
        }
    }
}
