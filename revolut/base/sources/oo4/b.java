package oo4;

import a0.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Loo4/b;", "", "", "toString", "()Ljava/lang/String;", "Loo4/a;", "a", "Loo4/a;", "getSelectedOption", "()Loo4/a;", "selectedOption", "", "b", "Ljava/util/List;", "getDiscountOptions", "()Ljava/util/List;", "discountOptions", "", "c", "J", "getPointsBalance", "()J", "pointsBalance", "d", "Ljava/lang/String;", "getLoyaltyQuoteToken", "loyaltyQuoteToken", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("selectedOption")
    @NotNull
    private final a selectedOption;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("options")
    @NotNull
    private final List<a> discountOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsBalance")
    private final long pointsBalance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("loyaltyQuoteToken")
    private final String loyaltyQuoteToken;

    public b(a selectedOption, ArrayList discountOptions, long j2, String str) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        Intrinsics.checkNotNullParameter(discountOptions, "discountOptions");
        this.selectedOption = selectedOption;
        this.discountOptions = discountOptions;
        this.pointsBalance = j2;
        this.loyaltyQuoteToken = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.selectedOption, bVar.selectedOption) && Intrinsics.f(this.discountOptions, bVar.discountOptions) && this.pointsBalance == bVar.pointsBalance && Intrinsics.f(this.loyaltyQuoteToken, bVar.loyaltyQuoteToken);
    }

    public final int hashCode() {
        int iC = d.c(p.a.d(this.selectedOption.hashCode() * 31, 31, this.discountOptions), 31, this.pointsBalance);
        String str = this.loyaltyQuoteToken;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
