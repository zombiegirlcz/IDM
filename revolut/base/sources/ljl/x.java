package ljl;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f196134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f196135b = e4m.b.b(new kyk.n(this, 1, 29));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f196136c = e4m.b.b(new kyk.n(this, 0, 29));

    public x(q0 q0Var, c cVar) {
        this.f196134a = cVar;
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f196134a.Q.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f196134a.P.get());
    }
}
