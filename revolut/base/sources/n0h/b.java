package n0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f211041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f211042b;

    public b(Links links, hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f211041a = links;
        this.f211042b = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f211041a, bVar.f211041a) && this.f211042b == bVar.f211042b;
    }

    public final int hashCode() {
        return this.f211042b.hashCode() + (this.f211041a.hashCode() * 31);
    }
}
