package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f318511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Links f318512b;

    public i(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f318511a = context;
        this.f318512b = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f318511a == iVar.f318511a && Intrinsics.f(this.f318512b, iVar.f318512b);
    }

    public final int hashCode() {
        return this.f318512b.hashCode() + (this.f318511a.hashCode() * 31);
    }
}
