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
public final /* synthetic */ class y2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2 f131774a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y2 y2Var = new y2();
        f131774a = y2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.MegaOfferDto.EarnDto", y2Var, 3);
        pluginGeneratedSerialDescriptor.j("shopsOnline", false);
        pluginGeneratedSerialDescriptor.j("shopsInStore", false);
        pluginGeneratedSerialDescriptor.j("revPay", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        y4 y4Var = y4.f131775a;
        return new KSerializer[]{nlm.a.c(y4Var), nlm.a.c(y4Var), nlm.a.c(y4Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        a5 a5Var = null;
        boolean z = true;
        int i = 0;
        a5 a5Var2 = null;
        a5 a5Var3 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                a5Var = (a5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, y4.f131775a, a5Var);
                i |= 1;
            } else if (iD == 1) {
                a5Var2 = (a5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, y4.f131775a, a5Var2);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                a5Var3 = (a5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, y4.f131775a, a5Var3);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a3(i, a5Var, a5Var2, a5Var3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a3 value = (a3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        y4 y4Var = y4.f131775a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, y4Var, value.f131536a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, y4Var, value.f131537b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, y4Var, value.f131538c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
