package qci;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f244789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244790b;

    public b(wi0.b countryCode, String countryName) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        this.f244789a = countryCode;
        this.f244790b = countryName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f244789a, bVar.f244789a) && Intrinsics.f(this.f244790b, bVar.f244790b);
    }

    public final int hashCode() {
        return this.f244790b.hashCode() + (this.f244789a.f297794a.hashCode() * 31);
    }
}
