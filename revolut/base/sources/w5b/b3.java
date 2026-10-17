package w5b;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b3 f294786a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b3 b3Var = new b3();
        f294786a = b3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsPlanHubInfoDto", b3Var, 5);
        pluginGeneratedSerialDescriptor.j("iconUrl", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("currentPlan", false);
        pluginGeneratedSerialDescriptor.j("tabs", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b3() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(r4.f294998a), i4.f294876a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str = null;
        t4 t4Var = null;
        k4 k4Var = null;
        boolean z = true;
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
            } else if (iD == 2) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str);
                i |= 4;
            } else if (iD == 3) {
                t4Var = (t4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, r4.f294998a, t4Var);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                k4Var = (k4) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, i4.f294876a, k4Var);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d3(i, strDecodeStringElement, strDecodeStringElement2, str, t4Var, k4Var);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f294810a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f294811b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, value.f294812c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, r4.f294998a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, i4.f294876a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
