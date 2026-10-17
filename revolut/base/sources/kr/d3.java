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
public final /* synthetic */ class d3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d3 f188480a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d3 d3Var = new d3();
        f188480a = d3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.media.BiometricVerificationYuvRectDto", d3Var, 4);
        pluginGeneratedSerialDescriptor.j("left", false);
        pluginGeneratedSerialDescriptor.j("top", false);
        pluginGeneratedSerialDescriptor.j("right", false);
        pluginGeneratedSerialDescriptor.j("bottom", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d3() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{n0Var, n0Var, n0Var, n0Var};
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
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                iDecodeIntElement4 = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f3(i, iDecodeIntElement, iDecodeIntElement2, iDecodeIntElement3, iDecodeIntElement4);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f3 value = (f3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f188495a);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f188496b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f188497c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
