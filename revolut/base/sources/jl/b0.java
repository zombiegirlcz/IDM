package jl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes17.dex */
public final class b0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f175523a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        b0 b0Var = new b0();
        f175523a = b0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.workflow.internal.network.DocumentUploadTaskConfig", b0Var, 2);
        pluginGeneratedSerialDescriptor.j("nfc_options", true);
        pluginGeneratedSerialDescriptor.j("document_selection", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(g0.f175536a), k0.f175548c[1]};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = k0.f175548c;
        dVarBeginStructure.getClass();
        j0 j0Var = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iD = dVarBeginStructure.d(pluginGeneratedSerialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                j0Var = (j0) dVarBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, g0.f175536a, j0Var);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                list = (List) dVarBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new k0(i, j0Var, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k0 value = (k0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = k0.f175548c;
        if (compositeEncoderBeginStructure.d(pluginGeneratedSerialDescriptor) || value.f175549a != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, g0.f175536a, value.f175549a);
        }
        if (compositeEncoderBeginStructure.d(pluginGeneratedSerialDescriptor) || !Intrinsics.f(value.f175550b, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], value.f175550b);
        }
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // qlm.f0
    public final KSerializer[] typeParametersSerializers() {
        return qlm.j1.f247666a;
    }
}
