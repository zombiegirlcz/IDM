package ft4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f137917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f137918b;

    public l(k creditContent, k kVar) {
        Intrinsics.checkNotNullParameter(creditContent, "creditContent");
        this.f137917a = creditContent;
        this.f137918b = kVar;
    }

    public static l a(l lVar, k creditContent, k kVar, int i) {
        if ((i & 1) != 0) {
            creditContent = lVar.f137917a;
        }
        if ((i & 2) != 0) {
            kVar = lVar.f137918b;
        }
        Intrinsics.checkNotNullParameter(creditContent, "creditContent");
        return new l(creditContent, kVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f137917a, lVar.f137917a) && Intrinsics.f(this.f137918b, lVar.f137918b);
    }

    public final int hashCode() {
        int iHashCode = this.f137917a.hashCode() * 31;
        k kVar = this.f137918b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }
}
