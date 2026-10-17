package iqj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Liqj/g;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "getExternal", "()Z", "external", "b", "Ljava/lang/String;", "getWalletId", "walletId", "Liqj/d;", "c", "Liqj/d;", "getTimeframe", "()Liqj/d;", "timeframe", "Liqj/c;", "d", "Liqj/c;", "getAnalyticsImpact", "()Liqj/c;", "analyticsImpact", "Liqj/b;", "e", "Liqj/b;", "getAnalyticsAmount", "()Liqj/b;", "analyticsAmount", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("external")
    private final boolean external;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("walletId")
    @NotNull
    private final String walletId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("timeframe")
    @NotNull
    private final d timeframe;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("analyticsImpact")
    private final c analyticsImpact;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("analyticsAmount")
    private final b analyticsAmount;

    public g(boolean z, String walletId, d timeframe, c cVar, b bVar) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        this.external = z;
        this.walletId = walletId;
        this.timeframe = timeframe;
        this.analyticsImpact = cVar;
        this.analyticsAmount = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.external == gVar.external && Intrinsics.f(this.walletId, gVar.walletId) && this.timeframe == gVar.timeframe && this.analyticsImpact == gVar.analyticsImpact && Intrinsics.f(this.analyticsAmount, gVar.analyticsAmount);
    }

    public final int hashCode() {
        int iHashCode = (this.timeframe.hashCode() + p.a.c(Boolean.hashCode(this.external) * 31, 31, this.walletId)) * 31;
        c cVar = this.analyticsImpact;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.analyticsAmount;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
