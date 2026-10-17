package znc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f323695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f323696b;

    public h(g gVar, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f323695a = gVar;
        this.f323696b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f323696b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f323695a, hVar.f323695a) && Intrinsics.f(this.f323696b, hVar.f323696b);
    }

    public final int hashCode() {
        g gVar = this.f323695a;
        return this.f323696b.hashCode() + ((gVar == null ? 0 : gVar.hashCode()) * 31);
    }
}
