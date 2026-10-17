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
import qlm.v1;

/* JADX INFO: loaded from: classes17.dex */
public final class m1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f175556a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        m1 m1Var = new m1();
        f175556a = m1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.workflow.internal.network.WorkflowResponse", m1Var, 4);
        pluginGeneratedSerialDescriptor.j("current_applicant_task", false);
        pluginGeneratedSerialDescriptor.j("interactive_tasks_status", false);
        pluginGeneratedSerialDescriptor.j("remaining_applicant_tasks", true);
        pluginGeneratedSerialDescriptor.j("workflow_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(p.f175564a), o0.f175560a, o1.e[2], nlm.a.c(v1.f247718a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = o1.e;
        dVarBeginStructure.getClass();
        int i = 0;
        r rVar = null;
        q0 q0Var = null;
        List list = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(pluginGeneratedSerialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                rVar = (r) dVarBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, p.f175564a, rVar);
                i |= 1;
            } else if (iD == 1) {
                q0Var = (q0) dVarBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, o0.f175560a, q0Var);
                i |= 2;
            } else if (iD == 2) {
                list = (List) dVarBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, v1.f247718a, str);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new o1(i, rVar, q0Var, list, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        o1 value = (o1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = o1.e;
        p pVar = p.f175564a;
        r rVar = value.f175561a;
        String str = value.d;
        List list = value.f175563c;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, pVar, rVar);
        compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, o0.f175560a, value.f175562b);
        if (compositeEncoderBeginStructure.d(pluginGeneratedSerialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
        }
        if (compositeEncoderBeginStructure.d(pluginGeneratedSerialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, v1.f247718a, str);
        }
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // qlm.f0
    public final KSerializer[] typeParametersSerializers() {
        return qlm.j1.f247666a;
    }
}
