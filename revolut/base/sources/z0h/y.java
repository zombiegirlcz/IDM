package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f318577c;

    public y(Links links, hel.b context, r1 parcelWrapStrategy) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parcelWrapStrategy, "parcelWrapStrategy");
        this.f318575a = links;
        this.f318576b = context;
        this.f318577c = parcelWrapStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f318575a, yVar.f318575a) && this.f318576b == yVar.f318576b && this.f318577c == yVar.f318577c;
    }

    public final int hashCode() {
        return this.f318577c.hashCode() + ((this.f318576b.hashCode() + (this.f318575a.hashCode() * 31)) * 31);
    }
}
