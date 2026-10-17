package ug9;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg9.b f279989a;

    public d(sg9.b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f279989a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f279989a, ((d) obj2).f279989a);
    }

    public final int hashCode() {
        return this.f279989a.hashCode();
    }
}
