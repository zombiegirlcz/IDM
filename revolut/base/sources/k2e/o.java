package k2e;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f180537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f180538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f180539c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f180540g;

    public o(j jVar, ViewController viewController) {
        this.f180537a = viewController;
        int i = 11;
        this.f180538b = e4m.b.b(new jqa.h(jVar, this, 1, i));
        this.f180539c = e4m.b.b(new jqa.h(jVar, this, 0, i));
        this.d = e4m.b.b(new jqa.h(jVar, this, 4, i));
        this.e = e4m.b.b(new jqa.h(jVar, this, 3, i));
        this.f = e4m.b.b(new jqa.h(jVar, this, 2, i));
        this.f180540g = e4m.b.b(new jqa.h(jVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f180539c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
