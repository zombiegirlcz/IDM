package cxk;

import ie0.l;
import java.time.ZonedDateTime;
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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f109999a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        f109999a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.trading_hours.impl.data.model.TradingSessionScheduleDto", cVar, 3);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("start", false);
        pluginGeneratedSerialDescriptor.j("end", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        l lVar = l.f160606a;
        return new KSerializer[]{e.d[0].getValue(), lVar, lVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = e.d;
        dVarBeginStructure.getClass();
        b bVar = null;
        boolean z = true;
        int i = 0;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                bVar = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), bVar);
                i |= 1;
            } else if (iD == 1) {
                zonedDateTime = (ZonedDateTime) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, l.f160606a, zonedDateTime);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                zonedDateTime2 = (ZonedDateTime) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, l.f160606a, zonedDateTime2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new e(i, bVar, zonedDateTime, zonedDateTime2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        e value = (e) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = e.d;
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f110000a != b.UNKNOWN) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f110000a);
        }
        l lVar = l.f160606a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, lVar, value.f110001b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, lVar, value.f110002c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
