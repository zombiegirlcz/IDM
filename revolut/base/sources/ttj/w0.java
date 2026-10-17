package ttj;

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
public final /* synthetic */ class w0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f274420a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        w0 w0Var = new w0();
        f274420a = w0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.rewards_hub.network.dto.RewardsHubDto", w0Var, 6);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("totalActiveChallenges", false);
        pluginGeneratedSerialDescriptor.j("totalPastChallenges", false);
        pluginGeneratedSerialDescriptor.j("challenges", false);
        pluginGeneratedSerialDescriptor.j("internalCampaigns", false);
        pluginGeneratedSerialDescriptor.j("quests", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private w0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = n1.f274377g;
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{lazyArr[0].getValue(), n0Var, n0Var, lazyArr[3].getValue(), lazyArr[4].getValue(), lazyArr[5].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = n1.f274377g;
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
        return new n1(i, list, iDecodeIntElement, iDecodeIntElement2, list2, list3, list4);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n1 value = (n1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = n1.f274377g;
        mlm.h hVar = (mlm.h) lazyArr[0].getValue();
        List list = value.f274378a;
        List list2 = value.f;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, list);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f274379b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f274380c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list2, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
