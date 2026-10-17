package ljl;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f196086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f196087b = e4m.b.b(new kyk.n(this, 1, 26));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f196088c = e4m.b.b(new kyk.n(this, 0, 26));

    public r(q0 q0Var, c cVar) {
        this.f196086a = cVar;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f196086a.Q.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f196086a.P.get());
    }
}
