package nif;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f216044a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        u1 u1Var = new u1();
        f216044a = u1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.impl.data.new_arch.database.entity.PocketFeesBreakdownEmbeddedEntity", u1Var, 8);
        pluginGeneratedSerialDescriptor.j("fxFee", false);
        pluginGeneratedSerialDescriptor.j("atmFee", false);
        pluginGeneratedSerialDescriptor.j("acquiring", false);
        pluginGeneratedSerialDescriptor.j("transferFee", false);
        pluginGeneratedSerialDescriptor.j("cashAdvance", false);
        pluginGeneratedSerialDescriptor.j("fxRareCurrencyFee", false);
        pluginGeneratedSerialDescriptor.j("fxWeekendFee", false);
        pluginGeneratedSerialDescriptor.j("cryptoFee", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private u1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.t0 t0Var = qlm.t0.f247706a;
        KSerializer kSerializerC = nlm.a.c(t0Var);
        KSerializer kSerializerC2 = nlm.a.c(t0Var);
        KSerializer kSerializerC3 = nlm.a.c(t0Var);
        KSerializer kSerializerC4 = nlm.a.c(t0Var);
        KSerializer kSerializerC5 = nlm.a.c(t0Var);
        x1 x1Var = x1.f216067a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, nlm.a.c(x1Var), nlm.a.c(x1Var), nlm.a.c(x1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Long l22 = null;
        z1 z1Var = null;
        z1 z1Var2 = null;
        z1 z1Var3 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.t0.f247706a, l2);
                    i |= 1;
                    break;
                case 1:
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.t0.f247706a, l3);
                    i |= 2;
                    break;
                case 2:
                    l4 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.t0.f247706a, l4);
                    i |= 4;
                    break;
                case 3:
                    l5 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.t0.f247706a, l5);
                    i |= 8;
                    break;
                case 4:
                    l22 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.t0.f247706a, l22);
                    i |= 16;
                    break;
                case 5:
                    z1Var = (z1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, x1.f216067a, z1Var);
                    i |= 32;
                    break;
                case 6:
                    z1Var2 = (z1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, x1.f216067a, z1Var2);
                    i |= 64;
                    break;
                case 7:
                    z1Var3 = (z1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, x1.f216067a, z1Var3);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new w1(i, l2, l3, l4, l5, l22, z1Var, z1Var2, z1Var3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        w1 value = (w1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, t0Var, value.f216058a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, t0Var, value.f216059b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, t0Var, value.f216060c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, t0Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, t0Var, value.e);
        x1 x1Var = x1.f216067a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, x1Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, x1Var, value.f216061g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, x1Var, value.f216062h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
