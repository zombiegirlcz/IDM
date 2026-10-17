package mz;

import android.content.Context;
import com.revolut.kompot.navigable.vc.ViewController;
import f00.a;
import fv.e;
import ly.o;
import px.g;
import vc.s;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements my.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewController f210556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ly.c f210557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f210558c;
    public Context d;
    public a.C0766a e;
    public e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f210559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l70.e f210560h;
    public gx.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u00.d f210561j;
    public nv.a k;

    private a() {
    }

    @Override // xki.b
    public final Object a(ViewController viewController) {
        this.f210556a = viewController;
        return this;
    }

    @Override // xki.b
    public final xki.c build() {
        s.h(this.f210556a, ViewController.class);
        s.h(this.f210557b, ly.c.class);
        s.h(this.f210558c, o.class);
        s.h(this.d, Context.class);
        s.h(this.e, f00.b.class);
        s.h(this.f, e.class);
        s.h(this.f210559g, g.class);
        s.h(this.f210560h, l70.e.class);
        s.h(this.i, gx.c.class);
        s.h(this.f210561j, u00.d.class);
        s.h(this.k, nv.a.class);
        return new b(this.f210559g, this.f210560h, this.i, this.f210561j, this.k, this.f210557b, this.e, this.f);
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
        this.f210557b = cVar;
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
        this.f210558c = oVar;
        return this;
    }
}
