package ekd;

import java.time.Instant;
import java.util.Map;
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
import qlm.v1;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f127017a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        f127017a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.suggestion.SlotIncentive.Meta", oVar, 5);
        pluginGeneratedSerialDescriptor.j("campaignId", false);
        pluginGeneratedSerialDescriptor.j("crossScreenId", true);
        pluginGeneratedSerialDescriptor.j("activeUntil", false);
        pluginGeneratedSerialDescriptor.j("analyticParams", true);
        pluginGeneratedSerialDescriptor.j("feedbackParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private o() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = q.f;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, ie0.j.f160602a, lazyArr[3].getValue(), lazyArr[4].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = q.f;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        Instant instant = null;
        Map map = null;
        Map map2 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                instant = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.j.f160602a, instant);
                i |= 4;
            } else if (iD == 3) {
                map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), map);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), map2);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new q(i, strDecodeStringElement, strDecodeStringElement2, instant, map, map2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q value = (q) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = q.f;
        String str = value.f127019a;
        Map map = value.e;
        Map map2 = value.d;
        String str2 = value.f127020b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(str2, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, str2);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, ie0.j.f160602a, value.f127021c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(map2, r0.g())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), map2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(map, r0.g())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), map);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
