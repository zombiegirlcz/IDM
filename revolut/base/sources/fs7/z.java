package fs7;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f137655a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        z zVar = new z();
        f137655a = zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DETAILS", zVar, 1);
        pluginGeneratedSerialDescriptor.j("details", false);
        pluginGeneratedSerialDescriptor.l(new bka.b(19));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private z() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{a.f137615a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        u uVar = null;
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
                uVar = (u) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.f137615a, uVar);
                i = 1;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new b0(i, uVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        b0 value = (b0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        a0 a0Var = b0.Companion;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, a.f137615a, value.f137616b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
