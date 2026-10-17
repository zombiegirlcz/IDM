package mod;

import com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig;
import java.time.ZonedDateTime;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f207635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f207636c;
    public final ZonedDateTime d;
    public final TripsMapBitmapConfig e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f207637g;

    public t(Set visitedCountries, String userName, ZonedDateTime joinDate, TripsMapBitmapConfig bitmapConfig, int i, Set allCountryCodes) {
        Intrinsics.checkNotNullParameter(visitedCountries, "visitedCountries");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(joinDate, "joinDate");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(allCountryCodes, "allCountryCodes");
        this.f207635b = visitedCountries;
        this.f207636c = userName;
        this.d = joinDate;
        this.e = bitmapConfig;
        this.f = i;
        this.f207637g = allCountryCodes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f207635b, tVar.f207635b) && Intrinsics.f(this.f207636c, tVar.f207636c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && this.f == tVar.f && Intrinsics.f(this.f207637g, tVar.f207637g);
    }

    public final int hashCode() {
        return this.f207637g.hashCode() + j6.a.b(this.f, (this.e.hashCode() + h30.l.h(this.d, p.a.c(this.f207635b.hashCode() * 31, 31, this.f207636c), 31)) * 31, 31);
    }
}
