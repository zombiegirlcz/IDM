package k5k;

import com.revolut.feature.transfer.models.quotes.CreditCardInterestPromotion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f181559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181561c;
    public final CreditCardInterestPromotion d;

    public z(dj0.d amount, String str, String str2, CreditCardInterestPromotion promotion) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        this.f181559a = amount;
        this.f181560b = str;
        this.f181561c = str2;
        this.d = promotion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f181559a, zVar.f181559a) && Intrinsics.f(this.f181560b, zVar.f181560b) && Intrinsics.f(this.f181561c, zVar.f181561c) && Intrinsics.f(this.d, zVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f181559a.hashCode() * 31;
        String str = this.f181560b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f181561c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
