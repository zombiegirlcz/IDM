package s1k;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f259152a;

    public i(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f259152a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f259152a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f259152a.equals(((i) obj2).f259152a);
    }

    public final int hashCode() {
        return this.f259152a.hashCode();
    }
}
