package xga;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f305646a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        f305646a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.pricing_plans.upgrade_prompt.impl.network.dto.PricingPlanContextualBannerDto.ContentDto", fVar, 3);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("icon", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private f() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v.f305665a, nlm.a.c(m.f305654a), b.f305641a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        b0 b0Var = null;
        boolean z = true;
        int i = 0;
        o oVar = null;
        d dVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                b0Var = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, v.f305665a, b0Var);
                i |= 1;
            } else if (iD == 1) {
                oVar = (o) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, m.f305654a, oVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, b.f305641a, dVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new h(i, b0Var, oVar, dVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        h value = (h) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, v.f305665a, value.f305647a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, m.f305654a, value.f305648b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, b.f305641a, value.f305649c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
