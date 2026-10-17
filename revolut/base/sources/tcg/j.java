package tcg;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsProperty f269792a;

    public j(HotelsProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f269792a = property;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f269792a, ((j) obj2).f269792a);
    }

    public final int hashCode() {
        return this.f269792a.hashCode();
    }
}
