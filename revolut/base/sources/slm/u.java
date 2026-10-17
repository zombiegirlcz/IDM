package slm;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import qlm.h1;
import zhm.a1;
import zhm.r0;

/* JADX INFO: loaded from: classes14.dex */
public class u extends b {
    public final JsonObject f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SerialDescriptor f264285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f264286h;
    public boolean i;

    public /* synthetic */ u(Json json, JsonObject jsonObject, String str, int i) {
        this(json, jsonObject, (i & 4) != 0 ? null : str, (SerialDescriptor) null);
    }

    @Override // slm.b, kotlinx.serialization.encoding.Decoder
    public final plm.d beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        SerialDescriptor serialDescriptor = this.f264285g;
        if (descriptor != serialDescriptor) {
            return super.beginStructure(descriptor);
        }
        JsonElement jsonElementF = f();
        String strE = serialDescriptor.e();
        if (jsonElementF instanceof JsonObject) {
            String str = this.d;
            return new u(this.f264238c, (JsonObject) jsonElementF, str, serialDescriptor);
        }
        StringBuilder sb6 = new StringBuilder("Expected ");
        p0 p0Var = o0.f186429a;
        sb6.append(p0Var.b(JsonObject.class).m());
        sb6.append(", but had ");
        sb6.append(p0Var.b(jsonElementF.getClass()).m());
        sb6.append(" as the serialized body of ");
        sb6.append(strE);
        sb6.append(" at element: ");
        sb6.append(v());
        throw q.d(jsonElementF.toString(), -1, sb6.toString());
    }

    @Override // plm.d
    public int d(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.f264286h < descriptor.c()) {
            int i = this.f264286h;
            this.f264286h = i + 1;
            String tag2 = s(descriptor, i);
            int i2 = this.f264286h - 1;
            this.i = false;
            if (t().containsKey(tag2) || z(descriptor, i2)) {
                if (this.e.f) {
                    boolean zI = descriptor.i(i2);
                    SerialDescriptor serialDescriptorB = descriptor.b(i2);
                    if (zI && !serialDescriptorB.f()) {
                        Intrinsics.checkNotNullParameter(tag2, "tag");
                        if (((JsonElement) t().get(tag2)) instanceof JsonNull) {
                            continue;
                        }
                    }
                    if (Intrinsics.f(serialDescriptorB.getKind(), olm.j.f226486b)) {
                        if (serialDescriptorB.f()) {
                            Intrinsics.checkNotNullParameter(tag2, "tag");
                            if (((JsonElement) t().get(tag2)) instanceof JsonNull) {
                            }
                        }
                        Intrinsics.checkNotNullParameter(tag2, "tag");
                        JsonElement jsonElement = (JsonElement) t().get(tag2);
                        kotlinx.serialization.json.b bVar = jsonElement instanceof kotlinx.serialization.json.b ? (kotlinx.serialization.json.b) jsonElement : null;
                        String strG = bVar != null ? rlm.j.g(bVar) : null;
                        if (strG != null) {
                            Json json = this.f264238c;
                            int iK = q.k(serialDescriptorB, json, strG);
                            boolean z = !json.f187948a.d && serialDescriptorB.f();
                            if (iK != -3 || ((!zI && !z) || z(descriptor, i2))) {
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    @Override // slm.b, kotlinx.serialization.encoding.Decoder
    public final boolean decodeNotNullMark() {
        return !this.i && super.decodeNotNullMark();
    }

    @Override // slm.b
    public JsonElement e(String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        return (JsonElement) r0.h(tag2, t());
    }

    @Override // slm.b, plm.d
    public void endStructure(SerialDescriptor descriptor) {
        Set setL;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Json json = this.f264238c;
        if (q.m(descriptor, json) || (descriptor.getKind() instanceof olm.d)) {
            return;
        }
        q.p(descriptor, json);
        if (this.e.f255108h) {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            Set setB = h1.b(descriptor);
            Intrinsics.checkNotNullParameter(json, "<this>");
            Map map = (Map) json.f187950c.a(descriptor, q.f264278a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = zhm.h0.f322473a;
            }
            setL = a1.l(setB, setKeySet);
        } else {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            setL = h1.b(descriptor);
        }
        for (String str : t().f187951a.keySet()) {
            if (!setL.contains(str) && !Intrinsics.f(str, this.d)) {
                StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Encountered an unknown key '", str, "' at element: ");
                sbX.append(v());
                sbX.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbX.append((Object) q.o(-1, t().toString()));
                throw q.c(-1, sbX.toString());
            }
        }
    }

    @Override // slm.b
    public String r(SerialDescriptor descriptor, int i) {
        Object next;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Json json = this.f264238c;
        q.p(descriptor, json);
        String strD = descriptor.d(i);
        if (this.e.f255108h && !t().f187951a.keySet().contains(strD)) {
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(json, "<this>");
            n nVar = json.f187950c;
            s86.a defaultValue = new s86.a(descriptor, json, 18);
            nVar.getClass();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            qf.b key = q.f264278a;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Object value = nVar.a(descriptor, key);
            if (value == null) {
                value = defaultValue.invoke();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                ConcurrentHashMap concurrentHashMap = nVar.f264273a;
                Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(key, value);
            }
            Map map = (Map) value;
            Iterator it8 = t().f187951a.keySet().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strD;
    }

    @Override // slm.b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public JsonObject t() {
        return this.f;
    }

    public final boolean z(SerialDescriptor serialDescriptor, int i) {
        boolean z = (this.f264238c.f187948a.d || serialDescriptor.i(i) || !serialDescriptor.b(i).f()) ? false : true;
        this.i = z;
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Json json, JsonObject value, String str, SerialDescriptor serialDescriptor) {
        super(json, str);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f = value;
        this.f264285g = serialDescriptor;
    }
}
