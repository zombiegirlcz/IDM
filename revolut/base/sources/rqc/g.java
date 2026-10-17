package rqc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f256517b;

    public g(List items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f256516a = items;
        this.f256517b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f256516a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f256516a, gVar.f256516a) && this.f256517b.equals(gVar.f256517b);
    }

    public final int hashCode() {
        return this.f256517b.hashCode() + (this.f256516a.hashCode() * 31);
    }
}
