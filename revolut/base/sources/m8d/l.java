package m8d;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f203510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f203511b;

    public l(TextClause title, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f203510a = title;
        this.f203511b = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f203510a.equals(lVar.f203510a) && Intrinsics.f(this.f203511b, lVar.f203511b);
    }

    public final int hashCode() {
        int iHashCode = this.f203510a.hashCode() * 31;
        AnalyticsContext analyticsContext = this.f203511b;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
