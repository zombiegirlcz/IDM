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
public final /* synthetic */ class z0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f177880a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        z0 z0Var = new z0();
        f177880a = z0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.instructions.BiometricVerificationVisionResourceDto.FaceQualityResourceDto.Thresholds", z0Var, 11);
        pluginGeneratedSerialDescriptor.j("dark", false);
        pluginGeneratedSerialDescriptor.j("darkContour", false);
        pluginGeneratedSerialDescriptor.j("bright", false);
        pluginGeneratedSerialDescriptor.j("blur", false);
        pluginGeneratedSerialDescriptor.j("glare", false);
        pluginGeneratedSerialDescriptor.j("colorized", false);
        pluginGeneratedSerialDescriptor.j("fraud", false);
        pluginGeneratedSerialDescriptor.j("leftEye", false);
        pluginGeneratedSerialDescriptor.j("rightEye", false);
        pluginGeneratedSerialDescriptor.j("occluded", false);
        pluginGeneratedSerialDescriptor.j("sunglasses", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private z0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.e0 e0Var = qlm.e0.f247634a;
        return new KSerializer[]{e0Var, e0Var, e0Var, e0Var, e0Var, e0Var, e0Var, e0Var, e0Var, e0Var, e0Var};
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
        float fDecodeFloatElement5 = 0.0f;
        float fDecodeFloatElement6 = 0.0f;
        float fDecodeFloatElement7 = 0.0f;
        float fDecodeFloatElement8 = 0.0f;
        float fDecodeFloatElement9 = 0.0f;
        float fDecodeFloatElement10 = 0.0f;
        float fDecodeFloatElement11 = 0.0f;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    fDecodeFloatElement = dVarBeginStructure.decodeFloatElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    fDecodeFloatElement2 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    fDecodeFloatElement3 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    fDecodeFloatElement4 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    fDecodeFloatElement5 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    fDecodeFloatElement6 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    fDecodeFloatElement7 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    fDecodeFloatElement8 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    fDecodeFloatElement9 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    fDecodeFloatElement10 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    fDecodeFloatElement11 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new b1(i, fDecodeFloatElement, fDecodeFloatElement2, fDecodeFloatElement3, fDecodeFloatElement4, fDecodeFloatElement5, fDecodeFloatElement6, fDecodeFloatElement7, fDecodeFloatElement8, fDecodeFloatElement9, fDecodeFloatElement10, fDecodeFloatElement11);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        b1 value = (b1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 0, value.f177764a);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 1, value.f177765b);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 2, value.f177766c);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 6, value.f177767g);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 7, value.f177768h);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 9, value.f177769j);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
