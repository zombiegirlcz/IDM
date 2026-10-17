package d56;

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
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f111372a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f111372a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.remittances.impl.data.network.dto.DeFiTransferQuoteResponseDto", dVar, 11);
        pluginGeneratedSerialDescriptor.j("accountId", false);
        pluginGeneratedSerialDescriptor.j("amountIn", false);
        pluginGeneratedSerialDescriptor.j("amountInFiat", false);
        pluginGeneratedSerialDescriptor.j("amountOut", false);
        pluginGeneratedSerialDescriptor.j("amountOutFiat", false);
        pluginGeneratedSerialDescriptor.j("rate", false);
        pluginGeneratedSerialDescriptor.j("side", false);
        pluginGeneratedSerialDescriptor.j("fee", false);
        pluginGeneratedSerialDescriptor.j("priceImpact", false);
        pluginGeneratedSerialDescriptor.j("expiresAt", false);
        pluginGeneratedSerialDescriptor.j("signature", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(f.f111373a);
        v1 v1Var = v1.f247718a;
        com.revolut.feature.defi.common.models.dto.a aVar = com.revolut.feature.defi.common.models.dto.a.f71709a;
        c36.l lVar = c36.l.f20906a;
        return new KSerializer[]{v1Var, aVar, lVar, aVar, lVar, c36.o.f20909a, v1Var, c36.i.f20902a, kSerializerC, t0.f247706a, v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        c36.k kVar = null;
        String strDecodeStringElement = null;
        com.revolut.feature.defi.common.models.dto.b bVar = null;
        c36.n nVar = null;
        com.revolut.feature.defi.common.models.dto.b bVar2 = null;
        c36.n nVar2 = null;
        c36.q qVar = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        long jDecodeLongElement = 0;
        int i = 0;
        boolean z = true;
        n nVar3 = null;
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
                    bVar = (com.revolut.feature.defi.common.models.dto.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, com.revolut.feature.defi.common.models.dto.a.f71709a, bVar);
                    i |= 2;
                    break;
                case 2:
                    nVar = (c36.n) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, c36.l.f20906a, nVar);
                    i |= 4;
                    break;
                case 3:
                    bVar2 = (com.revolut.feature.defi.common.models.dto.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, com.revolut.feature.defi.common.models.dto.a.f71709a, bVar2);
                    i |= 8;
                    break;
                case 4:
                    nVar2 = (c36.n) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, c36.l.f20906a, nVar2);
                    i |= 16;
                    break;
                case 5:
                    qVar = (c36.q) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, c36.o.f20909a, qVar);
                    i |= 32;
                    break;
                case 6:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    kVar = (c36.k) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, c36.i.f20902a, kVar);
                    i |= 128;
                    break;
                case 8:
                    nVar3 = (n) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, f.f111373a, nVar3);
                    i |= 256;
                    break;
                case 9:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o(i, strDecodeStringElement, bVar, nVar, bVar2, nVar2, qVar, strDecodeStringElement2, kVar, nVar3, jDecodeLongElement, strDecodeStringElement3);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f111385a);
        com.revolut.feature.defi.common.models.dto.a aVar = com.revolut.feature.defi.common.models.dto.a.f71709a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, aVar, value.f111386b);
        c36.l lVar = c36.l.f20906a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, lVar, value.f111387c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, aVar, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, lVar, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, c36.o.f20909a, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f111388g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, c36.i.f20902a, value.f111389h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, f.f111373a, value.i);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 9, value.f111390j);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
