package xel;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304711a;

    public d(List documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f304711a = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f304711a, ((d) obj2).f304711a);
    }

    public final int hashCode() {
        return this.f304711a.hashCode();
    }
}
