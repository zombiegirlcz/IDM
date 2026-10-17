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
public final /* synthetic */ class e5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e5 f147381a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e5 e5Var = new e5();
        f147381a = e5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airportlounges.impl.network.dto.AirportLoungesUserCapabilitiesDto", e5Var, 6);
        pluginGeneratedSerialDescriptor.j("unlimitedCountryProfiles", false);
        pluginGeneratedSerialDescriptor.j("helpTopic", true);
        pluginGeneratedSerialDescriptor.j("shouldShowTermsOnPass", true);
        pluginGeneratedSerialDescriptor.j("termsUrl", true);
        pluginGeneratedSerialDescriptor.j("termsAndConditions", true);
        pluginGeneratedSerialDescriptor.j("disclaimer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e5() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{g5.f147402g[0].getValue(), v1Var, nlm.a.c(qlm.h.f247648a), nlm.a.c(v1Var), nlm.a.c(y4.f147572a), nlm.a.c(t3.f147523a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g5.f147402g;
        dVarBeginStructure.getClass();
        int i = 0;
        List list = null;
        String strDecodeStringElement = null;
        Boolean bool = null;
        String str = null;
        a5 a5Var = null;
        v3 v3Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.h.f247648a, bool);
                    i |= 4;
                    break;
                case 3:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
                    i |= 8;
                    break;
                case 4:
                    a5Var = (a5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, y4.f147572a, a5Var);
                    i |= 16;
                    break;
                case 5:
                    v3Var = (v3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, t3.f147523a, v3Var);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g5(i, list, strDecodeStringElement, bool, str, a5Var, v3Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g5 value = (g5) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        mlm.h hVar = (mlm.h) g5.f147402g[0].getValue();
        List list = value.f147403a;
        v3 v3Var = value.f;
        a5 a5Var = value.e;
        String str = value.d;
        Boolean bool = value.f147405c;
        String str2 = value.f147404b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, list);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(str2, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.h.f247648a, bool);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || a5Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, y4.f147572a, a5Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || v3Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, t3.f147523a, v3Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
