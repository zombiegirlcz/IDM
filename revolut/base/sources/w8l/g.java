package w8l;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f295655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v8l.b f295656b;

    public g(List items, v8l.b navBarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f295655a = items;
        this.f295656b = navBarModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f295655a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f295655a, gVar.f295655a) && Intrinsics.f(this.f295656b, gVar.f295656b);
    }

    public final int hashCode() {
        return this.f295656b.hashCode() + (this.f295655a.hashCode() * 31);
    }
}
