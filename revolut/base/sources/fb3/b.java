package fb3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f133435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f133436c;

    public b(String storeId, double d, double d5) {
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        this.f133434a = storeId;
        this.f133435b = d;
        this.f133436c = d5;
    }

    @Override // fb3.c
    public final double a() {
        return this.f133435b;
    }

    @Override // fb3.c
    public final double b() {
        return this.f133436c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f133434a, bVar.f133434a) && Double.compare(this.f133435b, bVar.f133435b) == 0 && Double.compare(this.f133436c, bVar.f133436c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f133436c) + m72.b.c(this.f133434a.hashCode() * 31, this.f133435b, 31);
    }
}
