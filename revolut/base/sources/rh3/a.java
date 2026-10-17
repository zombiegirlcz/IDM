package rh3;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutParams f254302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f254303b;

    public a(CheckoutParams.CardOrder params, AnalyticsProduct automaticEventProduct) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f254302a = params;
        this.f254303b = automaticEventProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f254302a, aVar.f254302a) && Intrinsics.f(this.f254303b, aVar.f254303b);
    }

    public final int hashCode() {
        return this.f254303b.hashCode() + (this.f254302a.hashCode() * 29791);
    }
}
