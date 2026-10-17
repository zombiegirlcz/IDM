package k3g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qyf.a f180723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f180724c;
    public final TravelExperienceDatesSelection d;

    public j(String destinationId, qyf.a destinationType, String destinationName, TravelExperienceDatesSelection datesSelection) {
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(destinationType, "destinationType");
        Intrinsics.checkNotNullParameter(destinationName, "destinationName");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        this.f180722a = destinationId;
        this.f180723b = destinationType;
        this.f180724c = destinationName;
        this.d = datesSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f180722a, jVar.f180722a) && this.f180723b == jVar.f180723b && Intrinsics.f(this.f180724c, jVar.f180724c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f180723b.hashCode() + (this.f180722a.hashCode() * 31)) * 31, 31, this.f180724c);
    }
}
