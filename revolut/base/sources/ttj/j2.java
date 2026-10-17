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
public final /* synthetic */ class j2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2 f274361a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j2 j2Var = new j2();
        f274361a = j2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.rewards_hub.network.dto.UnacknowledgedChallengesDto", j2Var, 1);
        pluginGeneratedSerialDescriptor.j("count", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qlm.n0.f247680a};
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
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else {
                if (iD != 0) {
                    throw new UnknownFieldException(iD);
                }
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                i = 1;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l2(i, iDecodeIntElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l2 value = (l2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f274366a);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
