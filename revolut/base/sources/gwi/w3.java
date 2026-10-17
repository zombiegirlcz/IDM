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
public final /* synthetic */ class w3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w3 f147553a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        w3 w3Var = new w3();
        f147553a = w3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airportlounges.impl.network.dto.AirportLoungesDisclaimerItemDto", w3Var, 3);
        pluginGeneratedSerialDescriptor.j("icon", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private w3() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, ld7.d.f194042a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        String strDecodeStringElement2 = null;
        ld7.f fVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                fVar = (ld7.f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ld7.d.f194042a, fVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new y3(i, strDecodeStringElement, strDecodeStringElement2, fVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        y3 value = (y3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f147569a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f147570b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, ld7.d.f194042a, value.f147571c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
