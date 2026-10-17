package fa0;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class o implements ta0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133118a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormScreen f133119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f133120c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f133121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f133122h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f133123j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final na0.d f133124l;

    public o(k kVar, h hVar, ViewController viewController, FormScreen formScreen) {
        this.f133120c = kVar;
        this.f133124l = hVar;
        this.f133119b = formScreen;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 15;
        this.e = e4m.b.b(new ehe.o(kVar, hVar, this, 2, i));
        this.f = e4m.b.b(new ehe.o(kVar, hVar, this, 1, i));
        this.f133121g = e4m.b.b(new ehe.o(kVar, hVar, this, 0, i));
        this.f133122h = e4m.b.b(new ehe.o(kVar, hVar, this, 5, i));
        this.i = e4m.b.b(new ehe.o(kVar, hVar, this, 4, i));
        this.f133123j = e4m.b.b(new ehe.o(kVar, hVar, this, 3, i));
        this.k = e4m.b.b(new ehe.o(kVar, hVar, this, 6, i));
    }

    @Override // ta0.a
    public final qa0.a F() {
        switch (this.f133118a) {
            case 0:
                return (qa0.a) ((j) this.f133124l).f133086o0.get();
            default:
                return (qa0.a) ((h) this.f133124l).f133052o0.get();
        }
    }

    @Override // ta0.a
    public final j60.a P() {
        switch (this.f133118a) {
        }
        return (j60.a) this.f.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f133118a) {
        }
        return ImmutableSet.of((yji.n) this.f133123j.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f133118a) {
        }
        return ImmutableSet.of((yji.d) this.f133121g.get());
    }

    @Override // ta0.a
    public final yc0.g m() {
        switch (this.f133118a) {
            case 0:
                return (yc0.g) ((j) this.f133124l).f133100y.get();
            default:
                return (yc0.g) ((h) this.f133124l).f133066y.get();
        }
    }

    public o(k kVar, j jVar, ViewController viewController, FormScreen formScreen) {
        this.f133120c = kVar;
        this.f133124l = jVar;
        this.f133119b = formScreen;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.e = e4m.b.b(new ehe.o(kVar, jVar, this, 2, i));
        this.f = e4m.b.b(new ehe.o(kVar, jVar, this, 1, i));
        this.f133121g = e4m.b.b(new ehe.o(kVar, jVar, this, 0, i));
        this.f133122h = e4m.b.b(new ehe.o(kVar, jVar, this, 5, i));
        this.i = e4m.b.b(new ehe.o(kVar, jVar, this, 4, i));
        this.f133123j = e4m.b.b(new ehe.o(kVar, jVar, this, 3, i));
        this.k = e4m.b.b(new ehe.o(kVar, jVar, this, 6, i));
    }
}
