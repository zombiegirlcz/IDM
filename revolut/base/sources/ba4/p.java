package ba4;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f13907a;

    public p(Pair documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f13907a = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f13907a, ((p) obj2).f13907a);
    }

    public final int hashCode() {
        return this.f13907a.hashCode();
    }
}
