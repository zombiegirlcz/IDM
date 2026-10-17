package uyd;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f284243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f284244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284245c;

    public t(String str, LocalDate fromDate, LocalDate toDate) {
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        Intrinsics.checkNotNullParameter(toDate, "toDate");
        this.f284243a = fromDate;
        this.f284244b = toDate;
        this.f284245c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f284243a, tVar.f284243a) && Intrinsics.f(this.f284244b, tVar.f284244b) && Intrinsics.f(this.f284245c, tVar.f284245c);
    }

    public final int hashCode() {
        int iA = wp5.y.a(this.f284243a.hashCode() * 31, 31, this.f284244b);
        String str = this.f284245c;
        return iA + (str == null ? 0 : str.hashCode());
    }
}
