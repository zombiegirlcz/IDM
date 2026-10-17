package ok1;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f225876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f225877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f225878c;

    public h(d dVar, f fVar, ViewController viewController) {
        this.f225876a = viewController;
        int i = 18;
        this.f225877b = e4m.b.b(new oi9.a(dVar, this, 1, i));
        this.f225878c = e4m.b.b(new oi9.a(dVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
