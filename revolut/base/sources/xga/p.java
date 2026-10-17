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
public final /* synthetic */ class p implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f305657a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        f305657a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.pricing_plans.upgrade_prompt.impl.network.dto.PricingPlanContextualNudgeDto", pVar, 5);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("glow", true);
        pluginGeneratedSerialDescriptor.j("secondaryAction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(m.f305654a);
        q qVar = q.f305658a;
        return new KSerializer[]{v.f305665a, kSerializerC, qVar, qlm.h.f247648a, nlm.a.c(qVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        b0 b0Var = null;
        o oVar = null;
        s sVar = null;
        s sVar2 = null;
        boolean z = true;
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
            } else if (iD == 2) {
                sVar = (s) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, q.f305658a, sVar);
                i |= 4;
            } else if (iD == 3) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                sVar2 = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, q.f305658a, sVar2);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new u(i, b0Var, oVar, sVar, zDecodeBooleanElement, sVar2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        u value = (u) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        v vVar = v.f305665a;
        b0 b0Var = value.f305662a;
        s sVar = value.e;
        boolean z = value.d;
        o oVar = value.f305663b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, vVar, b0Var);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || oVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, m.f305654a, oVar);
        }
        q qVar = q.f305658a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, qVar, value.f305664c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, z);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || sVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qVar, sVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
