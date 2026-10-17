package pwg;

import com.revolut.feature.wealth.analytics.insights.model.PortfolioInsightsInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f240461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f240462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240463c;
    public final String d;
    public final String e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PortfolioInsightsInfo f240464g;

    public i(d assetIndicator, List assets) {
        Intrinsics.checkNotNullParameter(assetIndicator, "assetIndicator");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f240461a = assetIndicator;
        this.f240462b = assets;
        this.f240463c = assetIndicator.f240456a;
        this.d = assetIndicator.f240457b;
        this.e = assetIndicator.f240458c;
        this.f = assetIndicator.d;
        this.f240464g = assetIndicator.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f240461a, iVar.f240461a) && Intrinsics.f(this.f240462b, iVar.f240462b);
    }

    public final int hashCode() {
        return this.f240462b.hashCode() + (this.f240461a.hashCode() * 31);
    }
}
