package vm3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f290524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f290525b;

    public c(int i, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f290524a = countryCode;
        this.f290525b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f290524a, cVar.f290524a) && this.f290525b == cVar.f290525b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f290525b) + (this.f290524a.f297794a.hashCode() * 31);
    }
}
