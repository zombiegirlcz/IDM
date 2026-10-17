package bka;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f16303a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c0 c0Var = new c0();
        f16303a = c0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("HERO", c0Var, 1);
        pluginGeneratedSerialDescriptor.j("content", false);
        Intrinsics.checkNotNullParameter("type", "discriminator");
        pluginGeneratedSerialDescriptor.l(new b(3, false));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private c0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e0.f16308a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        g0 g0Var = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else {
                if (iD != 0) {
                    throw new UnknownFieldException(iD);
                }
                g0Var = (g0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, e0.f16308a, g0Var);
                i = 1;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l0(i, g0Var);
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
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, e0.f16308a, value.f16325a);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
