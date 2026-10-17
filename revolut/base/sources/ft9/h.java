package ft9;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f137970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f137971b;

    public h(List items, g navBarConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f137970a = items;
        this.f137971b = navBarConfig;
    }

    @Override // jki.n
    public final List c() {
        return this.f137970a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f137970a, hVar.f137970a) && Intrinsics.f(this.f137971b, hVar.f137971b);
    }

    public final int hashCode() {
        return this.f137971b.hashCode() + (this.f137970a.hashCode() * 31);
    }
}
