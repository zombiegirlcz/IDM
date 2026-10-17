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
public final /* synthetic */ class h3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h3 f147409a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h3 h3Var = new h3();
        f147409a = h3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airportlounges.impl.network.dto.AirportLoungeQuotesDto", h3Var, 3);
        pluginGeneratedSerialDescriptor.j("plans", false);
        pluginGeneratedSerialDescriptor.j("priceQuotePerPassengers", false);
        pluginGeneratedSerialDescriptor.j("config", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h3() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{i1.f147422a, b3.f147349a, e3.f147378a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        k1 k1Var = null;
        boolean z = true;
        int i = 0;
        d3 d3Var = null;
        g3 g3Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                k1Var = (k1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, i1.f147422a, k1Var);
                i |= 1;
            } else if (iD == 1) {
                d3Var = (d3) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, b3.f147349a, d3Var);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                g3Var = (g3) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, e3.f147378a, g3Var);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j3(i, k1Var, d3Var, g3Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j3 value = (j3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, i1.f147422a, value.f147432a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, b3.f147349a, value.f147433b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, e3.f147378a, value.f147434c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
