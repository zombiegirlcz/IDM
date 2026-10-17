package fth;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138024a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f138024a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f138024a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f138024a, ((g) obj2).f138024a);
    }

    public final int hashCode() {
        return this.f138024a.hashCode();
    }
}
