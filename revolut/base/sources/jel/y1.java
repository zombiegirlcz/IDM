package jel;

import java.time.Instant;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f173609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f173610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f173611c;
    public final LocalDate d;
    public final LocalDate e;
    public final Instant f;

    public y1(LocalDate noteTradeDate, LocalDate issueDate, LocalDate finalObservationDate, LocalDate maturityDate, LocalDate localDate, Instant instant) {
        Intrinsics.checkNotNullParameter(noteTradeDate, "noteTradeDate");
        Intrinsics.checkNotNullParameter(issueDate, "issueDate");
        Intrinsics.checkNotNullParameter(finalObservationDate, "finalObservationDate");
        Intrinsics.checkNotNullParameter(maturityDate, "maturityDate");
        this.f173609a = noteTradeDate;
        this.f173610b = issueDate;
        this.f173611c = finalObservationDate;
        this.d = maturityDate;
        this.e = localDate;
        this.f = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return Intrinsics.f(this.f173609a, y1Var.f173609a) && Intrinsics.f(this.f173610b, y1Var.f173610b) && Intrinsics.f(this.f173611c, y1Var.f173611c) && Intrinsics.f(this.d, y1Var.d) && Intrinsics.f(this.e, y1Var.e) && Intrinsics.f(this.f, y1Var.f);
    }

    public final int hashCode() {
        int iA = wp5.y.a(wp5.y.a(wp5.y.a(this.f173609a.hashCode() * 31, 31, this.f173610b), 31, this.f173611c), 31, this.d);
        LocalDate localDate = this.e;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Instant instant = this.f;
        return iHashCode + (instant != null ? instant.hashCode() : 0);
    }
}
