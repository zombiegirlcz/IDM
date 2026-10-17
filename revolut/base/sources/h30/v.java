package h30;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t50.h f148972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f148973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gff.a f148974c;
    public final gff.a d;
    public final e4m.e e;

    public v(n nVar, ViewController viewController, t50.h hVar) {
        this.f148973b = nVar;
        this.f148972a = hVar;
        int i = 8;
        this.f148974c = new gff.a(this, 0, i);
        this.d = new gff.a(this, 1, i);
        this.e = e4m.b.b(e4m.c.a(viewController));
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
