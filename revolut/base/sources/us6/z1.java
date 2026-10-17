package us6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f282824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282826c;

    public z1(c2 c2Var, a2 a2Var) {
        this.f282824a = c2Var;
        int i = 21;
        this.f282825b = e4m.b.b(new q0(c2Var, this, 1, i));
        this.f282826c = e4m.b.b(new q0(c2Var, this, 0, i));
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
