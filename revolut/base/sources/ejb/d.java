package ejb;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f126838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f126839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f126840c;
    public final dj0.d d;

    public d(LocalDate date, dj0.d moneyIn, dj0.d moneyOut, dj0.d interest) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(moneyIn, "moneyIn");
        Intrinsics.checkNotNullParameter(moneyOut, "moneyOut");
        Intrinsics.checkNotNullParameter(interest, "interest");
        this.f126838a = date;
        this.f126839b = moneyIn;
        this.f126840c = moneyOut;
        this.d = interest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f126838a, dVar.f126838a) && Intrinsics.f(this.f126839b, dVar.f126839b) && Intrinsics.f(this.f126840c, dVar.f126840c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f126838a.hashCode() * 31, 31, this.f126839b), 31, this.f126840c);
    }
}
