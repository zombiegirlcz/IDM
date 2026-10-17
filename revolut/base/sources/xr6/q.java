package xr6;

import kotlin.jvm.internal.Intrinsics;
import xr6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends p.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f308285a;

    public q(r status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f308285a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f308285a == ((q) obj2).f308285a;
    }

    public final int hashCode() {
        return this.f308285a.hashCode();
    }
}
