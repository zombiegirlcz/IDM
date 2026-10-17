package e2l;

import cli.j;
import com.revolut.retail.feature.travel_status.impl.domain.model.TravelStatusLinkAccountInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelStatusLinkAccountInfo f122141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f122142c;

    public d(String partnerId, TravelStatusLinkAccountInfo linkAccountInfo, Map fieldValues) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
        Intrinsics.checkNotNullParameter(fieldValues, "fieldValues");
        this.f122140a = partnerId;
        this.f122141b = linkAccountInfo;
        this.f122142c = fieldValues;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f122140a, dVar.f122140a) && Intrinsics.f(this.f122141b, dVar.f122141b) && Intrinsics.f(this.f122142c, dVar.f122142c);
    }

    public final int hashCode() {
        return this.f122142c.hashCode() + ((this.f122141b.hashCode() + (this.f122140a.hashCode() * 31)) * 31);
    }
}
