package z87;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f320047a;

    public g(ImmutableSet extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f320047a = extensions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f320047a, ((g) obj2).f320047a);
    }

    public final int hashCode() {
        return this.f320047a.hashCode();
    }
}
