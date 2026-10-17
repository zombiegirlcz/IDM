package gnh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knh.h f145002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f145003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f145004c;

    public i(knh.h assetListSource, List assets, List swipeableAssets) {
        Intrinsics.checkNotNullParameter(assetListSource, "assetListSource");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        this.f145002a = assetListSource;
        this.f145003b = assets;
        this.f145004c = swipeableAssets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f145002a, iVar.f145002a) && Intrinsics.f(this.f145003b, iVar.f145003b) && Intrinsics.f(this.f145004c, iVar.f145004c);
    }

    public final int hashCode() {
        return this.f145004c.hashCode() + p.a.d(this.f145002a.hashCode() * 31, 31, this.f145003b);
    }
}
