package s3a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.TabPaymentsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements xki.c, e5a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TabPaymentsFlowContract$InputData f259522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f259523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f259524c = this;
    public final e4m.e d;

    public j(k kVar, TabPaymentsFlowContract$InputData tabPaymentsFlowContract$InputData) {
        this.f259523b = kVar;
        this.f259522a = tabPaymentsFlowContract$InputData;
        this.d = e4m.b.b(new r6e.m(kVar, this, 16));
    }

    @Override // e5a.b
    public final e5a.a I() {
        return new m(this.f259523b, this.f259524c);
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
