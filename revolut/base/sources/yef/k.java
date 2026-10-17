package yef;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f312921a;

    public k(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f312921a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f312921a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f312921a.equals(((k) obj2).f312921a);
    }

    public final int hashCode() {
        return this.f312921a.hashCode();
    }
}
