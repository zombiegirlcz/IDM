package usj;

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
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f282940a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f282940a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.custom_assets.network.CreateCustomAssetRequestDto", dVar, 4);
        pluginGeneratedSerialDescriptor.j("category", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("attributes", true);
        pluginGeneratedSerialDescriptor.j("smartEstimation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(rlm.v.f255125a);
        KSerializer kSerializerC2 = nlm.a.c(qlm.h.f247648a);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, kSerializerC, kSerializerC2};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        JsonObject jsonObject = null;
        Boolean bool = null;
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
                jsonObject = (JsonObject) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, rlm.v.f255125a, jsonObject);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.h.f247648a, bool);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f(i, strDecodeStringElement, strDecodeStringElement2, jsonObject, bool);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f value = (f) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f282943a;
        Boolean bool = value.d;
        JsonObject jsonObject = value.f282945c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f282944b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || jsonObject != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, rlm.v.f255125a, jsonObject);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.h.f247648a, bool);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
