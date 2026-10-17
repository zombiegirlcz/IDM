package s86;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f260907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f260908b;

    public i(p navBarModel, List items) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f260907a = navBarModel;
        this.f260908b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f260908b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f260907a, iVar.f260907a) && Intrinsics.f(this.f260908b, iVar.f260908b);
    }

    public final int hashCode() {
        return this.f260908b.hashCode() + (this.f260907a.hashCode() * 31);
    }
}
