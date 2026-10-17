package raa;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f252798a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f252798a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f252798a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f252798a, ((g) obj2).f252798a);
    }

    public final int hashCode() {
        return this.f252798a.hashCode();
    }
}
