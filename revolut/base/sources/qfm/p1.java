package qfm;

/* JADX INFO: loaded from: classes13.dex */
public final class p1 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245503c;
    public final boolean d;
    public final en.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(pfm.x xVar, int i) {
        super(xVar);
        en.a aVar = mfm.f.f205043c;
        this.f245503c = i;
        this.d = true;
        this.e = aVar;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        this.f245362b.n(new o1(aVar, this.f245503c, this.d, this.e));
    }
}
