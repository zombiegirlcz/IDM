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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ljr/q0;", "Ljr/d1;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class q0 implements d1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f177828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f177829c;
    public final float d;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f177830a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f177830a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DOCUMENT_CORNERS_REV_VISION", aVar, 4);
            pluginGeneratedSerialDescriptor.j("modelUrl", false);
            pluginGeneratedSerialDescriptor.j("modelChecksum", false);
            pluginGeneratedSerialDescriptor.j("documentCornerRadius", false);
            pluginGeneratedSerialDescriptor.j("documentCornerConfidence", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            qlm.e0 e0Var = qlm.e0.f247634a;
            return new KSerializer[]{v1Var, v1Var, e0Var, e0Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            float fDecodeFloatElement = 0.0f;
            float fDecodeFloatElement2 = 0.0f;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    fDecodeFloatElement = dVarBeginStructure.decodeFloatElement(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    fDecodeFloatElement2 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 3);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new q0(i, strDecodeStringElement, strDecodeStringElement2, fDecodeFloatElement, fDecodeFloatElement2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            q0 value = (q0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f177827a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f177828b);
            compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 2, value.f177829c);
            compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 3, value.d);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: jr.q0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f177830a;
        }
    }

    public /* synthetic */ q0(int i, String str, String str2, float f, float f4) {
        if (15 != (i & 15)) {
            qlm.j1.f(a.f177830a.getDescriptor(), i, 15);
            throw null;
        }
        this.f177827a = str;
        this.f177828b = str2;
        this.f177829c = f;
        this.d = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f177827a, q0Var.f177827a) && Intrinsics.f(this.f177828b, q0Var.f177828b) && Float.compare(this.f177829c, q0Var.f177829c) == 0 && Float.compare(this.d, q0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f177829c, p.a.c(this.f177827a.hashCode() * 31, 31, this.f177828b), 31);
    }
}
