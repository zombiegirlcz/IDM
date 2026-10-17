package omh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f226849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f226850b;

    public c(ArrayList swipeableAssets, List commodities) {
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        this.f226849a = commodities;
        this.f226850b = swipeableAssets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f226849a, cVar.f226849a) && this.f226850b.equals(cVar.f226850b);
    }

    public final int hashCode() {
        return this.f226850b.hashCode() + (this.f226849a.hashCode() * 31);
    }
}
