package odc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f224439a;

    public a(dj0.d price) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.f224439a = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f224439a, ((a) obj2).f224439a);
    }

    public final int hashCode() {
        return this.f224439a.hashCode();
    }
}
