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
public final /* synthetic */ class v1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f177857a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v1 v1Var = new v1();
        f177857a = v1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.instructions.WatermarkSettingsDto", v1Var, 5);
        pluginGeneratedSerialDescriptor.j("enabled", false);
        pluginGeneratedSerialDescriptor.j("clusterSize", true);
        pluginGeneratedSerialDescriptor.j("brightnessDelta", true);
        pluginGeneratedSerialDescriptor.j("inset", true);
        pluginGeneratedSerialDescriptor.j("tokenBitsCount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{qlm.h.f247648a, n0Var, qlm.e0.f247634a, n0Var, n0Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        int iDecodeIntElement3 = 0;
        boolean zDecodeBooleanElement = false;
        float fDecodeFloatElement = 0.0f;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                fDecodeFloatElement = dVarBeginStructure.decodeFloatElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                iDecodeIntElement3 = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x1(i, iDecodeIntElement, iDecodeIntElement2, iDecodeIntElement3, zDecodeBooleanElement, fDecodeFloatElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x1 value = (x1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        boolean z = value.f177866a;
        int i = value.e;
        int i2 = value.d;
        float f = value.f177868c;
        int i3 = value.f177867b;
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || i3 != 4) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, i3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || Float.compare(f, 0.05f) != 0) {
            compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 2, f);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || i2 != 5) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, i2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || i != 32) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, i);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
