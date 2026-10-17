package nob;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f217967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f217968b;

    public h(List items, m header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f217967a = header;
        this.f217968b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f217968b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f217967a, hVar.f217967a) && Intrinsics.f(this.f217968b, hVar.f217968b);
    }

    public final int hashCode() {
        return this.f217968b.hashCode() + (this.f217967a.hashCode() * 31);
    }
}
