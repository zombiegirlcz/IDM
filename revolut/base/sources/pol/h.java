package pol;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f238051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f238052c;
    public final String d;

    public h(int i, String phone, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f238050a = phone;
        this.f238051b = i;
        this.f238052c = countryCode;
        this.d = a0.d.r(hx7.a.J(i), phone);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f238050a, hVar.f238050a) && this.f238051b == hVar.f238051b && Intrinsics.f(this.f238052c, hVar.f238052c);
    }

    public final int hashCode() {
        return this.f238052c.f297794a.hashCode() + j6.a.b(this.f238051b, this.f238050a.hashCode() * 31, 31);
    }
}
