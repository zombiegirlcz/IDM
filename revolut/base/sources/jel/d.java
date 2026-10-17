package jel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f173427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f173428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f173429c;
    public final LocalDate d;

    public d(boolean z, LocalDate localDate, dj0.d dVar, LocalDate localDate2) {
        this.f173427a = z;
        this.f173428b = localDate;
        this.f173429c = dVar;
        this.d = localDate2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f173427a == dVar.f173427a && Intrinsics.f(this.f173428b, dVar.f173428b) && Intrinsics.f(this.f173429c, dVar.f173429c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f173427a) * 31;
        LocalDate localDate = this.f173428b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        dj0.d dVar = this.f173429c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LocalDate localDate2 = this.d;
        return iHashCode3 + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
