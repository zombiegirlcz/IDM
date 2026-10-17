package x13;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class w implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f302209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f302210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f302211c;
    public final e4m.e d;

    public w(p pVar, q qVar) {
        this.f302209a = pVar;
        this.f302210b = qVar;
        int i = 18;
        this.f302211c = e4m.b.b(new vy9.a(this, 1, i));
        this.d = e4m.b.b(new vy9.a(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302209a.V.get(), (yji.n) this.f302210b.f302183r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
