package fuk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f138259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f138260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f138261c;

    public n(int i, Integer num, Integer num2) {
        this.f138259a = i;
        this.f138260b = num;
        this.f138261c = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f138259a == nVar.f138259a && Intrinsics.f(this.f138260b, nVar.f138260b) && Intrinsics.f(this.f138261c, nVar.f138261c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f138259a) * 31;
        Integer num = this.f138260b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f138261c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
