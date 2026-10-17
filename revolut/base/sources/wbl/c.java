package wbl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f296253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kel.n f296254b;

    public c(a asset, kel.n holding) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(holding, "holding");
        this.f296253a = asset;
        this.f296254b = holding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f296253a, cVar.f296253a) && Intrinsics.f(this.f296254b, cVar.f296254b);
    }

    public final int hashCode() {
        return this.f296254b.hashCode() + (this.f296253a.hashCode() * 31);
    }
}
