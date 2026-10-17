package eyd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.ConsolidatedStatementCustomisationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsolidatedStatementCustomisationScreenContract$InputData f130775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f130776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130777c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public k(b0 b0Var, l lVar, ConsolidatedStatementCustomisationScreenContract$InputData consolidatedStatementCustomisationScreenContract$InputData) {
        this.f130776b = b0Var;
        this.f130775a = consolidatedStatementCustomisationScreenContract$InputData;
        int i = 0;
        this.f130777c = e4m.b.b(new j(b0Var, this, 0, i));
        this.d = e4m.b.b(new j(b0Var, this, 1, i));
        this.e = e4m.b.b(new j(b0Var, this, 3, i));
        this.f = e4m.b.b(new j(b0Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f130777c.get(), (yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
