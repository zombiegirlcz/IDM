package r6j;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.CommodityOrderFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommodityOrderFlowContract$InputData f251894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f251895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f251896c = this;
    public final e4m.e d;
    public final e4m.e e;

    public d(c cVar, CommodityOrderFlowContract$InputData commodityOrderFlowContract$InputData) {
        this.f251895b = cVar;
        this.f251894a = commodityOrderFlowContract$InputData;
        int i = 23;
        this.d = e4m.b.b(new qy7.f(cVar, this, 0, i));
        this.e = e4m.b.b(new qy7.f(cVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
