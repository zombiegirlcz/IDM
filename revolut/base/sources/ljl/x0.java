package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.impl.ui.consolidation.we_found_existing_account.WeFoundExistingAccountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class x0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeFoundExistingAccountScreenContract$InputData f196137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f196138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f196139c;
    public final e4m.e d = e4m.b.b(new n(this, 3));

    public x0(q0 q0Var, c cVar, WeFoundExistingAccountScreenContract$InputData weFoundExistingAccountScreenContract$InputData) {
        this.f196138b = q0Var;
        this.f196139c = cVar;
        this.f196137a = weFoundExistingAccountScreenContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f196139c.Q.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f196139c.P.get());
    }
}
