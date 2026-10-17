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
public final /* synthetic */ class s implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f135793a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        s sVar = new s();
        f135793a = sVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("TODO_FINCRIME_NPS", sVar, 2);
        pluginGeneratedSerialDescriptor.j("metaInformation", false);
        pluginGeneratedSerialDescriptor.j("content", false);
        Intrinsics.checkNotNullParameter("contentType", "discriminator");
        pluginGeneratedSerialDescriptor.l(new bka.b(15, false));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private s() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{t0.f135795a, u.f135796a};
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
        w wVar = null;
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
                wVar = (w) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, u.f135796a, wVar);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x(i, v0Var, wVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x value = (x) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, t0.f135795a, value.f135802a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, u.f135796a, value.f135803b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
