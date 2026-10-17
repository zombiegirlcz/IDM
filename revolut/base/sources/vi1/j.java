package vi1;

import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289506a;

    public j(String selectedCity) {
        Intrinsics.checkNotNullParameter(selectedCity, "selectedCity");
        this.f289506a = selectedCity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f289506a, ((j) obj2).f289506a);
    }

    public final int hashCode() {
        return this.f289506a.hashCode();
    }
}
