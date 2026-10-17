package tg5;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements zg5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f271093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f271094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f271095c;

    public k(d dVar) {
        this.f271093a = dVar;
        int i = 1;
        this.f271094b = e4m.b.b(new h(dVar, this, 0, i));
        this.f271095c = e4m.b.b(new h(dVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f271094b.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // zg5.b
    public final yg5.k x() {
        return (yg5.k) this.f271095c.get();
    }
}
