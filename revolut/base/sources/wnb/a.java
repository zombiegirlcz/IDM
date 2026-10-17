package wnb;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import kotlin.jvm.internal.Intrinsics;
import od0.i;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsAccountDetails f298769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f298770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f298771c;

    public a(SavingsAccountDetails savingsAccountDetails, i juniorProfileOptional, i legalEntityRegionOptional) {
        Intrinsics.checkNotNullParameter(savingsAccountDetails, "savingsAccountDetails");
        Intrinsics.checkNotNullParameter(juniorProfileOptional, "juniorProfileOptional");
        Intrinsics.checkNotNullParameter(legalEntityRegionOptional, "legalEntityRegionOptional");
        this.f298769a = savingsAccountDetails;
        this.f298770b = juniorProfileOptional;
        this.f298771c = legalEntityRegionOptional;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f298769a, aVar.f298769a) && Intrinsics.f(this.f298770b, aVar.f298770b) && Intrinsics.f(this.f298771c, aVar.f298771c);
    }

    public final int hashCode() {
        return this.f298771c.hashCode() + r6.b.f(this.f298770b, this.f298769a.hashCode() * 31, 31);
    }
}
