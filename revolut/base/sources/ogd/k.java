package ogd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f225123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f225124b;

    public k(m type, l lVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f225123a = type;
        this.f225124b = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f225123a == kVar.f225123a && this.f225124b == kVar.f225124b;
    }

    public final int hashCode() {
        int iHashCode = this.f225123a.hashCode() * 31;
        l lVar = this.f225124b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}
