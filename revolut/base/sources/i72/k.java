package i72;

import android.content.Context;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f159109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.b f159110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f159111c;
    public final cri.d d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f159112g;

    public k(cri.d dVar, uw1.b bVar, l lVar, Context context) {
        this.f159109a = lVar;
        this.f159110b = bVar;
        this.f159111c = context;
        this.d = dVar;
        int i = 0;
        this.e = e4m.b.b(new j(this, 0, i));
        this.f = e4m.b.b(new j(this, 2, i));
        this.f159112g = e4m.b.b(new j(this, 1, i));
    }

    public final g72.g a() {
        l lVar = this.f159109a;
        a72.h hVar = (a72.h) lVar.f.get();
        vc.s.j(hVar);
        a72.f fVar = (a72.f) lVar.f159118j.get();
        vc.s.j(fVar);
        uw1.c cVarD = ((lz1.m) this.f159110b).d();
        vc.s.j(cVarD);
        return new g72.g(hVar, fVar, cVarD);
    }
}
