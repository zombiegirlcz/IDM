package gjg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends op5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144283a;

    public g(String merchantId) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        this.f144283a = merchantId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f144283a, ((g) obj2).f144283a);
    }

    public final int hashCode() {
        return this.f144283a.hashCode();
    }
}
