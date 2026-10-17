package w38;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements aii.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountDescriptor$Value.Main f294175a;

    public f(ProductAccountDescriptor$Value.Main descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f294175a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f294175a.equals(((f) obj2).f294175a);
    }

    public final int hashCode() {
        return this.f294175a.hashCode();
    }
}
