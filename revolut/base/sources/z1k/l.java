package z1k;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f318874c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f318875g;

    public l(String name, String logo, Double d, dj0.d fixedFee, dj0.d senderAmount, dj0.d recipientAmount, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(fixedFee, "fixedFee");
        Intrinsics.checkNotNullParameter(senderAmount, "senderAmount");
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        this.f318872a = name;
        this.f318873b = logo;
        this.f318874c = d;
        this.d = fixedFee;
        this.e = senderAmount;
        this.f = recipientAmount;
        this.f318875g = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f318872a, lVar.f318872a) && Intrinsics.f(this.f318873b, lVar.f318873b) && Intrinsics.f(this.f318874c, lVar.f318874c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f318875g, lVar.f318875g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f318872a.hashCode() * 31, 31, this.f318873b);
        Double d = this.f318874c;
        int iC2 = v7.c(v7.c(v7.c((iC + (d == null ? 0 : d.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.f318875g;
        return iC2 + (str != null ? str.hashCode() : 0);
    }
}
