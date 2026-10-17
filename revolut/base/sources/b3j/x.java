package b3j;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4j.g f12120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f12121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f12122c;
    public final e4m.e d;
    public final e4m.e e;

    public x(t tVar, ViewController viewController, m4j.g gVar) {
        this.f12120a = gVar;
        this.f12121b = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.f12122c = e4m.b.b(new aq1.e(this, 1, i));
        this.d = e4m.b.b(new aq1.e(this, 0, i));
        this.e = e4m.b.b(new aq1.e(this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
