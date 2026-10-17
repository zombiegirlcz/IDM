package ddj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u000e\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b\t\u0010!¨\u0006#"}, d2 = {"Lddj/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "symbol", "b", "c", "description", "g", "website", "d", "h", "whitepaperLink", "Lddj/e;", "e", "Lddj/e;", "()Lddj/e;", "stats", "Lddj/c;", "Lddj/c;", "()Lddj/c;", "sentimentIndicator", "Lddj/a;", "Lddj/a;", "()Lddj/a;", "airTip", "", "Lddj/f;", "Ljava/util/List;", "()Ljava/util/List;", "customLinks", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("website")
    private final String website;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("whitepaperLink")
    private final String whitepaperLink;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("stats")
    private final e stats;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("sentimentIndicator")
    private final c sentimentIndicator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("airTip")
    private final a airTip;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("customLinks")
    private final List<f> customLinks;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAirTip() {
        return this.airTip;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCustomLinks() {
        return this.customLinks;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getSentimentIndicator() {
        return this.sentimentIndicator;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getStats() {
        return this.stats;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.symbol, bVar.symbol) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.website, bVar.website) && Intrinsics.f(this.whitepaperLink, bVar.whitepaperLink) && Intrinsics.f(this.stats, bVar.stats) && Intrinsics.f(this.sentimentIndicator, bVar.sentimentIndicator) && Intrinsics.f(this.airTip, bVar.airTip) && Intrinsics.f(this.customLinks, bVar.customLinks);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getWebsite() {
        return this.website;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getWhitepaperLink() {
        return this.whitepaperLink;
    }

    public final int hashCode() {
        int iHashCode = this.symbol.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.website;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.whitepaperLink;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        e eVar = this.stats;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        c cVar = this.sentimentIndicator;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.airTip;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<f> list = this.customLinks;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }
}
