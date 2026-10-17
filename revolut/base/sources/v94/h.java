package v94;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286976a;

    public h(String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        this.f286976a = documentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f286976a, ((h) obj2).f286976a);
    }

    public final int hashCode() {
        return this.f286976a.hashCode();
    }
}
