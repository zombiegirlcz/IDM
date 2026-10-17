package y6a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f311244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f311245c;
    public final String d;

    public a(String encodedValue, String reference, String vpa2, String companyName) {
        Intrinsics.checkNotNullParameter(encodedValue, "encodedValue");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(vpa2, "vpa");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        this.f311243a = encodedValue;
        this.f311244b = reference;
        this.f311245c = vpa2;
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
        return Intrinsics.f(this.f311243a, aVar.f311243a) && Intrinsics.f(this.f311244b, aVar.f311244b) && Intrinsics.f(this.f311245c, aVar.f311245c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f311243a.hashCode() * 31, 31, this.f311244b), 31, this.f311245c);
    }
}
