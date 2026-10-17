package i2l;

import com.revolut.retail.feature.travel_status.impl.domain.model.TravelStatusLinkAccountInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelStatusLinkAccountInfo f158049b;

    public v(String partnerId, TravelStatusLinkAccountInfo linkAccountInfo) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
        this.f158048a = partnerId;
        this.f158049b = linkAccountInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f158048a, vVar.f158048a) && Intrinsics.f(this.f158049b, vVar.f158049b);
    }

    public final int hashCode() {
        return this.f158049b.hashCode() + (this.f158048a.hashCode() * 31);
    }
}
