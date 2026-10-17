package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class z1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f246352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f246353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246354c;

    public z1(i0 i0Var, p0 p0Var) {
        this.f246352a = i0Var;
        this.f246353b = e4m.b.b(new p1(i0Var, this, 1, 5));
        this.f246354c = e4m.b.b(new p1(i0Var, this, 0, 5));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
