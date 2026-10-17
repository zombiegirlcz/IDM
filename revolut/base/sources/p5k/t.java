package p5k;

import com.revolut.feature.transfer.models.quotes.CreditCardInterestPromotion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f233184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f233186c;
    public final CreditCardInterestPromotion d;

    public t(dj0.d amount, String str, String str2, CreditCardInterestPromotion promotion) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        this.f233184a = amount;
        this.f233185b = str;
        this.f233186c = str2;
        this.d = promotion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f233184a, tVar.f233184a) && Intrinsics.f(this.f233185b, tVar.f233185b) && Intrinsics.f(this.f233186c, tVar.f233186c) && Intrinsics.f(this.d, tVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f233184a.hashCode() * 31;
        String str = this.f233185b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f233186c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
