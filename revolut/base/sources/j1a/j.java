package j1a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillsFlowContract$InputData f170321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseFlow f170322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f170323c;
    public final e4m.e d;
    public final e4m.e e;

    public j(i iVar, BaseFlow baseFlow, SplitBillsFlowContract$InputData splitBillsFlowContract$InputData) {
        this.f170323c = iVar;
        this.f170321a = splitBillsFlowContract$InputData;
        this.f170322b = baseFlow;
        int i = 14;
        this.d = e4m.b.b(new iwb.b(iVar, this, 1, i));
        this.e = e4m.b.b(new iwb.b(iVar, this, 0, i));
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
