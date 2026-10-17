package ci7;

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
import qlm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class q implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f24417a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q qVar = new q();
        f24417a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.instruments.trend.collections.impl.network.InstrumentsTrendCollectionDto.InstrumentDto.CustomAttributes.RecommendedBuys", qVar, 3);
        pluginGeneratedSerialDescriptor.j("tsr", false);
        pluginGeneratedSerialDescriptor.j("sharpeRatio", false);
        pluginGeneratedSerialDescriptor.j("volatility", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private q() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        ie0.a aVar = ie0.a.f160587a;
        return new KSerializer[]{aVar, aVar, aVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        BigDecimal bigDecimal = null;
        boolean z = true;
        int i = 0;
        BigDecimal bigDecimal2 = null;
        BigDecimal bigDecimal3 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                bigDecimal = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.a.f160587a, bigDecimal);
                i |= 1;
            } else if (iD == 1) {
                bigDecimal2 = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.a.f160587a, bigDecimal2);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                bigDecimal3 = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.a.f160587a, bigDecimal3);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new s(i, bigDecimal, bigDecimal2, bigDecimal3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        s value = (s) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ie0.a aVar = ie0.a.f160587a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, aVar, value.f24418a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, aVar, value.f24419b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, aVar, value.f24420c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
