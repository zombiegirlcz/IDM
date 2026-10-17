package ljl;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class a1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195875a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f195876b = e4m.b.b(new if2.g(24));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f195877c;

    public a1(q0 q0Var, c cVar) {
        this.f195877c = cVar;
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f195875a) {
            case 0:
                return ImmutableSet.of();
            default:
                return ImmutableSet.of((yji.n) ((c) this.f195877c).Q.get());
        }
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f195875a) {
            case 0:
                return ImmutableSet.of((yji.d) ((b0) this.f195877c).k.get());
            default:
                return ImmutableSet.of((yji.d) ((c) this.f195877c).P.get());
        }
    }

    public a1(q0 q0Var, b0 b0Var) {
        this.f195877c = b0Var;
    }
}
