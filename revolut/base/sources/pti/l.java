package pti;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f239744a;

    public l(dj0.d amountLacking) {
        Intrinsics.checkNotNullParameter(amountLacking, "amountLacking");
        this.f239744a = amountLacking;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f239744a, ((l) obj2).f239744a);
    }

    public final int hashCode() {
        return this.f239744a.hashCode();
    }
}
