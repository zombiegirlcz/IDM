package hl7;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f153360a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        x0 x0Var = new x0();
        f153360a = x0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.CarVariationDto", x0Var, 10);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("abiCode", false);
        pluginGeneratedSerialDescriptor.j("modelType", false);
        pluginGeneratedSerialDescriptor.j("bodyType", false);
        pluginGeneratedSerialDescriptor.j("doors", false);
        pluginGeneratedSerialDescriptor.j("engineCapacityCc", false);
        pluginGeneratedSerialDescriptor.j("fuelType", false);
        pluginGeneratedSerialDescriptor.j("transmissionType", false);
        pluginGeneratedSerialDescriptor.j("productionStartYear", false);
        pluginGeneratedSerialDescriptor.j("productionFinishYear", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private x0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{v1Var, v1Var, kSerializerC, kSerializerC2, nlm.a.c(n0Var), nlm.a.c(n0Var), nlm.a.c(v1Var), nlm.a.c(v1Var), n0Var, nlm.a.c(n0Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Integer num = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str = null;
        String str2 = null;
        Integer num2 = null;
        Integer num3 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str2);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, num2);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.n0.f247680a, num3);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str4);
                    i |= 128;
                    break;
                case 8:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.n0.f247680a, num);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new z0(i, strDecodeStringElement, strDecodeStringElement2, str, str2, num2, num3, str3, str4, iDecodeIntElement, num);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        z0 value = (z0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f153384a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f153385b);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f153386c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        qlm.n0 n0Var = qlm.n0.f247680a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, n0Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, n0Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f153387g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, value.f153388h);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, n0Var, value.f153389j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
