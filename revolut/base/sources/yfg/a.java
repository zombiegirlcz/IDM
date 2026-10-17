package yfg;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lyfg/a;", "", "", "toString", "()Ljava/lang/String;", "", "Lyfg/b;", "a", "Ljava/util/List;", "()Ljava/util/List;", "availableAirlines", "b", "unavailableAirlines", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("availableAirlines")
    @NotNull
    private final List<b> availableAirlines;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("unavailableAirlines")
    @NotNull
    private final List<b> unavailableAirlines;

    public a(ArrayList availableAirlines, ArrayList unavailableAirlines) {
        Intrinsics.checkNotNullParameter(availableAirlines, "availableAirlines");
        Intrinsics.checkNotNullParameter(unavailableAirlines, "unavailableAirlines");
        this.availableAirlines = availableAirlines;
        this.unavailableAirlines = unavailableAirlines;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAvailableAirlines() {
        return this.availableAirlines;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getUnavailableAirlines() {
        return this.unavailableAirlines;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.availableAirlines, aVar.availableAirlines) && Intrinsics.f(this.unavailableAirlines, aVar.unavailableAirlines);
    }

    public final int hashCode() {
        return this.unavailableAirlines.hashCode() + (this.availableAirlines.hashCode() * 31);
    }
}
