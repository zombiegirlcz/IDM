package cxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f109910a;

    public a(dj0.d minAmount) {
        Intrinsics.checkNotNullParameter(minAmount, "minAmount");
        this.f109910a = minAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f109910a, ((a) obj2).f109910a);
    }

    public final int hashCode() {
        return this.f109910a.hashCode();
    }
}
