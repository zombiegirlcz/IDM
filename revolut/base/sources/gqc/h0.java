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
public final /* synthetic */ class h0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f145635a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h0 h0Var = new h0();
        f145635a = h0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.salary_switch.impl.models.dto.salary_switch.v2.PayrollSwitchResponseV2Dto", h0Var, 14);
        pluginGeneratedSerialDescriptor.j("scheme", false);
        pluginGeneratedSerialDescriptor.j("sourceAgent", false);
        pluginGeneratedSerialDescriptor.j("bankName", true);
        pluginGeneratedSerialDescriptor.j("applicationNumber", true);
        pluginGeneratedSerialDescriptor.j("account", true);
        pluginGeneratedSerialDescriptor.j("externalId", true);
        pluginGeneratedSerialDescriptor.j("employer", true);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("submittedAt", true);
        pluginGeneratedSerialDescriptor.j("estimatedCompletionAt", true);
        pluginGeneratedSerialDescriptor.j("completedAt", true);
        pluginGeneratedSerialDescriptor.j("failedAt", true);
        pluginGeneratedSerialDescriptor.j("failureReason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        KSerializer kSerializerC3 = nlm.a.c(d.f145622a);
        KSerializer kSerializerC4 = nlm.a.c(v1Var);
        KSerializer kSerializerC5 = nlm.a.c(p.f145659a);
        t0 t0Var = t0.f247706a;
        return new KSerializer[]{v1Var, y.f145671a, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, v1Var, t0Var, nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Long l2 = null;
        Long l3 = null;
        String str2 = null;
        String strDecodeStringElement = null;
        a0 a0Var = null;
        String str3 = null;
        String str4 = null;
        f fVar = null;
        String str5 = null;
        r rVar = null;
        String strDecodeStringElement2 = null;
        long jDecodeLongElement = 0;
        int i = 0;
        boolean z = true;
        Long l4 = null;
        Long l5 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i |= 1;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    continue;
                case 1:
                    str = strDecodeStringElement;
                    a0Var = (a0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, y.f145671a, a0Var);
                    i |= 2;
                    break;
                case 2:
                    str = strDecodeStringElement;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
                    i |= 4;
                    break;
                case 3:
                    str = strDecodeStringElement;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str4);
                    i |= 8;
                    break;
                case 4:
                    str = strDecodeStringElement;
                    fVar = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, d.f145622a, fVar);
                    i |= 16;
                    break;
                case 5:
                    str = strDecodeStringElement;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str5);
                    i |= 32;
                    break;
                case 6:
                    str = strDecodeStringElement;
                    rVar = (r) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, p.f145659a, rVar);
                    i |= 64;
                    break;
                case 7:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 8);
                    i |= 256;
                    continue;
                case 9:
                    str = strDecodeStringElement;
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, t0.f247706a, l2);
                    i |= 512;
                    break;
                case 10:
                    str = strDecodeStringElement;
                    l4 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, t0.f247706a, l4);
                    i |= 1024;
                    break;
                case 11:
                    str = strDecodeStringElement;
                    l5 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, t0.f247706a, l5);
                    i |= 2048;
                    break;
                case 12:
                    str = strDecodeStringElement;
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, t0.f247706a, l3);
                    i |= 4096;
                    break;
                case 13:
                    str = strDecodeStringElement;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, v1.f247718a, str2);
                    i |= 8192;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            strDecodeStringElement = str;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j0(i, strDecodeStringElement, a0Var, str3, str4, fVar, str5, rVar, strDecodeStringElement2, jDecodeLongElement, l2, l4, l5, l3, str2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j0 value = (j0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f145640a;
        String str2 = value.f145648n;
        Long l2 = value.f145647m;
        Long l3 = value.f145646l;
        Long l4 = value.k;
        Long l5 = value.f145645j;
        r rVar = value.f145643g;
        String str3 = value.f;
        f fVar = value.e;
        String str4 = value.d;
        String str5 = value.f145642c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, y.f145671a, value.f145641b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || fVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, d.f145622a, fVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || rVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, p.f145659a, rVar);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f145644h);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 8, value.i);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, t0.f247706a, l5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, t0.f247706a, l4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, t0.f247706a, l3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, t0.f247706a, l2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
