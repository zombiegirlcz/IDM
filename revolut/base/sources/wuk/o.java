package wuk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f300202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f300203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2h.b f300204c;

    public o(n header, List items, x2h.b panelState) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(panelState, "panelState");
        this.f300202a = header;
        this.f300203b = items;
        this.f300204c = panelState;
    }

    @Override // cli.p
    public final List c() {
        return this.f300203b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f300202a, oVar.f300202a) && Intrinsics.f(this.f300203b, oVar.f300203b) && Intrinsics.f(this.f300204c, oVar.f300204c);
    }

    public final int hashCode() {
        return this.f300204c.hashCode() + p.a.d(this.f300202a.hashCode() * 31, 31, this.f300203b);
    }
}
