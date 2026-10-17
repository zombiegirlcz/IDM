package nl4;

import hha.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f216998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f216999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f217000c;

    public g(e feeWaiverProgress, w0 planTier, boolean z) {
        Intrinsics.checkNotNullParameter(feeWaiverProgress, "feeWaiverProgress");
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        this.f216998a = feeWaiverProgress;
        this.f216999b = planTier;
        this.f217000c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f216998a, gVar.f216998a) && this.f216999b == gVar.f216999b && this.f217000c == gVar.f217000c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217000c) + ((this.f216999b.hashCode() + (this.f216998a.hashCode() * 31)) * 31);
    }
}
