package rw5;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Lrw5/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "code", "", "J", "d", "()J", "marketCap", "", "c", "D", "()D", "currentPrice", "e", "priceChange24h", "bought24h", "f", "sold24h", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("marketCap")
    private final long marketCap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("currentPrice")
    private final double currentPrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("priceChange24h")
    private final double priceChange24h;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("bought24h")
    private final double bought24h;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("sold24h")
    private final double sold24h;

    public a(String code, long j2, double d, double d5, double d6, double d10) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.marketCap = j2;
        this.currentPrice = d;
        this.priceChange24h = d5;
        this.bought24h = d6;
        this.sold24h = d10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getBought24h() {
        return this.bought24h;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getMarketCap() {
        return this.marketCap;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getPriceChange24h() {
        return this.priceChange24h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.code, aVar.code) && this.marketCap == aVar.marketCap && Double.compare(this.currentPrice, aVar.currentPrice) == 0 && Double.compare(this.priceChange24h, aVar.priceChange24h) == 0 && Double.compare(this.bought24h, aVar.bought24h) == 0 && Double.compare(this.sold24h, aVar.sold24h) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getSold24h() {
        return this.sold24h;
    }

    public final int hashCode() {
        return Double.hashCode(this.sold24h) + m72.b.c(m72.b.c(m72.b.c(d.c(this.code.hashCode() * 31, 31, this.marketCap), this.currentPrice, 31), this.priceChange24h, 31), this.bought24h, 31);
    }
}
