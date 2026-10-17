package s1l;

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
import qlm.v1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f259161a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        f259161a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.travel_status.impl.data.dto.partner.TravelStatusPartnerLayoutDto.AvailableUntilDto", bVar, 3);
        pluginGeneratedSerialDescriptor.j("icon", false);
        pluginGeneratedSerialDescriptor.j("expirationDate", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{o.f259197a, nlm.a.c(ie0.j.f160602a), nlm.a.c(v1.f247718a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        q qVar = null;
        boolean z = true;
        int i = 0;
        Instant instant = null;
        String str = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                qVar = (q) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, o.f259197a, qVar);
                i |= 1;
            } else if (iD == 1) {
                instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ie0.j.f160602a, instant);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d(i, qVar, instant, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d value = (d) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        o oVar = o.f259197a;
        q qVar = value.f259165a;
        String str = value.f259167c;
        Instant instant = value.f259166b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, oVar, qVar);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, ie0.j.f160602a, instant);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
