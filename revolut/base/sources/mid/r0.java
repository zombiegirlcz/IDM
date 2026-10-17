package mid;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsWaitlistOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsWaitlistOffer f205754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205755b;

    public r0(ShopsWaitlistOffer context) {
        String placementId = context.f87077a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f205754a = context;
        this.f205755b = placementId;
    }

    @Override // mid.v0
    public final ShopsContext a() {
        return this.f205754a;
    }

    @Override // mid.v0
    public final String b() {
        return this.f205755b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f205754a, r0Var.f205754a) && Intrinsics.f(this.f205755b, r0Var.f205755b);
    }

    public final int hashCode() {
        return this.f205755b.hashCode() + (this.f205754a.hashCode() * 31);
    }
}
