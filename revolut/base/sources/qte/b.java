package qte;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f249098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f249099b;

    public b(dj0.d total, ArrayList breakdown) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f249098a = total;
        this.f249099b = breakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f249098a.equals(bVar.f249098a) && this.f249099b.equals(bVar.f249099b);
    }

    public final int hashCode() {
        return this.f249099b.hashCode() + (this.f249098a.hashCode() * 31);
    }
}
