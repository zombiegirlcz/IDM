package bs3;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f18030a;

    public a(Set providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.f18030a = providers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f18030a, ((a) obj2).f18030a);
    }

    public final int hashCode() {
        return this.f18030a.hashCode();
    }
}
