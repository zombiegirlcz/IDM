package w2a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293989a;

    public g(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f293989a = categoryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f293989a, ((g) obj2).f293989a);
    }

    public final int hashCode() {
        return this.f293989a.hashCode();
    }
}
