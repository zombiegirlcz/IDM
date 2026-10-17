package g37;

import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxHubCalendarEvent f140221a;

    public m(TaxHubCalendarEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f140221a = event;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f140221a, ((m) obj2).f140221a);
    }

    public final int hashCode() {
        return this.f140221a.hashCode();
    }
}
