package gu7;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f146861a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        x0 x0Var = new x0();
        f146861a = x0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("HIDDEN_PHONE", x0Var, 1);
        pluginGeneratedSerialDescriptor.j("hiddenPhone", false);
        pluginGeneratedSerialDescriptor.l(new bka.b(25));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private x0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{c1.f146721a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        e1 e1Var = null;
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
                e1Var = (e1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, c1.f146721a, e1Var);
                i = 1;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new com.revolut.feature.insurance_embedded.impl.data.model.b0(i, e1Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        com.revolut.feature.insurance_embedded.impl.data.model.b0 value = (com.revolut.feature.insurance_embedded.impl.data.model.b0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        y0 y0Var = com.revolut.feature.insurance_embedded.impl.data.model.b0.Companion;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c1.f146721a, value.f75977b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
