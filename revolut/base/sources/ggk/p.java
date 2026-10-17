package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f143769b;

    public p(String imageUrl, r rVar) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f143768a = imageUrl;
        this.f143769b = rVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f143768a, pVar.f143768a) && Intrinsics.f(this.f143769b, pVar.f143769b);
    }

    public final int hashCode() {
        int iHashCode = this.f143768a.hashCode() * 31;
        r rVar = this.f143769b;
        return iHashCode + (rVar == null ? 0 : rVar.hashCode());
    }
}
