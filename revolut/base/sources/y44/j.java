package y44;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final du3.a f310779a;

    public j(du3.a document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f310779a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f310779a, ((j) obj2).f310779a);
    }

    public final int hashCode() {
        return this.f310779a.hashCode();
    }
}
