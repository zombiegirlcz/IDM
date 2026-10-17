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
public final /* synthetic */ class i1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f15981a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i1 i1Var = new i1();
        f15981a = i1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.pricing_plans.ui.impl.network.dto.PlanOfferPromptLayoutDto.ContentDto", i1Var, 5);
        pluginGeneratedSerialDescriptor.j("style", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("asset", false);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{o1.f16038a, qlm.v1.f247718a, d3.f15837a, nlm.a.c(b1.f15704a), nlm.a.c(r1.f16061a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        q1 q1Var = null;
        String strDecodeStringElement = null;
        i3 i3Var = null;
        d1 d1Var = null;
        t1 t1Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                q1Var = (q1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, o1.f16038a, q1Var);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                i3Var = (i3) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, d3.f15837a, i3Var);
                i |= 4;
            } else if (iD == 3) {
                d1Var = (d1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b1.f15704a, d1Var);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                t1Var = (t1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, r1.f16061a, t1Var);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k1(i, q1Var, strDecodeStringElement, i3Var, d1Var, t1Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k1 value = (k1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        o1 o1Var = o1.f16038a;
        q1 q1Var = value.f16008a;
        t1 t1Var = value.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, o1Var, q1Var);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f16009b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, d3.f15837a, value.f16010c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, b1.f15704a, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || t1Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, r1.f16061a, t1Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
