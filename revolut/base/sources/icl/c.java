package icl;

import a0.d;
import eel.i;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f160308c;
    public final i d;
    public final ko3.b e;
    public final BigDecimal f;

    public c(String ref2, String period, long j2, i valueType, ko3.b bVar, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        this.f160306a = ref2;
        this.f160307b = period;
        this.f160308c = j2;
        this.d = valueType;
        this.e = bVar;
        this.f = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f160306a, cVar.f160306a) && Intrinsics.f(this.f160307b, cVar.f160307b) && this.f160308c == cVar.f160308c && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + d.c(p.a.c(this.f160306a.hashCode() * 31, 31, this.f160307b), 31, this.f160308c)) * 31;
        ko3.b bVar = this.e;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        BigDecimal bigDecimal = this.f;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
