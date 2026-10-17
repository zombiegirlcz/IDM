package jel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f173452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f173453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f173454c;
    public final dj0.d d;
    public final dj0.d e;

    public h(LocalDate localDate, dj0.d dVar, LocalDate localDate2, dj0.d dVar2, dj0.d dVar3) {
        this.f173452a = localDate;
        this.f173453b = dVar;
        this.f173454c = localDate2;
        this.d = dVar2;
        this.e = dVar3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f173452a, hVar.f173452a) && Intrinsics.f(this.f173453b, hVar.f173453b) && Intrinsics.f(this.f173454c, hVar.f173454c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        LocalDate localDate = this.f173452a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        dj0.d dVar = this.f173453b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LocalDate localDate2 = this.f173454c;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        int iHashCode4 = (iHashCode3 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.e;
        return iHashCode4 + (dVar3 != null ? dVar3.hashCode() : 0);
    }
}
