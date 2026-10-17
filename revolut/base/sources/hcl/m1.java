package hcl;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f151074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f151075c;
    public final String d;
    public final String e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f151076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f151077h;

    public m1(String ref2, Instant launchDate, Instant instant, String str, String str2, jo3.b priceRangeLow, jo3.b priceRangeHigh, Instant instant2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(launchDate, "launchDate");
        Intrinsics.checkNotNullParameter(priceRangeLow, "priceRangeLow");
        Intrinsics.checkNotNullParameter(priceRangeHigh, "priceRangeHigh");
        this.f151073a = ref2;
        this.f151074b = launchDate;
        this.f151075c = instant;
        this.d = str;
        this.e = str2;
        this.f = priceRangeLow;
        this.f151076g = priceRangeHigh;
        this.f151077h = instant2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f151073a, m1Var.f151073a) && Intrinsics.f(this.f151074b, m1Var.f151074b) && Intrinsics.f(this.f151075c, m1Var.f151075c) && Intrinsics.f(this.d, m1Var.d) && Intrinsics.f(this.e, m1Var.e) && Intrinsics.f(this.f, m1Var.f) && Intrinsics.f(this.f151076g, m1Var.f151076g) && Intrinsics.f(this.f151077h, m1Var.f151077h);
    }

    public final int hashCode() {
        int iC = r6.b.c(this.f151073a.hashCode() * 31, 31, this.f151074b);
        Instant instant = this.f151075c;
        int iHashCode = (iC + (instant == null ? 0 : instant.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iE = wp5.y.e(this.f151076g, wp5.y.e(this.f, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Instant instant2 = this.f151077h;
        return iE + (instant2 != null ? instant2.hashCode() : 0);
    }
}
