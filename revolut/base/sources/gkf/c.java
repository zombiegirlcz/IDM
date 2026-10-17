package gkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v61.h f144379a;

    public c(v61.h splittedBill) {
        Intrinsics.checkNotNullParameter(splittedBill, "splittedBill");
        this.f144379a = splittedBill;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f144379a, ((c) obj2).f144379a);
    }

    public final int hashCode() {
        return this.f144379a.hashCode();
    }
}
