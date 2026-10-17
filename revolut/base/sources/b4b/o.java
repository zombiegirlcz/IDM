package b4b;

import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExpiryDate f12235a;

    public o(ExpiryDate expiryDate) {
        this.f12235a = expiryDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f12235a, ((o) obj2).f12235a);
    }

    public final int hashCode() {
        ExpiryDate expiryDate = this.f12235a;
        if (expiryDate == null) {
            return 0;
        }
        return expiryDate.hashCode();
    }
}
