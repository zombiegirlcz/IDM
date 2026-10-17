package wpg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.RecurringTransferFlowContract$FlowInput;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements qji.a, xbb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringTransferFlowContract$FlowInput f299266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f299267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f299268c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f299269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f299270h;

    public i(l lVar, RecurringTransferFlowContract$FlowInput recurringTransferFlowContract$FlowInput) {
        this.f299267b = lVar;
        this.f299266a = recurringTransferFlowContract$FlowInput;
        int i = 7;
        this.d = e4m.b.b(new whc.t(lVar, this, 0, i));
        this.e = e4m.b.b(new whc.t(lVar, this, 1, i));
        this.f = e4m.b.b(new whc.t(lVar, this, 2, i));
        this.f299269g = e4m.b.b(new whc.t(lVar, this, 4, i));
        this.f299270h = e4m.b.b(new whc.t(lVar, this, 3, i));
    }

    @Override // xbb.a
    public final r6e.i b() {
        return new r6e.i(this.f299267b, this.f299268c, 2);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
