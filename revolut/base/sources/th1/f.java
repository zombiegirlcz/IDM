package th1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271246a;

    public f(String postalCode) {
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        this.f271246a = postalCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f271246a, ((f) obj2).f271246a);
    }

    public final int hashCode() {
        return this.f271246a.hashCode();
    }
}
