package fb7;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountDescriptor$Value f133498a;

    public v(ProductAccountDescriptor$Value descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f133498a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f133498a, ((v) obj2).f133498a);
    }

    public final int hashCode() {
        return this.f133498a.hashCode();
    }
}
