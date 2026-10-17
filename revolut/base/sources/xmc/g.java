package xmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmc.m f307136a;

    public g(zmc.m documentGroup) {
        Intrinsics.checkNotNullParameter(documentGroup, "documentGroup");
        this.f307136a = documentGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f307136a, ((g) obj2).f307136a);
    }

    public final int hashCode() {
        return this.f307136a.hashCode();
    }
}
