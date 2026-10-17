package bpl;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f17639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17640b;

    public h(g header, aim.e items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f17639a = header;
        this.f17640b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f17640b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f17639a, hVar.f17639a) && Intrinsics.f(this.f17640b, hVar.f17640b);
    }

    public final int hashCode() {
        return this.f17640b.hashCode() + (this.f17639a.hashCode() * 31);
    }
}
