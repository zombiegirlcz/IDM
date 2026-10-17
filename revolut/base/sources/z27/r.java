package z27;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f318993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f318994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f318995c;

    public r(q headerState, m footerState, List items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f318993a = headerState;
        this.f318994b = footerState;
        this.f318995c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f318995c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f318993a, rVar.f318993a) && Intrinsics.f(this.f318994b, rVar.f318994b) && Intrinsics.f(this.f318995c, rVar.f318995c);
    }

    public final int hashCode() {
        return this.f318995c.hashCode() + ((this.f318994b.hashCode() + (this.f318993a.hashCode() * 31)) * 31);
    }
}
