package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class v1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DebtDetailsControllerContract$InputData f119965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119967c;
    public final e4m.e d;

    public v1(c1 c1Var, u4 u4Var, DebtDetailsControllerContract$InputData debtDetailsControllerContract$InputData) {
        this.f119966b = c1Var;
        this.f119965a = debtDetailsControllerContract$InputData;
        int i = 8;
        this.f119967c = e4m.b.b(new h1(c1Var, this, 1, i));
        this.d = e4m.b.b(new h1(c1Var, this, 0, i));
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
