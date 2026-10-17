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
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f211890a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f211890a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.exchange.impl.data.network.dto.DeFiSwapQuoteRequest", jVar, 7);
        pluginGeneratedSerialDescriptor.j("accountId", false);
        pluginGeneratedSerialDescriptor.j("assetIn", false);
        pluginGeneratedSerialDescriptor.j("assetOut", false);
        pluginGeneratedSerialDescriptor.j("assetOutRepresentations", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("side", false);
        pluginGeneratedSerialDescriptor.j("fiatCurrency", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, c0.d, c36.a.f20896a, v1Var, TokenAmountDto.a.f71708a, v1Var, v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        b0 b0Var = null;
        c36.c cVar = null;
        String strDecodeStringElement2 = null;
        TokenAmountDto tokenAmountDto = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    b0Var = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, c0.d, b0Var);
                    i |= 2;
                    break;
                case 2:
                    cVar = (c36.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, c36.a.f20896a, cVar);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    tokenAmountDto = (TokenAmountDto) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, TokenAmountDto.a.f71708a, tokenAmountDto);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l(i, strDecodeStringElement, b0Var, cVar, strDecodeStringElement2, tokenAmountDto, strDecodeStringElement3, strDecodeStringElement4);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l value = (l) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f211891a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c0.d, value.f211892b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, c36.a.f20896a, value.f211893c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, TokenAmountDto.a.f71708a, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f211894g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
