package hp4;

import com.revolut.feature.credit.card.models.CreditCard;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final el4.a f154447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f154448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yt8.c f154449c;
    public final CreditCard d;

    public f(el4.a accountInfo, List cards, yt8.c kyc2, CreditCard creditCard) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(creditCard, "creditCard");
        this.f154447a = accountInfo;
        this.f154448b = cards;
        this.f154449c = kyc2;
        this.d = creditCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f154447a, fVar.f154447a) && Intrinsics.f(this.f154448b, fVar.f154448b) && Intrinsics.f(this.f154449c, fVar.f154449c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f154449c.hashCode() + p.a.d(this.f154447a.hashCode() * 31, 31, this.f154448b)) * 31);
    }
}
