package sfe;

import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountDescriptor$Value f262403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductAccountMetadata f262404b;

    public b(ProductAccountDescriptor$Value descriptor, ProductAccountMetadata metadata) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f262403a = descriptor;
        this.f262404b = metadata;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f262403a, bVar.f262403a) && Intrinsics.f(this.f262404b, bVar.f262404b);
    }

    public final int hashCode() {
        return this.f262404b.hashCode() + (this.f262403a.hashCode() * 31);
    }
}
