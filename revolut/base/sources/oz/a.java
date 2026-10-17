package oz;

import android.content.Context;
import com.revolut.kompot.navigable.vc.ViewController;
import f00.a;
import ly.o;
import px.g;
import vc.s;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements my.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewController f231065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ly.c f231066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f231067c;
    public Context d;
    public a.C0766a e;
    public fv.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f231068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l70.e f231069h;
    public k81.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gx.c f231070j;
    public u00.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public nv.a f231071l;

    private a() {
    }

    @Override // xki.b
    public final Object a(ViewController viewController) {
        this.f231065a = viewController;
        return this;
    }

    @Override // xki.b
    public final xki.c build() {
        s.h(this.f231065a, ViewController.class);
        s.h(this.f231066b, ly.c.class);
        s.h(this.f231067c, o.class);
        s.h(this.d, Context.class);
        s.h(this.e, f00.b.class);
        s.h(this.f, fv.e.class);
        s.h(this.f231068g, g.class);
        s.h(this.f231069h, l70.e.class);
        s.h(this.i, k81.a.class);
        s.h(this.f231070j, gx.c.class);
        s.h(this.k, u00.d.class);
        s.h(this.f231071l, nv.a.class);
        return new ey.b(this.f231068g, this.f231069h, this.i, this.f231070j, this.k, this.f231071l, this.f231066b, this.e, this.f, 1);
    }

    @Override // my.a
    public final my.a c(fv.e eVar) {
        eVar.getClass();
        this.f = eVar;
        return this;
    }

    @Override // my.a
    public final my.a d(ly.c cVar) {
        cVar.getClass();
        this.f231066b = cVar;
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
        this.f231067c = oVar;
        return this;
    }
}
