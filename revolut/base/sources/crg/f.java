package crg;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108382a;

    public f(String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        this.f108382a = documentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f108382a, ((f) obj2).f108382a);
    }

    public final int hashCode() {
        return this.f108382a.hashCode();
    }
}
