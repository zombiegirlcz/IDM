package yna;

import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f315335a;

    public f(z helpItemBadge) {
        Intrinsics.checkNotNullParameter(helpItemBadge, "helpItemBadge");
        this.f315335a = helpItemBadge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f315335a, ((f) obj2).f315335a);
    }

    public final int hashCode() {
        return this.f315335a.hashCode();
    }
}
