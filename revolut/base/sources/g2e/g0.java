package g2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f139987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f139988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139989c;

    /* JADX WARN: Illegal instructions before constructor call */
    public g0() {
        Integer num = null;
        this(7, num, num);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f139987a, g0Var.f139987a) && Intrinsics.f(this.f139988b, g0Var.f139988b) && Intrinsics.f(this.f139989c, g0Var.f139989c);
    }

    public final int hashCode() {
        Integer num = this.f139987a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f139988b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f139989c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ g0(int i, Integer num, Integer num2) {
        this((String) null, (i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }

    public g0(String str, Integer num, Integer num2) {
        this.f139987a = num;
        this.f139988b = num2;
        this.f139989c = str;
    }
}
