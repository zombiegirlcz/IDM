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
public final /* synthetic */ class a2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2 f147335a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a2 a2Var = new a2();
        f147335a = a2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airportlounges.impl.network.dto.AirportLoungePassesPriceBreakdownDto", a2Var, 7);
        pluginGeneratedSerialDescriptor.j("originalPrice", false);
        pluginGeneratedSerialDescriptor.j("finalPrice", false);
        pluginGeneratedSerialDescriptor.j("planName", false);
        pluginGeneratedSerialDescriptor.j("planDiscount", false);
        pluginGeneratedSerialDescriptor.j("passPrice", false);
        pluginGeneratedSerialDescriptor.j("passPriceDiscounted", false);
        pluginGeneratedSerialDescriptor.j("pointsOptionsContainer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{nlm.a.c(c1001a), c1001a, nlm.a.c(qlm.v1.f247718a), nlm.a.c(c1001a), c1001a, nlm.a.c(c1001a), nlm.a.c(u1.f147528a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        jo3.a aVar = null;
        jo3.a aVar2 = null;
        String str = null;
        jo3.a aVar3 = null;
        jo3.a aVar4 = null;
        jo3.a aVar5 = null;
        w1 w1Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                    i |= 1;
                    break;
                case 1:
                    aVar2 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    aVar3 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar3);
                    i |= 8;
                    break;
                case 4:
                    aVar4 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, a.C1001a.f176860a, aVar4);
                    i |= 16;
                    break;
                case 5:
                    aVar5 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, a.C1001a.f176860a, aVar5);
                    i |= 32;
                    break;
                case 6:
                    w1Var = (w1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, u1.f147528a, w1Var);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c2(i, aVar, aVar2, str, aVar3, aVar4, aVar5, w1Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c2 value = (c2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, c1001a, value.f147362a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c1001a, value.f147363b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, value.f147364c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, c1001a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, c1001a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, c1001a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, u1.f147528a, value.f147365g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
