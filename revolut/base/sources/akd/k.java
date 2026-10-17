package akd;

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
import qlm.f0;
import qlm.v1;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f5793a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        f5793a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.SlotPromoBanner.Meta", kVar, 4);
        pluginGeneratedSerialDescriptor.j("crossScreenId", true);
        pluginGeneratedSerialDescriptor.j("campaignId", false);
        pluginGeneratedSerialDescriptor.j("analyticParams", true);
        pluginGeneratedSerialDescriptor.j("feedbackParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = m.e;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue(), lazyArr[3].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = m.e;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
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
                map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), map);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), map2);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new m(i, strDecodeStringElement, strDecodeStringElement2, map, map2);
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
        Lazy[] lazyArr = m.e;
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f5794a, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f5794a);
        }
        String str = value.f5795b;
        Map map = value.d;
        Map map2 = value.f5796c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(map2, r0.g())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), map2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(map, r0.g())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), map);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
