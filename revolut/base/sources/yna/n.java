package yna;

import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f315362a;

    public n(z unreadCountState) {
        Intrinsics.checkNotNullParameter(unreadCountState, "unreadCountState");
        this.f315362a = unreadCountState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f315362a, ((n) obj2).f315362a);
    }

    public final int hashCode() {
        return this.f315362a.hashCode();
    }
}
