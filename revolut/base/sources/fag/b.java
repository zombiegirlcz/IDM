package fag;

import com.revolut.feature_travel_hotels_models.property.search.HotelsSelectedDates;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HotelsSelectedDates f133307c;
    public final a d;

    public b(String prompt, String currency, HotelsSelectedDates hotelsSelectedDates, a aVar) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f133305a = prompt;
        this.f133306b = currency;
        this.f133307c = hotelsSelectedDates;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f133305a, bVar.f133305a) && Intrinsics.f(this.f133306b, bVar.f133306b) && Intrinsics.f(this.f133307c, bVar.f133307c) && this.d == bVar.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f133305a.hashCode() * 31, 31, this.f133306b);
        HotelsSelectedDates hotelsSelectedDates = this.f133307c;
        int iHashCode = (iC + (hotelsSelectedDates == null ? 0 : hotelsSelectedDates.hashCode())) * 31;
        a aVar = this.d;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
