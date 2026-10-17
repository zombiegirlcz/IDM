package p9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class q implements x9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f234237b;

    public q(int i) {
        this.f234236a = i;
        switch (i) {
            case 1:
                this.f234237b = new HashMap();
                break;
        }
    }

    public static q b(q qVar, q qVar2) {
        HashMap map;
        HashMap map2;
        if (qVar == null || (map = qVar.f234237b) == null || map.isEmpty()) {
            return qVar2;
        }
        if (qVar2 == null || (map2 = qVar2.f234237b) == null || map2.isEmpty()) {
            return qVar;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : qVar2.f234237b.values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : qVar.f234237b.values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new q(map3);
    }

    @Override // x9.a
    public Annotation a(Class cls) {
        HashMap map = this.f234237b;
        if (map == null) {
            return null;
        }
        return (Annotation) map.get(cls);
    }

    public void c(String str, String str2, String str3) {
        HashMap map = this.f234237b;
        if (!map.containsKey(str2)) {
            map.put(str2, new HashMap());
        }
        ((Map) map.get(str2)).put(str, str3);
    }

    public hh3.c d() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f234237b.entrySet()) {
            map.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new hh3.c(Collections.unmodifiableMap(map), 2);
    }

    @Override // x9.a
    public int size() {
        HashMap map = this.f234237b;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public String toString() {
        switch (this.f234236a) {
            case 0:
                HashMap map = this.f234237b;
                return map == null ? "[null]" : map.toString();
            default:
                return super.toString();
        }
    }

    public q(HashMap map) {
        this.f234236a = 0;
        this.f234237b = map;
    }
}
