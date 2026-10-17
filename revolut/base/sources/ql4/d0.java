package ql4;

import ip0.v7;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f247102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f247103c;
    public final int d;
    public final LocalDate e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f247104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f247105h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f247106j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f247107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dj0.d f247108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b0 f247109n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f247110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f247111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f247112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f247113s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f247114t;

    public d0(String id10, t state, Instant createdAt, int i, LocalDate localDate, String interestRate, String apr, dj0.d dVar, dj0.d dVar2, dj0.d remainingTotalAmount, dj0.d dVar3, dj0.d dVar4, dj0.d dVar5, b0 schedule, String str, ArrayList repaymentMethods, boolean z, ArrayList documents, String str2, ArrayList detailSections) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        Intrinsics.checkNotNullParameter(apr, "apr");
        Intrinsics.checkNotNullParameter(remainingTotalAmount, "remainingTotalAmount");
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        Intrinsics.checkNotNullParameter(repaymentMethods, "repaymentMethods");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(detailSections, "detailSections");
        this.f247101a = id10;
        this.f247102b = state;
        this.f247103c = createdAt;
        this.d = i;
        this.e = localDate;
        this.f = interestRate;
        this.f247104g = apr;
        this.f247105h = dVar;
        this.i = dVar2;
        this.f247106j = remainingTotalAmount;
        this.k = dVar3;
        this.f247107l = dVar4;
        this.f247108m = dVar5;
        this.f247109n = schedule;
        this.o = str;
        this.f247110p = repaymentMethods;
        this.f247111q = z;
        this.f247112r = documents;
        this.f247113s = str2;
        this.f247114t = detailSections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f247101a, d0Var.f247101a) && this.f247102b == d0Var.f247102b && Intrinsics.f(this.f247103c, d0Var.f247103c) && this.d == d0Var.d && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f) && Intrinsics.f(this.f247104g, d0Var.f247104g) && Intrinsics.f(this.f247105h, d0Var.f247105h) && Intrinsics.f(this.i, d0Var.i) && this.f247106j.equals(d0Var.f247106j) && Intrinsics.f(this.k, d0Var.k) && Intrinsics.f(this.f247107l, d0Var.f247107l) && Intrinsics.f(this.f247108m, d0Var.f247108m) && this.f247109n.equals(d0Var.f247109n) && Intrinsics.f(this.o, d0Var.o) && this.f247110p.equals(d0Var.f247110p) && this.f247111q == d0Var.f247111q && this.f247112r.equals(d0Var.f247112r) && Intrinsics.f(this.f247113s, d0Var.f247113s) && this.f247114t.equals(d0Var.f247114t);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, r6.b.c((this.f247102b.hashCode() + (this.f247101a.hashCode() * 31)) * 31, 31, this.f247103c), 31);
        LocalDate localDate = this.e;
        int iC = p.a.c(p.a.c((iB + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.f), 31, this.f247104g);
        dj0.d dVar = this.f247105h;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.i;
        int iC2 = v7.c((iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.f247106j);
        dj0.d dVar3 = this.k;
        int iHashCode2 = (iC2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.f247107l;
        int iHashCode3 = (iHashCode2 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        dj0.d dVar5 = this.f247108m;
        int iHashCode4 = (this.f247109n.hashCode() + ((iHashCode3 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31)) * 31;
        String str = this.o;
        int iB2 = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f247112r, j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f247110p, (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f247111q), 31);
        String str2 = this.f247113s;
        return this.f247114t.hashCode() + ((iB2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
