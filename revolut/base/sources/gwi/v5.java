package gwi;

import java.util.List;
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
public final /* synthetic */ class v5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v5 f147543a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v5 v5Var = new v5();
        f147543a = v5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airportlounges.impl.network.dto.SchemeAirportLoungesHomeDto.HomePageDto", v5Var, 4);
        pluginGeneratedSerialDescriptor.j("orderCardWidget", false);
        pluginGeneratedSerialDescriptor.j("imageUrl", false);
        pluginGeneratedSerialDescriptor.j("cells", false);
        pluginGeneratedSerialDescriptor.j("footer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v5() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(c6.f147367a), qlm.v1.f247718a, x5.e[2].getValue(), nlm.a.c(n5.f147479a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x5.e;
        dVarBeginStructure.getClass();
        int i = 0;
        e6 e6Var = null;
        String strDecodeStringElement = null;
        List list = null;
        s5 s5Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                e6Var = (e6) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, c6.f147367a, e6Var);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                s5Var = (s5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, n5.f147479a, s5Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x5(i, e6Var, strDecodeStringElement, list, s5Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x5 value = (x5) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x5.e;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, c6.f147367a, value.f147562a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f147563b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f147564c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, n5.f147479a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
