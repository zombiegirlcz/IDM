package ntj;

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
public final /* synthetic */ class o implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f219107a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        f219107a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.rewards_hub.data.storage.RewardsHubChallengeEntity.ProgressEntity", oVar, 2);
        pluginGeneratedSerialDescriptor.j("completedSteps", false);
        pluginGeneratedSerialDescriptor.j("totalSteps", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private o() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{n0Var, n0Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new q(i, iDecodeIntElement, iDecodeIntElement2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q value = (q) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f219111a);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f219112b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
