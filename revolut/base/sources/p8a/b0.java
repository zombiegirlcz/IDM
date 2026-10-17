package p8a;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f233895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f233896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233897c;

    public b0(d0 d0Var, n nVar) {
        this.f233895a = nVar;
        int i = 19;
        this.f233896b = e4m.b.b(new p12.s0(this, 1, i));
        this.f233897c = e4m.b.b(new p12.s0(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f233895a.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
