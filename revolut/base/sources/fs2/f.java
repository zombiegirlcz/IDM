package fs2;

import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentUser f137557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kr2.e f137558b;

    public f(ContentUser contentUser, kr2.e merchant) {
        Intrinsics.checkNotNullParameter(contentUser, "contentUser");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        this.f137557a = contentUser;
        this.f137558b = merchant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f137557a, fVar.f137557a) && Intrinsics.f(this.f137558b, fVar.f137558b);
    }

    public final int hashCode() {
        return this.f137558b.hashCode() + (this.f137557a.hashCode() * 31);
    }
}
