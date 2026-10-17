package zj9;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx4.a f322771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f322772b;

    public h(hx4.a navBarModel, List items) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f322771a = navBarModel;
        this.f322772b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f322772b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f322771a.equals(hVar.f322771a) && Intrinsics.f(this.f322772b, hVar.f322772b);
    }

    public final int hashCode() {
        return this.f322772b.hashCode() + (this.f322771a.hashCode() * 31);
    }
}
