package i0g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f157397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperienceDatesSelection f157398c;

    public a(String destinationId, xi0.b currency, TravelExperienceDatesSelection datesSelection) {
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        this.f157396a = destinationId;
        this.f157397b = currency;
        this.f157398c = datesSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f157396a, aVar.f157396a) && Intrinsics.f(this.f157397b, aVar.f157397b) && Intrinsics.f(this.f157398c, aVar.f157398c);
    }

    public final int hashCode() {
        return this.f157398c.hashCode() + l.j(this.f157397b, this.f157396a.hashCode() * 31, 31);
    }
}
