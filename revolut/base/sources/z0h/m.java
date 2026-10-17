package z0h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f318531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f318532b;

    public m(b footerVariant, r1 parcelWrapStrategy) {
        Intrinsics.checkNotNullParameter(footerVariant, "footerVariant");
        Intrinsics.checkNotNullParameter(parcelWrapStrategy, "parcelWrapStrategy");
        this.f318531a = footerVariant;
        this.f318532b = parcelWrapStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f318531a == mVar.f318531a && this.f318532b == mVar.f318532b;
    }

    public final int hashCode() {
        return this.f318532b.hashCode() + (this.f318531a.hashCode() * 31);
    }
}
