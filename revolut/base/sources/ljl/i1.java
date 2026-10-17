package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.impl.ui.email.enter_email.EnterEmailScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class i1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195980a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnterEmailScreenContract$InputData f195981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f195982c;
    public final e4m.e d;
    public final Object e;

    public i1(q0 q0Var, c cVar, EnterEmailScreenContract$InputData enterEmailScreenContract$InputData) {
        this.e = cVar;
        this.f195981b = enterEmailScreenContract$InputData;
        int i = 11;
        this.f195982c = e4m.b.b(new u(q0Var, this, 1, i));
        this.d = e4m.b.b(new u(q0Var, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f195980a) {
            case 0:
                return ImmutableSet.of();
            default:
                return ImmutableSet.of((yji.n) ((c) this.e).Q.get());
        }
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f195980a) {
            case 0:
                return ImmutableSet.of((yji.d) ((f) this.e).f195937l.get());
            default:
                return ImmutableSet.of((yji.d) ((c) this.e).P.get());
        }
    }

    public i1(q0 q0Var, f fVar, EnterEmailScreenContract$InputData enterEmailScreenContract$InputData) {
        this.e = fVar;
        this.f195981b = enterEmailScreenContract$InputData;
        int i = 10;
        this.f195982c = e4m.b.b(new u(q0Var, this, 1, i));
        this.d = e4m.b.b(new u(q0Var, this, 0, i));
    }
}
