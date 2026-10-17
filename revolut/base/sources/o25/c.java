package o25;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu3.e f221489a;

    public c(vu3.e action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f221489a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f221489a, ((c) obj2).f221489a);
    }

    public final int hashCode() {
        return this.f221489a.hashCode();
    }
}
