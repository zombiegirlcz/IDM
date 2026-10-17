package gwi;

import java.util.List;
import jo3.a;
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
public final /* synthetic */ class b3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b3 f147349a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b3 b3Var = new b3();
        f147349a = b3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airportlounges.impl.network.dto.AirportLoungePriceQuotePerPassengersDto", b3Var, 5);
        pluginGeneratedSerialDescriptor.j("passPrice", false);
        pluginGeneratedSerialDescriptor.j("planName", false);
        pluginGeneratedSerialDescriptor.j("quotes", false);
        pluginGeneratedSerialDescriptor.j("maxEntries", false);
        pluginGeneratedSerialDescriptor.j("activeEntries", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b3() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = d3.f;
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{a.C1001a.f176860a, nlm.a.c(qlm.v1.f247718a), lazyArr[2].getValue(), n0Var, n0Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = d3.f;
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        jo3.a aVar = null;
        String str = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                i |= 1;
            } else if (iD == 1) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                i |= 2;
            } else if (iD == 2) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                i |= 4;
            } else if (iD == 3) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d3(i, aVar, str, list, iDecodeIntElement, iDecodeIntElement2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d3 value = (d3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = d3.f;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, value.f147371a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, value.f147372b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f147373c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
