package ta9;

import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements bpg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f269284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f269285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f269286c;

    public x(m mVar, o oVar) {
        this.f269284a = mVar;
        this.f269285b = oVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f269286c = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f269286c, BaseScreen.class);
        BaseScreen baseScreen = this.f269286c;
        ow9.d dVar = new ow9.d(1);
        dVar.f230337b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 8;
        m mVar = this.f269284a;
        o oVar = this.f269285b;
        dVar.f230338c = e4m.b.b(new r7d.w(mVar, oVar, dVar, 2, i));
        dVar.d = e4m.b.b(new r7d.w(mVar, oVar, dVar, 1, i));
        dVar.e = e4m.b.b(new r7d.w(mVar, oVar, dVar, 0, i));
        dVar.f = e4m.b.b(new r7d.w(mVar, oVar, dVar, 6, i));
        dVar.f230339g = e4m.b.b(new r7d.w(mVar, oVar, dVar, 5, i));
        dVar.f230340h = e4m.b.b(new r7d.w(mVar, oVar, dVar, 4, i));
        dVar.i = e4m.b.b(new r7d.w(mVar, oVar, dVar, 3, i));
        return dVar;
    }
}
