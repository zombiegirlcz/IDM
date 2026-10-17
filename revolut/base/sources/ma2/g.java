package ma2;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f203925a;

    public g(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f203925a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f203925a, ((g) obj2).f203925a);
    }

    public final int hashCode() {
        return this.f203925a.hashCode();
    }
}
