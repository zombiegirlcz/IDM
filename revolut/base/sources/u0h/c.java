package u0h;

import kotlin.jvm.internal.Intrinsics;
import xzg.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f276200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f276201b;

    public c(h0 assets, boolean z) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f276200a = assets;
        this.f276201b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f276200a, cVar.f276200a) && this.f276201b == cVar.f276201b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f276201b) + (this.f276200a.hashCode() * 31);
    }
}
