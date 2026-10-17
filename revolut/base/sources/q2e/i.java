package q2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241592a;

    public i(String voucherProductGroup) {
        Intrinsics.checkNotNullParameter(voucherProductGroup, "voucherProductGroup");
        this.f241592a = voucherProductGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f241592a, ((i) obj2).f241592a);
    }

    public final int hashCode() {
        return this.f241592a.hashCode();
    }
}
