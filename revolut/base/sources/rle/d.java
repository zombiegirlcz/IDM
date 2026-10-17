package rle;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f255032a;

    public d(Links links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.f255032a = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f255032a, ((d) obj2).f255032a);
    }

    public final int hashCode() {
        return this.f255032a.hashCode();
    }
}
