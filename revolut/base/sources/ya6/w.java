package ya6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f311986b;

    public w(String currency, String charityId) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        this.f311985a = currency;
        this.f311986b = charityId;
    }

    public final String a() {
        return a0.d.s("SUGGESTED_POINTS_AMOUNTS_KEY:", this.f311985a, ":6:", this.f311986b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f311985a, wVar.f311985a) && Intrinsics.f(this.f311986b, wVar.f311986b);
    }

    public final int hashCode() {
        return Integer.hashCode(6) + p.a.c(this.f311985a.hashCode() * 31, 31, this.f311986b);
    }
}
