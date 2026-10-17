package ou3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f229794a;

    public i(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f229794a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f229794a.equals(((i) obj2).f229794a);
    }

    public final int hashCode() {
        return this.f229794a.hashCode();
    }
}
