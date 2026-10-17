package o0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221241a;

    public k(String occupation) {
        Intrinsics.checkNotNullParameter(occupation, "occupation");
        this.f221241a = occupation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f221241a, ((k) obj2).f221241a);
    }

    public final int hashCode() {
        return this.f221241a.hashCode();
    }
}
