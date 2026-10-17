package ve;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f288092b;

    public b(String str, Map map) {
        this.f288091a = str;
        this.f288092b = map;
    }

    public static u0a.a a(String str) {
        return new u0a.a(str);
    }

    public static b c(String str) {
        return new b(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f288092b.get(cls);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f288091a.equals(bVar.f288091a) && this.f288092b.equals(bVar.f288092b);
    }

    public final int hashCode() {
        return this.f288092b.hashCode() + (this.f288091a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f288091a + ", properties=" + this.f288092b.values() + "}";
    }
}
