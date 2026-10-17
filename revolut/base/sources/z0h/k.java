package z0h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f318519a;

    public k(b footerVariant) {
        Intrinsics.checkNotNullParameter(footerVariant, "footerVariant");
        this.f318519a = footerVariant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f318519a == ((k) obj2).f318519a;
    }

    public final int hashCode() {
        return this.f318519a.hashCode();
    }
}
