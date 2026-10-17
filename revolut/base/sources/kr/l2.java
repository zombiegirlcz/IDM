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
public final /* synthetic */ class l2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l2 f188524a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l2 l2Var = new l2();
        f188524a = l2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.media.BiometricVerificationVideoImuDataArtifactDto.ImuSample", l2Var, 14);
        pluginGeneratedSerialDescriptor.j("timestamp", false);
        pluginGeneratedSerialDescriptor.j("qx", false);
        pluginGeneratedSerialDescriptor.j("qy", false);
        pluginGeneratedSerialDescriptor.j("qz", false);
        pluginGeneratedSerialDescriptor.j("qw", false);
        pluginGeneratedSerialDescriptor.j("rx", false);
        pluginGeneratedSerialDescriptor.j("ry", false);
        pluginGeneratedSerialDescriptor.j("rz", false);
        pluginGeneratedSerialDescriptor.j("ax", false);
        pluginGeneratedSerialDescriptor.j("ay", false);
        pluginGeneratedSerialDescriptor.j("az", false);
        pluginGeneratedSerialDescriptor.j("gx", false);
        pluginGeneratedSerialDescriptor.j("gy", false);
        pluginGeneratedSerialDescriptor.j("gz", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.x xVar = qlm.x.f247723a;
        return new KSerializer[]{qlm.t0.f247706a, xVar, xVar, xVar, xVar, xVar, xVar, xVar, xVar, xVar, xVar, xVar, xVar, xVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        long jDecodeLongElement = 0;
        double dDecodeDoubleElement = 0.0d;
        double dDecodeDoubleElement2 = 0.0d;
        double dDecodeDoubleElement3 = 0.0d;
        double dDecodeDoubleElement4 = 0.0d;
        double dDecodeDoubleElement5 = 0.0d;
        double dDecodeDoubleElement6 = 0.0d;
        double dDecodeDoubleElement7 = 0.0d;
        double dDecodeDoubleElement8 = 0.0d;
        double dDecodeDoubleElement9 = 0.0d;
        double dDecodeDoubleElement10 = 0.0d;
        double dDecodeDoubleElement11 = 0.0d;
        double dDecodeDoubleElement12 = 0.0d;
        double dDecodeDoubleElement13 = 0.0d;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    dDecodeDoubleElement2 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    dDecodeDoubleElement3 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    dDecodeDoubleElement4 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    dDecodeDoubleElement5 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    dDecodeDoubleElement6 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    dDecodeDoubleElement7 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    dDecodeDoubleElement8 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    dDecodeDoubleElement9 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    dDecodeDoubleElement10 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    dDecodeDoubleElement11 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    dDecodeDoubleElement12 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 12);
                    i |= 4096;
                    break;
                case 13:
                    dDecodeDoubleElement13 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 13);
                    i |= 8192;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n2(i, jDecodeLongElement, dDecodeDoubleElement, dDecodeDoubleElement2, dDecodeDoubleElement3, dDecodeDoubleElement4, dDecodeDoubleElement5, dDecodeDoubleElement6, dDecodeDoubleElement7, dDecodeDoubleElement8, dDecodeDoubleElement9, dDecodeDoubleElement10, dDecodeDoubleElement11, dDecodeDoubleElement12, dDecodeDoubleElement13);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n2 value = (n2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f188540a);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 1, value.f188541b);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 2, value.f188542c);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 6, value.f188543g);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 7, value.f188544h);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 9, value.f188545j);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 11, value.f188546l);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 12, value.f188547m);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 13, value.f188548n);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
