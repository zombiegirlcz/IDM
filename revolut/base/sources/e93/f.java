package e93;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f123859a;

    public f(ArrayList arrayList, List list) {
        this.f123859a = list;
    }

    public abstract l a();

    public abstract b b();

    public abstract b93.b c();

    public abstract m d();

    public abstract w e();

    public abstract List f();

    public abstract String getTitle();

    public abstract String h();

    public abstract String i();

    public abstract List k();

    public abstract String l();

    public abstract String m();

    public abstract t n();

    public abstract dj0.d o();

    public abstract c93.j p();

    public abstract h93.j0 q();

    public abstract h93.l0 r();

    public abstract String s();

    public abstract String t();

    public final boolean u() {
        return a() == l.LOCKED;
    }
}
