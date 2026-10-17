package ii4;

import hs3.u1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f161532a;

    public k(u1 metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f161532a = metadata;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f161532a, ((k) obj2).f161532a);
    }

    public final int hashCode() {
        return this.f161532a.hashCode();
    }
}
