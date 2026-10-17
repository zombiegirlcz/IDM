package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class j1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109730a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109732c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f109733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f109734h;

    public j1(h0 h0Var, r0 r0Var, ViewController viewController) {
        this.f109731b = h0Var;
        this.f109732c = e4m.b.b(e4m.c.a(viewController));
        int i = 26;
        this.d = e4m.b.b(new d0(h0Var, this, 0, i));
        this.e = e4m.b.b(new d0(h0Var, this, 2, i));
        this.f = e4m.b.b(new d0(h0Var, this, 1, i));
        this.f109733g = e4m.b.b(new d0(h0Var, this, 4, i));
        this.f109734h = e4m.b.b(new d0(h0Var, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f109730a) {
        }
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f109730a) {
        }
        return ImmutableSet.of((yji.d) this.d.get());
    }

    public j1(h0 h0Var, ViewController viewController) {
        this.f109731b = h0Var;
        this.f109732c = e4m.b.b(e4m.c.a(viewController));
        int i = 27;
        this.d = e4m.b.b(new d0(h0Var, this, 0, i));
        this.e = e4m.b.b(new d0(h0Var, this, 2, i));
        this.f = e4m.b.b(new d0(h0Var, this, 1, i));
        this.f109733g = e4m.b.b(new d0(h0Var, this, 4, i));
        this.f109734h = e4m.b.b(new d0(h0Var, this, 3, i));
    }
}
