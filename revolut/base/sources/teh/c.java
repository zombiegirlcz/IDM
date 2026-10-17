package teh;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f270100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f270101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qel.b f270102c;
    public final b d;

    public c(String instrumentRef, LocalDate expirationDate, qel.b bVar, b bVar2) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.f270100a = instrumentRef;
        this.f270101b = expirationDate;
        this.f270102c = bVar;
        this.d = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f270100a, cVar.f270100a) && Intrinsics.f(this.f270101b, cVar.f270101b) && this.f270102c == cVar.f270102c && this.d == cVar.d;
    }

    public final int hashCode() {
        int iA = y.a(this.f270100a.hashCode() * 31, 31, this.f270101b);
        qel.b bVar = this.f270102c;
        int iHashCode = (iA + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.d;
        return (iHashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 29791;
    }
}
