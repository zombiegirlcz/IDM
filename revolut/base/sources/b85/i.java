package b85;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f13102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13103b;

    public i(h header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f13102a = header;
        this.f13103b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f13103b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f13102a, iVar.f13102a) && Intrinsics.f(this.f13103b, iVar.f13103b);
    }

    public final int hashCode() {
        return this.f13103b.hashCode() + (this.f13102a.hashCode() * 31);
    }
}
