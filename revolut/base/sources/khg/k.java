package khg;

import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesProvider f184128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184130c;

    public k(TravelMilesProvider provider, String str, String str2) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f184128a = provider;
        this.f184129b = str;
        this.f184130c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f184128a, kVar.f184128a) && Intrinsics.f(this.f184129b, kVar.f184129b) && Intrinsics.f(this.f184130c, kVar.f184130c);
    }

    public final int hashCode() {
        int iHashCode = this.f184128a.hashCode() * 31;
        String str = this.f184129b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f184130c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
