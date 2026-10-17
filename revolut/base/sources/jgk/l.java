package jgk;

import hha.i0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f174079a;

    public l(i0 discount) {
        Intrinsics.checkNotNullParameter(discount, "discount");
        this.f174079a = discount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f174079a, ((l) obj2).f174079a);
    }

    public final int hashCode() {
        return this.f174079a.hashCode();
    }
}
