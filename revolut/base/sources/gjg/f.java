package gjg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends op5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144282a;

    public f(String merchantId) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        this.f144282a = merchantId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f144282a, ((f) obj2).f144282a);
    }

    public final int hashCode() {
        return this.f144282a.hashCode();
    }
}
