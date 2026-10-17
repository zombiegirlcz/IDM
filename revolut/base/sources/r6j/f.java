package r6j;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.order_type_selection.CommodityOrderTypeSelectionScreenContract$InputData;
import java.util.Set;
import ql7.d2;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommodityOrderTypeSelectionScreenContract$InputData f251906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f251907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f251908c;

    public f(c cVar, d dVar, CommodityOrderTypeSelectionScreenContract$InputData commodityOrderTypeSelectionScreenContract$InputData) {
        this.f251906a = commodityOrderTypeSelectionScreenContract$InputData;
        int i = 15;
        this.f251907b = e4m.b.b(new d2(this, 1, i));
        this.f251908c = e4m.b.b(new d2(this, 0, i));
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
