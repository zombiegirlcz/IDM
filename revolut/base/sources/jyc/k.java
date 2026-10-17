package jyc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.selfserve.sot.api.navigation.SotDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements yyc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SotDestination.Config f179394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f179395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f179396c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public k(h hVar, ViewController viewController, SotDestination.Config config) {
        this.f179394a = config;
        this.f179395b = e4m.b.b(e4m.c.a(viewController));
        this.f179396c = e4m.b.b(new j(hVar, this, 2));
        this.d = e4m.b.b(new j(hVar, this, 1));
        this.e = e4m.b.b(new j(hVar, this, 0));
        this.f = e4m.b.b(new j(hVar, this, 3));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
