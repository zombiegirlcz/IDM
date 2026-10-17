package hja;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$InputData;
import e4m.e;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductLifecycleFlowContract$InputData f152676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f152677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f152678c;
    public final e d;

    public b(a aVar, ProductLifecycleFlowContract$InputData productLifecycleFlowContract$InputData) {
        this.f152677b = aVar;
        this.f152676a = productLifecycleFlowContract$InputData;
        int i = 28;
        this.f152678c = e4m.b.b(new h08.e(aVar, this, 0, i));
        this.d = e4m.b.b(new h08.e(aVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f152678c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
