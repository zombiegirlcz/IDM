package bxg;

import com.revolut.feature.wealth.analytics.insights.model.PortfolioInsightsInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19687c;
    public final pwg.q d;
    public final PortfolioInsightsInfo e;
    public final List f;

    public g(String title, String description, String sortOrderLabel, pwg.q sortOrder, PortfolioInsightsInfo info, List assets) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(sortOrderLabel, "sortOrderLabel");
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f19685a = title;
        this.f19686b = description;
        this.f19687c = sortOrderLabel;
        this.d = sortOrder;
        this.e = info;
        this.f = assets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f19685a, gVar.f19685a) && Intrinsics.f(this.f19686b, gVar.f19686b) && Intrinsics.f(this.f19687c, gVar.f19687c) && this.d == gVar.d && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f19685a.hashCode() * 31, 31, this.f19686b), 31, this.f19687c)) * 31)) * 31);
    }
}
