package pa8;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f234443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f234444b;

    public k(List items, i navbar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navbar, "navbar");
        this.f234443a = items;
        this.f234444b = navbar;
    }

    @Override // cli.p
    public final List c() {
        return this.f234443a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f234443a, kVar.f234443a) && Intrinsics.f(this.f234444b, kVar.f234444b);
    }

    public final int hashCode() {
        return this.f234444b.hashCode() + (this.f234443a.hashCode() * 31);
    }
}
