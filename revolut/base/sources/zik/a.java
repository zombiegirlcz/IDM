package zik;

import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Period f322580b;

    public a() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f322579a, aVar.f322579a) && Intrinsics.f(this.f322580b, aVar.f322580b);
    }

    public final int hashCode() {
        String str = this.f322579a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Period period = this.f322580b;
        return iHashCode + (period != null ? period.hashCode() : 0);
    }

    public a(String str, Period period) {
        this.f322579a = str;
        this.f322580b = period;
    }
}
