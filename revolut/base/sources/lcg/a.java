package lcg;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsProperty f193884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jxf.a f193885b;

    public a(HotelsProperty property, jxf.a recommendation) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(recommendation, "recommendation");
        this.f193884a = property;
        this.f193885b = recommendation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f193884a, aVar.f193884a) && Intrinsics.f(this.f193885b, aVar.f193885b);
    }

    public final int hashCode() {
        return this.f193885b.hashCode() + (this.f193884a.hashCode() * 31);
    }
}
