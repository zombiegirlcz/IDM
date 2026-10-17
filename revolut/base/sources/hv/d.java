package hv;

import kotlin.jvm.internal.Intrinsics;
import xv.l;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f155780a;

    public d(l detectorResult) {
        Intrinsics.checkNotNullParameter(detectorResult, "detectorResult");
        this.f155780a = detectorResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f155780a, ((d) obj2).f155780a);
    }

    public final int hashCode() {
        return this.f155780a.hashCode();
    }
}
