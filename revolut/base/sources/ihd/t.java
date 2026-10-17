package ihd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161390a;

    public t(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f161390a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f161390a, ((t) obj2).f161390a);
    }

    public final int hashCode() {
        return this.f161390a.hashCode();
    }
}
