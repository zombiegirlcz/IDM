package vl4;

import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$OutstandingBalance;
import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f290248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f290249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f290250c;
    public final LocalDate d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f290251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f290252h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f290253j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f290254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dj0.d f290255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dj0.d f290256n;
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditCardInAppStatement$OutstandingBalance f290257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f290258q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f290259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f290260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f290261t;
    public final List u;
    public final ArrayList v;

    public g(LocalDate referenceDate, LocalDate startDate, LocalDate endDate, LocalDate dueDate, LocalDate localDate, LocalDate nextInterestChargeDate, dj0.d statementBalance, c state, ArrayList revolverTransactions, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4, dj0.d dVar5, b bVar, CreditCardInAppStatement$OutstandingBalance creditCardInAppStatement$OutstandingBalance, String str, String str2, f fVar, d status, ArrayList arrayList, ArrayList detailsSection) {
        Intrinsics.checkNotNullParameter(referenceDate, "referenceDate");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(nextInterestChargeDate, "nextInterestChargeDate");
        Intrinsics.checkNotNullParameter(statementBalance, "statementBalance");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(revolverTransactions, "revolverTransactions");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(detailsSection, "detailsSection");
        this.f290248a = referenceDate;
        this.f290249b = startDate;
        this.f290250c = endDate;
        this.d = dueDate;
        this.e = localDate;
        this.f = nextInterestChargeDate;
        this.f290251g = statementBalance;
        this.f290252h = state;
        this.i = revolverTransactions;
        this.f290253j = dVar;
        this.k = dVar2;
        this.f290254l = dVar3;
        this.f290255m = dVar4;
        this.f290256n = dVar5;
        this.o = bVar;
        this.f290257p = creditCardInAppStatement$OutstandingBalance;
        this.f290258q = str;
        this.f290259r = str2;
        this.f290260s = fVar;
        this.f290261t = status;
        this.u = arrayList;
        this.v = detailsSection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f290248a, gVar.f290248a) && Intrinsics.f(this.f290249b, gVar.f290249b) && Intrinsics.f(this.f290250c, gVar.f290250c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && this.f290251g.equals(gVar.f290251g) && this.f290252h == gVar.f290252h && this.i.equals(gVar.i) && Intrinsics.f(this.f290253j, gVar.f290253j) && Intrinsics.f(this.k, gVar.k) && Intrinsics.f(this.f290254l, gVar.f290254l) && Intrinsics.f(this.f290255m, gVar.f290255m) && Intrinsics.f(this.f290256n, gVar.f290256n) && this.o == gVar.o && Intrinsics.f(this.f290257p, gVar.f290257p) && Intrinsics.f(this.f290258q, gVar.f290258q) && Intrinsics.f(this.f290259r, gVar.f290259r) && Intrinsics.f(this.f290260s, gVar.f290260s) && this.f290261t == gVar.f290261t && Intrinsics.f(this.u, gVar.u) && this.v.equals(gVar.v);
    }

    public final int hashCode() {
        int iA = y.a(y.a(y.a(this.f290248a.hashCode() * 31, 31, this.f290249b), 31, this.f290250c), 31, this.d);
        LocalDate localDate = this.e;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, (this.f290252h.hashCode() + v7.c(y.a((iA + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.f), 31, this.f290251g)) * 31, 31);
        dj0.d dVar = this.f290253j;
        int iHashCode = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.k;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f290254l;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.f290255m;
        int iHashCode4 = (iHashCode3 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        dj0.d dVar5 = this.f290256n;
        int iHashCode5 = (iHashCode4 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31;
        b bVar = this.o;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        CreditCardInAppStatement$OutstandingBalance creditCardInAppStatement$OutstandingBalance = this.f290257p;
        int iHashCode7 = (iHashCode6 + (creditCardInAppStatement$OutstandingBalance == null ? 0 : creditCardInAppStatement$OutstandingBalance.hashCode())) * 31;
        String str = this.f290258q;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f290259r;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        f fVar = this.f290260s;
        int iHashCode10 = (this.f290261t.hashCode() + ((iHashCode9 + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31;
        List list = this.u;
        return this.v.hashCode() + ((iHashCode10 + (list != null ? list.hashCode() : 0)) * 31);
    }
}
