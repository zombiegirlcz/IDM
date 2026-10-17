package qx;

import android.content.Context;
import com.revolut.kompot.navigable.vc.ViewController;
import f00.a;
import fv.e;
import ly.o;
import px.g;
import u00.d;
import vc.s;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements my.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewController f249964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ly.c f249965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f249966c;
    public Context d;
    public a.C0766a e;
    public e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f249967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l70.e f249968h;
    public k81.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gx.c f249969j;
    public d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public nv.a f249970l;

    private c() {
    }

    @Override // xki.b
    public final Object a(ViewController viewController) {
        this.f249964a = viewController;
        return this;
    }

    @Override // xki.b
    public final xki.c build() {
        s.h(this.f249964a, ViewController.class);
        s.h(this.f249965b, ly.c.class);
        s.h(this.f249966c, o.class);
        s.h(this.d, Context.class);
        s.h(this.e, f00.b.class);
        s.h(this.f, e.class);
        s.h(this.f249967g, g.class);
        s.h(this.f249968h, l70.e.class);
        s.h(this.i, k81.a.class);
        s.h(this.f249969j, gx.c.class);
        s.h(this.k, d.class);
        s.h(this.f249970l, nv.a.class);
        return new ey.b(this.f249967g, this.f249968h, this.i, this.f249969j, this.k, this.f249970l, this.f249965b, this.e, this.f, 3);
    }

    @Override // my.a
    public final my.a c(e eVar) {
        eVar.getClass();
        this.f = eVar;
        return this;
    }

    @Override // my.a
    public final my.a d(ly.c cVar) {
        cVar.getClass();
        this.f249965b = cVar;
        return this;
    }

    @Override // my.a
    public final my.a j(Context context) {
        context.getClass();
        this.d = context;
        return this;
    }

    @Override // my.a
    public final my.a n() {
        this.e = f00.a.f130988b;
        return this;
    }

    @Override // my.a
    public final my.a p(o oVar) {
        this.f249966c = oVar;
        return this;
    }
}
