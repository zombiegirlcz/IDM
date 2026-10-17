package jl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import qlm.v1;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f175541a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        i iVar = new i();
        f175541a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.workflow.internal.network.CompleteTaskRequest.CompletionMetaData", iVar, 2);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iD = dVarBeginStructure.d(pluginGeneratedSerialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, v1.f247718a, str);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new k(i, strDecodeStringElement, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k value = (k) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        String str = value.f175546a;
        String str2 = value.f175547b;
        compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(pluginGeneratedSerialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // qlm.f0
    public final KSerializer[] typeParametersSerializers() {
        return qlm.j1.f247666a;
    }
}
