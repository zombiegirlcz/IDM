package mkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206256a;

    public n(String reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f206256a = reference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f206256a, ((n) obj2).f206256a);
    }

    public final int hashCode() {
        return this.f206256a.hashCode();
    }
}
