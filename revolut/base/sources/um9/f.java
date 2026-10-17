package um9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281272a;

    public f(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f281272a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f281272a, ((f) obj2).f281272a);
    }

    public final int hashCode() {
        return this.f281272a.hashCode();
    }
}
