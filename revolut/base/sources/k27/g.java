package k27;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f180400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f180401b;

    public g(List items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f180400a = header;
        this.f180401b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f180401b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f180400a.equals(gVar.f180400a) && this.f180401b.equals(gVar.f180401b);
    }

    public final int hashCode() {
        return this.f180401b.hashCode() + (this.f180400a.hashCode() * 31);
    }
}
