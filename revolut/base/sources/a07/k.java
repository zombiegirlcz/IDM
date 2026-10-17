package a07;

import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f148a;

    public k(AbstractList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f148a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f148a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f148a, ((k) obj2).f148a);
    }

    public final int hashCode() {
        return this.f148a.hashCode();
    }
}
