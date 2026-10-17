package x0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301594a;

    public n(String externalCardId) {
        Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
        this.f301594a = externalCardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f301594a, ((n) obj2).f301594a);
    }

    public final int hashCode() {
        return this.f301594a.hashCode();
    }
}
