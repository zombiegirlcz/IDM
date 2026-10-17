package z0f;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupMethod.StoredMethod.Card.Restrictions f318281a;

    public s(TopupMethod.StoredMethod.Card.Restrictions restrictions) {
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.f318281a = restrictions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f318281a, ((s) obj2).f318281a);
    }

    public final int hashCode() {
        return this.f318281a.hashCode();
    }
}
