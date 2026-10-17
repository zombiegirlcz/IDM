package ttj;

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
public final /* synthetic */ class p implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f274391a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        f274391a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.rewards_hub.network.dto.RewardsHubChallengeDto", pVar, 11);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("campaignId", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("asset", false);
        pluginGeneratedSerialDescriptor.j("deadline", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("streak", false);
        pluginGeneratedSerialDescriptor.j("progress", false);
        pluginGeneratedSerialDescriptor.j("userAcknowledged", false);
        pluginGeneratedSerialDescriptor.j("rewardConfettiSeen", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.t0 t0Var = qlm.t0.f247706a;
        KSerializer kSerializerC = nlm.a.c(t0Var);
        KSerializer kSerializerC2 = nlm.a.c(t0Var);
        KSerializer kSerializerC3 = nlm.a.c(qlm.n0.f247680a);
        KSerializer kSerializerC4 = nlm.a.c(r.f274396a);
        qlm.h hVar = qlm.h.f247648a;
        KSerializer kSerializerC5 = nlm.a.c(hVar);
        KSerializer kSerializerC6 = nlm.a.c(hVar);
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, v1Var, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Boolean bool = null;
        Boolean bool2 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        Long l2 = null;
        Long l3 = null;
        Integer num = null;
        t tVar = null;
        int i = 0;
        boolean z3 = true;
        while (z3) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z3 = false;
                    continue;
                case 0:
                    z = z3;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    continue;
                case 2:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    continue;
                case 3:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    z = z3;
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.t0.f247706a, l2);
                    i |= 32;
                    break;
                case 6:
                    z = z3;
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.t0.f247706a, l3);
                    i |= 64;
                    break;
                case 7:
                    z = z3;
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.n0.f247680a, num);
                    i |= 128;
                    break;
                case 8:
                    z = z3;
                    tVar = (t) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, r.f274396a, tVar);
                    i |= 256;
                    break;
                case 9:
                    z = z3;
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.h.f247648a, bool);
                    i |= 512;
                    break;
                case 10:
                    z = z3;
                    bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.h.f247648a, bool2);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            z3 = z;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new u(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, l2, l3, num, tVar, bool, bool2);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f274410a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f274411b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f274412c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, t0Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, t0Var, value.f274413g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, qlm.n0.f247680a, value.f274414h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, r.f274396a, value.i);
        qlm.h hVar = qlm.h.f247648a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, hVar, value.f274415j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, hVar, value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
