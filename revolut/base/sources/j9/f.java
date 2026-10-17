package j9;

import com.fasterxml.jackson.core.p;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.t;
import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements p, g, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f9.i f172257h = new f9.i(" ");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f172258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f172259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f172260c;
    public final boolean d;
    public transient int e;
    public final dl.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f172261g;

    public f() {
        this.f172258a = e.f172256a;
        this.f172259b = d.d;
        this.d = true;
        this.f172260c = f172257h;
        this.f = p.f26181l1;
        this.f172261g = " : ";
    }

    public final void a(com.fasterxml.jackson.core.h hVar) {
        if (!this.f172258a.a()) {
            this.e++;
        }
        hVar.u('[');
    }

    public f(f fVar) {
        q qVar = fVar.f172260c;
        this.f172258a = e.f172256a;
        this.f172259b = d.d;
        this.d = true;
        this.f172258a = fVar.f172258a;
        this.f172259b = fVar.f172259b;
        this.d = fVar.d;
        this.e = fVar.e;
        this.f = fVar.f;
        this.f172261g = fVar.f172261g;
        this.f172260c = qVar;
    }
}
