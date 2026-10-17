package n36;

import com.revolut.feature.defi.common.models.dto.TokenAmountDto;
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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f211903a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        u uVar = new u();
        f211903a = uVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.exchange.impl.data.network.dto.DeFiSwapQuoteResponse.SourceAmount", uVar, 2);
        pluginGeneratedSerialDescriptor.j("asset", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private u() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{c0.d, TokenAmountDto.a.f71708a};
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
        TokenAmountDto tokenAmountDto = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                b0Var = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, c0.d, b0Var);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                tokenAmountDto = (TokenAmountDto) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, TokenAmountDto.a.f71708a, tokenAmountDto);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new w(i, b0Var, tokenAmountDto);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        w value = (w) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c0.d, value.f211904a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, TokenAmountDto.a.f71708a, value.f211905b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
