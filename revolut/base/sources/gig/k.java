package gig;

import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesProvider f144196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f144198c;

    public k(TravelMilesProvider provider, String str, String str2) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f144196a = provider;
        this.f144197b = str;
        this.f144198c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f144196a, kVar.f144196a) && Intrinsics.f(this.f144197b, kVar.f144197b) && Intrinsics.f(this.f144198c, kVar.f144198c);
    }

    public final int hashCode() {
        int iHashCode = this.f144196a.hashCode() * 31;
        String str = this.f144197b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f144198c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
