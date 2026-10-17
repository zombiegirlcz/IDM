package fa0;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class w implements ta0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133166a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormScreen f133167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f133168c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f133169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f133170h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final na0.d f133171j;

    public w(k kVar, h hVar, ViewController viewController, FormScreen formScreen) {
        this.f133168c = kVar;
        this.f133171j = hVar;
        this.f133167b = formScreen;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        this.e = e4m.b.b(new q(kVar, this, 2, i));
        this.f = e4m.b.b(new q(kVar, this, 1, i));
        this.f133169g = e4m.b.b(new q(kVar, this, 0, i));
        this.f133170h = e4m.b.b(new q(kVar, this, 4, i));
        this.i = e4m.b.b(new q(kVar, this, 3, i));
    }

    @Override // ta0.a
    public final qa0.a F() {
        switch (this.f133166a) {
            case 0:
                return (qa0.a) ((j) this.f133171j).f133086o0.get();
            default:
                return (qa0.a) ((h) this.f133171j).f133052o0.get();
        }
    }

    @Override // ta0.a
    public final j60.a P() {
        switch (this.f133166a) {
        }
        return (j60.a) this.f.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f133166a) {
        }
        return ImmutableSet.of((yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f133166a) {
        }
        return ImmutableSet.of((yji.d) this.f133169g.get());
    }

    @Override // ta0.a
    public final yc0.g m() {
        switch (this.f133166a) {
            case 0:
                return (yc0.g) ((j) this.f133171j).f133100y.get();
            default:
                return (yc0.g) ((h) this.f133171j).f133066y.get();
        }
    }

    public w(k kVar, j jVar, ViewController viewController, FormScreen formScreen) {
        this.f133168c = kVar;
        this.f133171j = jVar;
        this.f133167b = formScreen;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        this.e = e4m.b.b(new q(kVar, this, 2, i));
        this.f = e4m.b.b(new q(kVar, this, 1, i));
        this.f133169g = e4m.b.b(new q(kVar, this, 0, i));
        this.f133170h = e4m.b.b(new q(kVar, this, 4, i));
        this.i = e4m.b.b(new q(kVar, this, 3, i));
    }
}
