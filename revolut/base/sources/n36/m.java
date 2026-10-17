package n36;

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
public final /* synthetic */ class m implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f211895a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f211895a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.exchange.impl.data.network.dto.DeFiSwapQuoteResponse", mVar, 11);
        pluginGeneratedSerialDescriptor.j("accountId", false);
        pluginGeneratedSerialDescriptor.j("amountIn", false);
        pluginGeneratedSerialDescriptor.j("amountInFiat", false);
        pluginGeneratedSerialDescriptor.j("amountOut", false);
        pluginGeneratedSerialDescriptor.j("amountOutFiat", false);
        pluginGeneratedSerialDescriptor.j("amountOutPocketCurrency", false);
        pluginGeneratedSerialDescriptor.j("rate", false);
        pluginGeneratedSerialDescriptor.j("side", false);
        pluginGeneratedSerialDescriptor.j("fee", false);
        pluginGeneratedSerialDescriptor.j("expiresAt", false);
        pluginGeneratedSerialDescriptor.j("signature", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(o.f211896a);
        v1 v1Var = v1.f247718a;
        c36.l lVar = c36.l.f20906a;
        return new KSerializer[]{v1Var, u.f211903a, lVar, com.revolut.feature.defi.common.models.dto.a.f71709a, lVar, kSerializerC, r.f211899a, v1Var, c36.i.f20902a, t0.f247706a, v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        c36.k kVar = null;
        int i = 0;
        String strDecodeStringElement = null;
        w wVar = null;
        c36.n nVar = null;
        com.revolut.feature.defi.common.models.dto.b bVar = null;
        c36.n nVar2 = null;
        q qVar = null;
        t tVar = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        long jDecodeLongElement = 0;
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
                    wVar = (w) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, u.f211903a, wVar);
                    i |= 2;
                    break;
                case 2:
                    nVar = (c36.n) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, c36.l.f20906a, nVar);
                    i |= 4;
                    break;
                case 3:
                    bVar = (com.revolut.feature.defi.common.models.dto.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, com.revolut.feature.defi.common.models.dto.a.f71709a, bVar);
                    i |= 8;
                    break;
                case 4:
                    nVar2 = (c36.n) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, c36.l.f20906a, nVar2);
                    i |= 16;
                    break;
                case 5:
                    qVar = (q) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, o.f211896a, qVar);
                    i |= 32;
                    break;
                case 6:
                    tVar = (t) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, r.f211899a, tVar);
                    i |= 64;
                    break;
                case 7:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    kVar = (c36.k) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, c36.i.f20902a, kVar);
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
        return new x(i, strDecodeStringElement, wVar, nVar, bVar, nVar2, qVar, tVar, strDecodeStringElement2, kVar, jDecodeLongElement, strDecodeStringElement3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x value = (x) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f211906a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, u.f211903a, value.f211907b);
        c36.l lVar = c36.l.f20906a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, lVar, value.f211908c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, com.revolut.feature.defi.common.models.dto.a.f71709a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, lVar, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, o.f211896a, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, r.f211899a, value.f211909g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f211910h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, c36.i.f20902a, value.i);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 9, value.f211911j);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
