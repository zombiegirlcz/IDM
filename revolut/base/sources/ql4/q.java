package ql4;

import ip0.v7;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q {
    public final dj0.d A;
    public final ArrayList B;
    public final c C;
    public final ArrayList D;
    public final ArrayList E;
    public final o F;
    public final boolean G;
    public final String H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f247160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f247161c;
    public final int d;
    public final int e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f247162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f247163h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f247164j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f247165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dj0.d f247166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LocalDate f247167n;
    public final LocalDate o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LocalDate f247168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LocalDate f247169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dj0.d f247170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f247171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f247172t;
    public final t u;
    public final l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dj0.d f247173w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final dj0.d f247174x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final dj0.d f247175y;
    public final dj0.d z;

    public q(String id10, Instant createdAt, List transactionIds, int i, int i2, dj0.d principalAmount, dj0.d dVar, LocalDate localDate, dj0.d totalRepaid, dj0.d totalRepayable, dj0.d actualTotalRepayable, dj0.d dVar2, dj0.d dVar3, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, LocalDate firstMaturingDate, dj0.d dVar4, String str, String str2, t state, l lVar, dj0.d dVar5, dj0.d remainingTotalAmount, dj0.d dVar6, dj0.d dVar7, dj0.d dVar8, ArrayList documents, c cVar, ArrayList detailSections, ArrayList repaymentMethods, o schedule, boolean z, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(principalAmount, "principalAmount");
        Intrinsics.checkNotNullParameter(totalRepaid, "totalRepaid");
        Intrinsics.checkNotNullParameter(totalRepayable, "totalRepayable");
        Intrinsics.checkNotNullParameter(actualTotalRepayable, "actualTotalRepayable");
        Intrinsics.checkNotNullParameter(firstMaturingDate, "firstMaturingDate");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remainingTotalAmount, "remainingTotalAmount");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(detailSections, "detailSections");
        Intrinsics.checkNotNullParameter(repaymentMethods, "repaymentMethods");
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        this.f247159a = id10;
        this.f247160b = createdAt;
        this.f247161c = transactionIds;
        this.d = i;
        this.e = i2;
        this.f = principalAmount;
        this.f247162g = dVar;
        this.f247163h = localDate;
        this.i = totalRepaid;
        this.f247164j = totalRepayable;
        this.k = actualTotalRepayable;
        this.f247165l = dVar2;
        this.f247166m = dVar3;
        this.f247167n = localDate2;
        this.o = localDate3;
        this.f247168p = localDate4;
        this.f247169q = firstMaturingDate;
        this.f247170r = dVar4;
        this.f247171s = str;
        this.f247172t = str2;
        this.u = state;
        this.v = lVar;
        this.f247173w = dVar5;
        this.f247174x = remainingTotalAmount;
        this.f247175y = dVar6;
        this.z = dVar7;
        this.A = dVar8;
        this.B = documents;
        this.C = cVar;
        this.D = detailSections;
        this.E = repaymentMethods;
        this.F = schedule;
        this.G = z;
        this.H = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f247159a, qVar.f247159a) && Intrinsics.f(this.f247160b, qVar.f247160b) && Intrinsics.f(this.f247161c, qVar.f247161c) && this.d == qVar.d && this.e == qVar.e && this.f.equals(qVar.f) && Intrinsics.f(this.f247162g, qVar.f247162g) && Intrinsics.f(this.f247163h, qVar.f247163h) && this.i.equals(qVar.i) && this.f247164j.equals(qVar.f247164j) && this.k.equals(qVar.k) && Intrinsics.f(this.f247165l, qVar.f247165l) && Intrinsics.f(this.f247166m, qVar.f247166m) && Intrinsics.f(this.f247167n, qVar.f247167n) && Intrinsics.f(this.o, qVar.o) && Intrinsics.f(this.f247168p, qVar.f247168p) && Intrinsics.f(this.f247169q, qVar.f247169q) && Intrinsics.f(this.f247170r, qVar.f247170r) && Intrinsics.f(this.f247171s, qVar.f247171s) && Intrinsics.f(this.f247172t, qVar.f247172t) && this.u == qVar.u && Intrinsics.f(this.v, qVar.v) && Intrinsics.f(this.f247173w, qVar.f247173w) && this.f247174x.equals(qVar.f247174x) && Intrinsics.f(this.f247175y, qVar.f247175y) && Intrinsics.f(this.z, qVar.z) && Intrinsics.f(this.A, qVar.A) && this.B.equals(qVar.B) && Intrinsics.f(this.C, qVar.C) && this.D.equals(qVar.D) && this.E.equals(qVar.E) && this.F.equals(qVar.F) && this.G == qVar.G && Intrinsics.f(this.H, qVar.H);
    }

    public final int hashCode() {
        int iC = v7.c(j6.a.b(this.e, j6.a.b(this.d, p.a.d(r6.b.c(this.f247159a.hashCode() * 31, 31, this.f247160b), 31, this.f247161c), 31), 31), 31, this.f);
        dj0.d dVar = this.f247162g;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LocalDate localDate = this.f247163h;
        int iC2 = v7.c(v7.c(v7.c((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.i), 31, this.f247164j), 31, this.k);
        dj0.d dVar2 = this.f247165l;
        int iHashCode2 = (iC2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f247166m;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        LocalDate localDate2 = this.f247167n;
        int iHashCode4 = (iHashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.o;
        int iHashCode5 = (iHashCode4 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        LocalDate localDate4 = this.f247168p;
        int iA = wp5.y.a((iHashCode5 + (localDate4 == null ? 0 : localDate4.hashCode())) * 31, 31, this.f247169q);
        dj0.d dVar4 = this.f247170r;
        int iHashCode6 = (iA + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        String str = this.f247171s;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f247172t;
        int iHashCode8 = (this.u.hashCode() + ((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        l lVar = this.v;
        int iHashCode9 = (iHashCode8 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        dj0.d dVar5 = this.f247173w;
        int iC3 = v7.c((iHashCode9 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31, 31, this.f247174x);
        dj0.d dVar6 = this.f247175y;
        int iHashCode10 = (iC3 + (dVar6 == null ? 0 : dVar6.hashCode())) * 31;
        dj0.d dVar7 = this.z;
        int iHashCode11 = (iHashCode10 + (dVar7 == null ? 0 : dVar7.hashCode())) * 31;
        dj0.d dVar8 = this.A;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.B, (iHashCode11 + (dVar8 == null ? 0 : dVar8.hashCode())) * 31, 31);
        c cVar = this.C;
        int iC4 = j6.a.c((this.F.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.E, com.google.android.gms.internal.mlkit_vision_face.a.b(this.D, (iB + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31)) * 31, 31, this.G);
        String str3 = this.H;
        return iC4 + (str3 != null ? str3.hashCode() : 0);
    }
}
