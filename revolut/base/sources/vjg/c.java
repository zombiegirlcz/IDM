package vjg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f289740a;

    public c(List countryCodes) {
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        this.f289740a = countryCodes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f289740a, ((c) obj2).f289740a);
    }

    public final int hashCode() {
        return this.f289740a.hashCode();
    }
}
