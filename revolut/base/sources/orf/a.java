package orf;

import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lorf/a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "getDailyAmount", "()Ljo3/a;", "dailyAmount", "b", "Ljava/lang/String;", "getApr", "apr", "c", "getAnnualInterestRate", "annualInterestRate", "Lorf/b;", "d", "Lorf/b;", "getPromotion", "()Lorf/b;", "promotion", "feature_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("dailyAmount")
    @NotNull
    private final jo3.a dailyAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("apr")
    private final String apr;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("annualInterestRate")
    private final String annualInterestRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("promotion")
    private final b promotion;

    public final CreditCardInterest a() {
        dj0.d dVarO = mo3.a.o(this.dailyAmount);
        String str = this.apr;
        String str2 = this.annualInterestRate;
        b bVar = this.promotion;
        return new CreditCardInterest(dVarO, str, str2, bVar != null ? bVar.a() : null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.dailyAmount, aVar.dailyAmount) && Intrinsics.f(this.apr, aVar.apr) && Intrinsics.f(this.annualInterestRate, aVar.annualInterestRate) && Intrinsics.f(this.promotion, aVar.promotion);
    }

    public final int hashCode() {
        int iHashCode = this.dailyAmount.hashCode() * 31;
        String str = this.apr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.annualInterestRate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.promotion;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }
}
