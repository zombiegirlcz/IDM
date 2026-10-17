package qwf;

import com.revolut.feature.transport.models.transit.TransitTicketRevPointOption;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f249922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransitTicketRevPointOption f249923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f249924c;

    public p(List options, TransitTicketRevPointOption transitTicketRevPointOption, dj0.d totalPriceForPoints) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(totalPriceForPoints, "totalPriceForPoints");
        this.f249922a = options;
        this.f249923b = transitTicketRevPointOption;
        this.f249924c = totalPriceForPoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f249922a, pVar.f249922a) && Intrinsics.f(this.f249923b, pVar.f249923b) && Intrinsics.f(this.f249924c, pVar.f249924c);
    }

    public final int hashCode() {
        int iHashCode = this.f249922a.hashCode() * 31;
        TransitTicketRevPointOption transitTicketRevPointOption = this.f249923b;
        return this.f249924c.hashCode() + ((iHashCode + (transitTicketRevPointOption == null ? 0 : transitTicketRevPointOption.hashCode())) * 31);
    }
}
