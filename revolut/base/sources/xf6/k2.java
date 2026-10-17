package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.ConsentsListScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class k2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentsListScreenContract$InputData f304916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f304917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f304918c;

    public k2(w2 w2Var, x2 x2Var, ConsentsListScreenContract$InputData consentsListScreenContract$InputData) {
        this.f304916a = consentsListScreenContract$InputData;
        this.f304917b = e4m.b.b(new t1(w2Var, this, 1, 8));
        this.f304918c = e4m.b.b(new t1(w2Var, this, 0, 8));
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
