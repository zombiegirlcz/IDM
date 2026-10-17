package nj5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wk5.a f216367c;

    public b(String fullAddress, String currencyCode, wk5.a aVar) {
        Intrinsics.checkNotNullParameter(fullAddress, "fullAddress");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f216365a = fullAddress;
        this.f216366b = currencyCode;
        this.f216367c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f216365a, bVar.f216365a) && Intrinsics.f(this.f216366b, bVar.f216366b) && this.f216367c == bVar.f216367c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f216365a.hashCode() * 31, 31, this.f216366b);
        wk5.a aVar = this.f216367c;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
