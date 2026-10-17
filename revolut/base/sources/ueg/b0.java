package ueg;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 extends com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsProperty f279365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f279366b;

    public b0(HotelsProperty property, String listId) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f279365a = property;
        this.f279366b = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f279365a, b0Var.f279365a) && Intrinsics.f(this.f279366b, b0Var.f279366b);
    }

    public final int hashCode() {
        return this.f279366b.hashCode() + (this.f279365a.hashCode() * 31);
    }
}
