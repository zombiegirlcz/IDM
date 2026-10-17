package vl4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f290263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f290264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f290265c;
    public final LocalDate d;
    public final dj0.d e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f290266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f290267h;
    public final dj0.d i;

    public i(LocalDate referenceDate, LocalDate startDate, LocalDate endDate, LocalDate dueDate, dj0.d statementBalance, c state, h hVar, d status, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(referenceDate, "referenceDate");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(statementBalance, "statementBalance");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f290263a = referenceDate;
        this.f290264b = startDate;
        this.f290265c = endDate;
        this.d = dueDate;
        this.e = statementBalance;
        this.f = state;
        this.f290266g = hVar;
        this.f290267h = status;
        this.i = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f290263a, iVar.f290263a) && Intrinsics.f(this.f290264b, iVar.f290264b) && Intrinsics.f(this.f290265c, iVar.f290265c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && this.f == iVar.f && Intrinsics.f(this.f290266g, iVar.f290266g) && this.f290267h == iVar.f290267h && Intrinsics.f(this.i, iVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + v7.c(y.a(y.a(y.a(this.f290263a.hashCode() * 31, 31, this.f290264b), 31, this.f290265c), 31, this.d), 31, this.e)) * 31;
        h hVar = this.f290266g;
        int iHashCode2 = (this.f290267h.hashCode() + ((iHashCode + (hVar == null ? 0 : Boolean.hashCode(hVar.f290262a))) * 31)) * 31;
        dj0.d dVar = this.i;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
