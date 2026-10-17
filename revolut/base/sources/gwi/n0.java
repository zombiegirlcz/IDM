package gwi;

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
public final /* synthetic */ class n0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f147473a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        n0 n0Var = new n0();
        f147473a = n0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airportlounges.impl.network.dto.AirportLoungePassDto", n0Var, 10);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("passes", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("freeCompanionPasses", true);
        pluginGeneratedSerialDescriptor.j("lastPurchaseDate", false);
        pluginGeneratedSerialDescriptor.j("recurringPasses", false);
        pluginGeneratedSerialDescriptor.j("giftedPasses", false);
        pluginGeneratedSerialDescriptor.j("origin", false);
        pluginGeneratedSerialDescriptor.j("walletStyle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private n0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(qlm.t0.f247706a);
        KSerializer kSerializerC2 = nlm.a.c(k3.f147439a);
        KSerializer kSerializerC3 = nlm.a.c(m.f147453a);
        KSerializer kSerializerC4 = nlm.a.c(v1Var);
        KSerializer kSerializerC5 = nlm.a.c(v1Var);
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{v1Var, v1Var, n0Var, v1Var, n0Var, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5};
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
        m3 m3Var = null;
        o oVar = null;
        String str2 = null;
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
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
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.t0.f247706a, l2);
                    i |= 32;
                    break;
                case 6:
                    m3Var = (m3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, k3.f147439a, m3Var);
                    i |= 64;
                    break;
                case 7:
                    oVar = (o) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, m.f147453a, oVar);
                    i |= 128;
                    break;
                case 8:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str2);
                    i |= 256;
                    break;
                case 9:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.v1.f247718a, str);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new p0(i, strDecodeStringElement, strDecodeStringElement2, iDecodeIntElement, strDecodeStringElement3, iDecodeIntElement2, l2, m3Var, oVar, str2, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        p0 value = (p0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f147487a;
        String str2 = value.f147492j;
        int i = value.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f147488b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f147489c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, i);
        }
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, qlm.t0.f247706a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, k3.f147439a, value.f147490g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, m.f147453a, value.f147491h);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, value.i);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, v1Var, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
