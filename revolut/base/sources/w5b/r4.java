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
public final /* synthetic */ class r4 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r4 f294998a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        r4 r4Var = new r4();
        f294998a = r4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsPlanHubPlanDto", r4Var, 4);
        pluginGeneratedSerialDescriptor.j("productId", false);
        pluginGeneratedSerialDescriptor.j("tier", false);
        pluginGeneratedSerialDescriptor.j("cardConfiguration", false);
        pluginGeneratedSerialDescriptor.j("virtualCardConfiguration", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private r4() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        y yVar = y.f295078a;
        KSerializer kSerializerC = nlm.a.c(yVar);
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, yVar, kSerializerC};
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
        a0 a0Var = null;
        a0 a0Var2 = null;
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
                a0Var = (a0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, y.f295078a, a0Var);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                a0Var2 = (a0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, y.f295078a, a0Var2);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new t4(i, strDecodeStringElement, strDecodeStringElement2, a0Var, a0Var2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        t4 value = (t4) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f295021a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f295022b);
        y yVar = y.f295078a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, yVar, value.f295023c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, yVar, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
