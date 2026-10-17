package p9;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public abstract class f extends p implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient i0 f234212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient q f234213c;

    public f(i0 i0Var, q qVar) {
        this.f234212b = i0Var;
        this.f234213c = qVar;
    }

    @Override // p9.p
    public final Annotation e(Class cls) {
        q qVar = this.f234213c;
        if (qVar == null) {
            return null;
        }
        return qVar.a(cls);
    }

    public abstract Class n();

    public String o() {
        return n().getName() + "#" + getName();
    }

    public abstract Member p();

    public abstract Object q(Object obj2);

    public final boolean r(Class cls) {
        HashMap map;
        q qVar = this.f234213c;
        if (qVar == null || (map = qVar.f234237b) == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    public final boolean s(Class[] clsArr) {
        q qVar = this.f234213c;
        if (qVar == null || qVar.f234237b == null) {
            return false;
        }
        for (Class cls : clsArr) {
            if (qVar.f234237b.containsKey(cls)) {
                return true;
            }
        }
        return false;
    }

    public abstract p t(q qVar);
}
