package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class i1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f246026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f246027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246028c;
    public final e4m.e d;

    public i1(i0 i0Var) {
        this.f246026a = i0Var;
        int i = 24;
        this.f246027b = e4m.b.b(new m(i0Var, this, 0, i));
        this.f246028c = e4m.b.b(new m(i0Var, this, 2, i));
        this.d = e4m.b.b(new m(i0Var, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f246027b.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
