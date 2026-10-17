package gdf;

import aii.e;
import com.revolut.feature.trading_orders.api.invest.placement.locked_period.SecurityAssetBalanceBreakdownScreenDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecurityAssetBalanceBreakdownScreenDescriptor$InputData f143175a;

    public a(SecurityAssetBalanceBreakdownScreenDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f143175a = inputData;
    }

    public final SecurityAssetBalanceBreakdownScreenDescriptor$InputData b() {
        return this.f143175a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f143175a, ((a) obj2).f143175a);
    }

    public final int hashCode() {
        return this.f143175a.hashCode();
    }
}
