package gsc;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import g9g.e0;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f146386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f146387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f146388c;

    public e(c cVar, ViewController viewController) {
        this.f146386a = viewController;
        int i = 20;
        this.f146387b = e4m.b.b(new e0(cVar, this, 1, i));
        this.f146388c = e4m.b.b(new e0(cVar, this, 0, i));
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
