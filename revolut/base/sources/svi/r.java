package svi;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f265970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f265971c;
    public final boolean d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f265972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f265973h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f265974j;
    public final n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f265975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f265976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f265977n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f265978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f265979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f265980r;

    public r(String id10, q type, boolean z, boolean z3, Instant instant, Instant instant2, Instant instant3, p style, dj0.d dVar, dj0.d dVar2, n nVar, m mVar, String str, String str2, String str3, String str4, String str5, o status) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f265969a = id10;
        this.f265970b = type;
        this.f265971c = z;
        this.d = z3;
        this.e = instant;
        this.f = instant2;
        this.f265972g = instant3;
        this.f265973h = style;
        this.i = dVar;
        this.f265974j = dVar2;
        this.k = nVar;
        this.f265975l = mVar;
        this.f265976m = str;
        this.f265977n = str2;
        this.o = str3;
        this.f265978p = str4;
        this.f265979q = str5;
        this.f265980r = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f265969a, rVar.f265969a) && this.f265970b == rVar.f265970b && this.f265971c == rVar.f265971c && this.d == rVar.d && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f265972g, rVar.f265972g) && this.f265973h == rVar.f265973h && Intrinsics.f(this.i, rVar.i) && Intrinsics.f(this.f265974j, rVar.f265974j) && Intrinsics.f(this.k, rVar.k) && Intrinsics.f(this.f265975l, rVar.f265975l) && Intrinsics.f(this.f265976m, rVar.f265976m) && Intrinsics.f(this.f265977n, rVar.f265977n) && Intrinsics.f(this.o, rVar.o) && Intrinsics.f(this.f265978p, rVar.f265978p) && Intrinsics.f(this.f265979q, rVar.f265979q) && this.f265980r == rVar.f265980r;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f265970b.hashCode() + (this.f265969a.hashCode() * 31)) * 31, 31, this.f265971c), 31, this.d);
        Instant instant = this.e;
        int iHashCode = (iC + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f;
        int iHashCode2 = (iHashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.f265972g;
        int iHashCode3 = (this.f265973h.hashCode() + ((iHashCode2 + (instant3 == null ? 0 : instant3.hashCode())) * 31)) * 31;
        dj0.d dVar = this.i;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f265974j;
        int iHashCode5 = (iHashCode4 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        n nVar = this.k;
        int iHashCode6 = (iHashCode5 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        m mVar = this.f265975l;
        int iHashCode7 = (iHashCode6 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str = this.f265976m;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f265977n;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f265978p;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f265979q;
        return this.f265980r.hashCode() + ((iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}
