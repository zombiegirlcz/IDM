package k16;

import java.math.BigInteger;
import java.time.Instant;
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
public final /* synthetic */ class n implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f180121a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        n nVar = new n();
        f180121a = nVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.accounts.impl.data.network.dto.DeFiBalanceDto", nVar, 6);
        pluginGeneratedSerialDescriptor.j("asset", false);
        pluginGeneratedSerialDescriptor.j("accountScopedAssetId", false);
        pluginGeneratedSerialDescriptor.j("balance", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("updatedDate", false);
        pluginGeneratedSerialDescriptor.j("averagePrice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private n() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(k.f180118a);
        ie0.j jVar = ie0.j.f160602a;
        return new KSerializer[]{h.f180114a, v1.f247718a, ie0.b.f160589a, jVar, jVar, kSerializerC};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        j jVar = null;
        String strDecodeStringElement = null;
        BigInteger bigInteger = null;
        Instant instant = null;
        Instant instant2 = null;
        m mVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jVar = (j) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, h.f180114a, jVar);
                    i |= 1;
                    break;
                case 1:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    bigInteger = (BigInteger) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.b.f160589a, bigInteger);
                    i |= 4;
                    break;
                case 3:
                    instant = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, ie0.j.f160602a, instant);
                    i |= 8;
                    break;
                case 4:
                    instant2 = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, ie0.j.f160602a, instant2);
                    i |= 16;
                    break;
                case 5:
                    mVar = (m) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, k.f180118a, mVar);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new p(i, jVar, strDecodeStringElement, bigInteger, instant, instant2, mVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        p value = (p) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, h.f180114a, value.f180122a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f180123b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, ie0.b.f160589a, value.f180124c);
        ie0.j jVar = ie0.j.f160602a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, jVar, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, jVar, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, k.f180118a, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
