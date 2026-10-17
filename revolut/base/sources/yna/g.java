package yna;

import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f315338a;

    public g(z unreadCountState) {
        Intrinsics.checkNotNullParameter(unreadCountState, "unreadCountState");
        this.f315338a = unreadCountState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f315338a, ((g) obj2).f315338a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f315338a.hashCode() * 31);
    }
}
