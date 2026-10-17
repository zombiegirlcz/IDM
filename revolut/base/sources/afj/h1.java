package afj;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class h1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xhj.f f4269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f4271c;
    public final e4m.e d;

    public h1(b bVar, l lVar, xhj.f fVar) {
        this.f4270b = bVar;
        this.f4269a = fVar;
        int i = 11;
        this.f4271c = e4m.b.b(new c1(bVar, this, 1, i));
        this.d = e4m.b.b(new c1(bVar, this, 0, i));
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
