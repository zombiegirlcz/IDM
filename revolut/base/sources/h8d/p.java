package h8d;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f150002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f150003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f150004c;

    public p(ArrayList items, o searchQueryState, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchQueryState, "searchQueryState");
        this.f150002a = items;
        this.f150003b = searchQueryState;
        this.f150004c = analyticsContext;
    }

    @Override // jki.n
    public final List c() {
        return this.f150002a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f150002a.equals(pVar.f150002a) && this.f150003b.equals(pVar.f150003b) && Intrinsics.f(this.f150004c, pVar.f150004c);
    }

    public final int hashCode() {
        int iHashCode = (this.f150003b.hashCode() + (this.f150002a.hashCode() * 31)) * 31;
        AnalyticsContext analyticsContext = this.f150004c;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
