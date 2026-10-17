package pwg;

import com.revolut.feature.wealth.analytics.insights.model.PortfolioInsightsInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240458c;
    public final q d;
    public final PortfolioInsightsInfo e;
    public final ArrayList f;

    public d(String title, String description, String sortOrderLabel, q sortOrder, PortfolioInsightsInfo info, ArrayList assets) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(sortOrderLabel, "sortOrderLabel");
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f240456a = title;
        this.f240457b = description;
        this.f240458c = sortOrderLabel;
        this.d = sortOrder;
        this.e = info;
        this.f = assets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f240456a, dVar.f240456a) && Intrinsics.f(this.f240457b, dVar.f240457b) && Intrinsics.f(this.f240458c, dVar.f240458c) && this.d == dVar.d && this.e.equals(dVar.e) && this.f.equals(dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f240456a.hashCode() * 31, 31, this.f240457b), 31, this.f240458c)) * 31)) * 31);
    }
}
