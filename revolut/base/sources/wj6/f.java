package wj6;

import cli.p;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f297963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f297964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f297965c;
    public final boolean d;
    public final List e;
    public final AnalyticsContext f;

    public f(List items, Clause toolbarTitle, TextLocalisedClause textLocalisedClause, boolean z, List menuItems, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f297963a = items;
        this.f297964b = toolbarTitle;
        this.f297965c = textLocalisedClause;
        this.d = z;
        this.e = menuItems;
        this.f = analyticsContext;
    }

    @Override // cli.p
    public final List c() {
        return this.f297963a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f297963a, fVar.f297963a) && Intrinsics.f(this.f297964b, fVar.f297964b) && Intrinsics.f(this.f297965c, fVar.f297965c) && this.d == fVar.d && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f297963a.hashCode() * 31, 31, this.f297964b);
        Clause clause = this.f297965c;
        int iD = p.a.d(j6.a.c((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31, this.e);
        AnalyticsContext analyticsContext = this.f;
        return iD + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }
}
