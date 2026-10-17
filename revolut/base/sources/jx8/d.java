package jx8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx8.a f179092a;

    public d(hx8.a errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        this.f179092a = errorType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f179092a == ((d) obj2).f179092a;
    }

    public final int hashCode() {
        return this.f179092a.hashCode();
    }
}
