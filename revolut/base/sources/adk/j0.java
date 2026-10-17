package adk;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f3400a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j0 j0Var = new j0();
        f3400a = j0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.plan_rewards.impl.data.model.MonthlyDrawHubDto.PromotedRewardDto", j0Var, 5);
        pluginGeneratedSerialDescriptor.j("badge", false);
        pluginGeneratedSerialDescriptor.j("backgroundImageUrl", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("bottomSheet", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(q.f3425a);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{kSerializerC, v1Var, v1Var, nlm.a.c(v1Var), t.f3432a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        s sVar = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str = null;
        v vVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                sVar = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, q.f3425a, sVar);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                vVar = (v) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, t.f3432a, vVar);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l0(i, sVar, strDecodeStringElement, strDecodeStringElement2, str, vVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l0 value = (l0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, q.f3425a, value.f3403a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f3404b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f3405c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, t.f3432a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
