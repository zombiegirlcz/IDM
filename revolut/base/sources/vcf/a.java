package vcf;

import e8l.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u0012"}, d2 = {"Lvcf/a;", "", "", "toString", "()Ljava/lang/String;", "", "Le8l/m;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "quotes", "Le8l/a;", "Le8l/a;", "c", "()Le8l/a;", "remainingAmount", "marginQuotes", "feature_trading_asset_quotes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("quotes")
    @NotNull
    private final List<m> quotes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("remainingAmount")
    @NotNull
    private final e8l.a remainingAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("marginQuotes")
    private final List<m> marginQuotes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getMarginQuotes() {
        return this.marginQuotes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getQuotes() {
        return this.quotes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e8l.a getRemainingAmount() {
        return this.remainingAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.quotes, aVar.quotes) && Intrinsics.f(this.remainingAmount, aVar.remainingAmount) && Intrinsics.f(this.marginQuotes, aVar.marginQuotes);
    }

    public final int hashCode() {
        int iHashCode = (this.remainingAmount.hashCode() + (this.quotes.hashCode() * 31)) * 31;
        List<m> list = this.marginQuotes;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
