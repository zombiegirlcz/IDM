package fcf;

import com.revolut.feature.terms.api.model.Terms;
import ip0.v7;
import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbf.c f133736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f133737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f133738c;
    public final j d;
    public final Terms e;
    public final Period f;

    public h(lbf.c billingCode, dj0.d price, j tProTerms, j revolutTerms, Terms cardholderTerms, Period period) {
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(tProTerms, "tProTerms");
        Intrinsics.checkNotNullParameter(revolutTerms, "revolutTerms");
        Intrinsics.checkNotNullParameter(cardholderTerms, "cardholderTerms");
        this.f133736a = billingCode;
        this.f133737b = price;
        this.f133738c = tProTerms;
        this.d = revolutTerms;
        this.e = cardholderTerms;
        this.f = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f133736a == hVar.f133736a && Intrinsics.f(this.f133737b, hVar.f133737b) && Intrinsics.f(this.f133738c, hVar.f133738c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f133738c.hashCode() + v7.c(this.f133736a.hashCode() * 31, 31, this.f133737b)) * 31)) * 31)) * 31;
        Period period = this.f;
        return iHashCode + (period == null ? 0 : period.hashCode());
    }
}
