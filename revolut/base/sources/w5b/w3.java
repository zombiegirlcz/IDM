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
public final /* synthetic */ class w3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w3 f295055a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        w3 w3Var = new w3();
        f295055a = w3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsPlanHubInfoRewardSectionDto", w3Var, 4);
        pluginGeneratedSerialDescriptor.j("sectionTitle", false);
        pluginGeneratedSerialDescriptor.j("challenges", false);
        pluginGeneratedSerialDescriptor.j("sectionInfo", false);
        pluginGeneratedSerialDescriptor.j("expandable", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private w3() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qlm.v1.f247718a, y3.e[1].getValue(), nlm.a.c(z3.f295091a), nlm.a.c(qlm.h.f247648a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = y3.e;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        List list = null;
        b4 b4Var = null;
        Boolean bool = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                i |= 2;
            } else if (iD == 2) {
                b4Var = (b4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, z3.f295091a, b4Var);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.h.f247648a, bool);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new y3(i, strDecodeStringElement, list, b4Var, bool);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        y3 value = (y3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = y3.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f295083a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f295084b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, z3.f295091a, value.f295085c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.h.f247648a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
