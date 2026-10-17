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
public final /* synthetic */ class i4 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i4 f294876a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i4 i4Var = new i4();
        f294876a = i4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsPlanHubInfoTabsDto", i4Var, 3);
        pluginGeneratedSerialDescriptor.j("overview", false);
        pluginGeneratedSerialDescriptor.j("rewards", false);
        pluginGeneratedSerialDescriptor.j("transactions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i4() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h3.f294863a, nlm.a.c(c4.f294796a), o4.f294965a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        j3 j3Var = null;
        boolean z = true;
        int i = 0;
        e4 e4Var = null;
        q4 q4Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                j3Var = (j3) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, h3.f294863a, j3Var);
                i |= 1;
            } else if (iD == 1) {
                e4Var = (e4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, c4.f294796a, e4Var);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                q4Var = (q4) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, o4.f294965a, q4Var);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k4(i, j3Var, e4Var, q4Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k4 value = (k4) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, h3.f294863a, value.f294899a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, c4.f294796a, value.f294900b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, o4.f294965a, value.f294901c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
