package nnj;

import dej.p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f217691a;

    public i(p0 selectedCancellationReason) {
        Intrinsics.checkNotNullParameter(selectedCancellationReason, "selectedCancellationReason");
        this.f217691a = selectedCancellationReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f217691a == ((i) obj2).f217691a;
    }

    public final int hashCode() {
        return this.f217691a.hashCode();
    }
}
