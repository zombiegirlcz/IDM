package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.hub.DebtsV2HubScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class z1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DebtsV2HubScreenContract$InputData f120264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f120265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f120266c;

    public z1(c1 c1Var, t4 t4Var, DebtsV2HubScreenContract$InputData debtsV2HubScreenContract$InputData) {
        this.f120264a = debtsV2HubScreenContract$InputData;
        this.f120265b = e4m.b.b(new e0(c1Var, t4Var, this, 1, 11));
        this.f120266c = e4m.b.b(new e0(c1Var, t4Var, this, 0, 11));
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
