package gs2;

import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentUser f146288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kr2.e f146289b;

    public l(ContentUser contentUser, kr2.e merchant) {
        Intrinsics.checkNotNullParameter(contentUser, "contentUser");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        this.f146288a = contentUser;
        this.f146289b = merchant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f146288a, lVar.f146288a) && Intrinsics.f(this.f146289b, lVar.f146289b);
    }

    public final int hashCode() {
        return this.f146289b.hashCode() + (this.f146288a.hashCode() * 31);
    }
}
