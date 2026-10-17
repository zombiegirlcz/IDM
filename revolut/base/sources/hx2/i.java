package hx2;

import h93.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f156367a;

    public i(l0 subProductType) {
        Intrinsics.checkNotNullParameter(subProductType, "subProductType");
        this.f156367a = subProductType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f156367a == ((i) obj2).f156367a;
    }

    public final int hashCode() {
        return this.f156367a.hashCode();
    }
}
