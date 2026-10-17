package z0f;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupMethod.StoredMethod.Card.Restrictions f318280a;

    public r(TopupMethod.StoredMethod.Card.Restrictions restrictions) {
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.f318280a = restrictions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f318280a, ((r) obj2).f318280a);
    }

    public final int hashCode() {
        return this.f318280a.hashCode();
    }
}
