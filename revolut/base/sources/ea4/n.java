package ea4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124137a;

    public n(String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        this.f124137a = documentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f124137a, ((n) obj2).f124137a);
    }

    public final int hashCode() {
        return this.f124137a.hashCode();
    }
}
