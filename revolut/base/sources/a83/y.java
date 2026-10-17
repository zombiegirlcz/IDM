package a83;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f2097c;
    public final TextLocalisedClause d;
    public final int e;

    public y(List items, List navBarMenuItems, AnalyticsContext analyticsContext, TextLocalisedClause title, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f2095a = items;
        this.f2096b = navBarMenuItems;
        this.f2097c = analyticsContext;
        this.d = title;
        this.e = i;
    }

    @Override // cli.p
    public final List c() {
        return this.f2095a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f2095a, yVar.f2095a) && Intrinsics.f(this.f2096b, yVar.f2096b) && Intrinsics.f(this.f2097c, yVar.f2097c) && this.d.equals(yVar.d) && this.e == yVar.e;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f2095a.hashCode() * 31, 31, this.f2096b);
        AnalyticsContext analyticsContext = this.f2097c;
        return Integer.hashCode(this.e) + t61.a.a((iD + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31, 31, this.d);
    }
}
