package h1k;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f148596a;

    public i(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f148596a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f148596a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f148596a.equals(((i) obj2).f148596a);
    }

    public final int hashCode() {
        return this.f148596a.hashCode();
    }
}
