package y3b;

import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExpiryDate f310689a;

    public e(ExpiryDate expiryDate) {
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        this.f310689a = expiryDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f310689a, ((e) obj2).f310689a);
    }

    public final int hashCode() {
        return this.f310689a.hashCode();
    }
}
