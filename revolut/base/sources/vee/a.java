package vee;

import gsi.g;
import gsi.h;
import vc.s;
import xpi.d;
import xpi.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements g, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xoi.d f288291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f288292c;
    public e80.c d;
    public uce.c e;
    public final Object f;

    public /* synthetic */ a(Object obj2, int i) {
        this.f288290a = i;
        this.f = obj2;
    }

    @Override // gsi.g
    public final h build() {
        switch (this.f288290a) {
            case 0:
                s.h(this.f288291b, fsi.g.class);
                s.h(this.f288292c, f.class);
                s.h(this.d, e80.c.class);
                s.h(this.e, uce.c.class);
                return new b((c) this.f, this.f288291b, this.f288292c, this.e);
            default:
                s.h(this.f288291b, fsi.g.class);
                s.h(this.f288292c, f.class);
                s.h(this.d, e80.c.class);
                s.h(this.e, uce.c.class);
                return new xee.a((c) this.f, this.f288291b, this.f288292c, this.e);
        }
    }

    @Override // gsi.g
    public final Object h(fsi.g gVar) {
        switch (this.f288290a) {
            case 0:
                this.f288291b = (xoi.d) gVar;
                break;
            default:
                this.f288291b = (xoi.d) gVar;
                break;
        }
        return this;
    }

    @Override // xpi.d
    public final Object k() {
        switch (this.f288290a) {
            case 0:
                this.f288292c = f.f307976c;
                break;
            default:
                this.f288292c = f.f307976c;
                break;
        }
        return this;
    }
}
