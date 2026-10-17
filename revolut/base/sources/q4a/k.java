package q4a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f242107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f242108b;

    public k(List items, i searchBarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchBarState, "searchBarState");
        this.f242107a = items;
        this.f242108b = searchBarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f242107a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f242107a, kVar.f242107a) && Intrinsics.f(this.f242108b, kVar.f242108b);
    }

    public final int hashCode() {
        return this.f242108b.f242103a.hashCode() + (this.f242107a.hashCode() * 31);
    }
}
