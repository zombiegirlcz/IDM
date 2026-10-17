package a18;

import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeedFilter f560a;

    public e(FeedFilter feedFilter) {
        Intrinsics.checkNotNullParameter(feedFilter, "feedFilter");
        this.f560a = feedFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f560a, ((e) obj2).f560a);
    }

    public final int hashCode() {
        return this.f560a.hashCode();
    }
}
