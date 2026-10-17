package oel;

import afl.t0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f224647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f224648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f224649c;
    public final Instant d;
    public final String e;
    public final Instant f;

    public l(t0 priceRange, Instant launchDate, String str, Instant instant, String str2, Instant instant2) {
        Intrinsics.checkNotNullParameter(priceRange, "priceRange");
        Intrinsics.checkNotNullParameter(launchDate, "launchDate");
        this.f224647a = priceRange;
        this.f224648b = launchDate;
        this.f224649c = str;
        this.d = instant;
        this.e = str2;
        this.f = instant2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f224647a, lVar.f224647a) && Intrinsics.f(this.f224648b, lVar.f224648b) && Intrinsics.f(this.f224649c, lVar.f224649c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        int iC = r6.b.c(this.f224647a.hashCode() * 31, 31, this.f224648b);
        String str = this.f224649c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Instant instant = this.d;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Instant instant2 = this.f;
        return iHashCode3 + (instant2 != null ? instant2.hashCode() : 0);
    }
}
