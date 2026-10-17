package o0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221244a;

    public n(String purpose) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        this.f221244a = purpose;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f221244a, ((n) obj2).f221244a);
    }

    public final int hashCode() {
        return this.f221244a.hashCode();
    }
}
