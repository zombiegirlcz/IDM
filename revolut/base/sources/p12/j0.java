package p12;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class j0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e12.f f231688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f231689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231690c;

    public j0(v vVar, e12.f fVar) {
        this.f231688a = fVar;
        int i = 2;
        this.f231689b = e4m.b.b(new f0(vVar, this, 1, i));
        this.f231690c = e4m.b.b(new f0(vVar, this, 0, i));
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
