package qk0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import olm.g;
import qg7.v;
import qlm.t0;
import rlm.j;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f246935a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f246936b = com.bumptech.glide.c.d("PersonalisationStorageEntry", new SerialDescriptor[0], new v(26));

    private f() {
    }

    public static JsonElement a(Object obj2) {
        if (obj2 == null) {
            return JsonNull.INSTANCE;
        }
        if (obj2 instanceof String) {
            return j.c((String) obj2);
        }
        if (obj2 instanceof Boolean) {
            return j.a((Boolean) obj2);
        }
        if (obj2 instanceof Number) {
            return j.b((Number) obj2);
        }
        if (obj2 instanceof List) {
            Iterable iterable = (Iterable) obj2;
            ArrayList arrayList = new ArrayList(w.t(iterable, 10));
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                arrayList.add(a(it8.next()));
            }
            return new kotlinx.serialization.json.a(arrayList);
        }
        if (!(obj2 instanceof Map)) {
            return j.c(obj2.toString());
        }
        Map map = (Map) obj2;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList2.add(new Pair(String.valueOf(entry.getKey()), a(entry.getValue())));
        }
        return new JsonObject(r0.t(arrayList2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Serializable b(JsonElement jsonElement) {
        if (jsonElement instanceof kotlinx.serialization.json.b) {
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonElement;
            return bVar.b() ? bVar.a() : Intrinsics.f(bVar.a(), "true") ? Boolean.TRUE : Intrinsics.f(bVar.a(), "false") ? Boolean.FALSE : y.k(bVar.a()) != null ? Double.valueOf(Double.parseDouble(bVar.a())) : bVar.a();
        }
        if (jsonElement instanceof kotlinx.serialization.json.a) {
            Iterable iterable = (Iterable) jsonElement;
            ArrayList arrayList = new ArrayList(w.t(iterable, 10));
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                arrayList.add(b((JsonElement) it8.next()));
            }
            return arrayList;
        }
        if (!(jsonElement instanceof JsonObject)) {
            throw new NoWhenBranchMatchedException();
        }
        Map map = (Map) jsonElement;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), b((JsonElement) entry.getValue()));
        }
        return linkedHashMap;
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        g gVar = f246936b;
        plm.d dVarBeginStructure = decoder.beginStructure(gVar);
        String strDecodeStringElement = null;
        Serializable serializableB = null;
        Long l2 = null;
        while (true) {
            int iD = dVarBeginStructure.d(gVar);
            if (iD == -1) {
                if (strDecodeStringElement == null) {
                    throw new IllegalStateException("Missing key");
                }
                if (serializableB == null) {
                    throw new IllegalStateException("Missing value");
                }
                b bVar = new b(strDecodeStringElement, serializableB, l2);
                dVarBeginStructure.endStructure(gVar);
                return bVar;
            }
            if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(gVar, 0);
            } else if (iD == 1) {
                serializableB = b((JsonElement) dVarBeginStructure.decodeSerializableElement(gVar, 1, JsonElement.INSTANCE.serializer(), null));
            } else {
                if (iD != 2) {
                    throw new IllegalStateException(("Unexpected index: " + iD).toString());
                }
                Intrinsics.checkNotNullParameter(kotlin.jvm.internal.v.f186436a, "<this>");
                l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(gVar, 2, t0.f247706a, null);
            }
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f246936b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        b value = (b) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        g gVar = f246936b;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(gVar);
        compositeEncoderBeginStructure.encodeStringElement(gVar, 0, value.f246928a);
        compositeEncoderBeginStructure.encodeSerializableElement(gVar, 1, JsonElement.INSTANCE.serializer(), a(value.f246929b));
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.v.f186436a, "<this>");
        compositeEncoderBeginStructure.encodeNullableSerializableElement(gVar, 2, t0.f247706a, value.f246930c);
        compositeEncoderBeginStructure.endStructure(gVar);
    }
}
