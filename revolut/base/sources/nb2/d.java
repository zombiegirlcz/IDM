package nb2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.payto.impl.screen.topup.flow.PayToTopupFlowContract$InputData;
import java.util.Set;
import m2b.r;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayToTopupFlowContract$InputData f213970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f213971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f213972c = this;
    public final e4m.e d;

    public d(b bVar, PayToTopupFlowContract$InputData payToTopupFlowContract$InputData) {
        this.f213971b = bVar;
        this.f213970a = payToTopupFlowContract$InputData;
        this.d = e4m.b.b(new r(bVar, this, 23));
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
