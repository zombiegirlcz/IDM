package kn6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186023a;

    public l(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f186023a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f186023a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f186023a, ((l) obj2).f186023a);
    }

    public final int hashCode() {
        return this.f186023a.hashCode();
    }
}
