package i72;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.multibanco.impl.ui.pending.MultibancoPendingPaymentFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoPendingPaymentFlowContract$InputData f159167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f159168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f159169c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public u(m mVar, MultibancoPendingPaymentFlowContract$InputData multibancoPendingPaymentFlowContract$InputData) {
        this.f159168b = mVar;
        this.f159167a = multibancoPendingPaymentFlowContract$InputData;
        int i = 25;
        this.d = e4m.b.b(new hjg.b(mVar, this, 1, i));
        this.e = e4m.b.b(new hjg.b(mVar, this, 0, i));
        this.f = e4m.b.b(new hjg.b(mVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
