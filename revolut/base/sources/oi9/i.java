package oi9;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f225522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f225523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f225524c;

    public i(f fVar, j jVar, int i) {
        this.f225522a = fVar;
        this.f225523b = jVar;
        this.f225524c = i;
    }

    @Override // phm.a
    public final Object get() {
        j jVar = this.f225523b;
        f fVar = this.f225522a;
        int i = this.f225524c;
        if (i == 0) {
            return new wj9.i((xh9.a) fVar.E.get(), (jki.p) jVar.f225526b.get());
        }
        if (i == 1) {
            return new wj9.k(fVar.m(), jVar.f225525a);
        }
        throw new AssertionError(i);
    }
}
