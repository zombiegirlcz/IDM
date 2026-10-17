package zc;

/* JADX INFO: loaded from: classes16.dex */
public final class h extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f320984c;
    public final transient int d;
    public final /* synthetic */ i e;

    public h(i iVar, int i, int i2) {
        this.e = iVar;
        this.f320984c = i;
        this.d = i2;
    }

    @Override // zc.f
    public final int b() {
        return this.e.c() + this.f320984c + this.d;
    }

    @Override // zc.f
    public final int c() {
        return this.e.c() + this.f320984c;
    }

    @Override // zc.f
    public final Object[] d() {
        return this.e.d();
    }

    @Override // zc.i, java.util.List
    /* JADX INFO: renamed from: e */
    public final i subList(int i, int i2) {
        vc.s.f(i, i2, this.d);
        int i3 = this.f320984c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        vc.s.e(i, this.d);
        return this.e.get(i + this.f320984c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
