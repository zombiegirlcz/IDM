package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f318506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Links f318507b;

    public h(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f318506a = context;
        this.f318507b = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f318506a == hVar.f318506a && Intrinsics.f(this.f318507b, hVar.f318507b);
    }

    public final int hashCode() {
        return this.f318507b.hashCode() + (this.f318506a.hashCode() * 31);
    }
}
