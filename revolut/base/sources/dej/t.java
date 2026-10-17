package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f113649a;

    public t(dj0.d topupAmount) {
        Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
        this.f113649a = topupAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f113649a, ((t) obj2).f113649a);
    }

    public final int hashCode() {
        return this.f113649a.hashCode();
    }
}
