package odc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f224446a;

    public h(dj0.d price) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.f224446a = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f224446a, ((h) obj2).f224446a);
    }

    public final int hashCode() {
        return this.f224446a.hashCode();
    }
}
