package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.migrate_alias.screens.review.ReviewMigrateAliasScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class z0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReviewMigrateAliasScreenContract$InputData f234130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234132c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f234134h;
    public final e4m.e i;

    public z0(d0 d0Var, j jVar, ViewController viewController, ReviewMigrateAliasScreenContract$InputData reviewMigrateAliasScreenContract$InputData) {
        this.f234130a = reviewMigrateAliasScreenContract$InputData;
        this.f234131b = e4m.b.b(e4m.c.a(viewController));
        this.f234132c = e4m.b.b(new m(d0Var, this, 2, 19));
        this.d = e4m.b.b(new m(d0Var, this, 1, 19));
        this.e = e4m.b.b(new m(d0Var, this, 0, 19));
        this.f = e4m.b.b(new m(d0Var, this, 5, 19));
        this.f234133g = e4m.b.b(new m(d0Var, this, 4, 19));
        this.f234134h = e4m.b.b(new m(d0Var, this, 3, 19));
        this.i = e4m.b.b(new m(d0Var, this, 6, 19));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f234134h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
