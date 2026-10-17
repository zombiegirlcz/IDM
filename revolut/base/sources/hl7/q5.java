package hl7;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kr7.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q5 f153267a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q5 q5Var = new q5();
        f153267a = q5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.MtaStateResponse", q5Var, 8);
        pluginGeneratedSerialDescriptor.j("mtaId", false);
        pluginGeneratedSerialDescriptor.j("applicationId", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("effectiveFromDateTime", false);
        pluginGeneratedSerialDescriptor.j("effectiveToDateTime", false);
        pluginGeneratedSerialDescriptor.j("quote", false);
        pluginGeneratedSerialDescriptor.j("suitabilityStatement", false);
        pluginGeneratedSerialDescriptor.j("cancellationReason", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private q5() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(k5.f153170a), nlm.a.c(a.C1069a.f188668a), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String str = null;
        m5 m5Var = null;
        kr7.a aVar = null;
        String str2 = null;
        boolean z = true;
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
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str);
                    i |= 16;
                    break;
                case 5:
                    m5Var = (m5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, k5.f153170a, m5Var);
                    i |= 32;
                    break;
                case 6:
                    aVar = (kr7.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, a.C1069a.f188668a, aVar);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str2);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new s5(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, str, m5Var, aVar, str2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        s5 value = (s5) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f153298a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f153299b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f153300c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, k5.f153170a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, a.C1069a.f188668a, value.f153301g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, value.f153302h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
