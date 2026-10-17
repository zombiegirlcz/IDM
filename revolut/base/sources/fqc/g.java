package fqc;

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
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f137245a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f137245a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.salary_switch.impl.models.dto.salary_switch.dispute.SalaryDisputeResponseDto", gVar, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("disputeReason", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("resolvedAt", true);
        pluginGeneratedSerialDescriptor.j("resolutionReason", true);
        pluginGeneratedSerialDescriptor.j("failureReason", true);
        pluginGeneratedSerialDescriptor.j("expectedResolutionDate", true);
        pluginGeneratedSerialDescriptor.j("externalRef", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private g() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        t0 t0Var = t0.f247706a;
        return new KSerializer[]{v1Var, v1Var, v1Var, t0Var, nlm.a.c(t0Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(t0Var), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String str = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        Long l2 = null;
        String str2 = null;
        long jDecodeLongElement = 0;
        boolean z = true;
        int i = 0;
        Long l3 = null;
        String str3 = null;
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
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, t0.f247706a, l2);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str2);
                    i |= 32;
                    break;
                case 6:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str);
                    i |= 64;
                    break;
                case 7:
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, t0.f247706a, l3);
                    i |= 128;
                    break;
                case 8:
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str3);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, jDecodeLongElement, l2, str2, str, l3, str3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        i value = (i) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f137246a;
        String str2 = value.i;
        Long l2 = value.f137250h;
        String str3 = value.f137249g;
        String str4 = value.f;
        Long l3 = value.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f137247b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f137248c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, t0.f247706a, l3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str3);
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
