package slm;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.JsonEncodingException;
import qlm.q0;

/* JADX INFO: loaded from: classes14.dex */
public class t implements rlm.m, Encoder, CompositeEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f264280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Json f264281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f264282c;
    public final rlm.h d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f264283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f264284h;

    public t(Json json, Function1 function1, char c2) {
        this.f264280a = new ArrayList();
        this.f264281b = json;
        this.f264282c = function1;
        this.d = json.f187948a;
    }

    @Override // rlm.m
    public final Json a() {
        return this.f264281b;
    }

    @Override // rlm.m
    public final void b(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.e == null || (element instanceof JsonObject)) {
            encodeSerializableValue(rlm.k.f255111a, element);
        } else {
            q.s(element, this.f);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        t tVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Function1 nodeConsumer = zhm.d0.o0(this.f264280a) == null ? this.f264282c : new sl5.a(this, 2);
        com.bumptech.glide.d kind = descriptor.getKind();
        boolean zF = Intrinsics.f(kind, olm.k.f226488c);
        Json json = this.f264281b;
        if (zF || (kind instanceof olm.d)) {
            tVar = new t(json, nodeConsumer, 2);
        } else if (Intrinsics.f(kind, olm.k.d)) {
            SerialDescriptor serialDescriptorG = q.g(descriptor.b(0), json.f187949b);
            com.bumptech.glide.d kind2 = serialDescriptorG.getKind();
            if (!(kind2 instanceof olm.f) && !Intrinsics.f(kind2, olm.j.f226486b)) {
                throw q.b(serialDescriptorG);
            }
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
            x xVar = new x(json, nodeConsumer, 1);
            xVar.f264292j = true;
            tVar = xVar;
        } else {
            tVar = new t(json, nodeConsumer, 1);
        }
        String str = this.e;
        if (str != null) {
            if (tVar instanceof x) {
                x xVar2 = (x) tVar;
                xVar2.m(rlm.j.c(str), "key");
                String strE = this.f;
                if (strE == null) {
                    strE = descriptor.e();
                }
                xVar2.m(rlm.j.c(strE), "value");
            } else {
                String strE2 = this.f;
                if (strE2 == null) {
                    strE2 = descriptor.e();
                }
                tVar.m(rlm.j.c(strE2), str);
            }
            this.e = null;
            this.f = null;
        }
        return tVar;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final boolean d(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.d.f255104a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeBoolean(boolean z) {
        String tag2 = (String) l();
        Intrinsics.checkNotNullParameter(tag2, "tag");
        m(rlm.j.a(Boolean.valueOf(z)), tag2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeBooleanElement(SerialDescriptor descriptor, int i, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag2 = k(descriptor, i);
        Intrinsics.checkNotNullParameter(tag2, "tag");
        m(rlm.j.a(Boolean.valueOf(z)), tag2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte b4) {
        String tag2 = (String) l();
        Intrinsics.checkNotNullParameter(tag2, "tag");
        m(rlm.j.b(Byte.valueOf(b4)), tag2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeByteElement(SerialDescriptor descriptor, int i, byte b4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag2 = k(descriptor, i);
        Intrinsics.checkNotNullParameter(tag2, "tag");
        m(rlm.j.b(Byte.valueOf(b4)), tag2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeChar(char c2) {
        String tag2 = (String) l();
        Intrinsics.checkNotNullParameter(tag2, "tag");
        m(rlm.j.c(String.valueOf(c2)), tag2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeCharElement(SerialDescriptor descriptor, int i, char c2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag2 = k(descriptor, i);
        Intrinsics.checkNotNullParameter(tag2, "tag");
        m(rlm.j.c(String.valueOf(c2)), tag2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeDouble(double d) {
        g(l(), d);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeDoubleElement(SerialDescriptor descriptor, int i, double d) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        g(k(descriptor, i), d);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeEnum(SerialDescriptor enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        String tag2 = (String) l();
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        m(rlm.j.c(enumDescriptor.d(i)), tag2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeFloat(float f) {
        h(f, l());
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeFloatElement(SerialDescriptor descriptor, int i, float f) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        h(f, k(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder encodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (zhm.d0.o0(this.f264280a) == null) {
            return new t(this.f264281b, this.f264282c, 0).encodeInline(descriptor);
        }
        if (this.e != null) {
            this.f = descriptor.e();
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return i(l(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final Encoder encodeInlineElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return i(k(descriptor, i), ((q0) descriptor).b(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeInt(int i) {
        String tag2 = (String) l();
        Intrinsics.checkNotNullParameter(tag2, "tag");
        m(rlm.j.b(Integer.valueOf(i)), tag2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeIntElement(SerialDescriptor descriptor, int i, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag2 = k(descriptor, i);
        Intrinsics.checkNotNullParameter(tag2, "tag");
        m(rlm.j.b(Integer.valueOf(i2)), tag2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeLong(long j2) {
        String tag2 = (String) l();
        Intrinsics.checkNotNullParameter(tag2, "tag");
        m(rlm.j.b(Long.valueOf(j2)), tag2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeLongElement(SerialDescriptor descriptor, int i, long j2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag2 = k(descriptor, i);
        Intrinsics.checkNotNullParameter(tag2, "tag");
        m(rlm.j.b(Long.valueOf(j2)), tag2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeNull() {
        String tag2 = (String) zhm.d0.o0(this.f264280a);
        if (tag2 == null) {
            this.f264282c.invoke(JsonNull.INSTANCE);
        } else {
            Intrinsics.checkNotNullParameter(tag2, "tag");
            m(JsonNull.INSTANCE, tag2);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeNullableSerializableElement(SerialDescriptor descriptor, int i, mlm.h serializer, Object obj2) {
        switch (this.f264283g) {
            case 1:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(serializer, "serializer");
                if (obj2 != null || this.d.d) {
                    f(descriptor, i, serializer, obj2);
                }
                break;
            default:
                f(descriptor, i, serializer, obj2);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeSerializableElement(SerialDescriptor descriptor, int i, mlm.h serializer, Object obj2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f264280a.add(k(descriptor, i));
        encodeSerializableValue(serializer, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void encodeSerializableValue(mlm.h r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: slm.t.encodeSerializableValue(mlm.h, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeShort(short s2) {
        String tag2 = (String) l();
        Intrinsics.checkNotNullParameter(tag2, "tag");
        m(rlm.j.b(Short.valueOf(s2)), tag2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeShortElement(SerialDescriptor descriptor, int i, short s2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag2 = k(descriptor, i);
        Intrinsics.checkNotNullParameter(tag2, "tag");
        m(rlm.j.b(Short.valueOf(s2)), tag2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String tag2 = (String) l();
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        m(rlm.j.c(value), tag2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeStringElement(SerialDescriptor descriptor, int i, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        String tag2 = k(descriptor, i);
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        m(rlm.j.c(value), tag2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.f264280a.isEmpty()) {
            l();
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f264282c.invoke(j());
    }

    public final void f(SerialDescriptor descriptor, int i, mlm.h serializer, Object obj2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f264280a.add(k(descriptor, i));
        e(serializer, obj2);
    }

    public final void g(Object obj2, double d) {
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "tag");
        m(rlm.j.b(Double.valueOf(d)), key);
        this.d.getClass();
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        Double value = Double.valueOf(d);
        String output = j().toString();
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        throw new JsonEncodingException(q.u(value, key, output));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final tlm.e getSerializersModule() {
        return this.f264281b.f187949b;
    }

    public final void h(float f, Object obj2) {
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "tag");
        m(rlm.j.b(Float.valueOf(f)), key);
        this.d.getClass();
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        Float value = Float.valueOf(f);
        String output = j().toString();
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        throw new JsonEncodingException(q.u(value, key, output));
    }

    public final Encoder i(Object obj2, SerialDescriptor inlineDescriptor) {
        String tag2 = (String) obj2;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (g0.a(inlineDescriptor)) {
            return new c(this, tag2);
        }
        Intrinsics.checkNotNullParameter(inlineDescriptor, "<this>");
        if (inlineDescriptor.isInline() && inlineDescriptor.equals(rlm.j.f255110a)) {
            return new c(this, tag2, inlineDescriptor);
        }
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        this.f264280a.add(tag2);
        return this;
    }

    public JsonElement j() {
        switch (this.f264283g) {
            case 0:
                JsonElement jsonElement = (JsonElement) this.f264284h;
                if (jsonElement != null) {
                    return jsonElement;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
            case 1:
                return new JsonObject((LinkedHashMap) this.f264284h);
            default:
                return new kotlinx.serialization.json.a((ArrayList) this.f264284h);
        }
    }

    public final String k(SerialDescriptor descriptor, int i) {
        String childName;
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        switch (this.f264283g) {
            case 2:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                childName = String.valueOf(i);
                break;
            default:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(descriptor, "<this>");
                Json json = this.f264281b;
                Intrinsics.checkNotNullParameter(json, "json");
                q.p(descriptor, json);
                childName = descriptor.d(i);
                break;
        }
        Intrinsics.checkNotNullParameter(childName, "nestedName");
        String parentName = (String) zhm.d0.o0(this.f264280a);
        if (parentName == null) {
            parentName = "";
        }
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    public final Object l() {
        ArrayList arrayList = this.f264280a;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(zhm.v.j(arrayList));
    }

    public void m(JsonElement element, String key) {
        switch (this.f264283g) {
            case 0:
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(element, "element");
                if (key != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
                }
                if (((JsonElement) this.f264284h) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                }
                this.f264284h = element;
                this.f264282c.invoke(element);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(element, "element");
                ((LinkedHashMap) this.f264284h).put(key, element);
                return;
            default:
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(element, "element");
                ((ArrayList) this.f264284h).add(Integer.parseInt(key), element);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(Json json, Function1 nodeConsumer, int i) {
        this(json, nodeConsumer, (char) 0);
        this.f264283g = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
                this(json, nodeConsumer, (char) 0);
                this.f264284h = new LinkedHashMap();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
                this(json, nodeConsumer, (char) 0);
                this.f264284h = new ArrayList();
                break;
            default:
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
                this.f264280a.add("primitive");
                break;
        }
    }
}
