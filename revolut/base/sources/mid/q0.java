package mid;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsWaitlistOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsWaitlistOffer f205751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205752b;

    public q0(ShopsWaitlistOffer context) {
        String placementId = context.f87077a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205751a = context;
        this.f205752b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205751a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205752b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f205751a, q0Var.f205751a) && Intrinsics.f(this.f205752b, q0Var.f205752b);
    }

    public final int hashCode() {
        return this.f205752b.hashCode() + (this.f205751a.hashCode() * 31);
    }
}
