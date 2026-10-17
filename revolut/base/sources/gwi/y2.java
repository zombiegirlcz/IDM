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
public final /* synthetic */ class y2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2 f147568a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y2 y2Var = new y2();
        f147568a = y2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airportlounges.impl.network.dto.AirportLoungePriceQuoteDto", y2Var, 3);
        pluginGeneratedSerialDescriptor.j("totalPrice", false);
        pluginGeneratedSerialDescriptor.j("planDiscount", false);
        pluginGeneratedSerialDescriptor.j("highestPointsOption", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{a.C1001a.f176860a, s2.f147513a, nlm.a.c(v2.f147538a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        jo3.a aVar = null;
        boolean z = true;
        int i = 0;
        u2 u2Var = null;
        x2 x2Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                i |= 1;
            } else if (iD == 1) {
                u2Var = (u2) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, s2.f147513a, u2Var);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                x2Var = (x2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v2.f147538a, x2Var);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a3(i, aVar, u2Var, x2Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a3 value = (a3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, value.f147336a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, s2.f147513a, value.f147337b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v2.f147538a, value.f147338c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
