package uc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ju3.e f278981a;

    public b(ju3.e action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f278981a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f278981a == ((b) obj2).f278981a;
    }

    public final int hashCode() {
        return this.f278981a.hashCode();
    }
}
