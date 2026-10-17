package vrl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4l.r0 f291682b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(k4l.r0 orderType) {
        super(false);
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f291682b = orderType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f291682b == ((v) obj2).f291682b;
    }

    public final int hashCode() {
        return this.f291682b.hashCode();
    }
}
