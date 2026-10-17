package ce;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23279a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f23280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f23281c;
    public int d;
    public int e;
    public f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f23282g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f23280b = hashSet;
        this.f23281c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.f23282g = new HashSet();
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            m70.a.b(cls2, "Null interface");
            this.f23280b.add(t.a(cls2));
        }
    }

    public final void a(n nVar) {
        if (this.f23280b.contains(nVar.f23308a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f23281c.add(nVar);
    }

    public final b b() {
        if (this.f != null) {
            return new b(this.f23279a, new HashSet(this.f23280b), new HashSet(this.f23281c), this.d, this.e, this.f, this.f23282g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void c(int i) {
        if (!(this.d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.d = i;
    }

    public a(t tVar, t[] tVarArr) {
        HashSet hashSet = new HashSet();
        this.f23280b = hashSet;
        this.f23281c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.f23282g = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            m70.a.b(tVar2, "Null interface");
        }
        Collections.addAll(this.f23280b, tVarArr);
    }
}
