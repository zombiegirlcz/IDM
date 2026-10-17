package sd3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc3.d f261815a;

    public i(uc3.d cashbackSourceType) {
        Intrinsics.checkNotNullParameter(cashbackSourceType, "cashbackSourceType");
        this.f261815a = cashbackSourceType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f261815a == ((i) obj2).f261815a;
    }

    public final int hashCode() {
        return this.f261815a.hashCode();
    }
}
