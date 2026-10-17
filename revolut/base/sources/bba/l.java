package bba;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14208a;

    public l(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f14208a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f14208a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f14208a, ((l) obj2).f14208a);
    }

    public final int hashCode() {
        return this.f14208a.hashCode();
    }
}
