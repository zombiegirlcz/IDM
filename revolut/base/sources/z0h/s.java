package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318557a;

    public s(Links links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.f318557a = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f318557a, ((s) obj2).f318557a);
    }

    public final int hashCode() {
        return this.f318557a.hashCode();
    }
}
