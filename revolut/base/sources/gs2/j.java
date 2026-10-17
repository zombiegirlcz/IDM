package gs2;

import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentUser f146286a;

    public j(ContentUser contentUser) {
        Intrinsics.checkNotNullParameter(contentUser, "contentUser");
        this.f146286a = contentUser;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f146286a, ((j) obj2).f146286a);
    }

    public final int hashCode() {
        return this.f146286a.hashCode();
    }
}
