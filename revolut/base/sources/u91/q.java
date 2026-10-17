package u91;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f278377c;
    public final LocalDate d;
    public final s e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f278378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f278379h;
    public final n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f278380j;

    public q(String id10, String name, dj0.d amount, LocalDate date, s frequency, String str, String reference, String str2, n state, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f278375a = id10;
        this.f278376b = name;
        this.f278377c = amount;
        this.d = date;
        this.e = frequency;
        this.f = str;
        this.f278378g = reference;
        this.f278379h = str2;
        this.i = state;
        this.f278380j = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f278375a, qVar.f278375a) && Intrinsics.f(this.f278376b, qVar.f278376b) && Intrinsics.f(this.f278377c, qVar.f278377c) && Intrinsics.f(this.d, qVar.d) && this.e == qVar.e && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f278378g, qVar.f278378g) && Intrinsics.f(this.f278379h, qVar.f278379h) && this.i == qVar.i && Intrinsics.f(this.f278380j, qVar.f278380j);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + y.a(v7.c(p.a.c(this.f278375a.hashCode() * 31, 31, this.f278376b), 31, this.f278377c), 31, this.d)) * 31;
        String str = this.f;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f278378g);
        String str2 = this.f278379h;
        int iHashCode2 = (this.i.hashCode() + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        LocalDate localDate = this.f278380j;
        return iHashCode2 + (localDate != null ? localDate.hashCode() : 0);
    }
}
