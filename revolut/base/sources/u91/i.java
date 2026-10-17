package u91;

import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f278359c;
    public final LocalDate d;
    public final String e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f278360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f278361h;
    public final List i;

    public i(String id10, String name, dj0.d amount, LocalDate date, String str, p type, n state, LocalDate localDate, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f278357a = id10;
        this.f278358b = name;
        this.f278359c = amount;
        this.d = date;
        this.e = str;
        this.f = type;
        this.f278360g = state;
        this.f278361h = localDate;
        this.i = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f278357a, iVar.f278357a) && Intrinsics.f(this.f278358b, iVar.f278358b) && Intrinsics.f(this.f278359c, iVar.f278359c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && this.f == iVar.f && this.f278360g == iVar.f278360g && Intrinsics.f(this.f278361h, iVar.f278361h) && Intrinsics.f(this.i, iVar.i);
    }

    public final int hashCode() {
        int iA = y.a(v7.c(p.a.c(this.f278357a.hashCode() * 31, 31, this.f278358b), 31, this.f278359c), 31, this.d);
        String str = this.e;
        int iHashCode = (this.f278360g.hashCode() + ((this.f.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        LocalDate localDate = this.f278361h;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        List list = this.i;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
