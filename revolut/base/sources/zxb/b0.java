package zxb;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f326104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f326105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f326106c;
    public final e4m.e d;

    public b0(e eVar, ViewController viewController) {
        this.f326104a = viewController;
        this.f326105b = e4m.b.b(new s(eVar, this, 2, 2));
        this.f326106c = e4m.b.b(new s(eVar, this, 1, 2));
        this.d = e4m.b.b(new s(eVar, this, 0, 2));
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
