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
public final /* synthetic */ class b5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b5 f153034a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b5 b5Var = new b5();
        f153034a = b5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.ManualCarInputDto", b5Var, 9);
        pluginGeneratedSerialDescriptor.j("abiCode", false);
        pluginGeneratedSerialDescriptor.j("manufactureYear", false);
        pluginGeneratedSerialDescriptor.j("registrationCountryCode", false);
        pluginGeneratedSerialDescriptor.j("purchaseYear", false);
        pluginGeneratedSerialDescriptor.j("rightHand", false);
        pluginGeneratedSerialDescriptor.j("validNct", false);
        pluginGeneratedSerialDescriptor.j("registeredOwner", false);
        pluginGeneratedSerialDescriptor.j("taxedPrivately", false);
        pluginGeneratedSerialDescriptor.j("neverRegisteredOutsideUkIe", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b5() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        qlm.n0 n0Var = qlm.n0.f247680a;
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{v1Var, n0Var, v1Var, n0Var, hVar, hVar, hVar, hVar, hVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
        boolean zDecodeBooleanElement3 = false;
        boolean zDecodeBooleanElement4 = false;
        boolean zDecodeBooleanElement5 = false;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
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
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    zDecodeBooleanElement4 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    zDecodeBooleanElement5 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d5(i, strDecodeStringElement, iDecodeIntElement, strDecodeStringElement2, iDecodeIntElement2, zDecodeBooleanElement, zDecodeBooleanElement2, zDecodeBooleanElement3, zDecodeBooleanElement4, zDecodeBooleanElement5);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d5 value = (d5) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f153062a);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f153063b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f153064c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, value.f153065g);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, value.f153066h);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
