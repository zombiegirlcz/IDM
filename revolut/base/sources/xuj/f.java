package xuj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import xsl.q;
import zuj.t;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f309085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f309086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f309087c;
    public final e4m.e d;
    public final e4m.e e;

    public f(i iVar, ViewController viewController, t tVar) {
        this.f309086b = iVar;
        this.f309085a = tVar;
        this.f309087c = e4m.b.b(e4m.c.a(viewController));
        int i = 1;
        this.d = e4m.b.b(new q(iVar, this, 1, i));
        this.e = e4m.b.b(new q(iVar, this, 0, i));
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
