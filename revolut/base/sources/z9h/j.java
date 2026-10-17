package z9h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management.RecurringTransferManagementFlowContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringTransferManagementFlowContract$Input f320451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f320452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f320453c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public j(d dVar, RecurringTransferManagementFlowContract$Input recurringTransferManagementFlowContract$Input) {
        this.f320452b = dVar;
        this.f320451a = recurringTransferManagementFlowContract$Input;
        int i = 16;
        this.d = e4m.b.b(new yxj.c(this, 1, i));
        this.e = e4m.b.b(new yxj.c(this, 2, i));
        this.f = e4m.b.b(new yxj.c(this, 0, i));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
