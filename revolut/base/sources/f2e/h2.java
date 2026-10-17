package f2e;

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
public final /* synthetic */ class h2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2 f131612a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h2 h2Var = new h2();
        f131612a = h2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.MapBoxDto", h2Var, 2);
        pluginGeneratedSerialDescriptor.j("topLeft", false);
        pluginGeneratedSerialDescriptor.j("bottomRight", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f131710a;
        return new KSerializer[]{s1Var, s1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        u1 u1Var = null;
        boolean z = true;
        int i = 0;
        u1 u1Var2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                u1Var = (u1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, s1.f131710a, u1Var);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                u1Var2 = (u1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, s1.f131710a, u1Var2);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j2(i, u1Var, u1Var2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j2 value = (j2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        s1 s1Var = s1.f131710a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, s1Var, value.f131632a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, s1Var, value.f131633b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
