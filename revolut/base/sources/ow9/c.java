package ow9;

import com.revolut.kompot.navigable.screen.BaseScreen;
import ove.w;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements bpg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f230334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f230335b;

    public c(a aVar, b bVar) {
        this.f230334a = aVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f230335b = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        s.h(this.f230335b, BaseScreen.class);
        BaseScreen baseScreen = this.f230335b;
        d dVar = new d(0);
        dVar.f230337b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 3;
        a aVar = this.f230334a;
        dVar.f230338c = e4m.b.b(new w(aVar, dVar, 2, i));
        dVar.d = e4m.b.b(new w(aVar, dVar, 1, i));
        dVar.e = e4m.b.b(new w(aVar, dVar, 0, i));
        dVar.f = e4m.b.b(new w(aVar, dVar, 6, i));
        dVar.f230339g = e4m.b.b(new w(aVar, dVar, 5, i));
        dVar.f230340h = e4m.b.b(new w(aVar, dVar, 4, i));
        dVar.i = e4m.b.b(new w(aVar, dVar, 3, i));
        return dVar;
    }
}
