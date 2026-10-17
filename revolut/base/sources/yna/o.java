package yna;

import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f315364a;

    public o(z unreadCountState) {
        Intrinsics.checkNotNullParameter(unreadCountState, "unreadCountState");
        this.f315364a = unreadCountState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f315364a, ((o) obj2).f315364a);
    }

    public final int hashCode() {
        return this.f315364a.hashCode();
    }
}
