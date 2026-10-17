package fb7;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountDescriptor$Value f133491a;

    public o(ProductAccountDescriptor$Value descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f133491a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f133491a, ((o) obj2).f133491a);
    }

    public final int hashCode() {
        return this.f133491a.hashCode();
    }
}
