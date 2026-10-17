package sba;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f261520a;

    public e(dj0.d newAmount) {
        Intrinsics.checkNotNullParameter(newAmount, "newAmount");
        this.f261520a = newAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f261520a, ((e) obj2).f261520a);
    }

    public final int hashCode() {
        return this.f261520a.hashCode();
    }
}
