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
public final /* synthetic */ class c1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f294793a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c1 c1Var = new c1();
        f294793a = c1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsPlanAdditionalValueSectionDto", c1Var, 4);
        pluginGeneratedSerialDescriptor.j("icon", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        pluginGeneratedSerialDescriptor.j("infoBottomSheet", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private c1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = e1.e;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue(), nlm.a.c(k0.f294894a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = e1.e;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        List list = null;
        m0 m0Var = null;
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
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                m0Var = (m0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, k0.f294894a, m0Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new e1(i, strDecodeStringElement, strDecodeStringElement2, list, m0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        e1 value = (e1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = e1.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f294819a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f294820b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f294821c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, k0.f294894a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
