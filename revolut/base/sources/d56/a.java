package d56;

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
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f111366a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f111366a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.remittances.impl.data.network.dto.DeFiTransferQuoteRequestDto", aVar, 9);
        pluginGeneratedSerialDescriptor.j("accountId", false);
        pluginGeneratedSerialDescriptor.j("assetIn", false);
        pluginGeneratedSerialDescriptor.j("assetOutRepresentations", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("amountDenomination", false);
        pluginGeneratedSerialDescriptor.j("side", false);
        pluginGeneratedSerialDescriptor.j("chain", false);
        pluginGeneratedSerialDescriptor.j("beneficiaryId", false);
        pluginGeneratedSerialDescriptor.j("fiatCurrency", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, c36.a.f20896a, v1Var, TokenAmountDto.a.f71708a, v1Var, v1Var, v1Var, nlm.a.c(v1Var), v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        c36.c cVar = null;
        String strDecodeStringElement2 = null;
        TokenAmountDto tokenAmountDto = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String str = null;
        String strDecodeStringElement6 = null;
        int i = 0;
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
                    cVar = (c36.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, c36.a.f20896a, cVar);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    tokenAmountDto = (TokenAmountDto) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, TokenAmountDto.a.f71708a, tokenAmountDto);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str);
                    i |= 128;
                    break;
                case 8:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, strDecodeStringElement, cVar, strDecodeStringElement2, tokenAmountDto, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, str, strDecodeStringElement6);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c value = (c) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f111367a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c36.a.f20896a, value.f111368b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f111369c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, TokenAmountDto.a.f71708a, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f111370g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, value.f111371h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
