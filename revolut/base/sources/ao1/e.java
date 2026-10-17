package ao1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bills.bpay.impl.flow.BPayFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BPayFlowContract$InputData f7882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f7883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f7884c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public e(d dVar, BPayFlowContract$InputData bPayFlowContract$InputData) {
        this.f7883b = dVar;
        this.f7882a = bPayFlowContract$InputData;
        int i = 15;
        this.d = e4m.b.b(new ak5.f(dVar, this, 0, i));
        this.e = e4m.b.b(new ak5.f(dVar, this, 2, i));
        this.f = e4m.b.b(new ak5.f(dVar, this, 1, i));
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
