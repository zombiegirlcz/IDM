package i71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159048c;
    public final String d;

    public a(String encodedValue, String reference, String vpa2, String companyName) {
        Intrinsics.checkNotNullParameter(encodedValue, "encodedValue");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(vpa2, "vpa");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        this.f159046a = encodedValue;
        this.f159047b = reference;
        this.f159048c = vpa2;
        this.d = companyName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f159046a, aVar.f159046a) && Intrinsics.f(this.f159047b, aVar.f159047b) && Intrinsics.f(this.f159048c, aVar.f159048c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f159046a.hashCode() * 31, 31, this.f159047b), 31, this.f159048c);
    }
}
