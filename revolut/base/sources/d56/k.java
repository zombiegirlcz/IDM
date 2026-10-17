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
public final /* synthetic */ class k implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f111378a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        f111378a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.remittances.impl.data.network.dto.DeFiTransferQuoteResponseDto.PriceImpactDto.MarketDto", kVar, 3);
        pluginGeneratedSerialDescriptor.j("valueLossPercent", false);
        pluginGeneratedSerialDescriptor.j("midRate", false);
        pluginGeneratedSerialDescriptor.j("executionRate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        c36.o oVar = c36.o.f20909a;
        return new KSerializer[]{v1.f247718a, oVar, oVar};
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
        c36.q qVar = null;
        c36.q qVar2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                qVar = (c36.q) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, c36.o.f20909a, qVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                qVar2 = (c36.q) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, c36.o.f20909a, qVar2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new m(i, strDecodeStringElement, qVar, qVar2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        m value = (m) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f111379a);
        c36.o oVar = c36.o.f20909a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, oVar, value.f111380b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, oVar, value.f111381c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
