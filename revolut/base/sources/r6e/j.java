package r6e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subaccount.impl.ui.recurring_transfer.RecurringTransferFlowContract$FlowInput;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements qji.a, xbb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringTransferFlowContract$FlowInput f251755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f251756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f251757c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f251759h;

    public j(o oVar, RecurringTransferFlowContract$FlowInput recurringTransferFlowContract$FlowInput) {
        this.f251756b = oVar;
        this.f251755a = recurringTransferFlowContract$FlowInput;
        int i = 14;
        this.d = e4m.b.b(new qy7.f(oVar, this, 0, i));
        this.e = e4m.b.b(new qy7.f(oVar, this, 1, i));
        this.f = e4m.b.b(new qy7.f(oVar, this, 2, i));
        this.f251758g = e4m.b.b(new qy7.f(oVar, this, 3, i));
        this.f251759h = e4m.b.b(new qy7.f(oVar, this, 4, i));
    }

    @Override // xbb.a
    public final i b() {
        return new i(this.f251756b, this.f251757c, 0);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
