package tg5;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements zg5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4m.e f271089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f271090b;

    public i(d dVar, e eVar) {
        int i = 0;
        this.f271089a = e4m.b.b(new h(dVar, this, 0, i));
        this.f271090b = e4m.b.b(new h(dVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f271089a.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // zg5.b
    public final yg5.k x() {
        return (yg5.k) this.f271090b.get();
    }
}
