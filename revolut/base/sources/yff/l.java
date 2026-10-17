package yff;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f313348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f313349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f313350c;

    public l(AnalyticsContext analyticsContext, List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f313348a = items;
        this.f313349b = menuItems;
        this.f313350c = analyticsContext;
    }

    @Override // jki.n
    public final List c() {
        return this.f313348a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f313348a, lVar.f313348a) && Intrinsics.f(this.f313349b, lVar.f313349b) && Intrinsics.f(this.f313350c, lVar.f313350c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f313348a.hashCode() * 31, 31, this.f313349b);
        AnalyticsContext analyticsContext = this.f313350c;
        return iD + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
