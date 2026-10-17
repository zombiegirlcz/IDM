package yna;

import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f315346a;

    public i(z unreadCountState) {
        Intrinsics.checkNotNullParameter(unreadCountState, "unreadCountState");
        this.f315346a = unreadCountState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f315346a, ((i) obj2).f315346a);
    }

    public final int hashCode() {
        return this.f315346a.hashCode();
    }
}
