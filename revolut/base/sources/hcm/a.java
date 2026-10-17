package hcm;

import gcm.j0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f151247c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar) {
        super(dVar, 1);
        this.f151247c = dVar;
        dfm.b.b();
    }

    @Override // gcm.j0
    public final void a() {
        d dVar;
        int i;
        mmm.h hVar = new mmm.h();
        dfm.b.c();
        try {
            dfm.a aVar = dfm.b.f114548a;
            aVar.getClass();
            synchronized (this.f151247c.f151255a) {
                mmm.h hVar2 = this.f151247c.f151256b;
                hVar.write(hVar2, hVar2.h());
                dVar = this.f151247c;
                dVar.f = false;
                i = dVar.f151262m;
            }
            dVar.i.write(hVar, hVar.f207266b);
            synchronized (this.f151247c.f151255a) {
                this.f151247c.f151262m -= i;
            }
            aVar.getClass();
        } catch (Throwable th10) {
            try {
                dfm.b.f114548a.getClass();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }
}
