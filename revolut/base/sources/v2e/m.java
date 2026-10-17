package v2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285720a;

    public m(String voucherProductGroup) {
        Intrinsics.checkNotNullParameter(voucherProductGroup, "voucherProductGroup");
        this.f285720a = voucherProductGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f285720a, ((m) obj2).f285720a);
    }

    public final int hashCode() {
        return this.f285720a.hashCode();
    }
}
