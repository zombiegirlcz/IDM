package mg3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f205158b;

    public c(String productId, b status) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f205157a = productId;
        this.f205158b = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f205157a, cVar.f205157a) && this.f205158b == cVar.f205158b;
    }

    public final int hashCode() {
        return this.f205158b.hashCode() + (this.f205157a.hashCode() * 31);
    }
}
