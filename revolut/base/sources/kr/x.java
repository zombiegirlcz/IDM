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
public final /* synthetic */ class x implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f188604a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        x xVar = new x();
        f188604a = xVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.media.BiometricVerificationFrameStatDto", xVar, 5);
        pluginGeneratedSerialDescriptor.j("frame_id", false);
        pluginGeneratedSerialDescriptor.j("frame_width", false);
        pluginGeneratedSerialDescriptor.j("frame_height", false);
        pluginGeneratedSerialDescriptor.j("face_bounding_box", false);
        pluginGeneratedSerialDescriptor.j("quality_net_results", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private x() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(p.f188554a);
        KSerializer kSerializerC2 = nlm.a.c(k1.f188517a);
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{qlm.t0.f247706a, n0Var, n0Var, kSerializerC, kSerializerC2};
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
        long jDecodeLongElement = 0;
        r rVar = null;
        m1 m1Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                rVar = (r) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, p.f188554a, rVar);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                m1Var = (m1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, k1.f188517a, m1Var);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new z(i, jDecodeLongElement, iDecodeIntElement, iDecodeIntElement2, rVar, m1Var);
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
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f188611a);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f188612b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f188613c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, p.f188554a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, k1.f188517a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
