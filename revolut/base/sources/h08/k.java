package h08;

import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements gsi.g, xpi.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xoi.d f148317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xpi.f f148318c;
    public final Object d;

    public /* synthetic */ k(Object obj2, int i) {
        this.f148316a = i;
        this.d = obj2;
    }

    @Override // gsi.g
    public final gsi.h build() {
        switch (this.f148316a) {
            case 0:
                s.h(this.f148317b, fsi.g.class);
                s.h(this.f148318c, xpi.f.class);
                return new l((h) this.d, this.f148317b, this.f148318c);
            case 1:
                s.h(this.f148317b, fsi.g.class);
                s.h(this.f148318c, xpi.f.class);
                return new qy7.g((qy7.c) this.d, this.f148317b, this.f148318c);
            default:
                s.h(this.f148317b, fsi.g.class);
                s.h(this.f148318c, xpi.f.class);
                return new zz7.e((zz7.c) this.d, this.f148317b, this.f148318c);
        }
    }

    @Override // gsi.g
    public final Object h(fsi.g gVar) {
        switch (this.f148316a) {
            case 0:
                this.f148317b = (xoi.d) gVar;
                break;
            case 1:
                this.f148317b = (xoi.d) gVar;
                break;
            default:
                this.f148317b = (xoi.d) gVar;
                break;
        }
        return this;
    }

    @Override // xpi.d
    public final Object k() {
        switch (this.f148316a) {
            case 0:
                this.f148318c = xpi.f.d;
                break;
            case 1:
                this.f148318c = xpi.f.d;
                break;
            default:
                this.f148318c = xpi.f.d;
                break;
        }
        return this;
    }
}
