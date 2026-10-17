package bjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f16172c;

    public j(int i, String phoneNumber, wi0.b phoneCountryCode) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(phoneCountryCode, "phoneCountryCode");
        this.f16170a = phoneNumber;
        this.f16171b = i;
        this.f16172c = phoneCountryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f16170a, jVar.f16170a) && this.f16171b == jVar.f16171b && Intrinsics.f(this.f16172c, jVar.f16172c);
    }

    public final int hashCode() {
        return this.f16172c.f297794a.hashCode() + j6.a.b(this.f16171b, this.f16170a.hashCode() * 31, 31);
    }
}
