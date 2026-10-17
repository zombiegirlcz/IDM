package mdf;

import aii.e;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrdersListFeatureContract$InputData f204565a;

    public a(InvestOrdersListFeatureContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f204565a = inputData;
    }

    public final InvestOrdersListFeatureContract$InputData b() {
        return this.f204565a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f204565a, ((a) obj2).f204565a);
    }

    public final int hashCode() {
        return this.f204565a.hashCode();
    }
}
