package x88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f303298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f303299c;

    public b(String juniorId, String savingProductId, boolean z) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(savingProductId, "savingProductId");
        this.f303297a = juniorId;
        this.f303298b = z;
        this.f303299c = savingProductId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f303297a, bVar.f303297a) && this.f303298b == bVar.f303298b && Intrinsics.f(this.f303299c, bVar.f303299c);
    }

    public final int hashCode() {
        return this.f303299c.hashCode() + j6.a.c(this.f303297a.hashCode() * 31, 31, this.f303298b);
    }
}
