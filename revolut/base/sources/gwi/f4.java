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
public final /* synthetic */ class f4 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f4 f147396a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        f4 f4Var = new f4();
        f147396a = f4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airportlounges.impl.network.dto.AirportLoungesPassActivityEventDto", f4Var, 8);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("createdAt", false);
        pluginGeneratedSerialDescriptor.j("mainIcon", false);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle1", true);
        pluginGeneratedSerialDescriptor.j("subtitle2", true);
        pluginGeneratedSerialDescriptor.j("value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private f4() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, qlm.t0.f247706a, v1Var, nlm.a.c(c4.f147366a), v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(i4.f147425a)};
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
        e4 e4Var = null;
        String strDecodeStringElement3 = null;
        String str2 = null;
        long jDecodeLongElement = 0;
        int i = 0;
        boolean z = true;
        k4 k4Var = null;
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
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    e4Var = (e4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, c4.f147366a, e4Var);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str2);
                    i |= 32;
                    break;
                case 6:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str);
                    i |= 64;
                    break;
                case 7:
                    k4Var = (k4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, i4.f147425a, k4Var);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new h4(i, strDecodeStringElement, jDecodeLongElement, strDecodeStringElement2, e4Var, strDecodeStringElement3, str2, str, k4Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        h4 value = (h4) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f147410a;
        k4 k4Var = value.f147414h;
        String str2 = value.f147413g;
        String str3 = value.f;
        e4 e4Var = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.f147411b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f147412c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || e4Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, c4.f147366a, e4Var);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || k4Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, i4.f147425a, k4Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
