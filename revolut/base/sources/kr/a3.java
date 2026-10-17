package kr;

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
public final /* synthetic */ class a3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a3 f188458a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a3 a3Var = new a3();
        f188458a = a3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.media.BiometricVerificationYuvPlaneDto", a3Var, 5);
        pluginGeneratedSerialDescriptor.j("rowStride", false);
        pluginGeneratedSerialDescriptor.j("pixelStride", false);
        pluginGeneratedSerialDescriptor.j("sourceBufferPosition", false);
        pluginGeneratedSerialDescriptor.j("sourceBufferLimit", false);
        pluginGeneratedSerialDescriptor.j("byteCount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a3() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{n0Var, n0Var, n0Var, n0Var, n0Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        int iDecodeIntElement3 = 0;
        int iDecodeIntElement4 = 0;
        int iDecodeIntElement5 = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                iDecodeIntElement3 = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                iDecodeIntElement4 = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                iDecodeIntElement5 = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c3(i, iDecodeIntElement, iDecodeIntElement2, iDecodeIntElement3, iDecodeIntElement4, iDecodeIntElement5);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c3 value = (c3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f188471a);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f188472b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f188473c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
