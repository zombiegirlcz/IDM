package bjk;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes11.dex */
public final class c2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2 f15705a = new c2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PluginGeneratedSerialDescriptor f15706b = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.pricing_plans.ui.impl.network.dto.PlanOfferPromptPresentActionDto", null, 0);

    private c2() {
    }

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
        if (!strA.equals("USER_OFFER_PRESENTED")) {
            return new a2(strA);
        }
        if (jsonObjectK2 != null) {
            return (b2) iVar.a().a(z1.INSTANCE.serializer(), jsonObjectK2);
        }
        throw new SerializationException("Field 'payload' is missing");
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f15706b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        JsonObject jsonObjectA;
        b2 value = (b2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(encoder instanceof rlm.m)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (value instanceof z1) {
            rlm.t tVar = new rlm.t();
            hx7.q.S(tVar, "type", "USER_OFFER_PRESENTED");
            Json jsonA = ((rlm.m) encoder).a();
            KSerializer serializer = z1.INSTANCE.serializer();
            jsonA.getClass();
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            tVar.b(g4i.a.O(jsonA, value, serializer), "payload");
            jsonObjectA = tVar.a();
        } else {
            if (!(value instanceof a2)) {
                throw new NoWhenBranchMatchedException();
            }
            rlm.t tVar2 = new rlm.t();
            hx7.q.S(tVar2, "type", ((a2) value).f15697a);
            jsonObjectA = tVar2.a();
        }
        ((rlm.m) encoder).b(jsonObjectA);
    }
}
