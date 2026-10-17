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
public final /* synthetic */ class j7 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j7 f153162a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j7 j7Var = new j7();
        f153162a = j7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.PolicyDto", j7Var, 15);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("vehicle", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("imageUrl", false);
        pluginGeneratedSerialDescriptor.j("policyNumber", false);
        pluginGeneratedSerialDescriptor.j("startDateTime", false);
        pluginGeneratedSerialDescriptor.j("endDateTime", false);
        pluginGeneratedSerialDescriptor.j("nextPaymentDate", false);
        pluginGeneratedSerialDescriptor.j("renewalDate", false);
        pluginGeneratedSerialDescriptor.j("cancellationDetails", false);
        pluginGeneratedSerialDescriptor.j("failedPaymentDetails", false);
        pluginGeneratedSerialDescriptor.j("renewalDetails", false);
        pluginGeneratedSerialDescriptor.j("payment", false);
        pluginGeneratedSerialDescriptor.j("todoCount", false);
        pluginGeneratedSerialDescriptor.j("smartDrivingApplied", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j7() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, k0.f153166a, v1Var, nlm.a.c(v1Var), v1Var, v1Var, v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c(b0.f153026a), nlm.a.c(o3.f153241a), nlm.a.c(w8.f153354a), f6.f153100a, qlm.n0.f247680a, qlm.h.f247648a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        d0 d0Var = null;
        h6 h6Var = null;
        q3 q3Var = null;
        y8 y8Var = null;
        String strDecodeStringElement = null;
        m0 m0Var = null;
        String strDecodeStringElement2 = null;
        String str2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String str3 = null;
        String strDecodeStringElement6 = null;
        int i = 0;
        boolean z = true;
        int iDecodeIntElement = 0;
        boolean zDecodeBooleanElement = false;
        while (true) {
            String str4 = strDecodeStringElement;
            if (!z) {
                dVarBeginStructure.endStructure(serialDescriptor);
                return new l7(i, strDecodeStringElement, m0Var, strDecodeStringElement2, str2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, str3, strDecodeStringElement6, d0Var, q3Var, y8Var, h6Var, iDecodeIntElement, zDecodeBooleanElement);
            }
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    strDecodeStringElement = str4;
                    break;
                case 0:
                    str = strDecodeStringElement2;
                    i |= 1;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    strDecodeStringElement2 = str;
                    break;
                case 1:
                    str = strDecodeStringElement2;
                    m0Var = (m0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, k0.f153166a, m0Var);
                    i |= 2;
                    strDecodeStringElement = str4;
                    strDecodeStringElement2 = str;
                    break;
                case 2:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    strDecodeStringElement = str4;
                    break;
                case 3:
                    str = strDecodeStringElement2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str2);
                    i |= 8;
                    strDecodeStringElement = str4;
                    strDecodeStringElement2 = str;
                    break;
                case 4:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    strDecodeStringElement = str4;
                    break;
                case 5:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    strDecodeStringElement = str4;
                    break;
                case 6:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    strDecodeStringElement = str4;
                    break;
                case 7:
                    str = strDecodeStringElement2;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str3);
                    i |= 128;
                    strDecodeStringElement = str4;
                    strDecodeStringElement2 = str;
                    break;
                case 8:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                    i |= 256;
                    strDecodeStringElement = str4;
                    break;
                case 9:
                    str = strDecodeStringElement2;
                    d0Var = (d0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, b0.f153026a, d0Var);
                    i |= 512;
                    strDecodeStringElement = str4;
                    strDecodeStringElement2 = str;
                    break;
                case 10:
                    str = strDecodeStringElement2;
                    q3Var = (q3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, o3.f153241a, q3Var);
                    i |= 1024;
                    strDecodeStringElement = str4;
                    strDecodeStringElement2 = str;
                    break;
                case 11:
                    str = strDecodeStringElement2;
                    y8Var = (y8) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, w8.f153354a, y8Var);
                    i |= 2048;
                    strDecodeStringElement = str4;
                    strDecodeStringElement2 = str;
                    break;
                case 12:
                    str = strDecodeStringElement2;
                    h6Var = (h6) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 12, f6.f153100a, h6Var);
                    i |= 4096;
                    strDecodeStringElement = str4;
                    strDecodeStringElement2 = str;
                    break;
                case 13:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 13);
                    i |= 8192;
                    strDecodeStringElement = str4;
                    break;
                case 14:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                    i |= 16384;
                    strDecodeStringElement = str4;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l7 value = (l7) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f153187a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, k0.f153166a, value.f153188b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f153189c);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f153190g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, value.f153191h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, b0.f153026a, value.f153192j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, o3.f153241a, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, w8.f153354a, value.f153193l);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, f6.f153100a, value.f153194m);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 13, value.f153195n);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 14, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
