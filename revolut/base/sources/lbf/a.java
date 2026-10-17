package lbf;

import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f193664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193665c;
    public final Period d;
    public final boolean e;

    public a(String code, o type, String str, Period period, boolean z) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f193663a = code;
        this.f193664b = type;
        this.f193665c = str;
        this.d = period;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f193663a, aVar.f193663a) && this.f193664b == aVar.f193664b && Intrinsics.f(this.f193665c, aVar.f193665c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f193664b.hashCode() + (this.f193663a.hashCode() * 31)) * 31;
        String str = this.f193665c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Period period = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (period != null ? period.hashCode() : 0)) * 31);
    }
}
