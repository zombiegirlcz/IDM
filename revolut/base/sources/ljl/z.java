package ljl;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class z implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f196147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f196148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f196149c;

    public z(q0 q0Var, c cVar) {
        this.f196147a = cVar;
        int i = 0;
        this.f196148b = e4m.b.b(new y(this, 1, i));
        this.f196149c = e4m.b.b(new y(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f196147a.Q.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f196147a.P.get());
    }
}
