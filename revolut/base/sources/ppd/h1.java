package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class h1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238426a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238428c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f238429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f238430h;

    public h1(n nVar, ViewController viewController) {
        this.f238427b = nVar;
        this.f238428c = e4m.b.b(e4m.c.a(viewController));
        int i = 8;
        this.d = e4m.b.b(new i0(nVar, this, 2, i));
        this.e = e4m.b.b(new i0(nVar, this, 1, i));
        this.f = e4m.b.b(new i0(nVar, this, 0, i));
        this.f238429g = e4m.b.b(new i0(nVar, this, 4, i));
        this.f238430h = e4m.b.b(new i0(nVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f238426a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f238426a) {
        }
        return ImmutableSet.of((yji.d) this.f.get());
    }

    public h1(n nVar, l lVar, ViewController viewController) {
        this.f238427b = nVar;
        this.f238428c = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.d = e4m.b.b(new i0(nVar, this, 2, i));
        this.e = e4m.b.b(new i0(nVar, this, 1, i));
        this.f = e4m.b.b(new i0(nVar, this, 0, i));
        this.f238429g = e4m.b.b(new i0(nVar, this, 4, i));
        this.f238430h = e4m.b.b(new i0(nVar, this, 3, i));
    }
}
