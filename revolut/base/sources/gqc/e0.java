package gqc;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f145626a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e0 e0Var = new e0();
        f145626a = e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.salary_switch.impl.models.dto.salary_switch.v2.PayrollSwitchListItemV2Dto", e0Var, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("submittedAt", true);
        pluginGeneratedSerialDescriptor.j("bankName", true);
        pluginGeneratedSerialDescriptor.j("employer", true);
        pluginGeneratedSerialDescriptor.j("completedAt", true);
        pluginGeneratedSerialDescriptor.j("failedAt", true);
        pluginGeneratedSerialDescriptor.j("failureReason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        t0 t0Var = t0.f247706a;
        return new KSerializer[]{v1Var, v1Var, t0Var, nlm.a.c(t0Var), nlm.a.c(v1Var), nlm.a.c(p.f145659a), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Long l2 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        Long l3 = null;
        String str = null;
        r rVar = null;
        long jDecodeLongElement = 0;
        boolean z = true;
        int i = 0;
        Long l4 = null;
        String str2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, t0.f247706a, l3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str);
                    i |= 16;
                    break;
                case 5:
                    rVar = (r) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, p.f145659a, rVar);
                    i |= 32;
                    break;
                case 6:
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, t0.f247706a, l2);
                    i |= 64;
                    break;
                case 7:
                    l4 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, t0.f247706a, l4);
                    i |= 128;
                    break;
                case 8:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str2);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g0(i, strDecodeStringElement, strDecodeStringElement2, jDecodeLongElement, l3, str, rVar, l2, l4, str2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g0 value = (g0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f145630a;
        String str2 = value.i;
        Long l2 = value.f145634h;
        Long l3 = value.f145633g;
        r rVar = value.f;
        String str3 = value.e;
        Long l4 = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f145631b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.f145632c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, t0.f247706a, l4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || rVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, p.f145659a, rVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, t0.f247706a, l3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, t0.f247706a, l2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
