package fkd;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f135765a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g0 g0Var = new g0();
        f135765a = g0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("TODO_PROGRESS_TILE", g0Var, 2);
        pluginGeneratedSerialDescriptor.j("metaInformation", false);
        pluginGeneratedSerialDescriptor.j("content", false);
        Intrinsics.checkNotNullParameter("contentType", "discriminator");
        pluginGeneratedSerialDescriptor.l(new bka.b(17, false));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private g0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{t0.f135795a, l0.f135773a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        v0 v0Var = null;
        boolean z = true;
        int i = 0;
        n0 n0Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                v0Var = (v0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, t0.f135795a, v0Var);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                n0Var = (n0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, l0.f135773a, n0Var);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new r0(i, v0Var, n0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        r0 value = (r0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, t0.f135795a, value.f135791a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, l0.f135773a, value.f135792b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
