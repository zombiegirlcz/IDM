package jlc;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final alc.j f175670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f175671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f175672c;
    public final LocalDate d;
    public final boolean e;
    public final dj0.d f;

    public a(alc.j projection, dj0.d initialContribution, dj0.d monthlyContribution, LocalDate projectedDate, boolean z, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(initialContribution, "initialContribution");
        Intrinsics.checkNotNullParameter(monthlyContribution, "monthlyContribution");
        Intrinsics.checkNotNullParameter(projectedDate, "projectedDate");
        this.f175670a = projection;
        this.f175671b = initialContribution;
        this.f175672c = monthlyContribution;
        this.d = projectedDate;
        this.e = z;
        this.f = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f175670a, aVar.f175670a) && Intrinsics.f(this.f175671b, aVar.f175671b) && Intrinsics.f(this.f175672c, aVar.f175672c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(wp5.y.a(v7.c(v7.c(this.f175670a.hashCode() * 31, 31, this.f175671b), 31, this.f175672c), 31, this.d), 31, this.e);
        dj0.d dVar = this.f;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
