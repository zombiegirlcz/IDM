package xe;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ve.d, ve.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f304511a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f304512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f304513c;
    public final Map d;
    public final ve.c e;
    public final boolean f;

    public e(Writer writer, Map map, Map map2, ve.c cVar, boolean z) {
        this.f304512b = new JsonWriter(writer);
        this.f304513c = map;
        this.d = map2;
        this.e = cVar;
        this.f = z;
    }

    public final e a(Object obj2) throws IOException {
        JsonWriter jsonWriter = this.f304512b;
        if (obj2 == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj2 instanceof Number) {
            jsonWriter.value((Number) obj2);
            return this;
        }
        if (!obj2.getClass().isArray()) {
            if (obj2 instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it8 = ((Collection) obj2).iterator();
                while (it8.hasNext()) {
                    a(it8.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj2 instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        b(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            ve.c cVar = (ve.c) this.f304513c.get(obj2.getClass());
            if (cVar != null) {
                jsonWriter.beginObject();
                cVar.encode(obj2, this);
                jsonWriter.endObject();
                return this;
            }
            ve.e eVar = (ve.e) this.d.get(obj2.getClass());
            if (eVar != null) {
                eVar.encode(obj2, this);
                return this;
            }
            if (!(obj2 instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.encode(obj2, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj2 instanceof f) {
                int number = ((f) obj2).getNumber();
                c();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj2).name();
            c();
            jsonWriter.value(strName);
            return this;
        }
        if (obj2 instanceof byte[]) {
            c();
            jsonWriter.value(Base64.encodeToString((byte[]) obj2, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj2 instanceof int[]) {
            int length = ((int[]) obj2).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj2 instanceof long[]) {
            long[] jArr = (long[]) obj2;
            int length2 = jArr.length;
            while (i < length2) {
                long j2 = jArr[i];
                c();
                jsonWriter.value(j2);
                i++;
            }
        } else if (obj2 instanceof double[]) {
            double[] dArr = (double[]) obj2;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj2 instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj2;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj2 instanceof Number[]) {
            Number[] numberArr = (Number[]) obj2;
            int length5 = numberArr.length;
            while (i < length5) {
                a(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj2;
            int length6 = objArr.length;
            while (i < length6) {
                a(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    @Override // ve.d
    public final ve.d add(ve.b bVar, double d) throws IOException {
        String str = bVar.f288091a;
        c();
        JsonWriter jsonWriter = this.f304512b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(d);
        return this;
    }

    public final e b(Object obj2, String str) throws IOException {
        boolean z = this.f;
        JsonWriter jsonWriter = this.f304512b;
        if (z) {
            if (obj2 == null) {
                return this;
            }
            c();
            jsonWriter.name(str);
            a(obj2);
            return this;
        }
        c();
        jsonWriter.name(str);
        if (obj2 == null) {
            jsonWriter.nullValue();
            return this;
        }
        a(obj2);
        return this;
    }

    public final void c() {
        if (!this.f304511a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @Override // ve.d
    public final ve.d add(ve.b bVar, int i) throws IOException {
        String str = bVar.f288091a;
        c();
        JsonWriter jsonWriter = this.f304512b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(i);
        return this;
    }

    @Override // ve.d
    public final ve.d add(ve.b bVar, long j2) throws IOException {
        String str = bVar.f288091a;
        c();
        JsonWriter jsonWriter = this.f304512b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(j2);
        return this;
    }

    @Override // ve.d
    public final ve.d add(ve.b bVar, Object obj2) throws IOException {
        b(obj2, bVar.f288091a);
        return this;
    }

    @Override // ve.d
    public final ve.d add(ve.b bVar, boolean z) throws IOException {
        String str = bVar.f288091a;
        c();
        JsonWriter jsonWriter = this.f304512b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(z);
        return this;
    }

    @Override // ve.f
    public final ve.f add(String str) throws IOException {
        c();
        this.f304512b.value(str);
        return this;
    }

    @Override // ve.f
    public final ve.f add(boolean z) throws IOException {
        c();
        this.f304512b.value(z);
        return this;
    }
}
