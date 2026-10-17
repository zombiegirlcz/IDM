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
public final /* synthetic */ class t5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t5 f147526a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        t5 t5Var = new t5();
        f147526a = t5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airportlounges.impl.network.dto.SchemeAirportLoungesHomeDto", t5Var, 2);
        pluginGeneratedSerialDescriptor.j("homePage", false);
        pluginGeneratedSerialDescriptor.j("howToAccessPage", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private t5() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v5.f147543a, y5.f147573a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        x5 x5Var = null;
        boolean z = true;
        int i = 0;
        a6 a6Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                x5Var = (x5) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, v5.f147543a, x5Var);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                a6Var = (a6) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, y5.f147573a, a6Var);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new b6(i, x5Var, a6Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        b6 value = (b6) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, v5.f147543a, value.f147354a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, y5.f147573a, value.f147355b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
