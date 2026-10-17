package d7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$HintDialogReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommodityOrderEditScreenContract$HintDialogReason f112084a;

    public z(CommodityOrderEditScreenContract$HintDialogReason commodityOrderEditScreenContract$HintDialogReason) {
        this.f112084a = commodityOrderEditScreenContract$HintDialogReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f112084a, ((z) obj2).f112084a);
    }

    public final int hashCode() {
        CommodityOrderEditScreenContract$HintDialogReason commodityOrderEditScreenContract$HintDialogReason = this.f112084a;
        if (commodityOrderEditScreenContract$HintDialogReason == null) {
            return 0;
        }
        return commodityOrderEditScreenContract$HintDialogReason.hashCode();
    }
}
