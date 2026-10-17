package sdl;

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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class k1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f261978a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k1 k1Var = new k1();
        f261978a = k1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingProductDetailsDto.Robo.Fees.Management", k1Var, 2);
        pluginGeneratedSerialDescriptor.j("yearly-rate", false);
        pluginGeneratedSerialDescriptor.j("min", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ie0.a.f160587a, nlm.a.c(ie0.o.f160615a)};
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
        dj0.d dVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                bigDecimal = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.a.f160587a, bigDecimal);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                dVar = (dj0.d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ie0.o.f160615a, dVar);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new m1(i, bigDecimal, dVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        m1 value = (m1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.a.f160587a, value.f261983a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, ie0.o.f160615a, value.f261984b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
