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
public final /* synthetic */ class k0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f153166a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k0 k0Var = new k0();
        f153166a = k0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.CarDto", k0Var, 15);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("make", false);
        pluginGeneratedSerialDescriptor.j("model", false);
        pluginGeneratedSerialDescriptor.j("manufactureYear", false);
        pluginGeneratedSerialDescriptor.j("fuelType", false);
        pluginGeneratedSerialDescriptor.j("transmissionType", false);
        pluginGeneratedSerialDescriptor.j("registrationNumber", false);
        pluginGeneratedSerialDescriptor.j("engineCapacityCc", false);
        pluginGeneratedSerialDescriptor.j("roadWorthyCondition", false);
        pluginGeneratedSerialDescriptor.j("nctBooked", false);
        pluginGeneratedSerialDescriptor.j("manualInput", false);
        pluginGeneratedSerialDescriptor.j("shouldAskForNct", false);
        pluginGeneratedSerialDescriptor.j("estimatedCarValue", false);
        pluginGeneratedSerialDescriptor.j("effectiveFromDateTime", false);
        pluginGeneratedSerialDescriptor.j("effectiveToDateTime", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        qlm.n0 n0Var = qlm.n0.f247680a;
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        KSerializer kSerializerC3 = nlm.a.c(v1Var);
        KSerializer kSerializerC4 = nlm.a.c(v1Var);
        KSerializer kSerializerC5 = nlm.a.c(n0Var);
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{kSerializerC, v1Var, v1Var, n0Var, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, nlm.a.c(hVar), nlm.a.c(hVar), nlm.a.c(b5.f153034a), nlm.a.c(hVar), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Boolean bool = null;
        String str3 = null;
        String str4 = null;
        d5 d5Var = null;
        Boolean bool2 = null;
        String str5 = null;
        String strDecodeStringElement = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Integer num = null;
        Boolean bool3 = null;
        String strDecodeStringElement2 = null;
        int i = 0;
        boolean z = true;
        int iDecodeIntElement = 0;
        while (z) {
            String str10 = strDecodeStringElement;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str2 = str3;
                    z = false;
                    strDecodeStringElement = str10;
                    str3 = str2;
                    break;
                case 0:
                    str2 = str3;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str5);
                    i |= 1;
                    strDecodeStringElement = str10;
                    str3 = str2;
                    break;
                case 1:
                    str = str5;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                case 2:
                    str = str5;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    str5 = str;
                    break;
                case 3:
                    str = str5;
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i |= 8;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                case 4:
                    str = str5;
                    str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str7);
                    i |= 16;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                case 5:
                    str = str5;
                    str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str8);
                    i |= 32;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                case 6:
                    str = str5;
                    str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str9);
                    i |= 64;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                case 7:
                    str = str5;
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.n0.f247680a, num);
                    i |= 128;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                case 8:
                    str = str5;
                    bool3 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.h.f247648a, bool3);
                    i |= 256;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                case 9:
                    str = str5;
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.h.f247648a, bool);
                    i |= 512;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                case 10:
                    str = str5;
                    d5Var = (d5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, b5.f153034a, d5Var);
                    i |= 1024;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                case 11:
                    str = str5;
                    bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, qlm.h.f247648a, bool2);
                    i |= 2048;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                case 12:
                    str = str5;
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.v1.f247718a, str6);
                    i |= 4096;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                case 13:
                    str = str5;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, qlm.v1.f247718a, str4);
                    i |= 8192;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                case 14:
                    str = str5;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, qlm.v1.f247718a, str3);
                    i |= 16384;
                    strDecodeStringElement = str10;
                    str5 = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        String str11 = strDecodeStringElement;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new m0(i, str5, strDecodeStringElement2, str11, iDecodeIntElement, str7, str8, str9, num, bool3, bool, d5Var, bool2, str6, str4, str3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        m0 value = (m0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, value.f153200a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f153201b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f153202c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f153203g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, qlm.n0.f247680a, value.f153204h);
        qlm.h hVar = qlm.h.f247648a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, hVar, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, hVar, value.f153205j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, b5.f153034a, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, hVar, value.f153206l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, v1Var, value.f153207m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, v1Var, value.f153208n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, v1Var, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
