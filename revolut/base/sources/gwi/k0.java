package gwi;

import jo3.a;
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
public final /* synthetic */ class k0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f147435a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k0 k0Var = new k0();
        f147435a = k0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airportlounges.impl.network.dto.AirportLoungePassDetailsDto", k0Var, 18);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("refundable", false);
        pluginGeneratedSerialDescriptor.j("editable", false);
        pluginGeneratedSerialDescriptor.j("availableAt", false);
        pluginGeneratedSerialDescriptor.j("redeemedAt", false);
        pluginGeneratedSerialDescriptor.j("expirationDate", false);
        pluginGeneratedSerialDescriptor.j("style", false);
        pluginGeneratedSerialDescriptor.j("savedAmount", false);
        pluginGeneratedSerialDescriptor.j("passPrice", false);
        pluginGeneratedSerialDescriptor.j("recurring", false);
        pluginGeneratedSerialDescriptor.j("gifted", false);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("firstName", false);
        pluginGeneratedSerialDescriptor.j("lastName", false);
        pluginGeneratedSerialDescriptor.j("passId", false);
        pluginGeneratedSerialDescriptor.j("qrCode", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        qlm.t0 t0Var = qlm.t0.f247706a;
        KSerializer kSerializerC = nlm.a.c(t0Var);
        KSerializer kSerializerC2 = nlm.a.c(t0Var);
        KSerializer kSerializerC3 = nlm.a.c(t0Var);
        a.C1001a c1001a = a.C1001a.f176860a;
        KSerializer kSerializerC4 = nlm.a.c(c1001a);
        KSerializer kSerializerC5 = nlm.a.c(c1001a);
        KSerializer kSerializerC6 = nlm.a.c(h0.f147406a);
        KSerializer kSerializerC7 = nlm.a.c(e0.f147376a);
        KSerializer kSerializerC8 = nlm.a.c(v1Var);
        KSerializer kSerializerC9 = nlm.a.c(v1Var);
        KSerializer kSerializerC10 = nlm.a.c(v1Var);
        KSerializer kSerializerC11 = nlm.a.c(v1Var);
        KSerializer kSerializerC12 = nlm.a.c(v1Var);
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{v1Var, v1Var, hVar, hVar, kSerializerC, kSerializerC2, kSerializerC3, v1Var, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, kSerializerC10, kSerializerC11, kSerializerC12, v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Long l2;
        Long l3;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        jo3.a aVar = null;
        String str2 = null;
        String str3 = null;
        j0 j0Var = null;
        g0 g0Var = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Long l4 = null;
        Long l5 = null;
        Long l22 = null;
        String strDecodeStringElement = null;
        jo3.a aVar2 = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        int i2 = 0;
        boolean z = true;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
        while (z) {
            String str7 = strDecodeStringElement;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = str2;
                    z = false;
                    strDecodeStringElement = str7;
                    str2 = str;
                    break;
                case 0:
                    str = str2;
                    l2 = l4;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                    l4 = l2;
                    strDecodeStringElement = str7;
                    str2 = str;
                    break;
                case 1:
                    str = str2;
                    l2 = l4;
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                    l4 = l2;
                    strDecodeStringElement = str7;
                    str2 = str;
                    break;
                case 2:
                    str = str2;
                    l2 = l4;
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i2 |= 4;
                    l4 = l2;
                    strDecodeStringElement = str7;
                    str2 = str;
                    break;
                case 3:
                    str = str2;
                    l2 = l4;
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i2 |= 8;
                    l4 = l2;
                    strDecodeStringElement = str7;
                    str2 = str;
                    break;
                case 4:
                    str = str2;
                    l4 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.t0.f247706a, l4);
                    i2 |= 16;
                    strDecodeStringElement = str7;
                    str2 = str;
                    break;
                case 5:
                    l3 = l4;
                    l5 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.t0.f247706a, l5);
                    i2 |= 32;
                    strDecodeStringElement = str7;
                    l4 = l3;
                    break;
                case 6:
                    l3 = l4;
                    l22 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.t0.f247706a, l22);
                    i2 |= 64;
                    strDecodeStringElement = str7;
                    l4 = l3;
                    break;
                case 7:
                    l3 = l4;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i2 |= 128;
                    l4 = l3;
                    break;
                case 8:
                    l3 = l4;
                    aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, a.C1001a.f176860a, aVar2);
                    i2 |= 256;
                    strDecodeStringElement = str7;
                    l4 = l3;
                    break;
                case 9:
                    l3 = l4;
                    aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, a.C1001a.f176860a, aVar);
                    i2 |= 512;
                    strDecodeStringElement = str7;
                    l4 = l3;
                    break;
                case 10:
                    l3 = l4;
                    j0Var = (j0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, h0.f147406a, j0Var);
                    i2 |= 1024;
                    strDecodeStringElement = str7;
                    l4 = l3;
                    break;
                case 11:
                    l3 = l4;
                    g0Var = (g0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, e0.f147376a, g0Var);
                    i2 |= 2048;
                    strDecodeStringElement = str7;
                    l4 = l3;
                    break;
                case 12:
                    l3 = l4;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.v1.f247718a, str5);
                    i2 |= 4096;
                    strDecodeStringElement = str7;
                    l4 = l3;
                    break;
                case 13:
                    l3 = l4;
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, qlm.v1.f247718a, str6);
                    i2 |= 8192;
                    strDecodeStringElement = str7;
                    l4 = l3;
                    break;
                case 14:
                    l3 = l4;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, qlm.v1.f247718a, str3);
                    i2 |= 16384;
                    strDecodeStringElement = str7;
                    l4 = l3;
                    break;
                case 15:
                    l3 = l4;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, qlm.v1.f247718a, str2);
                    i = 32768;
                    i2 |= i;
                    strDecodeStringElement = str7;
                    l4 = l3;
                    break;
                case 16:
                    l3 = l4;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, qlm.v1.f247718a, str4);
                    i = 65536;
                    i2 |= i;
                    strDecodeStringElement = str7;
                    l4 = l3;
                    break;
                case 17:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 17);
                    i2 |= 131072;
                    strDecodeStringElement = str7;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        g0 g0Var2 = g0Var;
        int i3 = i2;
        String str8 = strDecodeStringElement3;
        String str9 = str5;
        return new m0(i3, strDecodeStringElement2, str8, zDecodeBooleanElement, zDecodeBooleanElement2, l4, l5, l22, strDecodeStringElement, aVar2, aVar, j0Var, g0Var2, str9, str6, str3, str2, str4, strDecodeStringElement4);
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
        String str = value.f147454a;
        String str2 = value.f147461m;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f147455b);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.f147456c);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, value.d);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, t0Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, t0Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, t0Var, value.f147457g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f147458h);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, c1001a, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, c1001a, value.f147459j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, h0.f147406a, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, e0.f147376a, value.f147460l);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, qlm.v1.f247718a, str2);
        }
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, v1Var, value.f147462n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, v1Var, value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, v1Var, value.f147463p);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, v1Var, value.f147464q);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 17, value.f147465r);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
