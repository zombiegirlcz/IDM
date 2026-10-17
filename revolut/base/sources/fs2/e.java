package fs2;

import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentUser f137556a;

    public e(ContentUser contentUser) {
        Intrinsics.checkNotNullParameter(contentUser, "contentUser");
        this.f137556a = contentUser;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f137556a, ((e) obj2).f137556a);
    }

    public final int hashCode() {
        return this.f137556a.hashCode();
    }
}
