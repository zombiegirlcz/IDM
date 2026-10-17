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
public final /* synthetic */ class j0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f188513a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j0 j0Var = new j0();
        f188513a = j0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.media.BiometricVerificationImuDataExtraMetadataDto", j0Var, 3);
        pluginGeneratedSerialDescriptor.j("imu_collection", false);
        pluginGeneratedSerialDescriptor.j("stepId", true);
        pluginGeneratedSerialDescriptor.j("attemptIndex", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{g0.f188499a, nlm.a.c(qlm.v1.f247718a), nlm.a.c(qlm.n0.f247680a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        i0 i0Var = null;
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                i0Var = (i0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, g0.f188499a, i0Var);
                i |= 1;
            } else if (iD == 1) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.n0.f247680a, num);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l0(i, i0Var, str, num);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l0 value = (l0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, g0.f188499a, value.f188521a);
        String str = value.f188522b;
        if (str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
        }
        Integer num = value.f188523c;
        if (num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.n0.f247680a, num);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
