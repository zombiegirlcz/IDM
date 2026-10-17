package b9d;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f13721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13722c;
    public final AnalyticsContext d;

    public j(aim.e items, TextLocalisedClause title, List menuItems, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f13720a = items;
        this.f13721b = title;
        this.f13722c = menuItems;
        this.d = analyticsContext;
    }

    @Override // jki.n
    public final List c() {
        return this.f13720a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f13720a, jVar.f13720a) && this.f13721b.equals(jVar.f13721b) && Intrinsics.f(this.f13722c, jVar.f13722c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(t61.a.a(this.f13720a.hashCode() * 31, 31, this.f13721b), 31, this.f13722c);
        AnalyticsContext analyticsContext = this.d;
        return iD + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
