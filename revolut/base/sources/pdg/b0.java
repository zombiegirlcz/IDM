package pdg;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f235174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f235175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f235176c;
    public final Data d;

    public b0(Data propertyDetails, Data amenities, Data rooms, List reviews) {
        Intrinsics.checkNotNullParameter(propertyDetails, "propertyDetails");
        Intrinsics.checkNotNullParameter(reviews, "reviews");
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        this.f235174a = propertyDetails;
        this.f235175b = reviews;
        this.f235176c = amenities;
        this.d = rooms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f235174a, b0Var.f235174a) && Intrinsics.f(this.f235175b, b0Var.f235175b) && Intrinsics.f(this.f235176c, b0Var.f235176c) && Intrinsics.f(this.d, b0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f235176c, p.a.d(this.f235174a.hashCode() * 31, 31, this.f235175b), 31);
    }
}
