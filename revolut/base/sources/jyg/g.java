package jyg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f179433a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f179433a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f179433a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f179433a, ((g) obj2).f179433a);
    }

    public final int hashCode() {
        return this.f179433a.hashCode();
    }
}
