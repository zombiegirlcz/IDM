package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f318493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Links f318494b;

    public e(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f318493a = context;
        this.f318494b = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f318493a == eVar.f318493a && Intrinsics.f(this.f318494b, eVar.f318494b);
    }

    public final int hashCode() {
        return this.f318494b.hashCode() + (this.f318493a.hashCode() * 31);
    }
}
