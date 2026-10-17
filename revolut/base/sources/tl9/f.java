package tl9;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f272038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f272039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f272040c;
    public final e4m.e d;

    public f(c cVar, ViewController viewController) {
        this.f272038a = cVar;
        this.f272039b = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        this.f272040c = e4m.b.b(new tg5.h(cVar, this, 1, i));
        this.d = e4m.b.b(new tg5.h(cVar, this, 0, i));
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
