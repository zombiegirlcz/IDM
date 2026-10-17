package ogd;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f225120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f225121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct.Retail f225122c;

    public j(TextLocalisedClause title, Clause description, AnalyticsProduct.Retail analyticsProduct) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f225120a = title;
        this.f225121b = description;
        this.f225122c = analyticsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f225120a.equals(jVar.f225120a) && this.f225121b.equals(jVar.f225121b) && this.f225122c.equals(jVar.f225122c);
    }

    public final int hashCode() {
        return this.f225122c.f50300a.hashCode() + p.a.b(this.f225120a.hashCode() * 31, 31, this.f225121b);
    }
}
