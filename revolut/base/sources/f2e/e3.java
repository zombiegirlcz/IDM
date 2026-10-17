package f2e;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e3 f131576a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e3 e3Var = new e3();
        f131576a = e3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.MegaOfferDto.RedeemDto", e3Var, 3);
        pluginGeneratedSerialDescriptor.j("giftcards", false);
        pluginGeneratedSerialDescriptor.j("exclusives", false);
        pluginGeneratedSerialDescriptor.j("revPay", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e3() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(v1.f131735a), nlm.a.c(g1.f131598a), nlm.a.c(y4.f131775a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        x1 x1Var = null;
        boolean z = true;
        int i = 0;
        i1 i1Var = null;
        a5 a5Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                x1Var = (x1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f131735a, x1Var);
                i |= 1;
            } else if (iD == 1) {
                i1Var = (i1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, g1.f131598a, i1Var);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                a5Var = (a5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, y4.f131775a, a5Var);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g3(i, x1Var, i1Var, a5Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g3 value = (g3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f131735a, value.f131601a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, g1.f131598a, value.f131602b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, y4.f131775a, value.f131603c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
