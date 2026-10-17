package hk9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f152896a;

    public w(dj0.d maximumAmount) {
        Intrinsics.checkNotNullParameter(maximumAmount, "maximumAmount");
        this.f152896a = maximumAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f152896a, ((w) obj2).f152896a);
    }

    public final int hashCode() {
        return this.f152896a.hashCode();
    }
}
