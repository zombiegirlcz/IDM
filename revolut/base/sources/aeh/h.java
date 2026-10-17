package aeh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3592b;

    public h(ArrayList swipeableAssets, List assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        this.f3591a = assets;
        this.f3592b = swipeableAssets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f3591a, hVar.f3591a) && this.f3592b.equals(hVar.f3592b);
    }

    public final int hashCode() {
        return this.f3592b.hashCode() + (this.f3591a.hashCode() * 31);
    }
}
