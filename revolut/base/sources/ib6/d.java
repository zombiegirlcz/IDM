package ib6;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yvh.b f160094a;

    public d(yvh.b spareChange) {
        Intrinsics.checkNotNullParameter(spareChange, "spareChange");
        this.f160094a = spareChange;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f160094a, ((d) obj2).f160094a);
    }

    public final int hashCode() {
        return this.f160094a.hashCode();
    }
}
