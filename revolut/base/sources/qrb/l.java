package qrb;

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
import qlm.x;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f248700a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        f248700a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.trading.advanced.charts.impl.model.TradingAdvancedChartHistoryItem", lVar, 6);
        pluginGeneratedSerialDescriptor.j("t", false);
        pluginGeneratedSerialDescriptor.j("h", false);
        pluginGeneratedSerialDescriptor.j("l", false);
        pluginGeneratedSerialDescriptor.j("o", false);
        pluginGeneratedSerialDescriptor.j("c", false);
        pluginGeneratedSerialDescriptor.j("v", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        x xVar = x.f247723a;
        return new KSerializer[]{t0.f247706a, xVar, xVar, xVar, xVar, nlm.a.c(xVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Double d = null;
        int i = 0;
        long jDecodeLongElement = 0;
        double dDecodeDoubleElement = 0.0d;
        double dDecodeDoubleElement2 = 0.0d;
        double dDecodeDoubleElement3 = 0.0d;
        double dDecodeDoubleElement4 = 0.0d;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    dDecodeDoubleElement2 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    dDecodeDoubleElement3 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    dDecodeDoubleElement4 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, x.f247723a, d);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n(i, jDecodeLongElement, dDecodeDoubleElement, dDecodeDoubleElement2, dDecodeDoubleElement3, dDecodeDoubleElement4, d);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n value = (n) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f248701a);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 1, value.f248702b);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 2, value.f248703c);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, x.f247723a, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
