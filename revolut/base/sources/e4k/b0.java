package e4k;

import com.revolut.feature.transfer.models.quotes.CreditCardInterestPromotion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f122575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f122577c;
    public final CreditCardInterestPromotion d;

    public b0(dj0.d dailyAmount, String str, String str2, CreditCardInterestPromotion promotion) {
        Intrinsics.checkNotNullParameter(dailyAmount, "dailyAmount");
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        this.f122575a = dailyAmount;
        this.f122576b = str;
        this.f122577c = str2;
        this.d = promotion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f122575a, b0Var.f122575a) && Intrinsics.f(this.f122576b, b0Var.f122576b) && Intrinsics.f(this.f122577c, b0Var.f122577c) && Intrinsics.f(this.d, b0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f122575a.hashCode() * 31;
        String str = this.f122576b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f122577c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
