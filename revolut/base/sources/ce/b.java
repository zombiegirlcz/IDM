package ce;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f23284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f23285c;
    public final int d;
    public final int e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f23286g;

    public b(String str, Set set, Set set2, int i, int i2, f fVar, Set set3) {
        this.f23283a = str;
        this.f23284b = Collections.unmodifiableSet(set);
        this.f23285c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = fVar;
        this.f23286g = Collections.unmodifiableSet(set3);
    }

    public static a a(t tVar) {
        return new a(tVar, new t[0]);
    }

    public static a b(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static b c(Object obj2, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            m70.a.b(cls2, "Null interface");
            hashSet.add(t.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ag.j(obj2, 6), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f23284b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f23285c.toArray()) + "}";
    }
}
