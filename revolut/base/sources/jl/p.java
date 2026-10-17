package jl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import qlm.v1;

/* JADX INFO: loaded from: classes17.dex */
public final class p implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f175564a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        p pVar = new p();
        f175564a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.workflow.internal.network.CurrentApplicantTask", pVar, 4);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("task_def_id", false);
        pluginGeneratedSerialDescriptor.j("config", true);
        pluginGeneratedSerialDescriptor.j("input", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        rlm.v vVar = rlm.v.f255125a;
        KSerializer kSerializerC = nlm.a.c(vVar);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, vVar, kSerializerC};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        JsonObject jsonObject = null;
        JsonObject jsonObject2 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(pluginGeneratedSerialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                jsonObject = (JsonObject) dVarBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, rlm.v.f255125a, jsonObject);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                jsonObject2 = (JsonObject) dVarBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, rlm.v.f255125a, jsonObject2);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new r(i, strDecodeStringElement, strDecodeStringElement2, jsonObject, jsonObject2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        r value = (r) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        String str = value.f175565a;
        JsonObject jsonObject = value.d;
        JsonObject jsonObject2 = value.f175567c;
        compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, value.f175566b);
        if (compositeEncoderBeginStructure.d(pluginGeneratedSerialDescriptor) || !Intrinsics.f(jsonObject2, new JsonObject(zhm.r0.g()))) {
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, rlm.v.f255125a, jsonObject2);
        }
        if (compositeEncoderBeginStructure.d(pluginGeneratedSerialDescriptor) || !Intrinsics.f(jsonObject, new JsonObject(zhm.r0.g()))) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, rlm.v.f255125a, jsonObject);
        }
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // qlm.f0
    public final KSerializer[] typeParametersSerializers() {
        return qlm.j1.f247666a;
    }
}
