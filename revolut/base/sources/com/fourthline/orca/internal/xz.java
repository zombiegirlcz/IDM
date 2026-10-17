package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes23.dex */
public final class xz implements KSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f35112b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35113c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f35114a = com.bumptech.glide.c.d("GenericMap", new SerialDescriptor[0], new okk.d(12));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final Map a(JsonObject jsonObject) {
        Pair pair;
        Set<Map.Entry> setEntrySet = jsonObject.f187951a.entrySet();
        int iB = zhm.q0.b(zhm.w.t(setEntrySet, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Map.Entry entry : setEntrySet) {
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (jsonElement instanceof kotlinx.serialization.json.b) {
                pair = new Pair(entry.getKey(), a((kotlinx.serialization.json.b) jsonElement));
            } else if (jsonElement instanceof JsonObject) {
                pair = new Pair(entry.getKey(), a((JsonObject) jsonElement));
            } else {
                if (!(jsonElement instanceof kotlinx.serialization.json.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(entry.getKey(), a((kotlinx.serialization.json.a) jsonElement));
            }
            linkedHashMap.put(pair.f186385a, pair.f186386b);
        }
        return linkedHashMap;
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f35114a;
    }

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        rlm.i iVar = decoder instanceof rlm.i ? (rlm.i) decoder : null;
        if (iVar != null) {
            JsonElement jsonElementC = iVar.c();
            if (jsonElementC instanceof JsonObject) {
                return a((JsonObject) jsonElementC);
            }
            throw new SerializationException("Cannot deserialize Json content to generic Map");
        }
        throw new SerializationException("Can only deserialize Json content to generic Map");
    }

    private final JsonElement a(Object obj2) {
        if (obj2 == null) {
            return JsonNull.INSTANCE;
        }
        return obj2 instanceof String ? rlm.j.c((String) obj2) : obj2 instanceof Number ? rlm.j.b((Number) obj2) : obj2 instanceof Boolean ? rlm.j.a((Boolean) obj2) : obj2 instanceof Map ? a((Map) obj2) : obj2 instanceof Iterable ? a((Iterable) obj2) : obj2 instanceof JsonElement ? (JsonElement) obj2 : rlm.j.c(obj2.toString());
    }

    private final JsonObject a(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iB = zhm.q0.b(zhm.w.t(setEntrySet, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(String.valueOf(entry.getKey()), a(entry.getValue()));
        }
        return new JsonObject(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(JsonElement jsonElement) {
        if (jsonElement instanceof kotlinx.serialization.json.b) {
            return a((kotlinx.serialization.json.b) jsonElement);
        }
        if (jsonElement instanceof JsonObject) {
            return a((JsonObject) jsonElement);
        }
        if (jsonElement instanceof kotlinx.serialization.json.a) {
            return zhm.d0.d1((Iterable) jsonElement);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object a(kotlinx.serialization.json.b bVar) {
        Long lValueOf = null;
        if (bVar instanceof JsonNull) {
            return null;
        }
        if (bVar.b()) {
            return bVar.a();
        }
        Boolean boolF = rlm.j.f(bVar);
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        try {
            lValueOf = Long.valueOf(rlm.j.m(bVar));
        } catch (JsonDecodingException unused) {
        }
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Object[] elements = {boolF, lValueOf, kotlin.text.y.k(bVar.a())};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.d0.d0(kotlin.collections.d.L(elements));
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, Map value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(value.size()));
        for (Map.Entry entry : value.entrySet()) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue()));
        }
        JsonObject jsonObject = new JsonObject(linkedHashMap);
        encoder.getSerializersModule();
        JsonObject.INSTANCE.serializer().serialize(encoder, jsonObject);
    }

    private final kotlinx.serialization.json.a a(Iterable iterable) {
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            arrayList.add(a(it8.next()));
        }
        return new kotlinx.serialization.json.a(arrayList);
    }

    private final List a(kotlinx.serialization.json.a aVar) {
        ArrayList arrayList = new ArrayList(zhm.w.t(aVar, 10));
        Iterator it8 = aVar.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((JsonElement) it8.next()));
        }
        return arrayList;
    }
}
