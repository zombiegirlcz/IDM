package lpl;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f199153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f199154b;

    public g(f header, aim.e items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f199153a = header;
        this.f199154b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f199154b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f199153a, gVar.f199153a) && Intrinsics.f(this.f199154b, gVar.f199154b);
    }

    public final int hashCode() {
        return this.f199154b.hashCode() + (this.f199153a.hashCode() * 31);
    }
}
