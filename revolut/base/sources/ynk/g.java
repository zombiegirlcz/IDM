package ynk;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f315500a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f315500a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f315500a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f315500a, ((g) obj2).f315500a);
    }

    public final int hashCode() {
        return this.f315500a.hashCode();
    }
}
