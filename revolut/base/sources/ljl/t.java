package ljl;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class t implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f196098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f196099b = e4m.b.b(new kyk.n(this, 1, 27));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f196100c = e4m.b.b(new kyk.n(this, 0, 27));

    public t(q0 q0Var, c cVar) {
        this.f196098a = cVar;
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f196098a.Q.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f196098a.P.get());
    }
}
