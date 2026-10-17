package i4k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.models.quotes.CreditCardInterestPromotion;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f158528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f158529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158530c;
    public final String d;
    public final CreditCardInterestPromotion e;

    public h(TextLocalisedClause text, dj0.d dailyAmount, String str, String str2, CreditCardInterestPromotion promotion) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(dailyAmount, "dailyAmount");
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        this.f158528a = text;
        this.f158529b = dailyAmount;
        this.f158530c = str;
        this.d = str2;
        this.e = promotion;
    }

    @Override // i4k.j
    public final boolean X0() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f158528a.equals(hVar.f158528a) && Intrinsics.f(this.f158529b, hVar.f158529b) && Intrinsics.f(this.f158530c, hVar.f158530c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    @Override // i4k.j
    public final Clause getText() {
        return this.f158528a;
    }

    public final int hashCode() {
        int iC = v7.c(this.f158528a.hashCode() * 31, 31, this.f158529b);
        String str = this.f158530c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
