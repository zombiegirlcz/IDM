package ip7;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f167669a;

    public g(Set selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        this.f167669a = selectedOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f167669a, ((g) obj2).f167669a);
    }

    public final int hashCode() {
        return this.f167669a.hashCode();
    }
}
