package eji;

import com.revolut.kompot.navigable.screen.BaseScreen;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseScreen f126905a;

    private a() {
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        throw null;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        s.h(this.f126905a, BaseScreen.class);
        b bVar = new b();
        bVar.f126906a = e4m.b.b(new ede.a(bVar, 1, 7));
        bVar.f126907b = e4m.b.b(new ede.a(bVar, 0, 7));
        return bVar;
    }
}
