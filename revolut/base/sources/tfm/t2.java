package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class t2 implements efm.h, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.g f270833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f270834c;
    public volatile boolean d;
    public boolean e;

    public t2(efm.y yVar, kfm.c cVar, kfm.g gVar, Object obj2) {
        this.f270832a = yVar;
        this.f270833b = gVar;
        this.f270834c = obj2;
    }

    public final void a(Object obj2) {
        try {
            this.f270833b.accept(obj2);
        } catch (Throwable th10) {
            m70.a.u(th10);
            mo3.a.m(th10);
        }
    }

    @Override // ifm.c
    public final void dispose() {
        this.d = true;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d;
    }
}
