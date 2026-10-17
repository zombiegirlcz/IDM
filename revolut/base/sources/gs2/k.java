package gs2;

import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentUser f146287a;

    public k(ContentUser contentUser) {
        Intrinsics.checkNotNullParameter(contentUser, "contentUser");
        this.f146287a = contentUser;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f146287a, ((k) obj2).f146287a);
    }

    public final int hashCode() {
        return this.f146287a.hashCode();
    }
}
