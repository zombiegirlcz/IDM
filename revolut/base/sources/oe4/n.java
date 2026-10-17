package oe4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224530a;

    public n(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f224530a = itemId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f224530a, ((n) obj2).f224530a);
    }

    public final int hashCode() {
        return this.f224530a.hashCode();
    }
}
