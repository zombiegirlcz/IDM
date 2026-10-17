package f3b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f131920c;

    public a(String id10, String str, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f131918a = id10;
        this.f131919b = str;
        this.f131920c = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f131918a, aVar.f131918a) && Intrinsics.f(this.f131919b, aVar.f131919b) && Intrinsics.f(this.f131920c, aVar.f131920c);
    }

    public final int hashCode() {
        int iHashCode = this.f131918a.hashCode() * 31;
        String str = this.f131919b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.f131920c;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
