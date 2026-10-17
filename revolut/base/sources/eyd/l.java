package eyd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.statements.impl.ui.consolidated.flow.ConsolidatedStatementFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements xki.c, jzd.a, hzd.a, z7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsolidatedStatementFlowContract$InputData f130779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f130780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f130781c = this;
    public final e4m.e d;
    public final e4m.e e;

    public l(b0 b0Var, ConsolidatedStatementFlowContract$InputData consolidatedStatementFlowContract$InputData) {
        this.f130780b = b0Var;
        this.f130779a = consolidatedStatementFlowContract$InputData;
        int i = 1;
        this.d = e4m.b.b(new j(b0Var, this, 0, i));
        this.e = e4m.b.b(new j(b0Var, this, 1, i));
    }

    @Override // hzd.a
    public final f0 b() {
        return new f0(this.f130780b, this.f130781c, 0);
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new u(this.f130780b, this.f130781c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // jzd.a
    public final h0 j() {
        return new h0(this.f130780b, this.f130781c, 0);
    }
}
