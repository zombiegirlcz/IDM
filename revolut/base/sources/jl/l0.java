package jl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes17.dex */
public final class l0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f175553a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        l0 l0Var = new l0();
        f175553a = l0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.workflow.internal.network.FaceVideoTaskConfig", l0Var, 2);
        pluginGeneratedSerialDescriptor.j("show_intro", false);
        pluginGeneratedSerialDescriptor.j("show_video_confirmation", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{hVar, hVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        dVarBeginStructure.getClass();
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
        while (z) {
            int iD = dVarBeginStructure.d(pluginGeneratedSerialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new n0(i, zDecodeBooleanElement, zDecodeBooleanElement2);
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
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        compositeEncoderBeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 0, value.f175557a);
        compositeEncoderBeginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 1, value.f175558b);
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // qlm.f0
    public final KSerializer[] typeParametersSerializers() {
        return qlm.j1.f247666a;
    }
}
