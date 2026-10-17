package pmh;

import jel.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f237571a;

    public c(w fundClass) {
        Intrinsics.checkNotNullParameter(fundClass, "fundClass");
        this.f237571a = fundClass;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f237571a == ((c) obj2).f237571a;
    }

    public final int hashCode() {
        return this.f237571a.hashCode();
    }
}
