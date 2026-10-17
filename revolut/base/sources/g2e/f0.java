package g2e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f139985c;
    public final Integer d;
    public final String e;

    public f0() {
        this(31, (Integer) null, (Integer) null, (String) null, (List) null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f139983a, f0Var.f139983a) && Intrinsics.f(this.f139984b, f0Var.f139984b) && Intrinsics.f(this.f139985c, f0Var.f139985c) && Intrinsics.f(this.d, f0Var.d) && Intrinsics.f(this.e, f0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f139983a.hashCode() * 31;
        String str = this.f139984b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f139985c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public f0(List filter, String str, Integer num, Integer num2, String str2) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f139983a = filter;
        this.f139984b = str;
        this.f139985c = num;
        this.d = num2;
        this.e = str2;
    }

    public f0(int i, Integer num, Integer num2, String str, List list) {
        this((i & 1) != 0 ? zhm.f0.f322471a : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (String) null);
    }
}
