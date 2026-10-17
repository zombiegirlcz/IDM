package ntj;

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
public final /* synthetic */ class t0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f219126a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        t0 t0Var = new t0();
        f219126a = t0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.rewards_hub.data.storage.RewardsHubEntity", t0Var, 6);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("totalActiveChallenges", false);
        pluginGeneratedSerialDescriptor.j("totalPastChallenges", false);
        pluginGeneratedSerialDescriptor.j("challenges", false);
        pluginGeneratedSerialDescriptor.j("internalCampaigns", false);
        pluginGeneratedSerialDescriptor.j("quests", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private t0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = k1.f219083g;
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{lazyArr[0].getValue(), n0Var, n0Var, lazyArr[3].getValue(), lazyArr[4].getValue(), lazyArr[5].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k1.f219083g;
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list3);
                    i |= 16;
                    break;
                case 5:
                    list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list4);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k1(i, list, iDecodeIntElement, iDecodeIntElement2, list2, list3, list4);
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
        Lazy[] lazyArr = k1.f219083g;
        mlm.h hVar = (mlm.h) lazyArr[0].getValue();
        List list = value.f219084a;
        List list2 = value.f;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, list);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f219085b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f219086c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list2, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
