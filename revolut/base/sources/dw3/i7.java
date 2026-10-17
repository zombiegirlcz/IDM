package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class i7 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WaitingListV3FlowContract$InputData f118985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i7 f118987c = this;
    public final e4m.e d;

    public i7(c1 c1Var, WaitingListV3FlowContract$InputData waitingListV3FlowContract$InputData) {
        this.f118986b = c1Var;
        this.f118985a = waitingListV3FlowContract$InputData;
        this.d = e4m.b.b(new w3(c1Var, this, 5));
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
