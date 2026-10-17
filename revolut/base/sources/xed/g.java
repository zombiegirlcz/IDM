package xed;

import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AlertItem f304619a;

    public g(AlertItem alertItem) {
        Intrinsics.checkNotNullParameter(alertItem, "alertItem");
        this.f304619a = alertItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f304619a, ((g) obj2).f304619a);
    }

    public final int hashCode() {
        return this.f304619a.hashCode();
    }
}
