package q0h;

import kotlin.jvm.internal.Intrinsics;
import xzg.v;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f241278a;

    public j(v asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f241278a = asset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f241278a, ((j) obj2).f241278a);
    }

    public final int hashCode() {
        return this.f241278a.hashCode() * 31;
    }
}
