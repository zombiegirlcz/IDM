package e18;

import java.math.BigDecimal;
import java.time.Instant;
import kotlin.Lazy;
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
import qlm.n0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f121918a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f121918a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.invest.smart_notifications.impl.data.database.model.PriceImpactEntity", jVar, 5);
        pluginGeneratedSerialDescriptor.j("attribution_status", false);
        pluginGeneratedSerialDescriptor.j("price_at_publication", false);
        pluginGeneratedSerialDescriptor.j("price_change_percentage", false);
        pluginGeneratedSerialDescriptor.j("attribution_window_hours", false);
        pluginGeneratedSerialDescriptor.j("snapshot_timestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l.f[0].getValue(), ie0.e.f160595a, nlm.a.c(ie0.a.f160587a), nlm.a.c(n0.f247680a), nlm.a.c(ie0.j.f160602a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = l.f;
        dVarBeginStructure.getClass();
        int i = 0;
        h hVar = null;
        ej0.b bVar = null;
        BigDecimal bigDecimal = null;
        Integer num = null;
        Instant instant = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                hVar = (h) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), hVar);
                i |= 1;
            } else if (iD == 1) {
                bVar = (ej0.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.e.f160595a, bVar);
                i |= 2;
            } else if (iD == 2) {
                bigDecimal = (BigDecimal) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ie0.a.f160587a, bigDecimal);
                i |= 4;
            } else if (iD == 3) {
                num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, n0.f247680a, num);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ie0.j.f160602a, instant);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l(i, hVar, bVar, bigDecimal, num, instant);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l value = (l) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) l.f[0].getValue(), value.f121919a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, ie0.e.f160595a, value.f121920b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, ie0.a.f160587a, value.f121921c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, n0.f247680a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, ie0.j.f160602a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
