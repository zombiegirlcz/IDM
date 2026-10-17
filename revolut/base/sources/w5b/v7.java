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
public final /* synthetic */ class v7 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v7 f295050a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v7 v7Var = new v7();
        f295050a = v7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsWidgetNextRewardDto", v7Var, 4);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("icon", false);
        pluginGeneratedSerialDescriptor.j("progress", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v7() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(qlm.x.f247723a);
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, kSerializerC};
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
        String strDecodeStringElement3 = null;
        Double d = null;
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
                strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.x.f247723a, d);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x7(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, d);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x7 value = (x7) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f295075a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f295076b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f295077c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.x.f247723a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
