package wed;

import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AlertItem f296749a;

    public n(AlertItem alertItem) {
        Intrinsics.checkNotNullParameter(alertItem, "alertItem");
        this.f296749a = alertItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f296749a, ((n) obj2).f296749a);
    }

    public final int hashCode() {
        return this.f296749a.hashCode();
    }
}
