package m2l;

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
import qlm.n0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f202196a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        f202196a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.wealth.data.core.insights.AnalystRatingsInsightDto.RatingsDistributionDto", fVar, 6);
        pluginGeneratedSerialDescriptor.j("consensus", false);
        pluginGeneratedSerialDescriptor.j("strongBuyRecommendations", false);
        pluginGeneratedSerialDescriptor.j("buyRecommendations", false);
        pluginGeneratedSerialDescriptor.j("holdRecommendations", false);
        pluginGeneratedSerialDescriptor.j("sellRecommendations", false);
        pluginGeneratedSerialDescriptor.j("strongSellRecommendations", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        n0 n0Var = n0.f247680a;
        return new KSerializer[]{h.f202198g[0].getValue(), n0Var, n0Var, n0Var, n0Var, n0Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = h.f202198g;
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        int iDecodeIntElement3 = 0;
        int iDecodeIntElement4 = 0;
        int iDecodeIntElement5 = 0;
        k0 k0Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    k0Var = (k0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), k0Var);
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
                    iDecodeIntElement3 = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iDecodeIntElement4 = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iDecodeIntElement5 = dVarBeginStructure.decodeIntElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new h(i, k0Var, iDecodeIntElement, iDecodeIntElement2, iDecodeIntElement3, iDecodeIntElement4, iDecodeIntElement5);
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
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) h.f202198g[0].getValue(), value.f202199a);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f202200b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f202201c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
