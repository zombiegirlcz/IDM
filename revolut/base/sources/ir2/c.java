package ir2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f167983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f167984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f167985c;
    public final h60.b d;

    public c(h navBarModel, List items, d twinButtonModel, h60.a aVar) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(twinButtonModel, "twinButtonModel");
        this.f167983a = navBarModel;
        this.f167984b = items;
        this.f167985c = twinButtonModel;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f167983a, cVar.f167983a) && Intrinsics.f(this.f167984b, cVar.f167984b) && Intrinsics.f(this.f167985c, cVar.f167985c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f167985c.hashCode() + p.a.d(this.f167983a.hashCode() * 31, 31, this.f167984b)) * 31;
        h60.b bVar = this.d;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
