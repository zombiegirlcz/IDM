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
public final /* synthetic */ class i1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f177795a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i1 i1Var = new i1();
        f177795a = i1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.instructions.CheckBDto", i1Var, 4);
        pluginGeneratedSerialDescriptor.j("enabled", false);
        pluginGeneratedSerialDescriptor.j("timeout", false);
        pluginGeneratedSerialDescriptor.j("minFramesToDrop", false);
        pluginGeneratedSerialDescriptor.j("maxFrameWaitTime", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.t0 t0Var = qlm.t0.f247706a;
        return new KSerializer[]{qlm.h.f247648a, nlm.a.c(t0Var), nlm.a.c(qlm.n0.f247680a), nlm.a.c(t0Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        Long l2 = null;
        Integer num = null;
        Long l3 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.t0.f247706a, l2);
                i |= 2;
            } else if (iD == 2) {
                num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.n0.f247680a, num);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.t0.f247706a, l3);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k1(i, zDecodeBooleanElement, l2, num, l3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k1 value = (k1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, value.f177800a);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, t0Var, value.f177801b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.n0.f247680a, value.f177802c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, t0Var, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
