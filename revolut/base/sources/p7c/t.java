package p7c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.impl.external.ui.flow.root.RevolutPayRootFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayRootFlowContract$InputData f233707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseFlow f233708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233709c;
    public final e4m.e d;
    public final e4m.e e;

    public t(r rVar, BaseFlow baseFlow, RevolutPayRootFlowContract$InputData revolutPayRootFlowContract$InputData) {
        this.f233707a = revolutPayRootFlowContract$InputData;
        this.f233708b = baseFlow;
        int i = 22;
        this.f233709c = e4m.b.b(new p12.f0(rVar, this, 1, i));
        this.d = e4m.b.b(new p12.f0(rVar, this, 2, i));
        this.e = e4m.b.b(new p12.f0(rVar, this, 0, i));
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
