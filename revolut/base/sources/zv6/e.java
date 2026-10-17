package zv6;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325578a;

    public e(String customerId) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        this.f325578a = customerId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f325578a, ((e) obj2).f325578a);
    }

    public final int hashCode() {
        return this.f325578a.hashCode();
    }
}
