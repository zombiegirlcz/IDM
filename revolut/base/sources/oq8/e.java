package oq8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_transfer.impl.ui.flow.transfer.JuniorTransferFlowContract$InputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorTransferFlowContract$InputData f227781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f227782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f227783c = this;
    public final e4m.e d;
    public final e4m.e e;

    public e(f fVar, JuniorTransferFlowContract$InputData juniorTransferFlowContract$InputData) {
        this.f227782b = fVar;
        this.f227781a = juniorTransferFlowContract$InputData;
        this.d = e4m.b.b(new oi9.a(fVar, this, 0, 20));
        this.e = e4m.b.b(new oi9.a(fVar, this, 1, 20));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of((n) this.d.get());
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
