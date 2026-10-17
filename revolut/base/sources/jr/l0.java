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
public final /* synthetic */ class l0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f177804a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l0 l0Var = new l0();
        f177804a = l0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.instructions.BiometricVerificationVideoRequirementsDto", l0Var, 5);
        pluginGeneratedSerialDescriptor.j("duration", false);
        pluginGeneratedSerialDescriptor.j("verticalResolution", false);
        pluginGeneratedSerialDescriptor.j("bitrate", true);
        pluginGeneratedSerialDescriptor.j("recordAudio", false);
        pluginGeneratedSerialDescriptor.j("secret", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{qlm.t0.f247706a, n0Var, nlm.a.c(n0Var), qlm.h.f247648a, nlm.a.c(qlm.v1.f247718a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        boolean zDecodeBooleanElement = false;
        long jDecodeLongElement = 0;
        Integer num = null;
        String str = null;
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
                num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.n0.f247680a, num);
                i |= 4;
            } else if (iD == 3) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n0(i, jDecodeLongElement, iDecodeIntElement, num, zDecodeBooleanElement, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n0 value = (n0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        long j2 = value.f177807a;
        String str = value.e;
        Integer num = value.f177809c;
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, j2);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f177808b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.n0.f247680a, num);
        }
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
