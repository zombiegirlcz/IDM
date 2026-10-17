package pk0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import okk.d;
import olm.g;
import rlm.i;
import rlm.j;
import rlm.m;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f236910a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f236911b = com.bumptech.glide.c.d("PersonalisationEntryValue", new SerialDescriptor[0], new d(12));

    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object a(JsonElement jsonElement) {
        if (jsonElement instanceof JsonNull) {
            return new Object();
        }
        if (jsonElement instanceof kotlinx.serialization.json.b) {
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonElement;
            if (bVar.b()) {
                return bVar.a();
            }
            if (j.f(bVar) != null) {
                Boolean boolF = j.f(bVar);
                if (boolF != null) {
                    return boolF;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            if (y.k(bVar.a()) == null) {
                return bVar.a();
            }
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Double dK = y.k(bVar.a());
            if (dK != null) {
                return dK;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (jsonElement instanceof kotlinx.serialization.json.a) {
            Iterable iterable = (Iterable) jsonElement;
            ArrayList arrayList = new ArrayList(w.t(iterable, 10));
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                arrayList.add(a((JsonElement) it8.next()));
            }
            return arrayList;
        }
        if (!(jsonElement instanceof JsonObject)) {
            throw new NoWhenBranchMatchedException();
        }
        Map map = (Map) jsonElement;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a((JsonElement) entry.getValue()));
        }
        return linkedHashMap;
    }

    public static JsonElement b(Object obj2) {
        if (obj2 instanceof Number) {
            return j.b((Number) obj2);
        }
        if (obj2 instanceof Boolean) {
            return j.a((Boolean) obj2);
        }
        if (obj2 instanceof String) {
            return j.c((String) obj2);
        }
        if (obj2 instanceof List) {
            Iterable iterable = (Iterable) obj2;
            ArrayList arrayList = new ArrayList(w.t(iterable, 10));
            for (Object obj3 : iterable) {
                if (obj3 == null) {
                    throw new SerializationException("Nulls not allowed");
                }
                arrayList.add(b(obj3));
            }
            return new kotlinx.serialization.json.a(arrayList);
        }
        if (!(obj2 instanceof Map)) {
            if (obj2 instanceof JsonElement) {
                return (JsonElement) obj2;
            }
            throw new SerializationException(p.a.p("Unable to serialize type ", o0.f186429a.b(obj2.getClass()).m(), " into JsonElement"));
        }
        Map map = (Map) obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(String.valueOf(entry.getKey()), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            if (value == null) {
                throw new SerializationException("Nulls not allowed");
            }
            linkedHashMap2.put(key, b(value));
        }
        return new JsonObject(linkedHashMap2);
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Object objA;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        i iVar = decoder instanceof i ? (i) decoder : null;
        JsonElement jsonElementC = iVar != null ? iVar.c() : null;
        return (jsonElementC == null || (objA = a(jsonElementC)) == null) ? new Object() : objA;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f236911b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m mVar = encoder instanceof m ? (m) encoder : null;
        JsonElement jsonElementB = b(value);
        if (mVar != null) {
            mVar.b(jsonElementB);
        }
    }
}
