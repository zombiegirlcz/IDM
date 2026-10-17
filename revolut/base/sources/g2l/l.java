package g2l;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f140144b;

    public l(List items, j header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f140143a = items;
        this.f140144b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f140143a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f140143a, lVar.f140143a) && Intrinsics.f(this.f140144b, lVar.f140144b);
    }

    public final int hashCode() {
        return this.f140144b.hashCode() + (this.f140143a.hashCode() * 31);
    }
}
