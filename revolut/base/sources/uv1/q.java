package uv1;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f283285a;

    public q(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f283285a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f283285a, ((q) obj2).f283285a);
    }

    public final int hashCode() {
        return this.f283285a.hashCode();
    }
}
