package mid;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsDeeplinkOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsDeeplinkOffer f205709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205710b;

    public h0(ShopsDeeplinkOffer context) {
        String placementId = context.f87044c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205709a = context;
        this.f205710b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205709a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205710b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f205709a, h0Var.f205709a) && Intrinsics.f(this.f205710b, h0Var.f205710b);
    }

    public final int hashCode() {
        return this.f205710b.hashCode() + (this.f205709a.hashCode() * 31);
    }
}
