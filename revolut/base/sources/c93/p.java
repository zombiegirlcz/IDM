package c93;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f22295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f22296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f22297c;
    public final LocalDate d;
    public final String e;
    public final Map f;

    public p(r state, dj0.d dVar, LocalDate localDate, LocalDate localDate2, String str, Map map) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f22295a = state;
        this.f22296b = dVar;
        this.f22297c = localDate;
        this.d = localDate2;
        this.e = str;
        this.f = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f22295a == pVar.f22295a && Intrinsics.f(this.f22296b, pVar.f22296b) && Intrinsics.f(this.f22297c, pVar.f22297c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f22295a.hashCode() * 31;
        dj0.d dVar = this.f22296b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LocalDate localDate = this.f22297c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.d;
        int iHashCode4 = (iHashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }
}
