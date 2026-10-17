package yrd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomAsset f316275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CustomAssetCategoryDefinition f316276c;
    public final xi0.b d;
    public final boolean e;
    public final SmartEstimationAccess f;

    public d(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition, xi0.b currency, boolean z, SmartEstimationAccess smartEstimationAccess) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(smartEstimationAccess, "smartEstimationAccess");
        this.f316275b = asset;
        this.f316276c = categoryDefinition;
        this.d = currency;
        this.e = z;
        this.f = smartEstimationAccess;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f316275b, dVar.f316275b) && Intrinsics.f(this.f316276c, dVar.f316276c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(l.j(this.d, (this.f316276c.hashCode() + (this.f316275b.hashCode() * 31)) * 31, 31), 31, this.e);
    }
}
