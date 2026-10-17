package bjk;

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

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f15696a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a1 a1Var = new a1();
        f15696a = a1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.pricing_plans.ui.impl.network.dto.PlanOfferPromptLayoutDto", a1Var, 6);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("background", false);
        pluginGeneratedSerialDescriptor.j("footer", false);
        pluginGeneratedSerialDescriptor.j("format", true);
        pluginGeneratedSerialDescriptor.j("presentActions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(l1.f16017a), i1.f15981a, nlm.a.c(e1.f15842a), nlm.a.c(a3.f15699a), nlm.a.c(qlm.v1.f247718a), nlm.a.c((KSerializer) x1.f16119g[5].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x1.f16119g;
        dVarBeginStructure.getClass();
        int i = 0;
        n1 n1Var = null;
        k1 k1Var = null;
        g1 g1Var = null;
        c3 c3Var = null;
        String str = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    n1Var = (n1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, l1.f16017a, n1Var);
                    i |= 1;
                    break;
                case 1:
                    k1Var = (k1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, i1.f15981a, k1Var);
                    i |= 2;
                    break;
                case 2:
                    g1Var = (g1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, e1.f15842a, g1Var);
                    i |= 4;
                    break;
                case 3:
                    c3Var = (c3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a3.f15699a, c3Var);
                    i |= 8;
                    break;
                case 4:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str);
                    i |= 16;
                    break;
                case 5:
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x1(i, n1Var, k1Var, g1Var, c3Var, str, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x1 value = (x1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x1.f16119g;
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f16120a != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, l1.f16017a, value.f16120a);
        }
        i1 i1Var = i1.f15981a;
        k1 k1Var = value.f16121b;
        List list = value.f;
        String str = value.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, i1Var, k1Var);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, e1.f15842a, value.f16122c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, a3.f15699a, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
