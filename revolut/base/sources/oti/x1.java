package oti;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1 f229704a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        x1 x1Var = new x1();
        f229704a = x1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airport.security_fast_track.impl.network.dto.AsftTerminalDto", x1Var, 14);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("terminalName", false);
        pluginGeneratedSerialDescriptor.j("terminalDescription", false);
        pluginGeneratedSerialDescriptor.j("passengersInformationRequired", false);
        pluginGeneratedSerialDescriptor.j("flightNumberRequired", false);
        pluginGeneratedSerialDescriptor.j("childMinAge", false);
        pluginGeneratedSerialDescriptor.j("bookingCancellableDurationInHours", false);
        pluginGeneratedSerialDescriptor.j("bookBeforeDurationInHours", false);
        pluginGeneratedSerialDescriptor.j("maxNoOfTravelers", false);
        pluginGeneratedSerialDescriptor.j("passValidityDurationInMinutes", false);
        pluginGeneratedSerialDescriptor.j("priceBreakdown", false);
        pluginGeneratedSerialDescriptor.j("businessHours", false);
        pluginGeneratedSerialDescriptor.j("overriddenPlanName", false);
        pluginGeneratedSerialDescriptor.j("bookingAvailability", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private x1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = z1.o;
        qlm.v1 v1Var = qlm.v1.f247718a;
        qlm.n0 n0Var = qlm.n0.f247680a;
        KSerializer kSerializerC = nlm.a.c(n0Var);
        KSerializer kSerializerC2 = nlm.a.c(n0Var);
        KSerializer kSerializerC3 = nlm.a.c((KSerializer) lazyArr[11].getValue());
        KSerializer kSerializerC4 = nlm.a.c(v1Var);
        KSerializer kSerializerC5 = nlm.a.c(v1Var);
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{v1Var, v1Var, v1Var, hVar, hVar, n0Var, kSerializerC, kSerializerC2, n0Var, n0Var, i1.f229647a, kSerializerC3, kSerializerC4, kSerializerC5};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = z1.o;
        dVarBeginStructure.getClass();
        n1 n1Var = null;
        List list = null;
        String str = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        int iDecodeIntElement3 = 0;
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
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.n0.f247680a, num);
                    i |= 64;
                    break;
                case 7:
                    num2 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.n0.f247680a, num2);
                    i |= 128;
                    break;
                case 8:
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    iDecodeIntElement3 = dVarBeginStructure.decodeIntElement(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    n1Var = (n1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, i1.f229647a, n1Var);
                    i |= 1024;
                    break;
                case 11:
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr[11].getValue(), list);
                    i |= 2048;
                    break;
                case 12:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.v1.f247718a, str);
                    i |= 4096;
                    break;
                case 13:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, qlm.v1.f247718a, str2);
                    i |= 8192;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new z1(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, zDecodeBooleanElement, zDecodeBooleanElement2, iDecodeIntElement, num, num2, iDecodeIntElement2, iDecodeIntElement3, n1Var, list, str, str2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        z1 value = (z1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = z1.o;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f229710a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f229711b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f229712c);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, value.f);
        qlm.n0 n0Var = qlm.n0.f247680a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, n0Var, value.f229713g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, n0Var, value.f229714h);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 9, value.f229715j);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, i1.f229647a, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, (mlm.h) lazyArr[11].getValue(), value.f229716l);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, v1Var, value.f229717m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, v1Var, value.f229718n);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
