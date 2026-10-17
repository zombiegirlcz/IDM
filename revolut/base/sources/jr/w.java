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
public final /* synthetic */ class w implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f177858a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        w wVar = new w();
        f177858a = wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.instructions.BiometricVerificationPreviewlessSelfieFallbackDto", wVar, 4);
        pluginGeneratedSerialDescriptor.j("maxAttempts", false);
        pluginGeneratedSerialDescriptor.j("manualFallbackTimeout", false);
        pluginGeneratedSerialDescriptor.j("photoSettings", true);
        pluginGeneratedSerialDescriptor.j("video", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private w() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qlm.n0.f247680a, qlm.t0.f247706a, nlm.a.c(t.f177843a), nlm.a.c(l0.f177804a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        long jDecodeLongElement = 0;
        v vVar = null;
        n0 n0Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                vVar = (v) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, t.f177843a, vVar);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                n0Var = (n0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, l0.f177804a, n0Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new y(i, iDecodeIntElement, jDecodeLongElement, vVar, n0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        y value = (y) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        int i = value.f177869a;
        n0 n0Var = value.d;
        v vVar = value.f177871c;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, i);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.f177870b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || vVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, t.f177843a, vVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || n0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, l0.f177804a, n0Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
