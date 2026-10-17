package g2l;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140142a;

    public k(String partnerId) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        this.f140142a = partnerId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f140142a, ((k) obj2).f140142a);
    }

    public final int hashCode() {
        return this.f140142a.hashCode();
    }
}
