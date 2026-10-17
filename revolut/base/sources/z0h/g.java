package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f318501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Links f318502b;

    public g(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f318501a = context;
        this.f318502b = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f318501a == gVar.f318501a && Intrinsics.f(this.f318502b, gVar.f318502b);
    }

    public final int hashCode() {
        return this.f318502b.hashCode() + (this.f318501a.hashCode() * 31);
    }
}
