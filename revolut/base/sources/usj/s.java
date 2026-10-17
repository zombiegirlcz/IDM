package usj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class s implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f282965a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        s sVar = new s();
        f282965a = sVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.custom_assets.network.CustomAssetResponseDto", sVar, 12);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("category", false);
        pluginGeneratedSerialDescriptor.j("currentValue", true);
        pluginGeneratedSerialDescriptor.j("attributes", true);
        pluginGeneratedSerialDescriptor.j("valueHistory", false);
        pluginGeneratedSerialDescriptor.j("nextEstimationDate", true);
        pluginGeneratedSerialDescriptor.j("createdAt", false);
        pluginGeneratedSerialDescriptor.j("updatedAt", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("currentValueSource", true);
        pluginGeneratedSerialDescriptor.j("smartEstimation", true);
        pluginGeneratedSerialDescriptor.j("smartEstimationRejected", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private s() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = u.f282966m;
        v1 v1Var = v1.f247718a;
        t0 t0Var = t0.f247706a;
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{v1Var, v1Var, nlm.a.c(v.f282974a), nlm.a.c(rlm.v.f255125a), lazyArr[4].getValue(), nlm.a.c(t0Var), t0Var, t0Var, v1Var, nlm.a.c(v1Var), nlm.a.c(hVar), nlm.a.c(hVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = u.f282966m;
        dVarBeginStructure.getClass();
        String str = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        x xVar = null;
        JsonObject jsonObject = null;
        List list = null;
        Long l2 = null;
        String strDecodeStringElement3 = null;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    xVar = (x) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v.f282974a, xVar);
                    i |= 4;
                    break;
                case 3:
                    jsonObject = (JsonObject) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, rlm.v.f255125a, jsonObject);
                    i |= 8;
                    break;
                case 4:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, l2);
                    i |= 32;
                    break;
                case 6:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, v1.f247718a, str);
                    i |= 512;
                    break;
                case 10:
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.h.f247648a, bool);
                    i |= 1024;
                    break;
                case 11:
                    bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, qlm.h.f247648a, bool2);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new u(i, strDecodeStringElement, strDecodeStringElement2, xVar, jsonObject, list, l2, jDecodeLongElement, jDecodeLongElement2, strDecodeStringElement3, str, bool, bool2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        u value = (u) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = u.f282966m;
        String str = value.f282967a;
        Boolean bool = value.f282973l;
        Boolean bool2 = value.k;
        String str2 = value.f282972j;
        Long l2 = value.f;
        JsonObject jsonObject = value.d;
        x xVar = value.f282969c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f282968b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || xVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v.f282974a, xVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || jsonObject != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, rlm.v.f255125a, jsonObject);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, l2);
        }
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, value.f282970g);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 7, value.f282971h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bool2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, qlm.h.f247648a, bool2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, qlm.h.f247648a, bool);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
