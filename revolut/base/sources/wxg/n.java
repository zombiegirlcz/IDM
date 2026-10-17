package wxg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f300988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f300989b;

    public n(dj0.d totalValue, List assets) {
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f300988a = totalValue;
        this.f300989b = assets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f300988a, nVar.f300988a) && Intrinsics.f(this.f300989b, nVar.f300989b);
    }

    public final int hashCode() {
        return this.f300989b.hashCode() + (this.f300988a.hashCode() * 31);
    }
}
