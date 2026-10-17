package i3k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158241c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f158242g;

    public j(String recipientCountry, String recipientCurrency, String senderCountry, String senderCurrency, String str, String str2, String routeId) {
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(recipientCurrency, "recipientCurrency");
        Intrinsics.checkNotNullParameter(senderCountry, "senderCountry");
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        this.f158239a = recipientCountry;
        this.f158240b = recipientCurrency;
        this.f158241c = senderCountry;
        this.d = senderCurrency;
        this.e = str;
        this.f = str2;
        this.f158242g = routeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f158239a, jVar.f158239a) && Intrinsics.f(this.f158240b, jVar.f158240b) && Intrinsics.f(this.f158241c, jVar.f158241c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f158242g, jVar.f158242g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f158239a.hashCode() * 31, 31, this.f158240b), 31, this.f158241c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.f158242g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
