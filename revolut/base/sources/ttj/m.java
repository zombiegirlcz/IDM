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
public final /* synthetic */ class m implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f274367a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f274367a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.rewards_hub.network.dto.RewardsHubChallengeDetailsDto", mVar, 14);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("campaignId", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("asset", false);
        pluginGeneratedSerialDescriptor.j("deadline", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("streak", false);
        pluginGeneratedSerialDescriptor.j("steps", false);
        pluginGeneratedSerialDescriptor.j("hasEligibilityCriteria", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("userAcknowledged", false);
        pluginGeneratedSerialDescriptor.j("rewardConfettiSeen", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = o.o;
        qlm.v1 v1Var = qlm.v1.f247718a;
        qlm.t0 t0Var = qlm.t0.f247706a;
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(qlm.n0.f247680a), lazyArr[9].getValue(), nlm.a.c(hVar), nlm.a.c(j.f274354a), nlm.a.c(hVar), nlm.a.c(hVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o.o;
        dVarBeginStructure.getClass();
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        l lVar = null;
        List list = null;
        Boolean bool3 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        Long l2 = null;
        Long l3 = null;
        String strDecodeStringElement6 = null;
        int i = 0;
        boolean z = true;
        while (true) {
            String str2 = strDecodeStringElement;
            if (!z) {
                dVarBeginStructure.endStructure(serialDescriptor);
                return new o(i, strDecodeStringElement6, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, l2, l3, num, list, bool3, lVar, bool2, bool);
            }
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = strDecodeStringElement2;
                    z = false;
                    strDecodeStringElement = str2;
                    strDecodeStringElement2 = str;
                    break;
                case 0:
                    str = strDecodeStringElement2;
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    strDecodeStringElement = str2;
                    strDecodeStringElement2 = str;
                    break;
                case 1:
                    str = strDecodeStringElement2;
                    i |= 2;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    strDecodeStringElement2 = str;
                    break;
                case 2:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    strDecodeStringElement = str2;
                    break;
                case 3:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    strDecodeStringElement = str2;
                    break;
                case 4:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    strDecodeStringElement = str2;
                    break;
                case 5:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    strDecodeStringElement = str2;
                    break;
                case 6:
                    str = strDecodeStringElement2;
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.t0.f247706a, l2);
                    i |= 64;
                    strDecodeStringElement = str2;
                    strDecodeStringElement2 = str;
                    break;
                case 7:
                    str = strDecodeStringElement2;
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.t0.f247706a, l3);
                    i |= 128;
                    strDecodeStringElement = str2;
                    strDecodeStringElement2 = str;
                    break;
                case 8:
                    str = strDecodeStringElement2;
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.n0.f247680a, num);
                    i |= 256;
                    strDecodeStringElement = str2;
                    strDecodeStringElement2 = str;
                    break;
                case 9:
                    str = strDecodeStringElement2;
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list);
                    i |= 512;
                    strDecodeStringElement = str2;
                    strDecodeStringElement2 = str;
                    break;
                case 10:
                    str = strDecodeStringElement2;
                    bool3 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.h.f247648a, bool3);
                    i |= 1024;
                    strDecodeStringElement = str2;
                    strDecodeStringElement2 = str;
                    break;
                case 11:
                    str = strDecodeStringElement2;
                    lVar = (l) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, j.f274354a, lVar);
                    i |= 2048;
                    strDecodeStringElement = str2;
                    strDecodeStringElement2 = str;
                    break;
                case 12:
                    str = strDecodeStringElement2;
                    bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.h.f247648a, bool2);
                    i |= 4096;
                    strDecodeStringElement = str2;
                    strDecodeStringElement2 = str;
                    break;
                case 13:
                    str = strDecodeStringElement2;
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, qlm.h.f247648a, bool);
                    i |= 8192;
                    strDecodeStringElement = str2;
                    strDecodeStringElement2 = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        o value = (o) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o.o;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f274381a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f274382b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f274383c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, t0Var, value.f274384g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, t0Var, value.f274385h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, qlm.n0.f247680a, value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f274386j);
        qlm.h hVar = qlm.h.f247648a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, hVar, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, j.f274354a, value.f274387l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, hVar, value.f274388m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, hVar, value.f274389n);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
