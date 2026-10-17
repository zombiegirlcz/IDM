package i4b;

import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExpiryDate f158365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2b.a f158366b;

    public o(ExpiryDate expiryDate, e2b.a orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f158365a = expiryDate;
        this.f158366b = orderType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f158365a, oVar.f158365a) && this.f158366b == oVar.f158366b;
    }

    public final int hashCode() {
        ExpiryDate expiryDate = this.f158365a;
        return this.f158366b.hashCode() + ((expiryDate == null ? 0 : expiryDate.hashCode()) * 31);
    }
}
