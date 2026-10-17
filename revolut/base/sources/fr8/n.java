package fr8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final psg.a f137424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorBankingProfile f137425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f137426c;
    public final String d;
    public final String e;

    public n(psg.a walletProfile, JuniorBankingProfile juniorProfile, dj0.d amount, String comment, String gifUrl) {
        Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        this.f137424a = walletProfile;
        this.f137425b = juniorProfile;
        this.f137426c = amount;
        this.d = comment;
        this.e = gifUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f137424a, nVar.f137424a) && Intrinsics.f(this.f137425b, nVar.f137425b) && Intrinsics.f(this.f137426c, nVar.f137426c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(v7.c((this.f137425b.hashCode() + (this.f137424a.hashCode() * 31)) * 31, 31, this.f137426c), 31, this.d);
    }
}
