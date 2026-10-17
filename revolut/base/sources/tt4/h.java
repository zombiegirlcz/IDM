package tt4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f274217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f274218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f274219c;

    public h(int i, dj0.d maxSecuredLimit, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(maxSecuredLimit, "maxSecuredLimit");
        this.f274217a = countryCode;
        this.f274218b = i;
        this.f274219c = maxSecuredLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f274217a, hVar.f274217a) && this.f274218b == hVar.f274218b && Intrinsics.f(this.f274219c, hVar.f274219c);
    }

    public final int hashCode() {
        return this.f274219c.hashCode() + j6.a.b(this.f274218b, this.f274217a.f297794a.hashCode() * 31, 31);
    }
}
