package z0h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f318524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f318525b;

    public l(b footerVariant) {
        r1 parcelWrapStrategy = r1.NONE;
        Intrinsics.checkNotNullParameter(footerVariant, "footerVariant");
        Intrinsics.checkNotNullParameter(parcelWrapStrategy, "parcelWrapStrategy");
        this.f318524a = footerVariant;
        this.f318525b = parcelWrapStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f318524a == lVar.f318524a && this.f318525b == lVar.f318525b;
    }

    public final int hashCode() {
        return this.f318525b.hashCode() + (this.f318524a.hashCode() * 31);
    }
}
