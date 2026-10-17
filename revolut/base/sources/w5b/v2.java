package w5b;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v2 f295046a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v2 v2Var = new v2();
        f295046a = v2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsPlanHubInfoCardBenefitsDto", v2Var, 3);
        pluginGeneratedSerialDescriptor.j("card", false);
        pluginGeneratedSerialDescriptor.j("benefitList", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v2() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{y2.f295082a, x2.d[1].getValue(), nlm.a.c(j2.f294884a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x2.d;
        dVarBeginStructure.getClass();
        a3 a3Var = null;
        boolean z = true;
        int i = 0;
        List list = null;
        l2 l2Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                a3Var = (a3) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, y2.f295082a, a3Var);
                i |= 1;
            } else if (iD == 1) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                l2Var = (l2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, j2.f294884a, l2Var);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x2(i, a3Var, list, l2Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x2 value = (x2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x2.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, y2.f295082a, value.f295066a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f295067b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, j2.f294884a, value.f295068c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
