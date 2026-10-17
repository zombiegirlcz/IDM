package yv1;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f317089a;

    public g(Alias selectedAlias) {
        Intrinsics.checkNotNullParameter(selectedAlias, "selectedAlias");
        this.f317089a = selectedAlias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f317089a, ((g) obj2).f317089a);
    }

    public final int hashCode() {
        return this.f317089a.hashCode();
    }
}
