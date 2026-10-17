package o5d;

import kotlin.jvm.internal.Intrinsics;
import p5d.f;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f222425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5d.b f222426b;

    public e(f tradeSide, p5d.b swipeableAsset) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(swipeableAsset, "swipeableAsset");
        this.f222425a = tradeSide;
        this.f222426b = swipeableAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f222425a == eVar.f222425a && Intrinsics.f(this.f222426b, eVar.f222426b);
    }

    public final int hashCode() {
        return this.f222426b.hashCode() + (this.f222425a.hashCode() * 31);
    }
}
