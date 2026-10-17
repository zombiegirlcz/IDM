package t1e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f267259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267260b;

    public f0() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f267259a, f0Var.f267259a) && Intrinsics.f(this.f267260b, f0Var.f267260b);
    }

    public final int hashCode() {
        Integer num = this.f267259a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f267260b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public f0(Integer num, String str) {
        this.f267259a = num;
        this.f267260b = str;
    }
}
