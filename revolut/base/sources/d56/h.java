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
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f111374a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        f111374a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.remittances.impl.data.network.dto.DeFiTransferQuoteResponseDto.PriceImpactDto.FeeDto", hVar, 3);
        pluginGeneratedSerialDescriptor.j("networkFeePercent", false);
        pluginGeneratedSerialDescriptor.j("networkFee", false);
        pluginGeneratedSerialDescriptor.j("networkFeeInInputAsset", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v1.f247718a, com.revolut.feature.defi.common.models.dto.c.f71712a, com.revolut.feature.defi.common.models.dto.a.f71709a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        com.revolut.feature.defi.common.models.dto.d dVar = null;
        com.revolut.feature.defi.common.models.dto.b bVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                dVar = (com.revolut.feature.defi.common.models.dto.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, com.revolut.feature.defi.common.models.dto.c.f71712a, dVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                bVar = (com.revolut.feature.defi.common.models.dto.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, com.revolut.feature.defi.common.models.dto.a.f71709a, bVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j(i, strDecodeStringElement, dVar, bVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j value = (j) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f111375a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, com.revolut.feature.defi.common.models.dto.c.f71712a, value.f111376b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, com.revolut.feature.defi.common.models.dto.a.f71709a, value.f111377c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
