package b0d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11651b;

    public b(String incomeFrequency, String str) {
        Intrinsics.checkNotNullParameter(incomeFrequency, "incomeFrequency");
        this.f11650a = incomeFrequency;
        this.f11651b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f11650a, bVar.f11650a) && Intrinsics.f(this.f11651b, bVar.f11651b);
    }

    public final int hashCode() {
        int iHashCode = this.f11650a.hashCode() * 31;
        String str = this.f11651b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
