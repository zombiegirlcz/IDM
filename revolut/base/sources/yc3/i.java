package yc3;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import xsl.q;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f312488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f312489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f312490c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f312491g;

    public i(a aVar, h hVar, BaseScreen baseScreen) {
        this.f312488a = aVar;
        this.f312489b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 21;
        this.f312490c = e4m.b.b(new q(aVar, this, 2, i));
        this.d = e4m.b.b(new q(aVar, this, 1, i));
        this.e = e4m.b.b(new q(aVar, this, 0, i));
        this.f = e4m.b.b(new q(aVar, this, 4, i));
        this.f312491g = e4m.b.b(new q(aVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
