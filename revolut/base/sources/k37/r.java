package k37;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f180641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f180642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f180643c;

    public r(q headerState, m footerState, List items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f180641a = headerState;
        this.f180642b = footerState;
        this.f180643c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f180643c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f180641a, rVar.f180641a) && Intrinsics.f(this.f180642b, rVar.f180642b) && Intrinsics.f(this.f180643c, rVar.f180643c);
    }

    public final int hashCode() {
        return this.f180643c.hashCode() + ((this.f180642b.hashCode() + (this.f180641a.hashCode() * 31)) * 31);
    }
}
