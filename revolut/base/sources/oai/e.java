package oai;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jai.b f223674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f223675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f223676c;
    public final e4m.e d;
    public final e4m.e e;

    public e(i0 i0Var, jai.b bVar) {
        this.f223675b = i0Var;
        this.f223674a = bVar;
        int i = 12;
        this.f223676c = e4m.b.b(new o41.b(i0Var, this, 1, i));
        this.d = e4m.b.b(new o41.b(i0Var, this, 0, i));
        this.e = e4m.b.b(new o41.b(i0Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
