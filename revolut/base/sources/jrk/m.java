package jrk;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.t0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class m implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f178066a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f178066a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.stockdetails.impl.data.network.model.IndexMarketSentimentDto.ChartDto.RateDto", mVar, 3);
        pluginGeneratedSerialDescriptor.j("timestampUtcMillis", false);
        pluginGeneratedSerialDescriptor.j("original", false);
        pluginGeneratedSerialDescriptor.j("movingAverage", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        ie0.a aVar = ie0.a.f160587a;
        return new KSerializer[]{t0.f247706a, aVar, aVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        long jDecodeLongElement = 0;
        BigDecimal bigDecimal = null;
        BigDecimal bigDecimal2 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                bigDecimal = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.a.f160587a, bigDecimal);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                bigDecimal2 = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.a.f160587a, bigDecimal2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o(i, jDecodeLongElement, bigDecimal, bigDecimal2);
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
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f178067a);
        ie0.a aVar = ie0.a.f160587a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, aVar, value.f178068b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, aVar, value.f178069c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
