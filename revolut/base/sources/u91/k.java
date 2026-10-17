package u91;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f278367c;
    public final LocalDate d;
    public final String e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f278368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f278369h;

    public k(String id10, String name, dj0.d amount, LocalDate date, String str, p type, n state, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f278365a = id10;
        this.f278366b = name;
        this.f278367c = amount;
        this.d = date;
        this.e = str;
        this.f = type;
        this.f278368g = state;
        this.f278369h = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f278365a, kVar.f278365a) && Intrinsics.f(this.f278366b, kVar.f278366b) && Intrinsics.f(this.f278367c, kVar.f278367c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && this.f == kVar.f && this.f278368g == kVar.f278368g && Intrinsics.f(this.f278369h, kVar.f278369h);
    }

    public final int hashCode() {
        int iA = y.a(v7.c(p.a.c(this.f278365a.hashCode() * 31, 31, this.f278366b), 31, this.f278367c), 31, this.d);
        String str = this.e;
        int iHashCode = (this.f278368g.hashCode() + ((this.f.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        LocalDate localDate = this.f278369h;
        return iHashCode + (localDate != null ? localDate.hashCode() : 0);
    }
}
