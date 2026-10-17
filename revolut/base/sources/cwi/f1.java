package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class f1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109670a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109672c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public f1(h0 h0Var, b0 b0Var, ViewController viewController) {
        this.f109671b = h0Var;
        this.f109672c = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.d = e4m.b.b(new d0(h0Var, this, 0, i));
        this.e = e4m.b.b(new d0(h0Var, this, 2, i));
        this.f = e4m.b.b(new d0(h0Var, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f109670a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f109670a) {
        }
        return ImmutableSet.of((yji.d) this.d.get());
    }

    public f1(h0 h0Var, q0 q0Var, ViewController viewController) {
        this.f109671b = h0Var;
        this.f109672c = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.d = e4m.b.b(new d0(h0Var, this, 0, i));
        this.e = e4m.b.b(new d0(h0Var, this, 2, i));
        this.f = e4m.b.b(new d0(h0Var, this, 1, i));
    }
}
