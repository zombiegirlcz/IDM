package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class l1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lnk.f f246101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246103c;
    public final e4m.e d;

    public l1(i0 i0Var, k1 k1Var, lnk.f fVar) {
        this.f246102b = i0Var;
        this.f246101a = fVar;
        this.f246103c = e4m.b.b(new m(i0Var, this, 1, 26));
        this.d = e4m.b.b(new m(i0Var, this, 0, 26));
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
