package hcl;

import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f151056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f151057c;
    public final String d;
    public final String e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f151058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f151059h;
    public final h1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b1 f151060j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Instant f151061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v0 f151062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v0 f151063n;

    public l1(String ref2, Instant launchDate, Instant instant, String str, String str2, jo3.b priceRangeLow, jo3.b priceRangeHigh, boolean z, h1 documents, b1 details, List sections, Instant instant2, v0 v0Var, v0 v0Var2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(launchDate, "launchDate");
        Intrinsics.checkNotNullParameter(priceRangeLow, "priceRangeLow");
        Intrinsics.checkNotNullParameter(priceRangeHigh, "priceRangeHigh");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f151055a = ref2;
        this.f151056b = launchDate;
        this.f151057c = instant;
        this.d = str;
        this.e = str2;
        this.f = priceRangeLow;
        this.f151058g = priceRangeHigh;
        this.f151059h = z;
        this.i = documents;
        this.f151060j = details;
        this.k = sections;
        this.f151061l = instant2;
        this.f151062m = v0Var;
        this.f151063n = v0Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.f151055a, l1Var.f151055a) && Intrinsics.f(this.f151056b, l1Var.f151056b) && Intrinsics.f(this.f151057c, l1Var.f151057c) && Intrinsics.f(this.d, l1Var.d) && Intrinsics.f(this.e, l1Var.e) && Intrinsics.f(this.f, l1Var.f) && Intrinsics.f(this.f151058g, l1Var.f151058g) && this.f151059h == l1Var.f151059h && Intrinsics.f(this.i, l1Var.i) && Intrinsics.f(this.f151060j, l1Var.f151060j) && Intrinsics.f(this.k, l1Var.k) && Intrinsics.f(this.f151061l, l1Var.f151061l) && Intrinsics.f(this.f151062m, l1Var.f151062m) && Intrinsics.f(this.f151063n, l1Var.f151063n);
    }

    public final int hashCode() {
        int iC = r6.b.c(this.f151055a.hashCode() * 31, 31, this.f151056b);
        Instant instant = this.f151057c;
        int iHashCode = (iC + (instant == null ? 0 : instant.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iD = p.a.d((this.f151060j.hashCode() + ((this.i.hashCode() + j6.a.c(wp5.y.e(this.f151058g, wp5.y.e(this.f, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.f151059h)) * 31)) * 31, 31, this.k);
        Instant instant2 = this.f151061l;
        int iHashCode3 = (iD + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        v0 v0Var = this.f151062m;
        int iHashCode4 = (iHashCode3 + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        v0 v0Var2 = this.f151063n;
        return iHashCode4 + (v0Var2 != null ? v0Var2.hashCode() : 0);
    }
}
