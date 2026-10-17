package lwe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200446c;
    public final String d;

    public a(String cardNumber, String expireDate, String cvv, String postcode) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        this.f200444a = cardNumber;
        this.f200445b = expireDate;
        this.f200446c = cvv;
        this.d = postcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200444a, aVar.f200444a) && Intrinsics.f(this.f200445b, aVar.f200445b) && Intrinsics.f(this.f200446c, aVar.f200446c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f200444a.hashCode() * 31, 31, this.f200445b), 31, this.f200446c);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("CardData(cardNumber=****, expireDate=**, cvv=***, ");
        sb6.append("postcode=" + this.d + ", ");
        sb6.append(")");
        return sb6.toString();
    }
}
