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
public final /* synthetic */ class l1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1 f177805a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l1 l1Var = new l1();
        f177805a = l1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.instructions.CheckCDto", l1Var, 5);
        pluginGeneratedSerialDescriptor.j("enabled", false);
        pluginGeneratedSerialDescriptor.j("timeout", false);
        pluginGeneratedSerialDescriptor.j("minFramesToDrop", false);
        pluginGeneratedSerialDescriptor.j("maxFrameWaitTime", false);
        pluginGeneratedSerialDescriptor.j("maxFramesToDrop", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.t0 t0Var = qlm.t0.f247706a;
        KSerializer kSerializerC = nlm.a.c(t0Var);
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{qlm.h.f247648a, kSerializerC, nlm.a.c(n0Var), nlm.a.c(t0Var), nlm.a.c(n0Var)};
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
        Integer num2 = null;
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
            } else if (iD == 3) {
                l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.t0.f247706a, l3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                num2 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, num2);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n1(i, zDecodeBooleanElement, l2, num, l3, num2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n1 value = (n1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, value.f177810a);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, t0Var, value.f177811b);
        qlm.n0 n0Var = qlm.n0.f247680a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, n0Var, value.f177812c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, t0Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, n0Var, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
