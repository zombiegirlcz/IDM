package bjk;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes11.dex */
public final class h2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2 f15973a = new h2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PluginGeneratedSerialDescriptor f15974b = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.pricing_plans.ui.impl.network.dto.PricingPlanActionDto", null, 0);

    private h2() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String strA;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof rlm.i)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        rlm.i iVar = (rlm.i) decoder;
        JsonObject jsonObjectK = rlm.j.k(iVar.c());
        JsonElement jsonElement = (JsonElement) jsonObjectK.get("type");
        if (jsonElement == null || (strA = rlm.j.l(jsonElement).a()) == null) {
            throw new SerializationException("Field 'type' is missing");
        }
        JsonElement jsonElement2 = (JsonElement) jsonObjectK.get("payload");
        JsonObject jsonObjectK2 = jsonElement2 != null ? rlm.j.k(jsonElement2) : null;
        switch (strA.hashCode()) {
            case -2034635050:
                if (strA.equals("DECLINE")) {
                    return k2.INSTANCE;
                }
                break;
            case -1907201458:
                if (strA.equals("SEE_ALL_DOCUMENTS")) {
                    if (jsonObjectK2 != null) {
                        return (v2) iVar.a().a(p2.INSTANCE.serializer(), jsonObjectK2);
                    }
                    throw new SerializationException("Field 'payload' is missing");
                }
                break;
            case -1905312150:
                if (strA.equals("DISMISS")) {
                    return l2.INSTANCE;
                }
                break;
            case -1350114542:
                if (strA.equals("APPLY_DISCOUNT")) {
                    if (jsonObjectK2 != null) {
                        return (v2) iVar.a().a(i2.INSTANCE.serializer(), jsonObjectK2);
                    }
                    throw new SerializationException("Field 'payload' is missing");
                }
                break;
            case -335038192:
                if (strA.equals("CLAIM_PLAN_REFERRAL")) {
                    if (jsonObjectK2 != null) {
                        return (v2) iVar.a().a(j2.INSTANCE.serializer(), jsonObjectK2);
                    }
                    throw new SerializationException("Field 'payload' is missing");
                }
                break;
            case 69924934:
                if (strA.equals("SEE_ALL_BENEFITS")) {
                    if (jsonObjectK2 != null) {
                        return (v2) iVar.a().a(o2.INSTANCE.serializer(), jsonObjectK2);
                    }
                    throw new SerializationException("Field 'payload' is missing");
                }
                break;
            case 279273946:
                if (strA.equals("OPEN_URL")) {
                    if (jsonObjectK2 != null) {
                        return (v2) iVar.a().a(n2.INSTANCE.serializer(), jsonObjectK2);
                    }
                    throw new SerializationException("Field 'payload' is missing");
                }
                break;
            case 486811132:
                if (strA.equals("UPGRADE")) {
                    if (jsonObjectK2 != null) {
                        return (v2) iVar.a().a(u2.INSTANCE.serializer(), jsonObjectK2);
                    }
                    throw new SerializationException("Field 'payload' is missing");
                }
                break;
            case 1146433927:
                if (strA.equals("OPEN_BILLING_PICKER")) {
                    if (jsonObjectK2 != null) {
                        return (v2) iVar.a().a(m2.INSTANCE.serializer(), jsonObjectK2);
                    }
                    throw new SerializationException("Field 'payload' is missing");
                }
                break;
        }
        return new t2(strA);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f15974b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        v2 value = (v2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15974b;
        encoder.beginStructure(pluginGeneratedSerialDescriptor).endStructure(pluginGeneratedSerialDescriptor);
    }
}
