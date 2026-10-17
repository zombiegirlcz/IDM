package kr;

import java.util.List;
import kotlin.Lazy;
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
public final /* synthetic */ class f2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f188494a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        f2 f2Var = new f2();
        f188494a = f2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.media.BiometricVerificationVideoImuDataArtifactDto", f2Var, 5);
        pluginGeneratedSerialDescriptor.j("session_id", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("video_capture_duration_nanoseconds", false);
        pluginGeneratedSerialDescriptor.j("video_frame_timestamps_nanoseconds", false);
        pluginGeneratedSerialDescriptor.j("imu_raw_data", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private f2() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = q2.f;
        return new KSerializer[]{qlm.v1.f247718a, lazyArr[1].getValue(), qlm.t0.f247706a, lazyArr[3].getValue(), i2.f188510a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = q2.f;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        p2 p2Var = null;
        List list = null;
        k2 k2Var = null;
        long jDecodeLongElement = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                p2Var = (p2) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), p2Var);
                i |= 2;
            } else if (iD == 2) {
                jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                k2Var = (k2) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, i2.f188510a, k2Var);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new q2(i, strDecodeStringElement, p2Var, jDecodeLongElement, list, k2Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q2 value = (q2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = q2.f;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f188562a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f188563b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.f188564c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, i2.f188510a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
