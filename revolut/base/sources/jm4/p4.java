package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.direct.debit.account_details_v2.DirectDebitAccountDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class p4 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DirectDebitAccountDetailsScreenContract$InputData f176254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f176255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176256c;

    public p4(a3 a3Var, j0 j0Var, DirectDebitAccountDetailsScreenContract$InputData directDebitAccountDetailsScreenContract$InputData) {
        this.f176254a = directDebitAccountDetailsScreenContract$InputData;
        int i = 12;
        this.f176255b = e4m.b.b(new z3(a3Var, this, 1, i));
        this.f176256c = e4m.b.b(new z3(a3Var, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
