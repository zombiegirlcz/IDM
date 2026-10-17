package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f318499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Links f318500b;

    public f(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f318499a = context;
        this.f318500b = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f318499a == fVar.f318499a && Intrinsics.f(this.f318500b, fVar.f318500b);
    }

    public final int hashCode() {
        return this.f318500b.hashCode() + (this.f318499a.hashCode() * 31);
    }
}
