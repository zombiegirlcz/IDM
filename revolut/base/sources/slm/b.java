package slm;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import qlm.q0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b implements rlm.i, Decoder, plm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f264236a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f264237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Json f264238c;
    public final String d;
    public final rlm.h e;

    public b(Json json, String str) {
        this.f264238c = json;
        this.d = str;
        this.e = json.f187948a;
    }

    @Override // rlm.i
    public final Json a() {
        return this.f264238c;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object b(mlm.b deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof qlm.b)) {
            return deserializer.deserialize(this);
        }
        Json json = this.f264238c;
        rlm.h hVar = json.f187948a;
        qlm.b bVar = (qlm.b) deserializer;
        String strJ = q.j(bVar.getDescriptor(), json);
        JsonElement jsonElementF = f();
        String strE = bVar.getDescriptor().e();
        if (jsonElementF instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElementF;
            JsonElement jsonElement = (JsonElement) jsonObject.get(strJ);
            try {
                return foh.i.v(json, strJ, jsonObject, com.bumptech.glide.d.f((qlm.b) deserializer, this, jsonElement != null ? rlm.j.g(rlm.j.l(jsonElement)) : null));
            } catch (SerializationException e) {
                String message = e.getMessage();
                Intrinsics.h(message);
                throw q.d(jsonObject.toString(), -1, message);
            }
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

    @Override // kotlinx.serialization.encoding.Decoder
    public plm.d beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement jsonElementF = f();
        com.bumptech.glide.d kind = descriptor.getKind();
        boolean zF = Intrinsics.f(kind, olm.k.f226488c);
        Json json = this.f264238c;
        if (zF || (kind instanceof olm.d)) {
            String strE = descriptor.e();
            if (jsonElementF instanceof kotlinx.serialization.json.a) {
                return new v(json, (kotlinx.serialization.json.a) jsonElementF);
            }
            StringBuilder sb6 = new StringBuilder("Expected ");
            p0 p0Var = o0.f186429a;
            sb6.append(p0Var.b(kotlinx.serialization.json.a.class).m());
            sb6.append(", but had ");
            sb6.append(p0Var.b(jsonElementF.getClass()).m());
            sb6.append(" as the serialized body of ");
            sb6.append(strE);
            sb6.append(" at element: ");
            sb6.append(v());
            throw q.d(jsonElementF.toString(), -1, sb6.toString());
        }
        if (!Intrinsics.f(kind, olm.k.d)) {
            String strE2 = descriptor.e();
            if (jsonElementF instanceof JsonObject) {
                return new u(json, (JsonObject) jsonElementF, this.d, 8);
            }
            StringBuilder sb9 = new StringBuilder("Expected ");
            p0 p0Var2 = o0.f186429a;
            sb9.append(p0Var2.b(JsonObject.class).m());
            sb9.append(", but had ");
            sb9.append(p0Var2.b(jsonElementF.getClass()).m());
            sb9.append(" as the serialized body of ");
            sb9.append(strE2);
            sb9.append(" at element: ");
            sb9.append(v());
            throw q.d(jsonElementF.toString(), -1, sb9.toString());
        }
        SerialDescriptor serialDescriptorG = q.g(descriptor.b(0), json.f187949b);
        com.bumptech.glide.d kind2 = serialDescriptorG.getKind();
        if (!(kind2 instanceof olm.f) && !Intrinsics.f(kind2, olm.j.f226486b)) {
            throw q.b(serialDescriptorG);
        }
        String strE3 = descriptor.e();
        if (jsonElementF instanceof JsonObject) {
            return new w(json, (JsonObject) jsonElementF);
        }
        StringBuilder sb10 = new StringBuilder("Expected ");
        p0 p0Var3 = o0.f186429a;
        sb10.append(p0Var3.b(JsonObject.class).m());
        sb10.append(", but had ");
        sb10.append(p0Var3.b(jsonElementF.getClass()).m());
        sb10.append(" as the serialized body of ");
        sb10.append(strE3);
        sb10.append(" at element: ");
        sb10.append(v());
        throw q.d(jsonElementF.toString(), -1, sb10.toString());
    }

    @Override // rlm.i
    public final JsonElement c() {
        return f();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean decodeBoolean() {
        return h(u());
    }

    @Override // plm.d
    public final boolean decodeBooleanElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return h(s(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        return i(u());
    }

    @Override // plm.d
    public final byte decodeByteElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return i(s(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char decodeChar() {
        return j(u());
    }

    @Override // plm.d
    public final char decodeCharElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return j(s(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double decodeDouble() {
        return k(u());
    }

    @Override // plm.d
    public final double decodeDoubleElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return k(s(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        String tag2 = (String) u();
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        JsonElement jsonElementE = e(tag2);
        String strE = enumDescriptor.e();
        if (jsonElementE instanceof kotlinx.serialization.json.b) {
            return q.l(enumDescriptor, this.f264238c, ((kotlinx.serialization.json.b) jsonElementE).a(), "");
        }
        StringBuilder sb6 = new StringBuilder("Expected ");
        p0 p0Var = o0.f186429a;
        sb6.append(p0Var.b(kotlinx.serialization.json.b.class).m());
        sb6.append(", but had ");
        sb6.append(p0Var.b(jsonElementE.getClass()).m());
        a0.d.C(sb6, " as the serialized body of ", strE, " at element: ");
        sb6.append(w(tag2));
        throw q.d(jsonElementE.toString(), -1, sb6.toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float decodeFloat() {
        return l(u());
    }

    @Override // plm.d
    public final float decodeFloatElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return l(s(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (zhm.d0.o0(this.f264236a) != null) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return m(u(), descriptor);
        }
        return new s(this.f264238c, t(), this.d).decodeInline(descriptor);
    }

    @Override // plm.d
    public final Decoder decodeInlineElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return m(s(descriptor, i), ((q0) descriptor).b(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        return n(u());
    }

    @Override // plm.d
    public final int decodeIntElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return n(s(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        return o(u());
    }

    @Override // plm.d
    public final long decodeLongElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return o(s(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(f() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Void decodeNull() {
        return null;
    }

    @Override // plm.d
    public final Object decodeNullableSerializableElement(SerialDescriptor descriptor, int i, mlm.b deserializer, Object obj2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f264236a.add(s(descriptor, i));
        Object objG = (deserializer.getDescriptor().f() || decodeNotNullMark()) ? g(deserializer, obj2) : null;
        if (!this.f264237b) {
            u();
        }
        this.f264237b = false;
        return objG;
    }

    @Override // plm.d
    public final Object decodeSerializableElement(SerialDescriptor descriptor, int i, mlm.b deserializer, Object obj2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f264236a.add(s(descriptor, i));
        Object objG = g(deserializer, obj2);
        if (!this.f264237b) {
            u();
        }
        this.f264237b = false;
        return objG;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        return p(u());
    }

    @Override // plm.d
    public final short decodeShortElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return p(s(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String decodeString() {
        return q(u());
    }

    @Override // plm.d
    public final String decodeStringElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return q(s(descriptor, i));
    }

    public abstract JsonElement e(String str);

    @Override // plm.d
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    public final JsonElement f() {
        JsonElement jsonElementE;
        String str = (String) zhm.d0.o0(this.f264236a);
        return (str == null || (jsonElementE = e(str)) == null) ? t() : jsonElementE;
    }

    public final Object g(mlm.b deserializer, Object obj2) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return b(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder, plm.d
    public final tlm.e getSerializersModule() {
        return this.f264238c.f187949b;
    }

    public final boolean h(Object obj2) {
        String tag2 = (String) obj2;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        JsonElement jsonElementE = e(tag2);
        if (jsonElementE instanceof kotlinx.serialization.json.b) {
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonElementE;
            try {
                Boolean boolF = rlm.j.f(bVar);
                if (boolF != null) {
                    return boolF.booleanValue();
                }
                x(bVar, "boolean", tag2);
                throw null;
            } catch (IllegalArgumentException unused) {
                x(bVar, "boolean", tag2);
                throw null;
            }
        }
        StringBuilder sb6 = new StringBuilder("Expected ");
        p0 p0Var = o0.f186429a;
        sb6.append(p0Var.b(kotlinx.serialization.json.b.class).m());
        sb6.append(", but had ");
        sb6.append(p0Var.b(jsonElementE.getClass()).m());
        sb6.append(" as the serialized body of boolean at element: ");
        sb6.append(w(tag2));
        throw q.d(jsonElementE.toString(), -1, sb6.toString());
    }

    public final byte i(Object obj2) {
        String tag2 = (String) obj2;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        JsonElement jsonElementE = e(tag2);
        if (!(jsonElementE instanceof kotlinx.serialization.json.b)) {
            StringBuilder sb6 = new StringBuilder("Expected ");
            p0 p0Var = o0.f186429a;
            sb6.append(p0Var.b(kotlinx.serialization.json.b.class).m());
            sb6.append(", but had ");
            sb6.append(p0Var.b(jsonElementE.getClass()).m());
            sb6.append(" as the serialized body of byte at element: ");
            sb6.append(w(tag2));
            throw q.d(jsonElementE.toString(), -1, sb6.toString());
        }
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonElementE;
        try {
            long jM = rlm.j.m(bVar);
            Byte bValueOf = (-128 > jM || jM > 127) ? null : Byte.valueOf((byte) jM);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            x(bVar, "byte", tag2);
            throw null;
        } catch (IllegalArgumentException unused) {
            x(bVar, "byte", tag2);
            throw null;
        }
    }

    public final char j(Object obj2) {
        String tag2 = (String) obj2;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        JsonElement jsonElementE = e(tag2);
        if (!(jsonElementE instanceof kotlinx.serialization.json.b)) {
            StringBuilder sb6 = new StringBuilder("Expected ");
            p0 p0Var = o0.f186429a;
            sb6.append(p0Var.b(kotlinx.serialization.json.b.class).m());
            sb6.append(", but had ");
            sb6.append(p0Var.b(jsonElementE.getClass()).m());
            sb6.append(" as the serialized body of char at element: ");
            sb6.append(w(tag2));
            throw q.d(jsonElementE.toString(), -1, sb6.toString());
        }
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonElementE;
        try {
            String strA = bVar.a();
            Intrinsics.checkNotNullParameter(strA, "<this>");
            int length = strA.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strA.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            x(bVar, "char", tag2);
            throw null;
        }
    }

    public final double k(Object obj2) {
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "tag");
        JsonElement jsonElementE = e(key);
        if (!(jsonElementE instanceof kotlinx.serialization.json.b)) {
            StringBuilder sb6 = new StringBuilder("Expected ");
            p0 p0Var = o0.f186429a;
            sb6.append(p0Var.b(kotlinx.serialization.json.b.class).m());
            sb6.append(", but had ");
            sb6.append(p0Var.b(jsonElementE.getClass()).m());
            sb6.append(" as the serialized body of double at element: ");
            sb6.append(w(key));
            throw q.d(jsonElementE.toString(), -1, sb6.toString());
        }
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonElementE;
        try {
            qlm.j0 j0Var = rlm.j.f255110a;
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            double d = Double.parseDouble(bVar.a());
            rlm.h hVar = this.f264238c.f187948a;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            Double value = Double.valueOf(d);
            String output = f().toString();
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(output, "output");
            throw q.c(-1, q.u(value, key, output));
        } catch (IllegalArgumentException unused) {
            x(bVar, "double", key);
            throw null;
        }
    }

    public final float l(Object obj2) {
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "tag");
        JsonElement jsonElementE = e(key);
        if (!(jsonElementE instanceof kotlinx.serialization.json.b)) {
            StringBuilder sb6 = new StringBuilder("Expected ");
            p0 p0Var = o0.f186429a;
            sb6.append(p0Var.b(kotlinx.serialization.json.b.class).m());
            sb6.append(", but had ");
            sb6.append(p0Var.b(jsonElementE.getClass()).m());
            sb6.append(" as the serialized body of float at element: ");
            sb6.append(w(key));
            throw q.d(jsonElementE.toString(), -1, sb6.toString());
        }
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonElementE;
        try {
            qlm.j0 j0Var = rlm.j.f255110a;
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            float f = Float.parseFloat(bVar.a());
            rlm.h hVar = this.f264238c.f187948a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            Float value = Float.valueOf(f);
            String output = f().toString();
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(output, "output");
            throw q.c(-1, q.u(value, key, output));
        } catch (IllegalArgumentException unused) {
            x(bVar, "float", key);
            throw null;
        }
    }

    public final Decoder m(Object obj2, SerialDescriptor inlineDescriptor) {
        String tag2 = (String) obj2;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (!g0.a(inlineDescriptor)) {
            Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
            this.f264236a.add(tag2);
            return this;
        }
        JsonElement jsonElementE = e(tag2);
        String strE = inlineDescriptor.e();
        if (jsonElementE instanceof kotlinx.serialization.json.b) {
            String strA = ((kotlinx.serialization.json.b) jsonElementE).a();
            Json json = this.f264238c;
            return new o(edl.a.a(json, strA), json);
        }
        StringBuilder sb6 = new StringBuilder("Expected ");
        p0 p0Var = o0.f186429a;
        sb6.append(p0Var.b(kotlinx.serialization.json.b.class).m());
        sb6.append(", but had ");
        sb6.append(p0Var.b(jsonElementE.getClass()).m());
        a0.d.C(sb6, " as the serialized body of ", strE, " at element: ");
        sb6.append(w(tag2));
        throw q.d(jsonElementE.toString(), -1, sb6.toString());
    }

    public final int n(Object obj2) {
        String tag2 = (String) obj2;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        JsonElement jsonElementE = e(tag2);
        if (!(jsonElementE instanceof kotlinx.serialization.json.b)) {
            StringBuilder sb6 = new StringBuilder("Expected ");
            p0 p0Var = o0.f186429a;
            sb6.append(p0Var.b(kotlinx.serialization.json.b.class).m());
            sb6.append(", but had ");
            sb6.append(p0Var.b(jsonElementE.getClass()).m());
            sb6.append(" as the serialized body of int at element: ");
            sb6.append(w(tag2));
            throw q.d(jsonElementE.toString(), -1, sb6.toString());
        }
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonElementE;
        try {
            long jM = rlm.j.m(bVar);
            Integer numValueOf = (-2147483648L > jM || jM > 2147483647L) ? null : Integer.valueOf((int) jM);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            x(bVar, "int", tag2);
            throw null;
        } catch (IllegalArgumentException unused) {
            x(bVar, "int", tag2);
            throw null;
        }
    }

    public final long o(Object obj2) {
        String tag2 = (String) obj2;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        JsonElement jsonElementE = e(tag2);
        if (jsonElementE instanceof kotlinx.serialization.json.b) {
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonElementE;
            try {
                return rlm.j.m(bVar);
            } catch (IllegalArgumentException unused) {
                x(bVar, "long", tag2);
                throw null;
            }
        }
        StringBuilder sb6 = new StringBuilder("Expected ");
        p0 p0Var = o0.f186429a;
        sb6.append(p0Var.b(kotlinx.serialization.json.b.class).m());
        sb6.append(", but had ");
        sb6.append(p0Var.b(jsonElementE.getClass()).m());
        sb6.append(" as the serialized body of long at element: ");
        sb6.append(w(tag2));
        throw q.d(jsonElementE.toString(), -1, sb6.toString());
    }

    public final short p(Object obj2) {
        String tag2 = (String) obj2;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        JsonElement jsonElementE = e(tag2);
        if (!(jsonElementE instanceof kotlinx.serialization.json.b)) {
            StringBuilder sb6 = new StringBuilder("Expected ");
            p0 p0Var = o0.f186429a;
            sb6.append(p0Var.b(kotlinx.serialization.json.b.class).m());
            sb6.append(", but had ");
            sb6.append(p0Var.b(jsonElementE.getClass()).m());
            sb6.append(" as the serialized body of short at element: ");
            sb6.append(w(tag2));
            throw q.d(jsonElementE.toString(), -1, sb6.toString());
        }
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonElementE;
        try {
            long jM = rlm.j.m(bVar);
            Short shValueOf = (-32768 > jM || jM > 32767) ? null : Short.valueOf((short) jM);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            x(bVar, "short", tag2);
            throw null;
        } catch (IllegalArgumentException unused) {
            x(bVar, "short", tag2);
            throw null;
        }
    }

    public final String q(Object obj2) {
        String tag2 = (String) obj2;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        JsonElement jsonElementE = e(tag2);
        if (!(jsonElementE instanceof kotlinx.serialization.json.b)) {
            StringBuilder sb6 = new StringBuilder("Expected ");
            p0 p0Var = o0.f186429a;
            sb6.append(p0Var.b(kotlinx.serialization.json.b.class).m());
            sb6.append(", but had ");
            sb6.append(p0Var.b(jsonElementE.getClass()).m());
            sb6.append(" as the serialized body of string at element: ");
            sb6.append(w(tag2));
            throw q.d(jsonElementE.toString(), -1, sb6.toString());
        }
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonElementE;
        if (!(bVar instanceof rlm.p)) {
            StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Expected string value for a non-null key '", tag2, "', got null literal instead at element: ");
            sbX.append(w(tag2));
            throw q.d(f().toString(), -1, sbX.toString());
        }
        rlm.p pVar = (rlm.p) bVar;
        if (pVar.f255114a || this.f264238c.f187948a.f255106c) {
            return pVar.f255116c;
        }
        StringBuilder sbX2 = com.google.android.gms.internal.mlkit_vision_face.a.x("String literal for key '", tag2, "' should be quoted at element: ");
        sbX2.append(w(tag2));
        sbX2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw q.d(f().toString(), -1, sbX2.toString());
    }

    public String r(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.d(i);
    }

    public final String s(SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        String childName = r(serialDescriptor, i);
        Intrinsics.checkNotNullParameter(childName, "nestedName");
        String parentName = (String) zhm.d0.o0(this.f264236a);
        if (parentName == null) {
            parentName = "";
        }
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    public abstract JsonElement t();

    public final Object u() {
        ArrayList arrayList = this.f264236a;
        Object objRemove = arrayList.remove(zhm.v.j(arrayList));
        this.f264237b = true;
        return objRemove;
    }

    public final String v() {
        ArrayList arrayList = this.f264236a;
        return arrayList.isEmpty() ? "$" : zhm.d0.k0(arrayList, ".", "$.", null, 0, null, 60);
    }

    public final String w(String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return v() + CoreConstants.DOT + currentTag;
    }

    public final void x(kotlinx.serialization.json.b bVar, String str, String str2) {
        throw q.d(f().toString(), -1, "Failed to parse literal '" + bVar + "' as " + (kotlin.text.a0.H(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + w(str2));
    }
}
