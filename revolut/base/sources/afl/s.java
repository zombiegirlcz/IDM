package afl;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f4637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f4638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4639c;
    public final Instant d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f4640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f4641h;
    public final Instant i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f4642j;

    public s(Instant launchDate, t0 priceRange, String companyDescription, Instant instant, Instant priceRangeIssueDate, Instant instant2, dj0.d dVar, dj0.d dVar2, Instant instant3, Instant instant4) {
        Intrinsics.checkNotNullParameter(launchDate, "launchDate");
        Intrinsics.checkNotNullParameter(priceRange, "priceRange");
        Intrinsics.checkNotNullParameter(companyDescription, "companyDescription");
        Intrinsics.checkNotNullParameter(priceRangeIssueDate, "priceRangeIssueDate");
        this.f4637a = launchDate;
        this.f4638b = priceRange;
        this.f4639c = companyDescription;
        this.d = instant;
        this.e = priceRangeIssueDate;
        this.f = instant2;
        this.f4640g = dVar;
        this.f4641h = dVar2;
        this.i = instant3;
        this.f4642j = instant4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f4637a, sVar.f4637a) && Intrinsics.f(this.f4638b, sVar.f4638b) && Intrinsics.f(this.f4639c, sVar.f4639c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f4640g, sVar.f4640g) && Intrinsics.f(this.f4641h, sVar.f4641h) && Intrinsics.f(this.i, sVar.i) && Intrinsics.f(this.f4642j, sVar.f4642j);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f4638b.hashCode() + (this.f4637a.hashCode() * 31)) * 31, 31, this.f4639c);
        Instant instant = this.d;
        int iC2 = r6.b.c((iC + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.e);
        Instant instant2 = this.f;
        int iHashCode = (iC2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        dj0.d dVar = this.f4640g;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f4641h;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Instant instant3 = this.i;
        int iHashCode4 = (iHashCode3 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
        Instant instant4 = this.f4642j;
        return iHashCode4 + (instant4 != null ? instant4.hashCode() : 0);
    }
}
