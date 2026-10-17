package fsl;

import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f137729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestOrdersParams f137730b;

    public l(g context, InvestOrdersParams params) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f137729a = context;
        this.f137730b = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f137729a, lVar.f137729a) && Intrinsics.f(this.f137730b, lVar.f137730b);
    }

    public final int hashCode() {
        return this.f137730b.hashCode() + (this.f137729a.hashCode() * 31);
    }
}
