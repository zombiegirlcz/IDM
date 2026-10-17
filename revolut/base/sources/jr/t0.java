package jr;

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
public final /* synthetic */ class t0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f177844a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        t0 t0Var = new t0();
        f177844a = t0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.instructions.BiometricVerificationVisionResourceDto.DocumentQualityResourceDto.Thresholds", t0Var, 4);
        pluginGeneratedSerialDescriptor.j("blur", false);
        pluginGeneratedSerialDescriptor.j("dark", false);
        pluginGeneratedSerialDescriptor.j("bright", false);
        pluginGeneratedSerialDescriptor.j("glare", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private t0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.e0 e0Var = qlm.e0.f247634a;
        return new KSerializer[]{e0Var, e0Var, e0Var, e0Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        float fDecodeFloatElement = 0.0f;
        float fDecodeFloatElement2 = 0.0f;
        float fDecodeFloatElement3 = 0.0f;
        float fDecodeFloatElement4 = 0.0f;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                fDecodeFloatElement = dVarBeginStructure.decodeFloatElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                fDecodeFloatElement2 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                fDecodeFloatElement3 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                fDecodeFloatElement4 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 3);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new v0(i, fDecodeFloatElement, fDecodeFloatElement2, fDecodeFloatElement3, fDecodeFloatElement4);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        v0 value = (v0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 0, value.f177854a);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 1, value.f177855b);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 2, value.f177856c);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
