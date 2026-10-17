package jje;

import com.revolut.kompot.navigable.screen.BaseScreen;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f174880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f174881c;
    public gfd.c d;
    public mkd.g e;
    public bi5.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ash.j f174882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ut5.l f174883h;
    public pr5.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qr5.b f174884j;
    public final Object k;

    public /* synthetic */ g(c cVar, Object obj2, int i) {
        this.f174879a = i;
        this.f174880b = cVar;
        this.k = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f174879a) {
            case 0:
                this.f174881c = baseScreen;
                break;
            default:
                this.f174881c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f174879a) {
            case 0:
                s.h(this.f174881c, BaseScreen.class);
                s.h(this.d, gfd.c.class);
                s.h(this.e, mkd.g.class);
                s.h(this.f, bi5.e.class);
                s.h(this.f174882g, ash.j.class);
                s.h(this.f174883h, ut5.l.class);
                s.h(this.i, pr5.c.class);
                s.h(this.f174884j, qr5.b.class);
                return new h(this.f174880b, (e) this.k, new rr5.c(), this.f174881c, this.d, this.e, this.f, this.f174882g, this.f174883h, this.i, this.f174884j);
            default:
                s.h(this.f174881c, BaseScreen.class);
                s.h(this.d, gfd.c.class);
                s.h(this.e, mkd.g.class);
                s.h(this.f, bi5.e.class);
                s.h(this.f174882g, ash.j.class);
                s.h(this.f174883h, ut5.l.class);
                s.h(this.i, pr5.c.class);
                s.h(this.f174884j, qr5.b.class);
                return new i(this.f174880b, (d) this.k, new rr5.c(), this.f174881c, this.d, this.e, this.f, this.f174882g, this.f174883h, this.i, this.f174884j);
        }
    }
}
