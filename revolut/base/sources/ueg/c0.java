package ueg;

import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f279373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f279374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f279375c;
    public final boolean d;
    public final LocationData e;
    public final boolean f;

    public c0(ArrayList properties, boolean z, boolean z3, boolean z4, LocationData locationData, boolean z6) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f279373a = properties;
        this.f279374b = z;
        this.f279375c = z3;
        this.d = z4;
        this.e = locationData;
        this.f = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f279373a.equals(c0Var.f279373a) && this.f279374b == c0Var.f279374b && this.f279375c == c0Var.f279375c && this.d == c0Var.d && Intrinsics.f(this.e, c0Var.e) && this.f == c0Var.f;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(this.f279373a.hashCode() * 31, 31, this.f279374b), 31, this.f279375c), 31, this.d);
        LocationData locationData = this.e;
        return Boolean.hashCode(this.f) + ((iC + (locationData == null ? 0 : locationData.hashCode())) * 31);
    }
}
