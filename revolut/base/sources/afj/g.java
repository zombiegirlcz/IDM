package afj;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f4249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f4250c;
    public final e4m.e d;
    public final e4m.e e;

    public g(b bVar, f fVar) {
        this.f4248a = bVar;
        this.f4249b = e4m.b.b(new d(bVar, fVar, this, 0, 1));
        this.f4250c = e4m.b.b(new d(bVar, fVar, this, 3, 1));
        this.d = e4m.b.b(new d(bVar, fVar, this, 2, 1));
        this.e = e4m.b.b(new d(bVar, fVar, this, 1, 1));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f4249b.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
