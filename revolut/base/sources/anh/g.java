package anh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7788b;

    public g(ArrayList swipeableAssets, List assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        this.f7787a = assets;
        this.f7788b = swipeableAssets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f7787a, gVar.f7787a) && this.f7788b.equals(gVar.f7788b);
    }

    public final int hashCode() {
        return this.f7788b.hashCode() + (this.f7787a.hashCode() * 31);
    }
}
