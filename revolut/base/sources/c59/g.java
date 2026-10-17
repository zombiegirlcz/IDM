package c59;

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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f21479a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f21479a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.market_alert_settings.impl.data.network.dto.UpdateMarketAlertSettingsRequest", gVar, 2);
        pluginGeneratedSerialDescriptor.j("cryptoVolatility", true);
        pluginGeneratedSerialDescriptor.j("tradingInsights", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private g() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        b bVar = b.f21475a;
        return new KSerializer[]{nlm.a.c(bVar), nlm.a.c(bVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        d dVar = null;
        boolean z = true;
        int i = 0;
        d dVar2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, b.f21475a, dVar);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                dVar2 = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b.f21475a, dVar2);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i(i, dVar, dVar2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        i value = (i) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f21480a != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, b.f21475a, value.f21480a);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f21481b != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, b.f21475a, value.f21481b);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
