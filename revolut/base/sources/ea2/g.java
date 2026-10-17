package ea2;

import com.google.common.collect.ImmutableSet;
import dw3.v7;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya2.f f124068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f124069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f124070c;
    public final e4m.e d;
    public final e4m.e e;

    public g(h hVar, j jVar, ya2.f fVar) {
        this.f124068a = fVar;
        int i = 25;
        this.f124069b = e4m.b.b(new v7(hVar, this, 1, i));
        this.f124070c = e4m.b.b(new v7(hVar, this, 0, i));
        this.d = e4m.b.b(new v7(hVar, this, 3, i));
        this.e = e4m.b.b(new v7(hVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f124070c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
