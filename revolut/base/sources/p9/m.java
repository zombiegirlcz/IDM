package p9;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class m extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f234229b;

    public m(Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
        HashMap map = new HashMap();
        this.f234229b = map;
        map.put(cls, annotation);
        map.put(cls2, annotation2);
    }

    @Override // p9.p
    public final p b(Annotation annotation) {
        this.f234229b.put(annotation.annotationType(), annotation);
        return this;
    }

    @Override // p9.p
    public final q c() {
        q qVar = new q(0);
        for (Annotation annotation : this.f234229b.values()) {
            if (qVar.f234237b == null) {
                qVar.f234237b = new HashMap();
            }
            Annotation annotation2 = (Annotation) qVar.f234237b.put(annotation.annotationType(), annotation);
            if (annotation2 != null) {
                annotation2.equals(annotation);
            }
        }
        return qVar;
    }

    @Override // p9.p
    public final x9.a d() {
        HashMap map = this.f234229b;
        if (map.size() != 2) {
            return new q(map);
        }
        Iterator it8 = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it8.next();
        Map.Entry entry2 = (Map.Entry) it8.next();
        return new o((Class) entry.getKey(), (Annotation) entry.getValue(), (Class) entry2.getKey(), (Annotation) entry2.getValue());
    }

    @Override // p9.p
    public final boolean i(Annotation annotation) {
        return this.f234229b.containsKey(annotation.annotationType());
    }
}
