package rh3;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutParams.CardOrder f254304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f254305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f254306c;

    public c(CheckoutParams.CardOrder params, NaviCommand naviCommand, AnalyticsProduct automaticEventProduct, int i) {
        naviCommand = (i & 2) != 0 ? null : naviCommand;
        if ((i & 4) != 0) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.f137496c;
            automaticEventProduct = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        }
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f254304a = params;
        this.f254305b = naviCommand;
        this.f254306c = automaticEventProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f254304a, cVar.f254304a) && Intrinsics.f(this.f254305b, cVar.f254305b) && Intrinsics.f(this.f254306c, cVar.f254306c);
    }

    public final int hashCode() {
        int iHashCode = this.f254304a.hashCode() * 31;
        NaviCommand naviCommand = this.f254305b;
        return this.f254306c.hashCode() + ((iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31);
    }
}
