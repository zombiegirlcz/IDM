package bjk;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class v implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f16087a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v vVar = new v();
        f16087a = vVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.pricing_plans.ui.impl.network.dto.PlanContextualSelectionLayoutDto.OptionDto", vVar, 5);
        pluginGeneratedSerialDescriptor.j("planTier", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("value", false);
        pluginGeneratedSerialDescriptor.j("footer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        p pVar = p.f16042a;
        return new KSerializer[]{kSerializerC, v1Var, nlm.a.c(pVar), nlm.a.c(pVar), nlm.a.c(a3.f15699a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String str = null;
        String strDecodeStringElement = null;
        r rVar = null;
        r rVar2 = null;
        c3 c3Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                rVar = (r) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, p.f16042a, rVar);
                i |= 4;
            } else if (iD == 3) {
                rVar2 = (r) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, p.f16042a, rVar2);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                c3Var = (c3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, a3.f15699a, c3Var);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x(i, str, strDecodeStringElement, rVar, rVar2, c3Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x value = (x) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f16116a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f16117b);
        p pVar = p.f16042a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, pVar, value.f16118c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, pVar, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, a3.f15699a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
