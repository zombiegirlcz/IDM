package lcb;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import e4m.e;
import java.util.Set;
import l9f.z;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f193829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f193830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f193831c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f193832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f193833h;
    public final e i;

    public c(a aVar, b bVar, BaseScreen baseScreen) {
        this.f193829a = aVar;
        this.f193830b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 8;
        this.f193831c = e4m.b.b(new z(aVar, this, 2, i));
        this.d = e4m.b.b(new z(aVar, this, 1, i));
        this.e = e4m.b.b(new z(aVar, this, 0, i));
        this.f = e4m.b.b(new z(aVar, this, 4, i));
        this.f193832g = e4m.b.b(new z(aVar, this, 3, i));
        this.f193833h = e4m.b.b(new z(aVar, this, 6, i));
        this.i = e4m.b.b(new z(aVar, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((n) this.f193832g.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
