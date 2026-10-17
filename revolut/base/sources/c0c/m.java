package c0c;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f20214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f20215c;

    public m(AnalyticsContext analyticsContext, List menuItems, List items) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f20213a = menuItems;
        this.f20214b = analyticsContext;
        this.f20215c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f20215c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f20213a, mVar.f20213a) && Intrinsics.f(this.f20214b, mVar.f20214b) && Intrinsics.f(this.f20215c, mVar.f20215c);
    }

    public final int hashCode() {
        int iHashCode = this.f20213a.hashCode() * 31;
        AnalyticsContext analyticsContext = this.f20214b;
        return this.f20215c.hashCode() + ((iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31);
    }

    public m(List list) {
        this(null, f0.f322471a, list);
    }
}
