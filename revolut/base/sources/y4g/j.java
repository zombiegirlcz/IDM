package y4g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f310928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f310929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f310930c;

    public j(int i, String number, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f310928a = countryCode;
        this.f310929b = i;
        this.f310930c = number;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f310928a, jVar.f310928a) && this.f310929b == jVar.f310929b && Intrinsics.f(this.f310930c, jVar.f310930c);
    }

    public final int hashCode() {
        return this.f310930c.hashCode() + j6.a.b(this.f310929b, this.f310928a.f297794a.hashCode() * 31, 31);
    }
}
