package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318567a;

    public v(Links links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.f318567a = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f318567a, ((v) obj2).f318567a);
    }

    public final int hashCode() {
        return this.f318567a.hashCode();
    }
}
