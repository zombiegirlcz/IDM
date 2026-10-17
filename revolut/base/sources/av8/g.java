package av8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9946a;

    public g(List docs) {
        Intrinsics.checkNotNullParameter(docs, "docs");
        this.f9946a = docs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f9946a, ((g) obj2).f9946a);
    }

    public final int hashCode() {
        return this.f9946a.hashCode();
    }
}
